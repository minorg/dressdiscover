namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetFeatureSetDefinition
    {
        WorksheetFeatureSetDefinition(string id)
        {
            this.Id = id;
        }

        public System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetDefinition> ChildFeatureSets
        {
            get { return childFeatureSets; }
            set { this.childFeatureSets = value; }
        }

        public string DisplayName
        {
            get { return displayName; }
            set { this.displayName = value; }
        }

        public System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureDefinition> Features
        {
            get { return features; }
            set { this.features = value; }
        }

        public string Id
        {
            get { return id; }
            set
            {
                if (value == null)
                {
                    throw new System.NullReferenceException("WorksheetFeatureSetDefinition.Id");
                }
                this.id = value;
            }
        }

        private System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetDefinition> childFeatureSets;
        private string displayName;
        private System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureDefinition> features;
        private string id;
    }
}
