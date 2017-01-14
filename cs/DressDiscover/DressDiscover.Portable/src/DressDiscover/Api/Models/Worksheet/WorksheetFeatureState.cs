namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetFeatureState
    {
        public WorksheetFeatureState()
        {
        }

        public WorksheetFeatureState(System.Collections.Generic.List<string> selectedValues, string text) {
            this.SelectedValues = selectedValues;
            this.Text = text;
        }

        public System.Collections.Generic.List<string> SelectedValues
        {
            get { return selectedValues; }
            set { this.selectedValues = value; }
        }

        public string Text
        {
            get { return text; }
            set { this.text = value; }
        }

        public static WorksheetFeatureState FromBuiltins(System.Collections.Generic.Dictionary<string, object> _dictionary)
        {
            System.Collections.Generic.List<string> selectedValues= null;
            string text= null;

            foreach (var _item in _dictionary)
            {
                switch (_item.Key)
                {
                case "selected_values":
                    selectedValues = ((System.Func<System.Collections.Generic.List<object>, System.Collections.Generic.List<string>>)((_sequence0) => { var _newSequence0 = new System.Collections.Generic.List<string>(); foreach (var _element0 in _sequence0) { _newSequence0.Add(((string)_element0)); } return _newSequence0; }))((System.Collections.Generic.List<object>)_item.Value);
                    break;
                case "text":
                    text = ((string)_item.Value);
                    break;
                }
            }

            return new WorksheetFeatureState(selectedValues, text);
        }

        public System.Collections.Generic.Dictionary<string, object> ToBuiltins()
        {
            var _builtins = new System.Collections.Generic.Dictionary<string, object>();
            if (!(this.SelectedValues != null))
            {
                _builtins["selected_values"] = ((System.Func<System.Collections.Generic.List<string>, System.Collections.Generic.List<object>>)((_sequence0) => { var _newSequence0 = new System.Collections.Generic.List<object>(); foreach (var _element0 in _sequence0) { _newSequence0.Add(_element0); } return _newSequence0; }))((System.Collections.Generic.List<string>)this.SelectedValues);
            }
            if (!(this.Text != null))
            {
                _builtins["text"] = this.Text;
            }
            return _builtins;
        }

        private System.Collections.Generic.List<string> selectedValues;
        private string text;
    }
}
