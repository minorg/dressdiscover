namespace DressDiscover.Api.Services.Worksheet
{
    public sealed class NoSuchWorksheetFeatureValueDefinitionException : System.Exception
    {
        public NoSuchWorksheetFeatureValueDefinitionException(string id)
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
                    throw new System.NullReferenceException("NoSuchWorksheetFeatureValueDefinitionException.Id");
                }
                this.id = value;
            }
        }

        private string id;
    }
}
