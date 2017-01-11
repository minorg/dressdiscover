namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetFeatureSetDefinition
    {
        WorksheetFeatureSetDefinition()
        {
        }

        public System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetDefinition> ChildFeatureSets { get; set; }

        public string DisplayName { get; set; }

        public System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureDefinition> Features { get; set; }

        public string Id { get; set; }
    }
}
