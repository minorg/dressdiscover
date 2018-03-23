namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetFeatureValueImage
    {
        public WorksheetFeatureValueImage(DressDiscover.Api.Models.Worksheet.WorksheetRights rights, string thumbnailUrl)
        {
            this.Rights = rights;
            this.ThumbnailUrl = thumbnailUrl;
        }

        public WorksheetFeatureValueImage(DressDiscover.Api.Models.Worksheet.WorksheetRights rights, string thumbnailUrl, string fullSizeUrl) {
            this.Rights = rights;
            this.ThumbnailUrl = thumbnailUrl;
            this.FullSizeUrl = fullSizeUrl;
        }

        public string FullSizeUrl
        {
            get { return fullSizeUrl; }
            set { this.fullSizeUrl = value; }
        }

        public DressDiscover.Api.Models.Worksheet.WorksheetRights Rights
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
        private DressDiscover.Api.Models.Worksheet.WorksheetRights rights;
        private string thumbnailUrl;
    }
}
