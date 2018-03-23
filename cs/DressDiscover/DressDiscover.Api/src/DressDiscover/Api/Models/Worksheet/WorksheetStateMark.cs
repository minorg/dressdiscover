namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetStateMark
    {
        public WorksheetStateMark(string worksheetStateId)
        {
            this.WorksheetStateId = worksheetStateId;
        }

        public WorksheetStateMark(string worksheetStateId, string featureId, string featureSetId, bool? review) {
            this.WorksheetStateId = worksheetStateId;
            this.FeatureId = featureId;
            this.FeatureSetId = featureSetId;
            this.Review = review;
        }

        public string FeatureId
        {
            get { return featureId; }
            set { this.featureId = value; }
        }

        public string FeatureSetId
        {
            get { return featureSetId; }
            set { this.featureSetId = value; }
        }

        public bool? Review
        {
            get { return review; }
            set { this.review = value; }
        }

        public string WorksheetStateId
        {
            get { return worksheetStateId; }
            set
            {
                if (value == null)
                {
                    throw new System.NullReferenceException("WorksheetStateMark.WorksheetStateId");
                }
                this.worksheetStateId = value;
            }
        }

        public static WorksheetStateMark FromBuiltins(System.Collections.Generic.IDictionary<string, object> _dictionary)
        {
            string worksheetStateId= null;
            string featureId= null;
            string featureSetId= null;
            bool? review= null;

            foreach (var _item in _dictionary)
            {
                switch (_item.Key)
                {
                case "worksheet_state_id":
                    worksheetStateId = ((string)_item.Value);
                    break;
                case "feature_id":
                    featureId = ((string)_item.Value);
                    break;
                case "feature_set_id":
                    featureSetId = ((string)_item.Value);
                    break;
                case "review":
                    review = ((bool)_item.Value);
                    break;
                }
            }

            return new WorksheetStateMark(worksheetStateId, featureId, featureSetId, review);
        }

        public static WorksheetStateMark FromJson(Newtonsoft.Json.Linq.JObject _dictionary)
        {
            string worksheetStateId= null;
            string featureId= null;
            string featureSetId= null;
            bool? review= null;

            foreach (var _item in _dictionary)
            {
                switch (_item.Key)
                {
                case "worksheet_state_id":
                    worksheetStateId = ((string)((Newtonsoft.Json.Linq.JValue)_item.Value));
                    break;
                case "feature_id":
                    featureId = ((string)((Newtonsoft.Json.Linq.JValue)_item.Value));
                    break;
                case "feature_set_id":
                    featureSetId = ((string)((Newtonsoft.Json.Linq.JValue)_item.Value));
                    break;
                case "review":
                    review = ((bool)((Newtonsoft.Json.Linq.JValue)_item.Value));
                    break;
                }
            }

            return new WorksheetStateMark(worksheetStateId, featureId, featureSetId, review);
        }

        public System.Collections.Generic.IDictionary<string, object> ToBuiltins()
        {
            var _dictionary = new System.Collections.Generic.Dictionary<string, object>();
            _dictionary["worksheet_state_id"] = this.WorksheetStateId;
            if (!(this.FeatureId != null))
            {
                _dictionary["feature_id"] = this.FeatureId;
            }
            if (!(this.FeatureSetId != null))
            {
                _dictionary["feature_set_id"] = this.FeatureSetId;
            }
            if (!(!this.Review.HasValue))
            {
                _dictionary["review"] = this.Review;
            }
            return _dictionary;
        }

        public Newtonsoft.Json.Linq.JObject ToJson()
        {
            var _dictionary = new Newtonsoft.Json.Linq.JObject();
            _dictionary["worksheet_state_id"] = new Newtonsoft.Json.Linq.JValue((string)this.WorksheetStateId);
            if (!(this.FeatureId != null))
            {
                _dictionary["feature_id"] = new Newtonsoft.Json.Linq.JValue((string)this.FeatureId);
            }
            if (!(this.FeatureSetId != null))
            {
                _dictionary["feature_set_id"] = new Newtonsoft.Json.Linq.JValue((string)this.FeatureSetId);
            }
            if (!(!this.Review.HasValue))
            {
                _dictionary["review"] = new Newtonsoft.Json.Linq.JValue((bool)this.Review);
            }
            return _dictionary;
        }

        private string featureId;
        private string featureSetId;
        private bool? review;
        private string worksheetStateId;
    }
}
