namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetDefinition
    {
        WorksheetDefinition(DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetDefinition rootFeatureSet)
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

        private DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetDefinition rootFeatureSet;
    }
}
