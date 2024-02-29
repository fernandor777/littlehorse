import { LHConfig } from "littlehorse-client";



const lhConfig = (tenantId?: string) => {
  const client = LHConfig.from({
    apiHost: process.env.LHC_API_HOST || "localhost",
    apiPort: process.env.LHC_API_PORT || "2023",
    protocol: process.env.LHC_API_PROTOCOL || "PLAINTEXT",
    caCert: process.env.LHC_CA_CERT,
    tenantId: tenantId || "default"
  });

  return client
}

export default lhConfig;
