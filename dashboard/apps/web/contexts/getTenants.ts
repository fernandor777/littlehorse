"use server";
import { getServerSession } from "next-auth";
import lhConfig from "../lhConfig";
import { authOptions } from "../pages/api/auth/[...nextauth]";
import {
  ACLAction,
  ACLResource,
  ServerACLs,
} from "littlehorse-client/dist/proto/acls";

const getTenants = async (): Promise<string[]> => {
  const session = await getServerSession(authOptions);
  let tenants: string[] = [];
  if (session) {
    const { accessToken } = session;
    const client = lhConfig().getClient(accessToken);

    const { perTenantAcls, globalAcls } = await client.whoami({});
    if (globalAcls && hasDefaultAccess(globalAcls)) {
      tenants = ["default"];
    }
    return [...tenants, ...Object.keys(perTenantAcls)];
  }
  return tenants;
};

const hasDefaultAccess = ({ acls }: ServerACLs): boolean => {
  const result = acls.filter(({resources, allowedActions}) => {
    return resources.includes(ACLResource.ACL_ALL_RESOURCES) && allowedActions.includes(ACLAction.ALL_ACTIONS)
  });
  return result.length > 0
};

export default getTenants;

// {"id":{"id":"anonymous"},"createdAt":"2024-02-28T15:35:24.816Z","perTenantAcls":{},"globalAcls":{"acls":[{"resources":["ACL_ALL_RESOURCES"],"allowedActions":["ALL_ACTIONS"]}]}}
