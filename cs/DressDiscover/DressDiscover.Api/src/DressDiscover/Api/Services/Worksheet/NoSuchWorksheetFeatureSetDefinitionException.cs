namespace DressDiscover.Api.Services.Worksheet
{
    public sealed class NoSuchWorksheetFeatureSetDefinitionException : System.Exception
    {
        public NoSuchWorksheetFeatureSetDefinitionException(string id)
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
                    throw new System.NullReferenceException("NoSuchWorksheetFeatureSetDefinitionException.Id");
                }
                this.id = value;
            }
        }

        private string id;
    }
}
