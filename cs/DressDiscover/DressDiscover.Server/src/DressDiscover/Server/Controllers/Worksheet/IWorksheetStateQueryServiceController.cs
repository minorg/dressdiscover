namespace DressDiscover.Server.Controllers.Worksheet
{
    public sealed class IWorksheetStateQueryServiceController : Microsoft.AspNetCore.Mvc {
        public IWorksheetStateQueryServiceController(DressDiscover.Api.Services.Worksheet.WorksheetStateQueryService service) {
            this.service = service;
        }



        private final DressDiscover.Api.Services.Worksheet.WorksheetStateQueryService service;
    }
}
