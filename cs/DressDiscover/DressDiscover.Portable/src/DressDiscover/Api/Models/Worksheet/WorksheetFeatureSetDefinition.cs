namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetFeatureSetDefinition
    {
        public WorksheetFeatureSetDefinition(string id)
        {
            this.Id = id;
        }

        public WorksheetFeatureSetDefinition(string id, System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetDefinition> childFeatureSets, string displayName, System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureDefinition> features) {
            this.Id = id;
            this.ChildFeatureSets = childFeatureSets;
            this.DisplayName = displayName;
            this.Features = features;
        }

        public System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetDefinition> ChildFeatureSets
        {
            get { return childFeatureSets; }
            set { this.childFeatureSets = value; }
        }

        public string DisplayName
        {
            get { return displayName; }
            set { this.displayName = value; }
        }

        public System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureDefinition> Features
        {
            get { return features; }
            set { this.features = value; }
        }

        public string Id
        {
            get { return id; }
            set
            {
                if (value == null)
                {
                    throw new System.NullReferenceException("WorksheetFeatureSetDefinition.Id");
                }
                this.id = value;
            }
        }

        public static WorksheetFeatureSetDefinition FromBuiltins(System.Collections.Generic.Dictionary<string, object> _dictionary)
        {
            string id= null;
            System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetDefinition> childFeatureSets= null;
            string displayName= null;
            System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureDefinition> features= null;

            foreach (var _item in _dictionary)
            {
                switch (_item.Key)
                {
                case "id":
                    id = ((string)_item.Value);
                    break;
                case "child_feature_sets":
                    childFeatureSets = ((System.Func<System.Collections.Generic.List<object>, System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetDefinition>>)((_sequence0) => { var _newSequence0 = new System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetDefinition>(); foreach (var _element0 in _sequence0) { _newSequence0.Add(DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetDefinition.FromBuiltins((System.Collections.Generic.Dictionary<string, object>)_element0)); } return _newSequence0; }))((System.Collections.Generic.List<object>)_item.Value);
                    break;
                case "display_name":
                    displayName = ((string)_item.Value);
                    break;
                case "features":
                    features = ((System.Func<System.Collections.Generic.List<object>, System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureDefinition>>)((_sequence0) => { var _newSequence0 = new System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureDefinition>(); foreach (var _element0 in _sequence0) { _newSequence0.Add(DressDiscover.Api.Models.Worksheet.WorksheetFeatureDefinition.FromBuiltins((System.Collections.Generic.Dictionary<string, object>)_element0)); } return _newSequence0; }))((System.Collections.Generic.List<object>)_item.Value);
                    break;
                }
            }

            return new WorksheetFeatureSetDefinition(id, childFeatureSets, displayName, features);
        }

        public System.Collections.Generic.Dictionary<string, object> ToBuiltins()
        {
            var _builtins = new System.Collections.Generic.Dictionary<string, object>();
            _builtins["id"] = this.Id;
            if (!(this.ChildFeatureSets != null))
            {
                _builtins["child_feature_sets"] = ((System.Func<System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetDefinition>, System.Collections.Generic.List<object>>)((_sequence0) => { var _newSequence0 = new System.Collections.Generic.List<object>(); foreach (var _element0 in _sequence0) { _newSequence0.Add(_element0.ToBuiltins()); } return _newSequence0; }))((System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetDefinition>)this.ChildFeatureSets);
            }
            if (!(this.DisplayName != null))
            {
                _builtins["display_name"] = this.DisplayName;
            }
            if (!(this.Features != null))
            {
                _builtins["features"] = ((System.Func<System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureDefinition>, System.Collections.Generic.List<object>>)((_sequence0) => { var _newSequence0 = new System.Collections.Generic.List<object>(); foreach (var _element0 in _sequence0) { _newSequence0.Add(_element0.ToBuiltins()); } return _newSequence0; }))((System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureDefinition>)this.Features);
            }
            return _builtins;
        }

        private System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetDefinition> childFeatureSets;
        private string displayName;
        private System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureDefinition> features;
        private string id;
    }
}
