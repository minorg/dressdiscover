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

        public static WorksheetState FromBuiltins(System.Collections.Generic.Dictionary<string, object> _dictionary)
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
                    rootFeatureSet = DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState.FromBuiltins((System.Collections.Generic.Dictionary<string, object>)_item.Value);
                    break;
                }
            }

            return new WorksheetState(accessionNumber, rootFeatureSet);
        }

        public System.Collections.Generic.Dictionary<string, object> ToBuiltins()
        {
            var _builtins = new System.Collections.Generic.Dictionary<string, object>();
            _builtins["accession_number"] = this.AccessionNumber;
            if (!(this.RootFeatureSet != null))
            {
                _builtins["root_feature_set"] = this.RootFeatureSet.ToBuiltins();
            }
            return _builtins;
        }

        private string accessionNumber;
        private DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState rootFeatureSet;
    }
}
