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

        private string causeMessage;
    }
}
