namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetState
    {
        public WorksheetState(System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState> featureSets, string id)
        {
            this.FeatureSets = featureSets;
            this.Id = id;
        }

        public WorksheetState(System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState> featureSets, string id, string text) {
            this.FeatureSets = featureSets;
            this.Id = id;
            this.Text = text;
        }

        public System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState> FeatureSets
        {
            get { return featureSets; }
            set
            {
                if (value == null)
                {
                    throw new System.NullReferenceException("WorksheetState.FeatureSets");
                }
                this.featureSets = value;
            }
        }

        public string Id
        {
            get { return id; }
            set
            {
                if (value == null)
                {
                    throw new System.NullReferenceException("WorksheetState.Id");
                }
                this.id = value;
            }
        }

        public string Text
        {
            get { return text; }
            set { this.text = value; }
        }

        private System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState> featureSets;
        private string id;
        private string text;
    }
}
