"use server";

import { getServerSession } from "next-auth";
import lhConfig from "../../../../lhConfig";
import { authOptions } from "../../../../pages/api/auth/[...nextauth]";
import { ListTaskMetricsRequest } from "littlehorse-client/dist/proto/service";

export const fethTaskMetrics = async (
  request: ListTaskMetricsRequest,
  tenantId?: string
) => {
  if (tenantId === null) return; // TODO: this part should be removed after we fix the current authentication
  const session = await getServerSession(authOptions);
  const client = lhConfig(tenantId).getClient(session?.accessToken);
  return client.listTaskDefMetrics(request);
};
