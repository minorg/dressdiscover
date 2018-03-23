namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetFeatureSetDefinition
    {
        public WorksheetFeatureSetDefinition(System.Collections.Generic.IList<string> featureIds, string id)
        {
            this.FeatureIds = featureIds;
            this.Id = id;
        }

        public WorksheetFeatureSetDefinition(System.Collections.Generic.IList<string> featureIds, string id, DressDiscover.Api.Models.Worksheet.WorksheetDescription description, string displayName, System.Collections.Generic.ISet<string> extentIds) {
            this.FeatureIds = featureIds;
            this.Id = id;
            this.Description = description;
            this.DisplayName = displayName;
            this.ExtentIds = extentIds;
        }

        public DressDiscover.Api.Models.Worksheet.WorksheetDescription Description
        {
            get { return description; }
            set { this.description = value; }
        }

        public string DisplayName
        {
            get { return displayName; }
            set { this.displayName = value; }
        }

        public System.Collections.Generic.ISet<string> ExtentIds
        {
            get { return extentIds; }
            set { this.extentIds = value; }
        }

        public System.Collections.Generic.IList<string> FeatureIds
        {
            get { return featureIds; }
            set
            {
                if (value == null)
                {
                    throw new System.NullReferenceException("WorksheetFeatureSetDefinition.FeatureIds");
                }
                this.featureIds = value;
            }
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

        private DressDiscover.Api.Models.Worksheet.WorksheetDescription description;
        private string displayName;
        private System.Collections.Generic.ISet<string> extentIds;
        private System.Collections.Generic.IList<string> featureIds;
        private string id;
    }
}
