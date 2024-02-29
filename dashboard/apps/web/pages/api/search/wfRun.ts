import type { NextApiRequest, NextApiResponse } from 'next'
import { handleGrpcCallWithNext } from '../grpcMethodCallHandler'
import { SearchWfRunRequest } from 'littlehorse-client/dist/proto/service';
import lhConfig from '../../../lhConfig';
import { getServerSession } from 'next-auth';
import { authOptions } from '../auth/[...nextauth]';
import { RequestBody } from './wfSpec';

export default async function handler(req: NextApiRequest, res: NextApiResponse) {
    const { tenantId, request } = req.body as RequestBody;
    const session = await getServerSession(req, res, authOptions);
    const client = lhConfig(tenantId).getClient(session?.accessToken);

    if (req.method === 'POST'){
        await client.searchWfRun(SearchWfRunRequest.create(request))
    }
}
