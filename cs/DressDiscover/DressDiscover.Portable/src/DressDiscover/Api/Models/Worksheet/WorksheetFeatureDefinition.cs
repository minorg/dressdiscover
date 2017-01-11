namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetFeatureDefinition
    {
        WorksheetFeatureDefinition()
        {
        }

        public string DisplayName { get; set; }

        public string Id { get; set; }

        public System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition> Values_ { get; set; }
    }
}
