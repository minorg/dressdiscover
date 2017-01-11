namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetDefinition
    {
        WorksheetDefinition()
        {
        }

        public DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetDefinition RootFeatureSet { get; set; }
    }
}
