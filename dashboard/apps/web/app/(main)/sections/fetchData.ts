'use server'

import lhConfig from "../../../lhConfig"

if (metadataType === 'wfSpec') {setWfSpecBookmark(bookmark)}
        if (metadataType === 'taskDef') {setTaskDefBookmark(bookmark)}
        if (metadataType === 'userTaskDef') {setUserTaskDefBookmark(bookmark)}
        if (metadataType === 'externalEventDef') {setExternalEventDefBookmark(bookmark)}
type AllowedType = "wfSpec" | "taskDef" | "userTaskDef" | "externalEventDef"

export const fetchData = (type: AllowedType, filters: string) => {
  const tenantId = ""
  const client = lhConfig(tenantId).getClient()

  const demo = client.getWfSpec
  client[type](filters)
}
