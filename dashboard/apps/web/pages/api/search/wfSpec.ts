import type { NextApiRequest, NextApiResponse } from "next";
import type { WfSpecIdList } from "../../../littlehorse-public-api/service";
import type { WfSpecId } from "../../../littlehorse-public-api/object_id";
import lhConfig from "../../../lhConfig";
import { getServerSession } from "next-auth";
import { authOptions } from "../auth/[...nextauth]";
import { SearchWfSpecRequest } from "littlehorse-client/dist/proto/service";

export type RequestBody = {
  tenantId: string;
  request: Object;
};
export default async function handler(
  req: NextApiRequest,
  res: NextApiResponse
) {
  if (req.method === "POST") {
    const { tenantId, request } = req.body as RequestBody;
    const session = await getServerSession(req, res, authOptions);
    const client = lhConfig(tenantId).getClient(session?.accessToken);
    const response = await client.searchWfSpec(
      SearchWfSpecRequest.create(request)
    );

    const resultsWithFormattedVersion = response.results.map(
      (result: WfSpecId) => ({
        ...result,
        version: `${result.majorVersion}.${result.revision}`,
      })
    );

    res.json({
      ...response,
      results: resultsWithFormattedVersion,
    } as WfSpecIdList);
  }
}
