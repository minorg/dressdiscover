namespace DressDiscover.Server.Controllers.Worksheet
{
    public sealed class WorksheetStateCommandServiceController : Microsoft.AspNetCore.Mvc.Controller {
        public WorksheetStateCommandServiceController(DressDiscover.Api.Services.Worksheet.IWorksheetStateCommandService service) {
            this.service = service;
        }




        private DressDiscover.Api.Services.Worksheet.IWorksheetStateCommandService service;
    }
}
