using DressDiscover.Api.Models.Worksheet;
using DressDiscover.Api.Services.Worksheet;
using DressDiscover.Gui.Portable.Services.Worksheet;
using System.Collections.Generic;

namespace DressDiscover.Gui.Portable
{
    public sealed class AppServices
    {
        public IWorksheetCommandService WorksheetCommandService { get; private set; }
        public IWorksheetQueryService WorksheetQueryService { get; private set; }

        public AppServices(IDictionary<string, object> properties, WorksheetDefinition worksheetDefinition)
        {
            WorksheetCommandService = new LocalWorksheetCommandService(properties);
            WorksheetQueryService = new LocalWorksheetQueryService(properties, worksheetDefinition);
        }
    }
}
