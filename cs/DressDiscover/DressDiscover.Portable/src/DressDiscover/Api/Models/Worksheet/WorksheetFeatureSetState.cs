namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetFeatureSetState
    {
        public WorksheetFeatureSetState()
        {
        }

        public WorksheetFeatureSetState(System.Collections.Generic.Dictionary<string, DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState> childFeatureSets, System.Collections.Generic.Dictionary<string, DressDiscover.Api.Models.Worksheet.WorksheetFeatureState> features) {
            this.ChildFeatureSets = childFeatureSets;
            this.Features = features;
        }

        public System.Collections.Generic.Dictionary<string, DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState> ChildFeatureSets
        {
            get { return childFeatureSets; }
            set { this.childFeatureSets = value; }
        }

        public System.Collections.Generic.Dictionary<string, DressDiscover.Api.Models.Worksheet.WorksheetFeatureState> Features
        {
            get { return features; }
            set { this.features = value; }
        }

        public static WorksheetFeatureSetState FromBuiltins(System.Collections.Generic.IDictionary<string, object> _dictionary)
        {
            System.Collections.Generic.Dictionary<string, DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState> childFeatureSets= null;
            System.Collections.Generic.Dictionary<string, DressDiscover.Api.Models.Worksheet.WorksheetFeatureState> features= null;

            foreach (var _item in _dictionary)
            {
                switch (_item.Key)
                {
                case "child_feature_sets":
                    childFeatureSets = ((System.Func<System.Collections.Generic.Dictionary<object, object>, System.Collections.Generic.Dictionary<string, DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState>>)((_map0) => { var _newMap0 = new System.Collections.Generic.Dictionary<string, DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState>(); foreach (var _item0 in _map0) { _newMap0.Add(((string)_item0.Key), DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState.FromBuiltins((System.Collections.Generic.IDictionary<string, object>)_item0.Value)); } return _newMap0; }))((System.Collections.Generic.Dictionary<object, object>)_item.Value);
                    break;
                case "features":
                    features = ((System.Func<System.Collections.Generic.Dictionary<object, object>, System.Collections.Generic.Dictionary<string, DressDiscover.Api.Models.Worksheet.WorksheetFeatureState>>)((_map0) => { var _newMap0 = new System.Collections.Generic.Dictionary<string, DressDiscover.Api.Models.Worksheet.WorksheetFeatureState>(); foreach (var _item0 in _map0) { _newMap0.Add(((string)_item0.Key), DressDiscover.Api.Models.Worksheet.WorksheetFeatureState.FromBuiltins((System.Collections.Generic.IDictionary<string, object>)_item0.Value)); } return _newMap0; }))((System.Collections.Generic.Dictionary<object, object>)_item.Value);
                    break;
                }
            }

            return new WorksheetFeatureSetState(childFeatureSets, features);
        }

        public static WorksheetFeatureSetState FromJson(Newtonsoft.Json.Linq.JObject _dictionary)
        {
            System.Collections.Generic.Dictionary<string, DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState> childFeatureSets= null;
            System.Collections.Generic.Dictionary<string, DressDiscover.Api.Models.Worksheet.WorksheetFeatureState> features= null;

            foreach (var _item in _dictionary)
            {
                switch (_item.Key)
                {
                case "child_feature_sets":
                    childFeatureSets = ((System.Func<Newtonsoft.Json.Linq.JObject, System.Collections.Generic.Dictionary<string, DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState>>)((_map0) => { var _newMap0 = new System.Collections.Generic.Dictionary<string, DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState>(); foreach (var _item0 in _map0) { _newMap0.Add(((string)((Newtonsoft.Json.Linq.JValue)_item0.Key)), DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState.FromJson((Newtonsoft.Json.Linq.JObject)_item0.Value)); } return _newMap0; }))((Newtonsoft.Json.Linq.JObject)_item.Value);
                    break;
                case "features":
                    features = ((System.Func<Newtonsoft.Json.Linq.JObject, System.Collections.Generic.Dictionary<string, DressDiscover.Api.Models.Worksheet.WorksheetFeatureState>>)((_map0) => { var _newMap0 = new System.Collections.Generic.Dictionary<string, DressDiscover.Api.Models.Worksheet.WorksheetFeatureState>(); foreach (var _item0 in _map0) { _newMap0.Add(((string)((Newtonsoft.Json.Linq.JValue)_item0.Key)), DressDiscover.Api.Models.Worksheet.WorksheetFeatureState.FromJson((Newtonsoft.Json.Linq.JObject)_item0.Value)); } return _newMap0; }))((Newtonsoft.Json.Linq.JObject)_item.Value);
                    break;
                }
            }

            return new WorksheetFeatureSetState(childFeatureSets, features);
        }

        public System.Collections.Generic.IDictionary<string, object> ToBuiltins()
        {
            var _dictionary = new System.Collections.Generic.Dictionary<string, object>();
            if (!(this.ChildFeatureSets != null))
            {
                _dictionary["child_feature_sets"] = ((System.Func<System.Collections.Generic.Dictionary<string, DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState>, System.Collections.Generic.Dictionary<object, object>>)((_map0) => { var _newMap0 = new System.Collections.Generic.Dictionary<object, object>(); foreach (var _item0 in _map0) { _newMap0.Add(_item0.Key, _item0.Value.ToBuiltins()); } return _newMap0; }))((System.Collections.Generic.Dictionary<string, DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState>)this.ChildFeatureSets);
            }
            if (!(this.Features != null))
            {
                _dictionary["features"] = ((System.Func<System.Collections.Generic.Dictionary<string, DressDiscover.Api.Models.Worksheet.WorksheetFeatureState>, System.Collections.Generic.Dictionary<object, object>>)((_map0) => { var _newMap0 = new System.Collections.Generic.Dictionary<object, object>(); foreach (var _item0 in _map0) { _newMap0.Add(_item0.Key, _item0.Value.ToBuiltins()); } return _newMap0; }))((System.Collections.Generic.Dictionary<string, DressDiscover.Api.Models.Worksheet.WorksheetFeatureState>)this.Features);
            }
            return _dictionary;
        }

        public Newtonsoft.Json.Linq.JObject ToJson()
        {
            var _dictionary = new Newtonsoft.Json.Linq.JObject();
            if (!(this.ChildFeatureSets != null))
            {
                _dictionary["child_feature_sets"] = ((System.Func<System.Collections.Generic.Dictionary<string, DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState>, Newtonsoft.Json.Linq.JObject>)((_map0) => { var _newMap0 = new Newtonsoft.Json.Linq.JObject(); foreach (var _item0 in _map0) { _newMap0.Add(_item0.Key, _item0.Value.ToJson()); } return _newMap0; }))((System.Collections.Generic.Dictionary<string, DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState>)this.ChildFeatureSets);
            }
            if (!(this.Features != null))
            {
                _dictionary["features"] = ((System.Func<System.Collections.Generic.Dictionary<string, DressDiscover.Api.Models.Worksheet.WorksheetFeatureState>, Newtonsoft.Json.Linq.JObject>)((_map0) => { var _newMap0 = new Newtonsoft.Json.Linq.JObject(); foreach (var _item0 in _map0) { _newMap0.Add(_item0.Key, _item0.Value.ToJson()); } return _newMap0; }))((System.Collections.Generic.Dictionary<string, DressDiscover.Api.Models.Worksheet.WorksheetFeatureState>)this.Features);
            }
            return _dictionary;
        }

        private System.Collections.Generic.Dictionary<string, DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState> childFeatureSets;
        private System.Collections.Generic.Dictionary<string, DressDiscover.Api.Models.Worksheet.WorksheetFeatureState> features;
    }
}
