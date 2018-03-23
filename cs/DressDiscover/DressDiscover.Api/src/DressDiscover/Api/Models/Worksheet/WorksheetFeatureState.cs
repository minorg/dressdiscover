namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetFeatureState
    {
        public WorksheetFeatureState(string id)
        {
            this.Id = id;
        }

        public WorksheetFeatureState(string id, System.Collections.Generic.IList<string> selectedValueIds, string text) {
            this.Id = id;
            this.SelectedValueIds = selectedValueIds;
            this.Text = text;
        }

        public string Id
        {
            get { return id; }
            set
            {
                if (value == null)
                {
                    throw new System.NullReferenceException("WorksheetFeatureState.Id");
                }
                this.id = value;
            }
        }

        public System.Collections.Generic.IList<string> SelectedValueIds
        {
            get { return selectedValueIds; }
            set { this.selectedValueIds = value; }
        }

        public string Text
        {
            get { return text; }
            set { this.text = value; }
        }

        public static WorksheetFeatureState FromBuiltins(System.Collections.Generic.IDictionary<string, object> _dictionary)
        {
            string id= null;
            System.Collections.Generic.IList<string> selectedValueIds= null;
            string text= null;

            foreach (var _item in _dictionary)
            {
                switch (_item.Key)
                {
                case "id":
                    id = ((string)_item.Value);
                    break;
                case "selected_value_ids":
                    selectedValueIds = ((System.Func<System.Collections.Generic.IList<object>, System.Collections.Generic.IList<string>>)((_sequence0) => { var _newSequence0 = new System.Collections.Generic.List<string>(); foreach (var _element0 in _sequence0) { _newSequence0.Add(((string)_element0)); } return _newSequence0; }))((System.Collections.Generic.IList<object>)_item.Value);
                    break;
                case "text":
                    text = ((string)_item.Value);
                    break;
                }
            }

            return new WorksheetFeatureState(id, selectedValueIds, text);
        }

        public static WorksheetFeatureState FromJson(Newtonsoft.Json.Linq.JObject _dictionary)
        {
            string id= null;
            System.Collections.Generic.IList<string> selectedValueIds= null;
            string text= null;

            foreach (var _item in _dictionary)
            {
                switch (_item.Key)
                {
                case "id":
                    id = ((string)((Newtonsoft.Json.Linq.JValue)_item.Value));
                    break;
                case "selected_value_ids":
                    selectedValueIds = ((System.Func<Newtonsoft.Json.Linq.JArray, System.Collections.Generic.IList<string>>)((_sequence0) => { var _newSequence0 = new System.Collections.Generic.List<string>(); foreach (var _element0 in _sequence0) { _newSequence0.Add(((string)((Newtonsoft.Json.Linq.JValue)_element0))); } return _newSequence0; }))((Newtonsoft.Json.Linq.JArray)_item.Value);
                    break;
                case "text":
                    text = ((string)((Newtonsoft.Json.Linq.JValue)_item.Value));
                    break;
                }
            }

            return new WorksheetFeatureState(id, selectedValueIds, text);
        }

        public System.Collections.Generic.IDictionary<string, object> ToBuiltins()
        {
            var _dictionary = new System.Collections.Generic.Dictionary<string, object>();
            _dictionary["id"] = this.Id;
            if (!(this.SelectedValueIds != null))
            {
                _dictionary["selected_value_ids"] = ((System.Func<System.Collections.Generic.IList<string>, System.Collections.Generic.IList<object>>)((_sequence0) => { var _newSequence0 = new System.Collections.Generic.List<object>(); foreach (var _element0 in _sequence0) { _newSequence0.Add(_element0); } return _newSequence0; }))((System.Collections.Generic.IList<string>)this.SelectedValueIds);
            }
            if (!(this.Text != null))
            {
                _dictionary["text"] = this.Text;
            }
            return _dictionary;
        }

        public Newtonsoft.Json.Linq.JObject ToJson()
        {
            var _dictionary = new Newtonsoft.Json.Linq.JObject();
            _dictionary["id"] = new Newtonsoft.Json.Linq.JValue((string)this.Id);
            if (!(this.SelectedValueIds != null))
            {
                _dictionary["selected_value_ids"] = ((System.Func<System.Collections.Generic.IList<string>, Newtonsoft.Json.Linq.JArray>)((_sequence0) => { var _newSequence0 = new Newtonsoft.Json.Linq.JArray(); foreach (var _element0 in _sequence0) { _newSequence0.Add(new Newtonsoft.Json.Linq.JValue((string)_element0)); } return _newSequence0; }))((System.Collections.Generic.IList<string>)this.SelectedValueIds);
            }
            if (!(this.Text != null))
            {
                _dictionary["text"] = new Newtonsoft.Json.Linq.JValue((string)this.Text);
            }
            return _dictionary;
        }

        private string id;
        private System.Collections.Generic.IList<string> selectedValueIds;
        private string text;
    }
}
