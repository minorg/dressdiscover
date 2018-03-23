namespace DressDiscover.Api.Services.Worksheet
{
    public interface IWorksheetStateQueryService
    {
        DressDiscover.Api.Models.Worksheet.WorksheetState GetWorksheetState(string id);
        System.Collections.Generic.IList<string> GetWorksheetStateIds();
    }
}
