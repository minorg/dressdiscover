namespace DressDiscover.Api.Services.Worksheet
{
    public sealed class DuplicateWorksheetStateException : System.Exception
    {
        public DuplicateWorksheetStateException(string id)
        {
            this.Id = id;
        }

        public string Id
        {
            get { return id; }
            set
            {
                if (value == null)
                {
                    throw new System.NullReferenceException("DuplicateWorksheetStateException.Id");
                }
                this.id = value;
            }
        }

        private string id;
    }
}
