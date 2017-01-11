namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetFeatureValueDefinition
    {
        WorksheetFeatureValueDefinition(string id)
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

        private string displayName;
        private string id;
        private DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueImage image;
    }
}
