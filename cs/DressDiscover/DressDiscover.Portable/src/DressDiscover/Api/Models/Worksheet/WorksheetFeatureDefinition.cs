namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetFeatureDefinition
    {
        public WorksheetFeatureDefinition(string id)
        {
            this.Id = id;
        }

        public WorksheetFeatureDefinition(string id, string displayName, System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition> values_) {
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

        public System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition> Values_
        {
            get { return values_; }
            set { this.values_ = value; }
        }

        public static WorksheetFeatureDefinition FromBuiltins(System.Collections.Generic.Dictionary<string, object> _dictionary)
        {
            string id= null;
            string displayName= null;
            System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition> values_= null;

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
                    values_ = ((System.Func<System.Collections.Generic.List<object>, System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition>>)((_sequence0) => { var _newSequence0 = new System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition>(); foreach (var _element0 in _sequence0) { _newSequence0.Add(DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition.FromBuiltins((System.Collections.Generic.Dictionary<string, object>)_element0)); } return _newSequence0; }))((System.Collections.Generic.List<object>)_item.Value);
                    break;
                }
            }

            return new WorksheetFeatureDefinition(id, displayName, values_);
        }

        public System.Collections.Generic.Dictionary<string, object> ToBuiltins()
        {
            var _builtins = new System.Collections.Generic.Dictionary<string, object>();
            _builtins["id"] = this.Id;
            if (!(this.DisplayName != null))
            {
                _builtins["display_name"] = this.DisplayName;
            }
            if (!(this.Values_ != null))
            {
                _builtins["values_"] = ((System.Func<System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition>, System.Collections.Generic.List<object>>)((_sequence0) => { var _newSequence0 = new System.Collections.Generic.List<object>(); foreach (var _element0 in _sequence0) { _newSequence0.Add(_element0.ToBuiltins()); } return _newSequence0; }))((System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition>)this.Values_);
            }
            return _builtins;
        }

        private string displayName;
        private string id;
        private System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition> values_;
    }
}
