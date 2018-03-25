namespace DressDiscover.Server.Controllers.Worksheet
{
    public sealed class WorksheetPingQueryServiceJsonRpcController : Microsoft.AspNetCore.Mvc.Controller {
        public sealed class Messages {
            public sealed class PingRequestParams
            {
                public PingRequestParams(string message)
                {
                    this.Message = message;
                }

                [Newtonsoft.Json.JsonProperty(PropertyName = "message")]
                public string Message
                {
                    get { return message; }
                    set
                    {
                        if (value == null)
                        {
                            throw new System.NullReferenceException("PingRequestParams.Message");
                        }
                        this.message = value;
                    }
                }

                private string message;
            }

            public sealed class PingRequest
            {
                public PingRequest(string jsonrpc, string method, string id, PingRequestParams params_)
                {
                    this.Jsonrpc = jsonrpc;
                    this.Method = method;
                    this.Id = id;
                    this.Params_ = params_;
                }

                [Newtonsoft.Json.JsonProperty(PropertyName = "id")]
                public string Id
                {
                    get { return id; }
                    set
                    {
                        if (value == null)
                        {
                            throw new System.NullReferenceException("PingRequest.Id");
                        }
                        this.id = value;
                    }
                }

                [Newtonsoft.Json.JsonProperty(PropertyName = "jsonrpc")]
                public string Jsonrpc
                {
                    get { return jsonrpc; }
                    set
                    {
                        if (value == null)
                        {
                            throw new System.NullReferenceException("PingRequest.Jsonrpc");
                        }
                        this.jsonrpc = value;
                    }
                }

                [Newtonsoft.Json.JsonProperty(PropertyName = "method")]
                public string Method
                {
                    get { return method; }
                    set
                    {
                        if (value == null)
                        {
                            throw new System.NullReferenceException("PingRequest.Method");
                        }
                        this.method = value;
                    }
                }

                [Newtonsoft.Json.JsonProperty(PropertyName = "params_")]
                public PingRequestParams Params_
                {
                    get { return params_; }
                    set
                    {
                        if (value == null)
                        {
                            throw new System.NullReferenceException("PingRequest.Params_");
                        }
                        this.params_ = value;
                    }
                }

                private string id;
                private string jsonrpc;
                private string method;
                private PingRequestParams params_;
            }

            public sealed class PingResponse
            {
                public PingResponse(string id, string result)
                {
                    this.Id = id;
                    this.Result = result;
                }

                public PingResponse(string id, string result, string jsonrpc = "2.0") {
                    this.Id = id;
                    this.Result = result;
                    this.Jsonrpc = jsonrpc;
                }

                [Newtonsoft.Json.JsonProperty(PropertyName = "id")]
                public string Id
                {
                    get { return id; }
                    set
                    {
                        if (value == null)
                        {
                            throw new System.NullReferenceException("PingResponse.Id");
                        }
                        this.id = value;
                    }
                }

                [Newtonsoft.Json.JsonProperty(PropertyName = "jsonrpc")]
                public string Jsonrpc
                {
                    get { return jsonrpc; }
                    set
                    {
                        if (value == null)
                        {
                            throw new System.NullReferenceException("PingResponse.Jsonrpc");
                        }
                        this.jsonrpc = value;
                    }
                }

                [Newtonsoft.Json.JsonProperty(PropertyName = "result")]
                public string Result
                {
                    get { return result; }
                    set
                    {
                        if (value == null)
                        {
                            throw new System.NullReferenceException("PingResponse.Result");
                        }
                        this.result = value;
                    }
                }

                private string id;
                private string jsonrpc = "2.0";
                private string result;
            }
        }

        public WorksheetPingQueryServiceJsonRpcController(DressDiscover.Api.Services.Worksheet.IWorksheetPingQueryService service) {
            this.service = service;
        }

        [Microsoft.AspNetCore.Mvc.HttpPost]
        [Microsoft.AspNetCore.Mvc.Route("ping")]
        public Messages.PingResponse Ping([Microsoft.AspNetCore.Mvc.FromBody] Messages.PingRequest request) {
            return new Messages.PingResponse(id: request.Id, result: service.Ping(request.message));
        }

        private DressDiscover.Api.Services.Worksheet.IWorksheetPingQueryService service;
    }
}
