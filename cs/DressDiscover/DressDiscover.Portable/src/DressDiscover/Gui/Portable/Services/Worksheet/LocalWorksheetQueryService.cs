using DressDiscover.Api.Models.Worksheet;
using DressDiscover.Api.Services.Worksheet;
using Newtonsoft.Json.Linq;
using System.Collections.Generic;
using System;

namespace DressDiscover.Gui.Portable.Services.Worksheet
{
    public sealed class LocalWorksheetQueryService : IWorksheetQueryService
    {
        public LocalWorksheetQueryService(IDictionary<string, object> properties, WorksheetDefinition worksheetDefinition)
        {
            this.properties = properties;
            this.worksheetDefinition = worksheetDefinition;
        }

        public static string GetWorksheetStateItemKey(string accessionNumber)
        {
            return WORKSHEET_ITEM_KEY_PREFIX + accessionNumber;
        }

        public IList<string> GetWorksheetAccessionNumbers()
        {
            //let result: string[] = [];
            //for (var keyI = 0; ; keyI++)
            //{
            //    const key = localStorage.key(keyI);
            //    if (key == null)
            //    {
            //        break;
            //    }
            //    if (!key.match("^" + LocalWorksheetQueryService._WORKSHEET_ITEM_KEY_PREFIX))
            //    {
            //        continue;
            //    }
            //    else if (key.length == LocalWorksheetQueryService._WORKSHEET_ITEM_KEY_PREFIX.length)
            //    {
            //        continue;
            //    }
            //    result.push(key.substr(LocalWorksheetQueryService._WORKSHEET_ITEM_KEY_PREFIX.length));
            //}
            //return result;

            throw new NotImplementedException();
        }

        public WorksheetDefinition GetWorksheetDefinition()
        {
            return worksheetDefinition;
        }

        public WorksheetState GetWorksheetState(string accessionNumber)
        {
            var worksheetStateJson = properties[GetWorksheetStateItemKey(accessionNumber)];
            if (!(worksheetStateJson is string))
            {
                return new WorksheetState(accessionNumber);
            }
            return WorksheetState.FromJson(JObject.Parse((string)worksheetStateJson));
        }

        private IDictionary<string, object> properties;
        private WorksheetDefinition worksheetDefinition;
        private static readonly string WORKSHEET_ITEM_KEY_PREFIX = "worksheet/state/";
    }
}
