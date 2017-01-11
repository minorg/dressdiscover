namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetState
    {
        WorksheetState(string accessionNumber)
        {
            this.AccessionNumber = accessionNumber;
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

        private string accessionNumber;
        private DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetState rootFeatureSet;
    }
}
