namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetFeatureSetState
    {
        public WorksheetFeatureSetState(System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureState> features, string id)
        {
            this.Features = features;
            this.Id = id;
        }

        public System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureState> Features
        {
            get { return features; }
            set
            {
                if (value == null)
                {
                    throw new System.NullReferenceException("WorksheetFeatureSetState.Features");
                }
                this.features = value;
            }
        }

        public string Id
        {
            get { return id; }
            set
            {
                if (value == null)
                {
                    throw new System.NullReferenceException("WorksheetFeatureSetState.Id");
                }
                this.id = value;
            }
        }

        private System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureState> features;
        private string id;
    }
}
