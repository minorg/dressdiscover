namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetFeatureValueDefinition
    {
        WorksheetFeatureValueDefinition()
        {
        }

        public string DisplayName { get; set; }

        public string Id { get; set; }

        public DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueImage Image { get; set; }
    }
}
