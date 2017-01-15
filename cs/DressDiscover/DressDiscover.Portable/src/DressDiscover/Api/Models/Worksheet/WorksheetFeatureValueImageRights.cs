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

        public static WorksheetFeatureValueImageRights FromJson(Newtonsoft.Json.Linq.JObject _dictionary)
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
                    author = ((string)((Newtonsoft.Json.Linq.JValue)_item.Value));
                    break;
                case "license":
                    license = ((string)((Newtonsoft.Json.Linq.JValue)_item.Value));
                    break;
                case "source_name":
                    sourceName = ((string)((Newtonsoft.Json.Linq.JValue)_item.Value));
                    break;
                case "source_url":
                    sourceUrl = ((string)((Newtonsoft.Json.Linq.JValue)_item.Value));
                    break;
                }
            }

            return new WorksheetFeatureValueImageRights(author, license, sourceName, sourceUrl);
        }

        public System.Collections.Generic.IDictionary<string, object> ToBuiltins()
        {
            var _dictionary = new System.Collections.Generic.Dictionary<string, object>();
            _dictionary["author"] = this.Author;
            _dictionary["license"] = this.License;
            _dictionary["source_name"] = this.SourceName;
            _dictionary["source_url"] = this.SourceUrl;
            return _dictionary;
        }

        public Newtonsoft.Json.Linq.JObject ToJson()
        {
            var _dictionary = new Newtonsoft.Json.Linq.JObject();
            _dictionary["author"] = new Newtonsoft.Json.Linq.JValue((string)this.Author);
            _dictionary["license"] = new Newtonsoft.Json.Linq.JValue((string)this.License);
            _dictionary["source_name"] = new Newtonsoft.Json.Linq.JValue((string)this.SourceName);
            _dictionary["source_url"] = new Newtonsoft.Json.Linq.JValue((string)this.SourceUrl);
            return _dictionary;
        }

        private string author;
        private string license;
        private string sourceName;
        private string sourceUrl;
    }
}
