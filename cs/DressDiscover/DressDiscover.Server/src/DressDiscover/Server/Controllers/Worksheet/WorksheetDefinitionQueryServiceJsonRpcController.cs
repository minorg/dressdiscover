namespace DressDiscover.Server.Controllers.Worksheet
{
    public sealed class WorksheetDefinitionQueryServiceJsonRpcController : Microsoft.AspNetCore.Mvc.Controller {
        public sealed class Messages {
            public sealed class GetWorksheetDefinitionRequestParams
            {
            }

            public sealed class GetWorksheetDefinitionRequest
            {
                public GetWorksheetDefinitionRequest(string jsonrpc, string method, string id, GetWorksheetDefinitionRequestParams params_)
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
                            throw new System.NullReferenceException("GetWorksheetDefinitionRequest.Id");
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
                            throw new System.NullReferenceException("GetWorksheetDefinitionRequest.Jsonrpc");
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
                            throw new System.NullReferenceException("GetWorksheetDefinitionRequest.Method");
                        }
                        this.method = value;
                    }
                }

                [Newtonsoft.Json.JsonProperty(PropertyName = "params_")]
                public GetWorksheetDefinitionRequestParams Params_
                {
                    get { return params_; }
                    set
                    {
                        if (value == null)
                        {
                            throw new System.NullReferenceException("GetWorksheetDefinitionRequest.Params_");
                        }
                        this.params_ = value;
                    }
                }

                private string id;
                private string jsonrpc;
                private string method;
                private GetWorksheetDefinitionRequestParams params_;
            }

            public sealed class GetWorksheetDefinitionResponse
            {
                public GetWorksheetDefinitionResponse(string id, DressDiscover.Api.Models.Worksheet.WorksheetDefinition result)
                {
                    this.Id = id;
                    this.Result = result;
                }

                public GetWorksheetDefinitionResponse(string id, DressDiscover.Api.Models.Worksheet.WorksheetDefinition result, string jsonrpc = "2.0") {
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
                            throw new System.NullReferenceException("GetWorksheetDefinitionResponse.Id");
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
                            throw new System.NullReferenceException("GetWorksheetDefinitionResponse.Jsonrpc");
                        }
                        this.jsonrpc = value;
                    }
                }

                [Newtonsoft.Json.JsonProperty(PropertyName = "result")]
                public DressDiscover.Api.Models.Worksheet.WorksheetDefinition Result
                {
                    get { return result; }
                    set
                    {
                        if (value == null)
                        {
                            throw new System.NullReferenceException("GetWorksheetDefinitionResponse.Result");
                        }
                        this.result = value;
                    }
                }

                private string id;
                private string jsonrpc = "2.0";
                private DressDiscover.Api.Models.Worksheet.WorksheetDefinition result;
            }
        }

        public WorksheetDefinitionQueryServiceJsonRpcController(DressDiscover.Api.Services.Worksheet.IWorksheetDefinitionQueryService service) {
            this.service = service;
        }

        [Microsoft.AspNetCore.Mvc.HttpPost]
        [Microsoft.AspNetCore.Mvc.Route("get_worksheet_definition")]
        public Messages.GetWorksheetDefinitionResponse GetWorksheetDefinition([Microsoft.AspNetCore.Mvc.FromBody] Messages.GetWorksheetDefinitionRequest request) {
            return new Messages.%(name)sResponse(id = request.Id, result = %(delegate)s);service.GetWorksheetDefinition()
        }

        private DressDiscover.Api.Services.Worksheet.IWorksheetDefinitionQueryService service;
    }
}
