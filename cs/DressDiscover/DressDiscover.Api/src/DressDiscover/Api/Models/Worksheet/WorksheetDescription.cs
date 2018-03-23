namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetDescription
    {
        public WorksheetDescription(DressDiscover.Api.Models.Worksheet.WorksheetRights rights, string text)
        {
            this.Rights = rights;
            this.Text = text;
        }

        public DressDiscover.Api.Models.Worksheet.WorksheetRights Rights
        {
            get { return rights; }
            set
            {
                if (value == null)
                {
                    throw new System.NullReferenceException("WorksheetDescription.Rights");
                }
                this.rights = value;
            }
        }

        public string Text
        {
            get { return text; }
            set
            {
                if (value == null)
                {
                    throw new System.NullReferenceException("WorksheetDescription.Text");
                }
                this.text = value;
            }
        }

        public static WorksheetDescription FromBuiltins(System.Collections.Generic.IDictionary<string, object> _dictionary)
        {
            DressDiscover.Api.Models.Worksheet.WorksheetRights rights= null;
            string text= null;

            foreach (var _item in _dictionary)
            {
                switch (_item.Key)
                {
                case "rights":
                    rights = DressDiscover.Api.Models.Worksheet.WorksheetRights.FromBuiltins((System.Collections.Generic.IDictionary<string, object>)_item.Value);
                    break;
                case "text":
                    text = ((string)_item.Value);
                    break;
                }
            }

            return new WorksheetDescription(rights, text);
        }

        public static WorksheetDescription FromJson(Newtonsoft.Json.Linq.JObject _dictionary)
        {
            DressDiscover.Api.Models.Worksheet.WorksheetRights rights= null;
            string text= null;

            foreach (var _item in _dictionary)
            {
                switch (_item.Key)
                {
                case "rights":
                    rights = DressDiscover.Api.Models.Worksheet.WorksheetRights.FromJson((Newtonsoft.Json.Linq.JObject)_item.Value);
                    break;
                case "text":
                    text = ((string)((Newtonsoft.Json.Linq.JValue)_item.Value));
                    break;
                }
            }

            return new WorksheetDescription(rights, text);
        }

        public System.Collections.Generic.IDictionary<string, object> ToBuiltins()
        {
            var _dictionary = new System.Collections.Generic.Dictionary<string, object>();
            _dictionary["rights"] = this.Rights.ToBuiltins();
            _dictionary["text"] = this.Text;
            return _dictionary;
        }

        public Newtonsoft.Json.Linq.JObject ToJson()
        {
            var _dictionary = new Newtonsoft.Json.Linq.JObject();
            _dictionary["rights"] = this.Rights.ToJson();
            _dictionary["text"] = new Newtonsoft.Json.Linq.JValue((string)this.Text);
            return _dictionary;
        }

        private DressDiscover.Api.Models.Worksheet.WorksheetRights rights;
        private string text;
    }
}
