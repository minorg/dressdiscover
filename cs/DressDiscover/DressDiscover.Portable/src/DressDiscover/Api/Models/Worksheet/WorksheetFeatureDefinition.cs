namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetFeatureDefinition
    {
        WorksheetFeatureDefinition(string id)
        {
            this.Id = id;
        }

        public string DisplayName
        {
            get { return displayName; }
            set { this.displayName = value; }
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

        public System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition> Values_
        {
            get { return values_; }
            set { this.values_ = value; }
        }

        private string displayName;
        private string id;
        private System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition> values_;
    }
}
