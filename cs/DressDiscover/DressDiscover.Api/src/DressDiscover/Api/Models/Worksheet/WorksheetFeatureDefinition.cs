namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetFeatureDefinition
    {
        public WorksheetFeatureDefinition(string id, System.Collections.Generic.IList<string> valueIds)
        {
            this.Id = id;
            this.ValueIds = valueIds;
        }

        public WorksheetFeatureDefinition(string id, System.Collections.Generic.IList<string> valueIds, DressDiscover.Api.Models.Worksheet.WorksheetDescription description, string displayName, System.Collections.Generic.ISet<string> extentIds) {
            this.Id = id;
            this.ValueIds = valueIds;
            this.Description = description;
            this.DisplayName = displayName;
            this.ExtentIds = extentIds;
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

        public System.Collections.Generic.ISet<string> ExtentIds
        {
            get { return extentIds; }
            set { this.extentIds = value; }
        }

        public string Id
        {
            get { return id; }
            set
            {
                if (value == null)
                {
                    throw new System.NullReferenceException("WorksheetFeatureDefinition.Id");
                }
                this.id = value;
            }
        }

        public System.Collections.Generic.IList<string> ValueIds
        {
            get { return valueIds; }
            set
            {
                if (value == null)
                {
                    throw new System.NullReferenceException("WorksheetFeatureDefinition.ValueIds");
                }
                this.valueIds = value;
            }
        }

        public static WorksheetFeatureDefinition FromBuiltins(System.Collections.Generic.IDictionary<string, object> _dictionary)
        {
            string id= null;
            System.Collections.Generic.IList<string> valueIds= null;
            DressDiscover.Api.Models.Worksheet.WorksheetDescription description= null;
            string displayName= null;
            System.Collections.Generic.ISet<string> extentIds= null;

            foreach (var _item in _dictionary)
            {
                switch (_item.Key)
                {
                case "id":
                    id = ((string)_item.Value);
                    break;
                case "value_ids":
                    valueIds = ((System.Func<System.Collections.Generic.IList<object>, System.Collections.Generic.IList<string>>)((_sequence0) => { var _newSequence0 = new System.Collections.Generic.List<string>(); foreach (var _element0 in _sequence0) { _newSequence0.Add(((string)_element0)); } return _newSequence0; }))((System.Collections.Generic.IList<object>)_item.Value);
                    break;
                case "description":
                    description = DressDiscover.Api.Models.Worksheet.WorksheetDescription.FromBuiltins((System.Collections.Generic.IDictionary<string, object>)_item.Value);
                    break;
                case "display_name":
                    displayName = ((string)_item.Value);
                    break;
                case "extent_ids":
                    extentIds = ((System.Func<System.Collections.Generic.ISet<object>, System.Collections.Generic.ISet<string>>)((_sequence0) => { var _newSequence0 = new System.Collections.Generic.HashSet<string>(); foreach (var _element0 in _sequence0) { _newSequence0.Add(((string)_element0)); } return _newSequence0; }))((System.Collections.Generic.ISet<object>)_item.Value);
                    break;
                }
            }

            return new WorksheetFeatureDefinition(id, valueIds, description, displayName, extentIds);
        }

        public static WorksheetFeatureDefinition FromJson(Newtonsoft.Json.Linq.JObject _dictionary)
        {
            string id= null;
            System.Collections.Generic.IList<string> valueIds= null;
            DressDiscover.Api.Models.Worksheet.WorksheetDescription description= null;
            string displayName= null;
            System.Collections.Generic.ISet<string> extentIds= null;

            foreach (var _item in _dictionary)
            {
                switch (_item.Key)
                {
                case "id":
                    id = ((string)((Newtonsoft.Json.Linq.JValue)_item.Value));
                    break;
                case "value_ids":
                    valueIds = ((System.Func<Newtonsoft.Json.Linq.JArray, System.Collections.Generic.IList<string>>)((_sequence0) => { var _newSequence0 = new System.Collections.Generic.List<string>(); foreach (var _element0 in _sequence0) { _newSequence0.Add(((string)((Newtonsoft.Json.Linq.JValue)_element0))); } return _newSequence0; }))((Newtonsoft.Json.Linq.JArray)_item.Value);
                    break;
                case "description":
                    description = DressDiscover.Api.Models.Worksheet.WorksheetDescription.FromJson((Newtonsoft.Json.Linq.JObject)_item.Value);
                    break;
                case "display_name":
                    displayName = ((string)((Newtonsoft.Json.Linq.JValue)_item.Value));
                    break;
                case "extent_ids":
                    extentIds = ((System.Func<Newtonsoft.Json.Linq.JArray, System.Collections.Generic.ISet<string>>)((_sequence0) => { var _newSequence0 = new System.Collections.Generic.HashSet<string>(); foreach (var _element0 in _sequence0) { _newSequence0.Add(((string)((Newtonsoft.Json.Linq.JValue)_element0))); } return _newSequence0; }))((Newtonsoft.Json.Linq.JArray)_item.Value);
                    break;
                }
            }

            return new WorksheetFeatureDefinition(id, valueIds, description, displayName, extentIds);
        }

        public System.Collections.Generic.IDictionary<string, object> ToBuiltins()
        {
            var _dictionary = new System.Collections.Generic.Dictionary<string, object>();
            _dictionary["id"] = this.Id;
            _dictionary["value_ids"] = ((System.Func<System.Collections.Generic.IList<string>, System.Collections.Generic.IList<object>>)((_sequence0) => { var _newSequence0 = new System.Collections.Generic.List<object>(); foreach (var _element0 in _sequence0) { _newSequence0.Add(_element0); } return _newSequence0; }))((System.Collections.Generic.IList<string>)this.ValueIds);
            if (!(this.Description != null))
            {
                _dictionary["description"] = this.Description.ToBuiltins();
            }
            if (!(this.DisplayName != null))
            {
                _dictionary["display_name"] = this.DisplayName;
            }
            if (!(this.ExtentIds != null))
            {
                _dictionary["extent_ids"] = ((System.Func<System.Collections.Generic.ISet<string>, System.Collections.Generic.ISet<object>>)((_sequence0) => { var _newSequence0 = new System.Collections.Generic.HashSet<object>(); foreach (var _element0 in _sequence0) { _newSequence0.Add(_element0); } return _newSequence0; }))((System.Collections.Generic.ISet<string>)this.ExtentIds);
            }
            return _dictionary;
        }

        public Newtonsoft.Json.Linq.JObject ToJson()
        {
            var _dictionary = new Newtonsoft.Json.Linq.JObject();
            _dictionary["id"] = new Newtonsoft.Json.Linq.JValue((string)this.Id);
            _dictionary["value_ids"] = ((System.Func<System.Collections.Generic.IList<string>, Newtonsoft.Json.Linq.JArray>)((_sequence0) => { var _newSequence0 = new Newtonsoft.Json.Linq.JArray(); foreach (var _element0 in _sequence0) { _newSequence0.Add(new Newtonsoft.Json.Linq.JValue((string)_element0)); } return _newSequence0; }))((System.Collections.Generic.IList<string>)this.ValueIds);
            if (!(this.Description != null))
            {
                _dictionary["description"] = this.Description.ToJson();
            }
            if (!(this.DisplayName != null))
            {
                _dictionary["display_name"] = new Newtonsoft.Json.Linq.JValue((string)this.DisplayName);
            }
            if (!(this.ExtentIds != null))
            {
                _dictionary["extent_ids"] = ((System.Func<System.Collections.Generic.ISet<string>, Newtonsoft.Json.Linq.JArray>)((_sequence0) => { var _newSequence0 = new Newtonsoft.Json.Linq.JArray(); foreach (var _element0 in _sequence0) { _newSequence0.Add(new Newtonsoft.Json.Linq.JValue((string)_element0)); } return _newSequence0; }))((System.Collections.Generic.ISet<string>)this.ExtentIds);
            }
            return _dictionary;
        }

        private DressDiscover.Api.Models.Worksheet.WorksheetDescription description;
        private string displayName;
        private System.Collections.Generic.ISet<string> extentIds;
        private string id;
        private System.Collections.Generic.IList<string> valueIds;
    }
}
