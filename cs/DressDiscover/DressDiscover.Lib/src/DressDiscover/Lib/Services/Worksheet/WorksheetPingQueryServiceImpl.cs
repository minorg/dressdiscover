
namespace DressDiscover.Lib.Services.Worksheet
{
    public sealed class WorksheetPingQueryServiceImpl : Api.Services.Worksheet.IWorksheetPingQueryService
    {
        public string Ping(string message)
        {
            return message;
        }
    }
}
