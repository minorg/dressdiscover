namespace DressDiscover.Api.Services.Worksheet
{
    public interface IWorksheetStateCommandService
    {
        void DeleteWorksheetState(string id);
        void PutWorksheetState(DressDiscover.Api.Models.Worksheet.WorksheetState state);
        void RenameWorksheetState(string newId, string oldId);
    }
}
