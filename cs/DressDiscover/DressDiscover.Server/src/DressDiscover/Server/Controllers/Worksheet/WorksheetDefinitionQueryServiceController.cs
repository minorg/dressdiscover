namespace DressDiscover.Server.Controllers.Worksheet
{
    [Microsoft.AspNetCore.Mvc.Route("api/[controller]")]
    public sealed class WorksheetDefinitionQueryServiceController : Microsoft.AspNetCore.Mvc.Controller {
        public WorksheetDefinitionQueryServiceController(DressDiscover.Api.Services.Worksheet.IWorksheetDefinitionQueryService service) {
            this.service = service;
        }


        private DressDiscover.Api.Services.Worksheet.IWorksheetDefinitionQueryService service;
    }
}
