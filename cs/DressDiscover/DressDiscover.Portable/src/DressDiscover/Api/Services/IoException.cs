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

        public static IoException FromBuiltins(System.Collections.Generic.Dictionary<string, object> _dictionary)
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

        public System.Collections.Generic.Dictionary<string, object> ToBuiltins()
        {
            var _builtins = new System.Collections.Generic.Dictionary<string, object>();
            _builtins["cause_message"] = this.CauseMessage;
            return _builtins;
        }

        private string causeMessage;
    }
}
