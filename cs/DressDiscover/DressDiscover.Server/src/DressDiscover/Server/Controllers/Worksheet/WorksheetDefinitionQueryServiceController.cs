namespace DressDiscover.Server.Controllers.Worksheet
{
    public sealed class WorksheetDefinitionQueryServiceController : Microsoft.AspNetCore.Mvc.Controller {
        public WorksheetDefinitionQueryServiceController(DressDiscover.Api.Services.Worksheet.IWorksheetDefinitionQueryService service) {
            this.service = service;
        }


        private DressDiscover.Api.Services.Worksheet.IWorksheetDefinitionQueryService service;
    }
}
