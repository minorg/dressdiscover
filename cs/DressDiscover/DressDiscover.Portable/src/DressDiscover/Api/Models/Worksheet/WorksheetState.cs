namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetState
    {
        WorksheetState()
        {
        }

        public string AccessionNumber { get; set; }

        public DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState RootFeatureSet { get; set; }
    }
}
