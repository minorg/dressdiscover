namespace DressDiscover.Server.Controllers.Worksheet
{
    public sealed class IWorksheetStateCommandServiceController : Microsoft.AspNetCore.Mvc {
        public IWorksheetStateCommandServiceController(DressDiscover.Api.Services.Worksheet.WorksheetStateCommandService service) {
            this.service = service;
        }




        private final DressDiscover.Api.Services.Worksheet.WorksheetStateCommandService service;
    }
}
