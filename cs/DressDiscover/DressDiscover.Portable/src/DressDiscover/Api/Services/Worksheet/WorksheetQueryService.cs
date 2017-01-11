namespace DressDiscover.Api.Services.Worksheet
{
    public interface WorksheetQueryService
    {
        System.Collections.Generic.List<string> GetWorksheetAccessionNumbers();
        DressDiscover.Api.Models.Worksheet.WorksheetDefinition GetWorksheetDefinition();
        DressDiscover.Api.Models.Worksheet.WorksheetState GetWorksheetState(string accessionNumber);
    }
}
