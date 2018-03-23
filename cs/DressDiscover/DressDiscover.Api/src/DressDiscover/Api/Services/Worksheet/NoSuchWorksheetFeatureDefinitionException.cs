namespace DressDiscover.Api.Services.Worksheet
{
    public sealed class NoSuchWorksheetFeatureDefinitionException : System.Exception
    {
        public NoSuchWorksheetFeatureDefinitionException(string id)
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
                    throw new System.NullReferenceException("NoSuchWorksheetFeatureDefinitionException.Id");
                }
                this.id = value;
            }
        }

        private string id;
    }
}
