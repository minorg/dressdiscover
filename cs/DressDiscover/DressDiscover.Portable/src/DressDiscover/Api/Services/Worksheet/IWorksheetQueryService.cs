namespace DressDiscover.Api.Services.Worksheet
{
    public interface IWorksheetQueryService
    {
        System.Collections.Generic.IList<string> GetWorksheetAccessionNumbers();
        DressDiscover.Api.Models.Worksheet.WorksheetDefinition GetWorksheetDefinition();
        DressDiscover.Api.Models.Worksheet.WorksheetState GetWorksheetState(string accessionNumber);
    }
}
