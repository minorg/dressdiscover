namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetFeatureValueDefinition
    {
        public WorksheetFeatureValueDefinition(string id)
        {
            this.Id = id;
        }

        public WorksheetFeatureValueDefinition(string id, DressDiscover.Api.Models.Worksheet.WorksheetDescription description, string displayName, DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueImage image) {
            this.Id = id;
            this.Description = description;
            this.DisplayName = displayName;
            this.Image = image;
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

        public string Id
        {
            get { return id; }
            set
            {
                if (value == null)
                {
                    throw new System.NullReferenceException("WorksheetFeatureValueDefinition.Id");
                }
                this.id = value;
            }
        }

        public DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueImage Image
        {
            get { return image; }
            set { this.image = value; }
        }

        private DressDiscover.Api.Models.Worksheet.WorksheetDescription description;
        private string displayName;
        private string id;
        private DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueImage image;
    }
}
