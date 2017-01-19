namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetFeatureDefinition
    {
        public WorksheetFeatureDefinition(string id)
        {
            this.Id = id;
        }

        public WorksheetFeatureDefinition(string id, string displayName, System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition> values_) {
            this.Id = id;
            this.DisplayName = displayName;
            this.Values_ = values_;
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
                    throw new System.NullReferenceException("WorksheetFeatureDefinition.Id");
                }
                this.id = value;
            }
        }

        public System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition> Values_
        {
            get { return values_; }
            set { this.values_ = value; }
        }

        public static WorksheetFeatureDefinition FromBuiltins(System.Collections.Generic.IDictionary<string, object> _dictionary)
        {
            string id= null;
            string displayName= null;
            System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition> values_= null;

            foreach (var _item in _dictionary)
            {
                switch (_item.Key)
                {
                case "id":
                    id = ((string)_item.Value);
                    break;
                case "display_name":
                    displayName = ((string)_item.Value);
                    break;
                case "values_":
                    values_ = ((System.Func<System.Collections.Generic.IList<object>, System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition>>)((_sequence0) => { var _newSequence0 = new System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition>(); foreach (var _element0 in _sequence0) { _newSequence0.Add(DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition.FromBuiltins((System.Collections.Generic.IDictionary<string, object>)_element0)); } return _newSequence0; }))((System.Collections.Generic.IList<object>)_item.Value);
                    break;
                }
            }

            return new WorksheetFeatureDefinition(id, displayName, values_);
        }

        public static WorksheetFeatureDefinition FromJson(Newtonsoft.Json.Linq.JObject _dictionary)
        {
            string id= null;
            string displayName= null;
            System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition> values_= null;

            foreach (var _item in _dictionary)
            {
                switch (_item.Key)
                {
                case "id":
                    id = ((string)((Newtonsoft.Json.Linq.JValue)_item.Value));
                    break;
                case "display_name":
                    displayName = ((string)((Newtonsoft.Json.Linq.JValue)_item.Value));
                    break;
                case "values_":
                    values_ = ((System.Func<Newtonsoft.Json.Linq.JArray, System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition>>)((_sequence0) => { var _newSequence0 = new System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition>(); foreach (var _element0 in _sequence0) { _newSequence0.Add(DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition.FromJson((Newtonsoft.Json.Linq.JObject)_element0)); } return _newSequence0; }))((Newtonsoft.Json.Linq.JArray)_item.Value);
                    break;
                }
            }

            return new WorksheetFeatureDefinition(id, displayName, values_);
        }

        public System.Collections.Generic.IDictionary<string, object> ToBuiltins()
        {
            var _dictionary = new System.Collections.Generic.Dictionary<string, object>();
            _dictionary["id"] = this.Id;
            if (!(this.DisplayName != null))
            {
                _dictionary["display_name"] = this.DisplayName;
            }
            if (!(this.Values_ != null))
            {
                _dictionary["values_"] = ((System.Func<System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition>, System.Collections.Generic.IList<object>>)((_sequence0) => { var _newSequence0 = new System.Collections.Generic.List<object>(); foreach (var _element0 in _sequence0) { _newSequence0.Add(_element0.ToBuiltins()); } return _newSequence0; }))((System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition>)this.Values_);
            }
            return _dictionary;
        }

        public Newtonsoft.Json.Linq.JObject ToJson()
        {
            var _dictionary = new Newtonsoft.Json.Linq.JObject();
            _dictionary["id"] = new Newtonsoft.Json.Linq.JValue((string)this.Id);
            if (!(this.DisplayName != null))
            {
                _dictionary["display_name"] = new Newtonsoft.Json.Linq.JValue((string)this.DisplayName);
            }
            if (!(this.Values_ != null))
            {
                _dictionary["values_"] = ((System.Func<System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition>, Newtonsoft.Json.Linq.JArray>)((_sequence0) => { var _newSequence0 = new Newtonsoft.Json.Linq.JArray(); foreach (var _element0 in _sequence0) { _newSequence0.Add(_element0.ToJson()); } return _newSequence0; }))((System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition>)this.Values_);
            }
            return _dictionary;
        }

        private string displayName;
        private string id;
        private System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition> values_;
    }
}
