namespace DressDiscover.Server.Controllers.Worksheet
{
    public sealed class WorksheetStateQueryServiceController : Microsoft.AspNetCore.Mvc.Controller {
        public WorksheetStateQueryServiceController(DressDiscover.Api.Services.Worksheet.IWorksheetStateQueryService service) {
            this.service = service;
        }



        private DressDiscover.Api.Services.Worksheet.IWorksheetStateQueryService service;
    }
}
