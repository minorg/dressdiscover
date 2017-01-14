namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetFeatureValueImageRights
    {
        public WorksheetFeatureValueImageRights(string author, string license, string sourceName, string sourceUrl)
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

        public static WorksheetFeatureValueImageRights FromBuiltins(System.Collections.Generic.IDictionary<string, object> _dictionary)
        {
            string author= null;
            string license= null;
            string sourceName= null;
            string sourceUrl= null;

            foreach (var _item in _dictionary)
            {
                switch (_item.Key)
                {
                case "author":
                    author = ((string)_item.Value);
                    break;
                case "license":
                    license = ((string)_item.Value);
                    break;
                case "source_name":
                    sourceName = ((string)_item.Value);
                    break;
                case "source_url":
                    sourceUrl = ((string)_item.Value);
                    break;
                }
            }

            return new WorksheetFeatureValueImageRights(author, license, sourceName, sourceUrl);
        }

        public System.Collections.Generic.IDictionary<string, object> ToBuiltins()
        {
            var _builtins = new System.Collections.Generic.Dictionary<string, object>();
            _builtins["author"] = this.Author;
            _builtins["license"] = this.License;
            _builtins["source_name"] = this.SourceName;
            _builtins["source_url"] = this.SourceUrl;
            return _builtins;
        }

        private string author;
        private string license;
        private string sourceName;
        private string sourceUrl;
    }
}
