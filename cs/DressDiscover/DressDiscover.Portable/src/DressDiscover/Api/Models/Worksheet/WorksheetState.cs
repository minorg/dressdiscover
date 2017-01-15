namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetState
    {
        public WorksheetState(string accessionNumber)
        {
            this.AccessionNumber = accessionNumber;
        }

        public WorksheetState(string accessionNumber, DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState rootFeatureSet) {
            this.AccessionNumber = accessionNumber;
            this.RootFeatureSet = rootFeatureSet;
        }

        public string AccessionNumber
        {
            get { return accessionNumber; }
            set
            {
                if (value == null)
                {
                    throw new System.NullReferenceException("WorksheetState.AccessionNumber");
                }
                this.accessionNumber = value;
            }
        }

        public DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState RootFeatureSet
        {
            get { return rootFeatureSet; }
            set { this.rootFeatureSet = value; }
        }

        public static WorksheetState FromBuiltins(System.Collections.Generic.IDictionary<string, object> _dictionary)
        {
            string accessionNumber= null;
            DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState rootFeatureSet= null;

            foreach (var _item in _dictionary)
            {
                switch (_item.Key)
                {
                case "accession_number":
                    accessionNumber = ((string)_item.Value);
                    break;
                case "root_feature_set":
                    rootFeatureSet = DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState.FromBuiltins((System.Collections.Generic.IDictionary<string, object>)_item.Value);
                    break;
                }
            }

            return new WorksheetState(accessionNumber, rootFeatureSet);
        }

        public static WorksheetState FromJson(Newtonsoft.Json.Linq.JObject _dictionary)
        {
            string accessionNumber= null;
            DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState rootFeatureSet= null;

            foreach (var _item in _dictionary)
            {
                switch (_item.Key)
                {
                case "accession_number":
                    accessionNumber = ((string)((Newtonsoft.Json.Linq.JValue)_item.Value));
                    break;
                case "root_feature_set":
                    rootFeatureSet = DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState.FromJson((Newtonsoft.Json.Linq.JObject)_item.Value);
                    break;
                }
            }

            return new WorksheetState(accessionNumber, rootFeatureSet);
        }

        public System.Collections.Generic.IDictionary<string, object> ToBuiltins()
        {
            var _dictionary = new System.Collections.Generic.Dictionary<string, object>();
            _dictionary["accession_number"] = this.AccessionNumber;
            if (!(this.RootFeatureSet != null))
            {
                _dictionary["root_feature_set"] = this.RootFeatureSet.ToBuiltins();
            }
            return _dictionary;
        }

        public Newtonsoft.Json.Linq.JObject ToJson()
        {
            var _dictionary = new Newtonsoft.Json.Linq.JObject();
            _dictionary["accession_number"] = new Newtonsoft.Json.Linq.JValue((string)this.AccessionNumber);
            if (!(this.RootFeatureSet != null))
            {
                _dictionary["root_feature_set"] = this.RootFeatureSet.ToJson();
            }
            return _dictionary;
        }

        private string accessionNumber;
        private DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState rootFeatureSet;
    }
}
