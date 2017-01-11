namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetFeatureValueImageRights
    {
        WorksheetFeatureValueImageRights(string author, string license, string sourceName, string sourceUrl)
        {
            this.Author = author;
            this.License = license;
            this.SourceName = sourceName;
            this.SourceUrl = sourceUrl;
        }

        public string Author
        {
            get { return author; }
            set
            {
                if (value == null)
                {
                    throw new System.NullReferenceException("WorksheetFeatureValueImageRights.Author");
                }
                this.author = value;
            }
        }

        public string License
        {
            get { return license; }
            set
            {
                if (value == null)
                {
                    throw new System.NullReferenceException("WorksheetFeatureValueImageRights.License");
                }
                this.license = value;
            }
        }

        public string SourceName
        {
            get { return sourceName; }
            set
            {
                if (value == null)
                {
                    throw new System.NullReferenceException("WorksheetFeatureValueImageRights.SourceName");
                }
                this.sourceName = value;
            }
        }

        public string SourceUrl
        {
            get { return sourceUrl; }
            set
            {
                if (value == null)
                {
                    throw new System.NullReferenceException("WorksheetFeatureValueImageRights.SourceUrl");
                }
                this.sourceUrl = value;
            }
        }

        private string author;
        private string license;
        private string sourceName;
        private string sourceUrl;
    }
}
