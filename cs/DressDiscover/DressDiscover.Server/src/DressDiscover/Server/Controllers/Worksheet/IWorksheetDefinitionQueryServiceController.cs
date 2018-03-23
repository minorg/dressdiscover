namespace DressDiscover.Server.Controllers.Worksheet
{
    public sealed class IWorksheetDefinitionQueryServiceController : Microsoft.AspNetCore.Mvc {
        public IWorksheetDefinitionQueryServiceController(DressDiscover.Api.Services.Worksheet.WorksheetDefinitionQueryService service) {
            this.service = service;
        }


        private final DressDiscover.Api.Services.Worksheet.WorksheetDefinitionQueryService service;
    }
}
