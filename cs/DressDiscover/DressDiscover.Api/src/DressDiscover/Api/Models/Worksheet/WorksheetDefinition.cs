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

        private System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetExtentDefinition> extents;
        private System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureSetDefinition> featureSets;
        private System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueDefinition> featureValues;
        private System.Collections.Generic.IList<DressDiscover.Api.Models.Worksheet.WorksheetFeatureDefinition> features;
    }
}
