namespace DressDiscover.Api.Services.Worksheet
{
    public sealed class NoSuchWorksheetStateException : System.Exception
    {
        public NoSuchWorksheetStateException(string id)
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
                    throw new System.NullReferenceException("NoSuchWorksheetStateException.Id");
                }
                this.id = value;
            }
        }

        private string id;
    }
}
