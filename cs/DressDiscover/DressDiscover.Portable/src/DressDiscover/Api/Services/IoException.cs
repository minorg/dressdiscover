namespace DressDiscover.Api.Services
{
    public sealed class IoException : System.Exception
    {
        IoException()
        {
        }

        public string CauseMessage { get; set; }
    }
}
