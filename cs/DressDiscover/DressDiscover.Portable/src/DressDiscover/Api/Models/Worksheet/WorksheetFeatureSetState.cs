namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetFeatureSetState
    {
        WorksheetFeatureSetState()
        {
        }

        public System.Collections.Generic.Dictionary<string, DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState> ChildFeatureSets
        {
            get { return childFeatureSets; }
            set { this.childFeatureSets = value; }
        }

        public System.Collections.Generic.Dictionary<string, DressDiscover.Api.Models.Worksheet.WorksheetFeatureState> Features
        {
            get { return features; }
            set { this.features = value; }
        }

        private System.Collections.Generic.Dictionary<string, DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState> childFeatureSets;
        private System.Collections.Generic.Dictionary<string, DressDiscover.Api.Models.Worksheet.WorksheetFeatureState> features;
    }
}
