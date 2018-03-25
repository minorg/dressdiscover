namespace DressDiscover.Server.Controllers.Worksheet
{
    public sealed class WorksheetStateQueryServiceJsonRpcController : Microsoft.AspNetCore.Mvc.Controller {
        public sealed class Messages {
            public sealed class GetWorksheetStateRequestParams
            {
                public GetWorksheetStateRequestParams(string id)
                {
                    this.Id = id;
                }

                [Newtonsoft.Json.JsonProperty(PropertyName = "id")]
                public string Id
                {
                    get { return id; }
                    set
                    {
                        if (value == null)
                        {
                            throw new System.NullReferenceException("GetWorksheetStateRequestParams.Id");
                        }
                        this.id = value;
                    }
                }

                private string id;
            }

            public sealed class GetWorksheetStateRequest
            {
                public GetWorksheetStateRequest(string jsonrpc, string method, string id, GetWorksheetStateRequestParams params_)
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
                            throw new System.NullReferenceException("GetWorksheetStateRequest.Id");
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
                            throw new System.NullReferenceException("GetWorksheetStateRequest.Jsonrpc");
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
                            throw new System.NullReferenceException("GetWorksheetStateRequest.Method");
                        }
                        this.method = value;
                    }
                }

                [Newtonsoft.Json.JsonProperty(PropertyName = "params_")]
                public GetWorksheetStateRequestParams Params_
                {
                    get { return params_; }
                    set
                    {
                        if (value == null)
                        {
                            throw new System.NullReferenceException("GetWorksheetStateRequest.Params_");
                        }
                        this.params_ = value;
                    }
                }

                private string id;
                private string jsonrpc;
                private string method;
                private GetWorksheetStateRequestParams params_;
            }

            public sealed class GetWorksheetStateResponse
            {
                public GetWorksheetStateResponse(string id, DressDiscover.Api.Models.Worksheet.WorksheetState result)
                {
                    this.Id = id;
                    this.Result = result;
                }

                public GetWorksheetStateResponse(string id, DressDiscover.Api.Models.Worksheet.WorksheetState result, string jsonrpc = "2.0") {
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
                            throw new System.NullReferenceException("GetWorksheetStateResponse.Id");
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
                            throw new System.NullReferenceException("GetWorksheetStateResponse.Jsonrpc");
                        }
                        this.jsonrpc = value;
                    }
                }

                [Newtonsoft.Json.JsonProperty(PropertyName = "result")]
                public DressDiscover.Api.Models.Worksheet.WorksheetState Result
                {
                    get { return result; }
                    set
                    {
                        if (value == null)
                        {
                            throw new System.NullReferenceException("GetWorksheetStateResponse.Result");
                        }
                        this.result = value;
                    }
                }

                private string id;
                private string jsonrpc = "2.0";
                private DressDiscover.Api.Models.Worksheet.WorksheetState result;
            }

            public sealed class GetWorksheetStateIdsRequestParams
            {
            }

            public sealed class GetWorksheetStateIdsRequest
            {
                public GetWorksheetStateIdsRequest(string jsonrpc, string method, string id, GetWorksheetStateIdsRequestParams params_)
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
                            throw new System.NullReferenceException("GetWorksheetStateIdsRequest.Id");
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
                            throw new System.NullReferenceException("GetWorksheetStateIdsRequest.Jsonrpc");
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
                            throw new System.NullReferenceException("GetWorksheetStateIdsRequest.Method");
                        }
                        this.method = value;
                    }
                }

                [Newtonsoft.Json.JsonProperty(PropertyName = "params_")]
                public GetWorksheetStateIdsRequestParams Params_
                {
                    get { return params_; }
                    set
                    {
                        if (value == null)
                        {
                            throw new System.NullReferenceException("GetWorksheetStateIdsRequest.Params_");
                        }
                        this.params_ = value;
                    }
                }

                private string id;
                private string jsonrpc;
                private string method;
                private GetWorksheetStateIdsRequestParams params_;
            }

            public sealed class GetWorksheetStateIdsResponse
            {
                public GetWorksheetStateIdsResponse(string id, System.Collections.Generic.IList<string> result)
                {
                    this.Id = id;
                    this.Result = result;
                }

                public GetWorksheetStateIdsResponse(string id, System.Collections.Generic.IList<string> result, string jsonrpc = "2.0") {
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
                            throw new System.NullReferenceException("GetWorksheetStateIdsResponse.Id");
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
                            throw new System.NullReferenceException("GetWorksheetStateIdsResponse.Jsonrpc");
                        }
                        this.jsonrpc = value;
                    }
                }

                [Newtonsoft.Json.JsonProperty(PropertyName = "result")]
                public System.Collections.Generic.IList<string> Result
                {
                    get { return result; }
                    set
                    {
                        if (value == null)
                        {
                            throw new System.NullReferenceException("GetWorksheetStateIdsResponse.Result");
                        }
                        this.result = value;
                    }
                }

                private string id;
                private string jsonrpc = "2.0";
                private System.Collections.Generic.IList<string> result;
            }
        }

        public WorksheetStateQueryServiceJsonRpcController(DressDiscover.Api.Services.Worksheet.IWorksheetStateQueryService service) {
            this.service = service;
        }

        [Microsoft.AspNetCore.Mvc.HttpPost]
        [Microsoft.AspNetCore.Mvc.Route("get_worksheet_state")]
        public Messages.GetWorksheetStateResponse GetWorksheetState([Microsoft.AspNetCore.Mvc.FromBody] Messages.GetWorksheetStateRequest request) {
            return new Messages.GetWorksheetStateResponse(id: request.Id, result: service.GetWorksheetState(request.id));
        }
        [Microsoft.AspNetCore.Mvc.HttpPost]
        [Microsoft.AspNetCore.Mvc.Route("get_worksheet_state_ids")]
        public Messages.GetWorksheetStateIdsResponse GetWorksheetStateIds([Microsoft.AspNetCore.Mvc.FromBody] Messages.GetWorksheetStateIdsRequest request) {
            return new Messages.GetWorksheetStateIdsResponse(id: request.Id, result: service.GetWorksheetStateIds());
        }

        private DressDiscover.Api.Services.Worksheet.IWorksheetStateQueryService service;
    }
}
