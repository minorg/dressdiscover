namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetDefinition
    {
        public WorksheetDefinition(System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetDefinition> featureSets, System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition> featureValues, System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureDefinition> features)
        {
            this.FeatureSets = featureSets;
            this.FeatureValues = featureValues;
            this.Features = features;
        }

        public WorksheetDefinition(System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetDefinition> featureSets, System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition> featureValues, System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureDefinition> features, System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetExtentDefinition> extents) {
            this.FeatureSets = featureSets;
            this.FeatureValues = featureValues;
            this.Features = features;
            this.Extents = extents;
        }

        public System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetExtentDefinition> Extents
        {
            get { return extents; }
            set { this.extents = value; }
        }

        public System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetDefinition> FeatureSets
        {
            get { return featureSets; }
            set
            {
                if (value == null)
                {
                    throw new System.NullReferenceException("WorksheetDefinition.FeatureSets");
                }
                this.featureSets = value;
            }
        }

        public System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition> FeatureValues
        {
            get { return featureValues; }
            set
            {
                if (value == null)
                {
                    throw new System.NullReferenceException("WorksheetDefinition.FeatureValues");
                }
                this.featureValues = value;
            }
        }

        public System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureDefinition> Features
        {
            get { return features; }
            set
            {
                if (value == null)
                {
                    throw new System.NullReferenceException("WorksheetDefinition.Features");
                }
                this.features = value;
            }
        }

        public static WorksheetDefinition FromBuiltins(System.Collections.Generic.IDictionary<string, object> _dictionary)
        {
            System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetDefinition> featureSets= null;
            System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition> featureValues= null;
            System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureDefinition> features= null;
            System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetExtentDefinition> extents= null;

            foreach (var _item in _dictionary)
            {
                switch (_item.Key)
                {
                case "feature_sets":
                    featureSets = ((System.Func<System.Collections.Generic.IList<object>, System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetDefinition>>)((_sequence0) => { var _newSequence0 = new System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetDefinition>(); foreach (var _element0 in _sequence0) { _newSequence0.Add(DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetDefinition.FromBuiltins((System.Collections.Generic.IDictionary<string, object>)_element0)); } return _newSequence0; }))((System.Collections.Generic.IList<object>)_item.Value);
                    break;
                case "feature_values":
                    featureValues = ((System.Func<System.Collections.Generic.IList<object>, System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition>>)((_sequence0) => { var _newSequence0 = new System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition>(); foreach (var _element0 in _sequence0) { _newSequence0.Add(DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition.FromBuiltins((System.Collections.Generic.IDictionary<string, object>)_element0)); } return _newSequence0; }))((System.Collections.Generic.IList<object>)_item.Value);
                    break;
                case "features":
                    features = ((System.Func<System.Collections.Generic.IList<object>, System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureDefinition>>)((_sequence0) => { var _newSequence0 = new System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureDefinition>(); foreach (var _element0 in _sequence0) { _newSequence0.Add(DressDiscover.Api.Models.Worksheet.WorksheetFeatureDefinition.FromBuiltins((System.Collections.Generic.IDictionary<string, object>)_element0)); } return _newSequence0; }))((System.Collections.Generic.IList<object>)_item.Value);
                    break;
                case "extents":
                    extents = ((System.Func<System.Collections.Generic.IList<object>, System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetExtentDefinition>>)((_sequence0) => { var _newSequence0 = new System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetExtentDefinition>(); foreach (var _element0 in _sequence0) { _newSequence0.Add(DressDiscover.Api.Models.Worksheet.WorksheetExtentDefinition.FromBuiltins((System.Collections.Generic.IDictionary<string, object>)_element0)); } return _newSequence0; }))((System.Collections.Generic.IList<object>)_item.Value);
                    break;
                }
            }

            return new WorksheetDefinition(featureSets, featureValues, features, extents);
        }

        public static WorksheetDefinition FromJson(Newtonsoft.Json.Linq.JObject _dictionary)
        {
            System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetDefinition> featureSets= null;
            System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition> featureValues= null;
            System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureDefinition> features= null;
            System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetExtentDefinition> extents= null;

            foreach (var _item in _dictionary)
            {
                switch (_item.Key)
                {
                case "feature_sets":
                    featureSets = ((System.Func<Newtonsoft.Json.Linq.JArray, System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetDefinition>>)((_sequence0) => { var _newSequence0 = new System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetDefinition>(); foreach (var _element0 in _sequence0) { _newSequence0.Add(DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetDefinition.FromJson((Newtonsoft.Json.Linq.JObject)_element0)); } return _newSequence0; }))((Newtonsoft.Json.Linq.JArray)_item.Value);
                    break;
                case "feature_values":
                    featureValues = ((System.Func<Newtonsoft.Json.Linq.JArray, System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition>>)((_sequence0) => { var _newSequence0 = new System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition>(); foreach (var _element0 in _sequence0) { _newSequence0.Add(DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition.FromJson((Newtonsoft.Json.Linq.JObject)_element0)); } return _newSequence0; }))((Newtonsoft.Json.Linq.JArray)_item.Value);
                    break;
                case "features":
                    features = ((System.Func<Newtonsoft.Json.Linq.JArray, System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureDefinition>>)((_sequence0) => { var _newSequence0 = new System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetFeatureDefinition>(); foreach (var _element0 in _sequence0) { _newSequence0.Add(DressDiscover.Api.Models.Worksheet.WorksheetFeatureDefinition.FromJson((Newtonsoft.Json.Linq.JObject)_element0)); } return _newSequence0; }))((Newtonsoft.Json.Linq.JArray)_item.Value);
                    break;
                case "extents":
                    extents = ((System.Func<Newtonsoft.Json.Linq.JArray, System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetExtentDefinition>>)((_sequence0) => { var _newSequence0 = new System.Collections.Generic.List<DressDiscover.Api.Models.Worksheet.WorksheetExtentDefinition>(); foreach (var _element0 in _sequence0) { _newSequence0.Add(DressDiscover.Api.Models.Worksheet.WorksheetExtentDefinition.FromJson((Newtonsoft.Json.Linq.JObject)_element0)); } return _newSequence0; }))((Newtonsoft.Json.Linq.JArray)_item.Value);
                    break;
                }
            }

            return new WorksheetDefinition(featureSets, featureValues, features, extents);
        }

        public System.Collections.Generic.IDictionary<string, object> ToBuiltins()
        {
            var _dictionary = new System.Collections.Generic.Dictionary<string, object>();
            _dictionary["feature_sets"] = ((System.Func<System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetDefinition>, System.Collections.Generic.IList<object>>)((_sequence0) => { var _newSequence0 = new System.Collections.Generic.List<object>(); foreach (var _element0 in _sequence0) { _newSequence0.Add(_element0.ToBuiltins()); } return _newSequence0; }))((System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetDefinition>)this.FeatureSets);
            _dictionary["feature_values"] = ((System.Func<System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition>, System.Collections.Generic.IList<object>>)((_sequence0) => { var _newSequence0 = new System.Collections.Generic.List<object>(); foreach (var _element0 in _sequence0) { _newSequence0.Add(_element0.ToBuiltins()); } return _newSequence0; }))((System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition>)this.FeatureValues);
            _dictionary["features"] = ((System.Func<System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureDefinition>, System.Collections.Generic.IList<object>>)((_sequence0) => { var _newSequence0 = new System.Collections.Generic.List<object>(); foreach (var _element0 in _sequence0) { _newSequence0.Add(_element0.ToBuiltins()); } return _newSequence0; }))((System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureDefinition>)this.Features);
            if (!(this.Extents != null))
            {
                _dictionary["extents"] = ((System.Func<System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetExtentDefinition>, System.Collections.Generic.IList<object>>)((_sequence0) => { var _newSequence0 = new System.Collections.Generic.List<object>(); foreach (var _element0 in _sequence0) { _newSequence0.Add(_element0.ToBuiltins()); } return _newSequence0; }))((System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetExtentDefinition>)this.Extents);
            }
            return _dictionary;
        }

        public Newtonsoft.Json.Linq.JObject ToJson()
        {
            var _dictionary = new Newtonsoft.Json.Linq.JObject();
            _dictionary["feature_sets"] = ((System.Func<System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetDefinition>, Newtonsoft.Json.Linq.JArray>)((_sequence0) => { var _newSequence0 = new Newtonsoft.Json.Linq.JArray(); foreach (var _element0 in _sequence0) { _newSequence0.Add(_element0.ToJson()); } return _newSequence0; }))((System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetDefinition>)this.FeatureSets);
            _dictionary["feature_values"] = ((System.Func<System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition>, Newtonsoft.Json.Linq.JArray>)((_sequence0) => { var _newSequence0 = new Newtonsoft.Json.Linq.JArray(); foreach (var _element0 in _sequence0) { _newSequence0.Add(_element0.ToJson()); } return _newSequence0; }))((System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition>)this.FeatureValues);
            _dictionary["features"] = ((System.Func<System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureDefinition>, Newtonsoft.Json.Linq.JArray>)((_sequence0) => { var _newSequence0 = new Newtonsoft.Json.Linq.JArray(); foreach (var _element0 in _sequence0) { _newSequence0.Add(_element0.ToJson()); } return _newSequence0; }))((System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureDefinition>)this.Features);
            if (!(this.Extents != null))
            {
                _dictionary["extents"] = ((System.Func<System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetExtentDefinition>, Newtonsoft.Json.Linq.JArray>)((_sequence0) => { var _newSequence0 = new Newtonsoft.Json.Linq.JArray(); foreach (var _element0 in _sequence0) { _newSequence0.Add(_element0.ToJson()); } return _newSequence0; }))((System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetExtentDefinition>)this.Extents);
            }
            return _dictionary;
        }

        private System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetExtentDefinition> extents;
        private System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetDefinition> featureSets;
        private System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition> featureValues;
        private System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureDefinition> features;
    }
}
