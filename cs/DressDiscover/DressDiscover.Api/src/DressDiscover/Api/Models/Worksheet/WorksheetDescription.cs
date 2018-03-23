namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetDescription
    {
        public WorksheetDescription(DressDiscover.Api.Models.Worksheet.WorksheetRights rights, string text)
        {
            this.Rights = rights;
            this.Text = text;
        }

        public DressDiscover.Api.Models.Worksheet.WorksheetRights Rights
        {
            get { return rights; }
            set
            {
                if (value == null)
                {
                    throw new System.NullReferenceException("WorksheetDescription.Rights");
                }
                this.rights = value;
            }
        }

        public string Text
        {
            get { return text; }
            set
            {
                if (value == null)
                {
                    throw new System.NullReferenceException("WorksheetDescription.Text");
                }
                this.text = value;
            }
        }

        private DressDiscover.Api.Models.Worksheet.WorksheetRights rights;
        private string text;
    }
}
