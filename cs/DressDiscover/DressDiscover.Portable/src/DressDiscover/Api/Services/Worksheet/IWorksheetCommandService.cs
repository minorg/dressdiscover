namespace DressDiscover.Api.Services.Worksheet
{
    public interface IWorksheetCommandService
    {
        void DeleteWorksheetState(string accessionNumber);
        void PutWorksheetState(DressDiscover.Api.Models.Worksheet.WorksheetState state);
    }
}
