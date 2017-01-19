using DressDiscover.Api.Models.Worksheet;
using DressDiscover.Api.Services.Worksheet;
using System.Collections.Generic;
using System.Diagnostics;

namespace DressDiscover.Gui.Portable.Services.Worksheet
{
    public sealed class LocalWorksheetCommandService : IWorksheetCommandService
    {
        public LocalWorksheetCommandService(IDictionary<string, object> properties)
        {
            this.properties = properties;
        }

        public void DeleteWorksheetState(string accessionNumber)
        {
            Debug.WriteLine("delete " + accessionNumber);
            properties.Remove(LocalWorksheetQueryService.GetWorksheetStateItemKey(accessionNumber));
        }

        public void PutWorksheetState(WorksheetState state)
        {
            var stateJsonString = state.ToJson().ToString(Newtonsoft.Json.Formatting.None);
            Debug.WriteLine("put {0} <- {1}", state.AccessionNumber, stateJsonString);
            properties[LocalWorksheetQueryService.GetWorksheetStateItemKey(state.AccessionNumber)] = stateJsonString;
        }

        private IDictionary<string, object> properties;
    }
}
