namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetState
    {
        public WorksheetState(System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState> featureSets, string id)
        {
            this.FeatureSets = featureSets;
            this.Id = id;
        }

        public WorksheetState(System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState> featureSets, string id, string text) {
            this.FeatureSets = featureSets;
            this.Id = id;
            this.Text = text;
        }

        public System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState> FeatureSets
        {
            get { return featureSets; }
            set
            {
                if (value == null)
                {
                    throw new System.NullReferenceException("WorksheetState.FeatureSets");
                }
                this.featureSets = value;
            }
        }

        public string Id
        {
            get { return id; }
            set
            {
                if (value == null)
                {
                    throw new System.NullReferenceException("WorksheetState.Id");
                }
                this.id = value;
            }
        }

        public string Text
        {
            get { return text; }
            set { this.text = value; }
        }

        public static WorksheetState FromBuiltins(System.Collections.Generic.IDictionary<string, object> _dictionary)
        {
            System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState> featureSets= null;
            string id= null;
            string text= null;

            foreach (var _item in _dictionary)
            {
                switch (_item.Key)
                {
                case "feature_sets":
                    featureSets = ((System.Func<System.Collections.Generic.IList<object>, System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState>>)((_sequence0) => { var _newSequence0 = new System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState>(); foreach (var _element0 in _sequence0) { _newSequence0.Add(DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState.FromBuiltins((System.Collections.Generic.IDictionary<string, object>)_element0)); } return _newSequence0; }))((System.Collections.Generic.IList<object>)_item.Value);
                    break;
                case "id":
                    id = ((string)_item.Value);
                    break;
                case "text":
                    text = ((string)_item.Value);
                    break;
                }
            }

            return new WorksheetState(featureSets, id, text);
        }

        public static WorksheetState FromJson(Newtonsoft.Json.Linq.JObject _dictionary)
        {
            System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState> featureSets= null;
            string id= null;
            string text= null;

            foreach (var _item in _dictionary)
            {
                switch (_item.Key)
                {
                case "feature_sets":
                    featureSets = ((System.Func<Newtonsoft.Json.Linq.JArray, System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState>>)((_sequence0) => { var _newSequence0 = new System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState>(); foreach (var _element0 in _sequence0) { _newSequence0.Add(DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState.FromJson((Newtonsoft.Json.Linq.JObject)_element0)); } return _newSequence0; }))((Newtonsoft.Json.Linq.JArray)_item.Value);
                    break;
                case "id":
                    id = ((string)((Newtonsoft.Json.Linq.JValue)_item.Value));
                    break;
                case "text":
                    text = ((string)((Newtonsoft.Json.Linq.JValue)_item.Value));
                    break;
                }
            }

            return new WorksheetState(featureSets, id, text);
        }

        public System.Collections.Generic.IDictionary<string, object> ToBuiltins()
        {
            var _dictionary = new System.Collections.Generic.Dictionary<string, object>();
            _dictionary["feature_sets"] = ((System.Func<System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState>, System.Collections.Generic.IList<object>>)((_sequence0) => { var _newSequence0 = new System.Collections.Generic.List<object>(); foreach (var _element0 in _sequence0) { _newSequence0.Add(_element0.ToBuiltins()); } return _newSequence0; }))((System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState>)this.FeatureSets);
            _dictionary["id"] = this.Id;
            if (!(this.Text != null))
            {
                _dictionary["text"] = this.Text;
            }
            return _dictionary;
        }

        public Newtonsoft.Json.Linq.JObject ToJson()
        {
            var _dictionary = new Newtonsoft.Json.Linq.JObject();
            _dictionary["feature_sets"] = ((System.Func<System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState>, Newtonsoft.Json.Linq.JArray>)((_sequence0) => { var _newSequence0 = new Newtonsoft.Json.Linq.JArray(); foreach (var _element0 in _sequence0) { _newSequence0.Add(_element0.ToJson()); } return _newSequence0; }))((System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState>)this.FeatureSets);
            _dictionary["id"] = new Newtonsoft.Json.Linq.JValue((string)this.Id);
            if (!(this.Text != null))
            {
                _dictionary["text"] = new Newtonsoft.Json.Linq.JValue((string)this.Text);
            }
            return _dictionary;
        }

        private System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState> featureSets;
        private string id;
        private string text;
    }
}
