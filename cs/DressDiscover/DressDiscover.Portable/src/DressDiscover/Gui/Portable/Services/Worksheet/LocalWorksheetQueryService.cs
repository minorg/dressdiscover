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
            var result = new List<string>();
            foreach (var key in properties.Keys)
            {
                if (key.StartsWith(WORKSHEET_ITEM_KEY_PREFIX) && key.Length > WORKSHEET_ITEM_KEY_PREFIX.Length)
                {
                    result.Add(key.Substring(WORKSHEET_ITEM_KEY_PREFIX.Length));
                }
            }
            return result;
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
