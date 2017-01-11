namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetFeatureValueImage
    {
        WorksheetFeatureValueImage(DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueImageRights rights, string thumbnailUrl)
        {
            this.Rights = rights;
            this.ThumbnailUrl = thumbnailUrl;
        }

        public string FullSizeUrl
        {
            get { return fullSizeUrl; }
            set { this.fullSizeUrl = value; }
        }

        public DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueImageRights Rights
        {
            get { return rights; }
            set
            {
                if (value == null)
                {
                    throw new System.NullReferenceException("WorksheetFeatureValueImage.Rights");
                }
                this.rights = value;
            }
        }

        public string ThumbnailUrl
        {
            get { return thumbnailUrl; }
            set
            {
                if (value == null)
                {
                    throw new System.NullReferenceException("WorksheetFeatureValueImage.ThumbnailUrl");
                }
                this.thumbnailUrl = value;
            }
        }

        private string fullSizeUrl;
        private DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueImageRights rights;
        private string thumbnailUrl;
    }
}
