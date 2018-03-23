namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetExtentDefinition
    {
        public WorksheetExtentDefinition(string id)
        {
            this.Id = id;
        }

        public WorksheetExtentDefinition(string id, DressDiscover.Api.Models.Worksheet.WorksheetDescription description, string displayName) {
            this.Id = id;
            this.Description = description;
            this.DisplayName = displayName;
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
                    throw new System.NullReferenceException("WorksheetExtentDefinition.Id");
                }
                this.id = value;
            }
        }

        private DressDiscover.Api.Models.Worksheet.WorksheetDescription description;
        private string displayName;
        private string id;
    }
}
