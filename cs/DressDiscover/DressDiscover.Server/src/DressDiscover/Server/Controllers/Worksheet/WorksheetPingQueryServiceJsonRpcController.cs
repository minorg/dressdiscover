namespace DressDiscover.Server.Controllers.Worksheet
{
    [Microsoft.AspNetCore.Mvc.Route("api/jsonrpc/worksheet_ping")]
    public sealed class WorksheetPingQueryServiceJsonRpcController : Microsoft.AspNetCore.Mvc.Controller
    {
        public sealed class Messages
        {
            public sealed class JsonRpcError
            {
                public JsonRpcError(int code, string message)
                {
                    this.Code = code;
                    this.Message = message;
                }

                [Newtonsoft.Json.JsonProperty(PropertyName = "@class")]
                public string Class { get; set; }

                [Newtonsoft.Json.JsonProperty(PropertyName = "code")]
                public int Code { get; }

                [Newtonsoft.Json.JsonProperty(PropertyName = "data")]
                public System.Exception Data { get; set; }

                [Newtonsoft.Json.JsonProperty(PropertyName = "message")]
                public string Message { get; }
            }

            public sealed class JsonRpcErrorResponse
            {
                public JsonRpcErrorResponse(JsonRpcError error, string id)
                {
                    this.Error = error;
                    this.Jsonrpc = "2.0";
                    this.Id = id;
                }

                [Newtonsoft.Json.JsonProperty(PropertyName = "error")]
                public JsonRpcError Error { get; }

                [Newtonsoft.Json.JsonProperty(PropertyName = "id")]
                public string Id { get; }

                [Newtonsoft.Json.JsonProperty(PropertyName = "jsonrpc")]
                public string Jsonrpc { get; }
            }

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

                [Newtonsoft.Json.JsonProperty(PropertyName = "params")]
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

        public WorksheetPingQueryServiceJsonRpcController(DressDiscover.Api.Services.Worksheet.IWorksheetPingQueryService service)
        {
            this.service = service;
        }

        [Microsoft.AspNetCore.Mvc.HttpPost]
        [Microsoft.AspNetCore.Mvc.Route("ping")]
        public Microsoft.AspNetCore.Mvc.JsonResult Ping([Microsoft.AspNetCore.Mvc.FromBody] Messages.PingRequest request)
        {
            try
            {
                return new Microsoft.AspNetCore.Mvc.JsonResult(new Messages.PingResponse(id: request.Id, result: service.Ping(request.Params_.Message)));
            }
            catch (DressDiscover.Api.Services.IoException e)
            {
                return new Microsoft.AspNetCore.Mvc.JsonResult(new Messages.JsonRpcErrorResponse(error: new Messages.JsonRpcError(code: 1, message: e.ToString()) { Class = "dressdiscover.api.services.io_exception.IoException", Data = e }, id: request.Id));
            }
        }

        private DressDiscover.Api.Services.Worksheet.IWorksheetPingQueryService service;
    }
}
