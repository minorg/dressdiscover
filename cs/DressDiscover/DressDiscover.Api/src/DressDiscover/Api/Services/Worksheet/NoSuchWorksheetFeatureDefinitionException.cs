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

        public static NoSuchWorksheetFeatureDefinitionException FromBuiltins(System.Collections.Generic.IDictionary<string, object> _dictionary)
        {
            string id= null;

            foreach (var _item in _dictionary)
            {
                switch (_item.Key)
                {
                case "id":
                    id = ((string)_item.Value);
                    break;
                }
            }

            return new NoSuchWorksheetFeatureDefinitionException(id);
        }

        public static NoSuchWorksheetFeatureDefinitionException FromJson(Newtonsoft.Json.Linq.JObject _dictionary)
        {
            string id= null;

            foreach (var _item in _dictionary)
            {
                switch (_item.Key)
                {
                case "id":
                    id = ((string)((Newtonsoft.Json.Linq.JValue)_item.Value));
                    break;
                }
            }

            return new NoSuchWorksheetFeatureDefinitionException(id);
        }

        public System.Collections.Generic.IDictionary<string, object> ToBuiltins()
        {
            var _dictionary = new System.Collections.Generic.Dictionary<string, object>();
            _dictionary["id"] = this.Id;
            return _dictionary;
        }

        public Newtonsoft.Json.Linq.JObject ToJson()
        {
            var _dictionary = new Newtonsoft.Json.Linq.JObject();
            _dictionary["id"] = new Newtonsoft.Json.Linq.JValue((string)this.Id);
            return _dictionary;
        }

        private string id;
    }
}
