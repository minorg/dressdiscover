namespace DressDiscover.Api.Services
{
    public sealed class IoException : System.Exception
    {
        public IoException(string causeMessage)
        {
            this.CauseMessage = causeMessage;
        }

        public string CauseMessage
        {
            get { return causeMessage; }
            set
            {
                if (value == null)
                {
                    throw new System.NullReferenceException("IoException.CauseMessage");
                }
                this.causeMessage = value;
            }
        }

        public static IoException FromBuiltins(System.Collections.Generic.IDictionary<string, object> _dictionary)
        {
            string causeMessage= null;

            foreach (var _item in _dictionary)
            {
                switch (_item.Key)
                {
                case "cause_message":
                    causeMessage = ((string)_item.Value);
                    break;
                }
            }

            return new IoException(causeMessage);
        }

        public static IoException FromJson(Newtonsoft.Json.Linq.JObject _dictionary)
        {
            string causeMessage= null;

            foreach (var _item in _dictionary)
            {
                switch (_item.Key)
                {
                case "cause_message":
                    causeMessage = ((string)((Newtonsoft.Json.Linq.JValue)_item.Value));
                    break;
                }
            }

            return new IoException(causeMessage);
        }

        public System.Collections.Generic.IDictionary<string, object> ToBuiltins()
        {
            var _dictionary = new System.Collections.Generic.Dictionary<string, object>();
            _dictionary["cause_message"] = this.CauseMessage;
            return _dictionary;
        }

        public Newtonsoft.Json.Linq.JObject ToJson()
        {
            var _dictionary = new Newtonsoft.Json.Linq.JObject();
            _dictionary["cause_message"] = new Newtonsoft.Json.Linq.JValue((string)this.CauseMessage);
            return _dictionary;
        }

        private string causeMessage;
    }
}
