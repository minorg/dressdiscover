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

        private string featureId;
        private string featureSetId;
        private bool? review;
        private string worksheetStateId;
    }
}
