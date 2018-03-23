namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetFeatureSetState
    {
        public WorksheetFeatureSetState(System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureState> features, string id)
        {
            this.Features = features;
            this.Id = id;
        }

        public System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureState> Features
        {
            get { return features; }
            set
            {
                if (value == null)
                {
                    throw new System.NullReferenceException("WorksheetFeatureSetState.Features");
                }
                this.features = value;
            }
        }

        public string Id
        {
            get { return id; }
            set
            {
                if (value == null)
                {
                    throw new System.NullReferenceException("WorksheetFeatureSetState.Id");
                }
                this.id = value;
            }
        }

        public static WorksheetFeatureSetState FromBuiltins(System.Collections.Generic.IDictionary<string, object> _dictionary)
        {
            System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureState> features= null;
            string id= null;

            foreach (var _item in _dictionary)
            {
                switch (_item.Key)
                {
                case "features":
                    features = ((System.Func<System.Collections.Generic.IList<object>, System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureState>>)((_sequence0) => { var _newSequence0 = new System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureState>(); foreach (var _element0 in _sequence0) { _newSequence0.Add(DressDiscover.Api.Models.Worksheet.WorksheetFeatureState.FromBuiltins((System.Collections.Generic.IDictionary<string, object>)_element0)); } return _newSequence0; }))((System.Collections.Generic.IList<object>)_item.Value);
                    break;
                case "id":
                    id = ((string)_item.Value);
                    break;
                }
            }

            return new WorksheetFeatureSetState(features, id);
        }

        public static WorksheetFeatureSetState FromJson(Newtonsoft.Json.Linq.JObject _dictionary)
        {
            System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureState> features= null;
            string id= null;

            foreach (var _item in _dictionary)
            {
                switch (_item.Key)
                {
                case "features":
                    features = ((System.Func<Newtonsoft.Json.Linq.JArray, System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureState>>)((_sequence0) => { var _newSequence0 = new System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureState>(); foreach (var _element0 in _sequence0) { _newSequence0.Add(DressDiscover.Api.Models.Worksheet.WorksheetFeatureState.FromJson((Newtonsoft.Json.Linq.JObject)_element0)); } return _newSequence0; }))((Newtonsoft.Json.Linq.JArray)_item.Value);
                    break;
                case "id":
                    id = ((string)((Newtonsoft.Json.Linq.JValue)_item.Value));
                    break;
                }
            }

            return new WorksheetFeatureSetState(features, id);
        }

        public System.Collections.Generic.IDictionary<string, object> ToBuiltins()
        {
            var _dictionary = new System.Collections.Generic.Dictionary<string, object>();
            _dictionary["features"] = ((System.Func<System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureState>, System.Collections.Generic.IList<object>>)((_sequence0) => { var _newSequence0 = new System.Collections.Generic.List<object>(); foreach (var _element0 in _sequence0) { _newSequence0.Add(_element0.ToBuiltins()); } return _newSequence0; }))((System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureState>)this.Features);
            _dictionary["id"] = this.Id;
            return _dictionary;
        }

        public Newtonsoft.Json.Linq.JObject ToJson()
        {
            var _dictionary = new Newtonsoft.Json.Linq.JObject();
            _dictionary["features"] = ((System.Func<System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureState>, Newtonsoft.Json.Linq.JArray>)((_sequence0) => { var _newSequence0 = new Newtonsoft.Json.Linq.JArray(); foreach (var _element0 in _sequence0) { _newSequence0.Add(_element0.ToJson()); } return _newSequence0; }))((System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureState>)this.Features);
            _dictionary["id"] = new Newtonsoft.Json.Linq.JValue((string)this.Id);
            return _dictionary;
        }

        private System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureState> features;
        private string id;
    }
}
