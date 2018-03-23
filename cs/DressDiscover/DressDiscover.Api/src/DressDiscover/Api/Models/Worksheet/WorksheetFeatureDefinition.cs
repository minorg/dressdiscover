namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetFeatureDefinition
    {
        public WorksheetFeatureDefinition(string id, System.Collections.Generic.IList<string> valueIds)
        {
            this.Id = id;
            this.ValueIds = valueIds;
        }

        public WorksheetFeatureDefinition(string id, System.Collections.Generic.IList<string> valueIds, DressDiscover.Api.Models.Worksheet.WorksheetDescription description, string displayName, System.Collections.Generic.ISet<string> extentIds) {
            this.Id = id;
            this.ValueIds = valueIds;
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

        public string Id
        {
            get { return id; }
            set
            {
                if (value == null)
                {
                    throw new System.NullReferenceException("WorksheetFeatureDefinition.Id");
                }
                this.id = value;
            }
        }

        public System.Collections.Generic.IList<string> ValueIds
        {
            get { return valueIds; }
            set
            {
                if (value == null)
                {
                    throw new System.NullReferenceException("WorksheetFeatureDefinition.ValueIds");
                }
                this.valueIds = value;
            }
        }

        private DressDiscover.Api.Models.Worksheet.WorksheetDescription description;
        private string displayName;
        private System.Collections.Generic.ISet<string> extentIds;
        private string id;
        private System.Collections.Generic.IList<string> valueIds;
    }
}
