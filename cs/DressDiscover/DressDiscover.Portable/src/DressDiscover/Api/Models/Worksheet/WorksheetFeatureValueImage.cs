namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetFeatureValueImage
    {
        public WorksheetFeatureValueImage(DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueImageRights rights, string thumbnailUrl)
        {
            this.Rights = rights;
            this.ThumbnailUrl = thumbnailUrl;
        }

        public WorksheetFeatureValueImage(DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueImageRights rights, string thumbnailUrl, string fullSizeUrl) {
            this.Rights = rights;
            this.ThumbnailUrl = thumbnailUrl;
            this.FullSizeUrl = fullSizeUrl;
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

        public static WorksheetFeatureValueImage FromBuiltins(System.Collections.Generic.IDictionary<string, object> _dictionary)
        {
            DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueImageRights rights= null;
            string thumbnailUrl= null;
            string fullSizeUrl= null;

            foreach (var _item in _dictionary)
            {
                switch (_item.Key)
                {
                case "rights":
                    rights = DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueImageRights.FromBuiltins((System.Collections.Generic.IDictionary<string, object>)_item.Value);
                    break;
                case "thumbnail_url":
                    thumbnailUrl = ((string)_item.Value);
                    break;
                case "full_size_url":
                    fullSizeUrl = ((string)_item.Value);
                    break;
                }
            }

            return new WorksheetFeatureValueImage(rights, thumbnailUrl, fullSizeUrl);
        }

        public System.Collections.Generic.IDictionary<string, object> ToBuiltins()
        {
            var _builtins = new System.Collections.Generic.Dictionary<string, object>();
            _builtins["rights"] = this.Rights.ToBuiltins();
            _builtins["thumbnail_url"] = this.ThumbnailUrl;
            if (!(this.FullSizeUrl != null))
            {
                _builtins["full_size_url"] = this.FullSizeUrl;
            }
            return _builtins;
        }

        private string fullSizeUrl;
        private DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueImageRights rights;
        private string thumbnailUrl;
    }
}
