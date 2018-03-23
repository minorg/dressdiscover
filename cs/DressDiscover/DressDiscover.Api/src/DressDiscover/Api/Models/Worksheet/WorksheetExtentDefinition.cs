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

        public static WorksheetExtentDefinition FromBuiltins(System.Collections.Generic.IDictionary<string, object> _dictionary)
        {
            string id= null;
            DressDiscover.Api.Models.Worksheet.WorksheetDescription description= null;
            string displayName= null;

            foreach (var _item in _dictionary)
            {
                switch (_item.Key)
                {
                case "id":
                    id = ((string)_item.Value);
                    break;
                case "description":
                    description = DressDiscover.Api.Models.Worksheet.WorksheetDescription.FromBuiltins((System.Collections.Generic.IDictionary<string, object>)_item.Value);
                    break;
                case "display_name":
                    displayName = ((string)_item.Value);
                    break;
                }
            }

            return new WorksheetExtentDefinition(id, description, displayName);
        }

        public static WorksheetExtentDefinition FromJson(Newtonsoft.Json.Linq.JObject _dictionary)
        {
            string id= null;
            DressDiscover.Api.Models.Worksheet.WorksheetDescription description= null;
            string displayName= null;

            foreach (var _item in _dictionary)
            {
                switch (_item.Key)
                {
                case "id":
                    id = ((string)((Newtonsoft.Json.Linq.JValue)_item.Value));
                    break;
                case "description":
                    description = DressDiscover.Api.Models.Worksheet.WorksheetDescription.FromJson((Newtonsoft.Json.Linq.JObject)_item.Value);
                    break;
                case "display_name":
                    displayName = ((string)((Newtonsoft.Json.Linq.JValue)_item.Value));
                    break;
                }
            }

            return new WorksheetExtentDefinition(id, description, displayName);
        }

        public System.Collections.Generic.IDictionary<string, object> ToBuiltins()
        {
            var _dictionary = new System.Collections.Generic.Dictionary<string, object>();
            _dictionary["id"] = this.Id;
            if (!(this.Description != null))
            {
                _dictionary["description"] = this.Description.ToBuiltins();
            }
            if (!(this.DisplayName != null))
            {
                _dictionary["display_name"] = this.DisplayName;
            }
            return _dictionary;
        }

        public Newtonsoft.Json.Linq.JObject ToJson()
        {
            var _dictionary = new Newtonsoft.Json.Linq.JObject();
            _dictionary["id"] = new Newtonsoft.Json.Linq.JValue((string)this.Id);
            if (!(this.Description != null))
            {
                _dictionary["description"] = this.Description.ToJson();
            }
            if (!(this.DisplayName != null))
            {
                _dictionary["display_name"] = new Newtonsoft.Json.Linq.JValue((string)this.DisplayName);
            }
            return _dictionary;
        }

        private DressDiscover.Api.Models.Worksheet.WorksheetDescription description;
        private string displayName;
        private string id;
    }
}
