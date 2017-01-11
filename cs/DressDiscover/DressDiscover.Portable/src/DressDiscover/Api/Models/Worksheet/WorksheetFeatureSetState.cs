namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetFeatureSetState
    {
        WorksheetFeatureSetState()
        {
        }

        public System.Collections.Generic.Dictionary<string, DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState> ChildFeatureSets { get; set; }

        public System.Collections.Generic.Dictionary<string, DressDiscover.Api.Models.Worksheet.WorksheetFeatureState> Features { get; set; }
    }
}
