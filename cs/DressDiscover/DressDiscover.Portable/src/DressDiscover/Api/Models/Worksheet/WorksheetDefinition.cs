namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetDefinition
    {
        public WorksheetDefinition(DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetDefinition rootFeatureSet)
        {
            this.RootFeatureSet = rootFeatureSet;
        }

        public DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetDefinition RootFeatureSet
        {
            get { return rootFeatureSet; }
            set
            {
                if (value == null)
                {
                    throw new System.NullReferenceException("WorksheetDefinition.RootFeatureSet");
                }
                this.rootFeatureSet = value;
            }
        }

        public static WorksheetDefinition FromBuiltins(System.Collections.Generic.IDictionary<string, object> _dictionary)
        {
            DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetDefinition rootFeatureSet= null;

            foreach (var _item in _dictionary)
            {
                switch (_item.Key)
                {
                case "root_feature_set":
                    rootFeatureSet = DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetDefinition.FromBuiltins((System.Collections.Generic.IDictionary<string, object>)_item.Value);
                    break;
                }
            }

            return new WorksheetDefinition(rootFeatureSet);
        }

        public System.Collections.Generic.IDictionary<string, object> ToBuiltins()
        {
            var _builtins = new System.Collections.Generic.Dictionary<string, object>();
            _builtins["root_feature_set"] = this.RootFeatureSet.ToBuiltins();
            return _builtins;
        }

        private DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetDefinition rootFeatureSet;
    }
}
