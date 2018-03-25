namespace DressDiscover.Server.Controllers.Worksheet
{
    public sealed class WorksheetStateCommandServiceJsonRpcController : Microsoft.AspNetCore.Mvc.Controller {
        public sealed class Messages {
            public sealed class DeleteWorksheetStateRequestParams
            {
                public DeleteWorksheetStateRequestParams(string id)
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
                            throw new System.NullReferenceException("DeleteWorksheetStateRequestParams.Id");
                        }
                        this.id = value;
                    }
                }

                private string id;
            }

            public sealed class DeleteWorksheetStateRequest
            {
                public DeleteWorksheetStateRequest(string jsonrpc, string method, string id, DeleteWorksheetStateRequestParams params_)
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
                            throw new System.NullReferenceException("DeleteWorksheetStateRequest.Id");
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
                            throw new System.NullReferenceException("DeleteWorksheetStateRequest.Jsonrpc");
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
                            throw new System.NullReferenceException("DeleteWorksheetStateRequest.Method");
                        }
                        this.method = value;
                    }
                }

                [Newtonsoft.Json.JsonProperty(PropertyName = "params_")]
                public DeleteWorksheetStateRequestParams Params_
                {
                    get { return params_; }
                    set
                    {
                        if (value == null)
                        {
                            throw new System.NullReferenceException("DeleteWorksheetStateRequest.Params_");
                        }
                        this.params_ = value;
                    }
                }

                private string id;
                private string jsonrpc;
                private string method;
                private DeleteWorksheetStateRequestParams params_;
            }

            public sealed class PutWorksheetStateRequestParams
            {
                public PutWorksheetStateRequestParams(DressDiscover.Api.Models.Worksheet.WorksheetState state)
                {
                    this.State = state;
                }

                [Newtonsoft.Json.JsonProperty(PropertyName = "state")]
                public DressDiscover.Api.Models.Worksheet.WorksheetState State
                {
                    get { return state; }
                    set
                    {
                        if (value == null)
                        {
                            throw new System.NullReferenceException("PutWorksheetStateRequestParams.State");
                        }
                        this.state = value;
                    }
                }

                private DressDiscover.Api.Models.Worksheet.WorksheetState state;
            }

            public sealed class PutWorksheetStateRequest
            {
                public PutWorksheetStateRequest(string jsonrpc, string method, string id, PutWorksheetStateRequestParams params_)
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
                            throw new System.NullReferenceException("PutWorksheetStateRequest.Id");
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
                            throw new System.NullReferenceException("PutWorksheetStateRequest.Jsonrpc");
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
                            throw new System.NullReferenceException("PutWorksheetStateRequest.Method");
                        }
                        this.method = value;
                    }
                }

                [Newtonsoft.Json.JsonProperty(PropertyName = "params_")]
                public PutWorksheetStateRequestParams Params_
                {
                    get { return params_; }
                    set
                    {
                        if (value == null)
                        {
                            throw new System.NullReferenceException("PutWorksheetStateRequest.Params_");
                        }
                        this.params_ = value;
                    }
                }

                private string id;
                private string jsonrpc;
                private string method;
                private PutWorksheetStateRequestParams params_;
            }

            public sealed class RenameWorksheetStateRequestParams
            {
                public RenameWorksheetStateRequestParams(string newId, string oldId)
                {
                    this.NewId = newId;
                    this.OldId = oldId;
                }

                [Newtonsoft.Json.JsonProperty(PropertyName = "new_id")]
                public string NewId
                {
                    get { return newId; }
                    set
                    {
                        if (value == null)
                        {
                            throw new System.NullReferenceException("RenameWorksheetStateRequestParams.NewId");
                        }
                        this.newId = value;
                    }
                }

                [Newtonsoft.Json.JsonProperty(PropertyName = "old_id")]
                public string OldId
                {
                    get { return oldId; }
                    set
                    {
                        if (value == null)
                        {
                            throw new System.NullReferenceException("RenameWorksheetStateRequestParams.OldId");
                        }
                        this.oldId = value;
                    }
                }

                private string newId;
                private string oldId;
            }

            public sealed class RenameWorksheetStateRequest
            {
                public RenameWorksheetStateRequest(string jsonrpc, string method, string id, RenameWorksheetStateRequestParams params_)
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
                            throw new System.NullReferenceException("RenameWorksheetStateRequest.Id");
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
                            throw new System.NullReferenceException("RenameWorksheetStateRequest.Jsonrpc");
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
                            throw new System.NullReferenceException("RenameWorksheetStateRequest.Method");
                        }
                        this.method = value;
                    }
                }

                [Newtonsoft.Json.JsonProperty(PropertyName = "params_")]
                public RenameWorksheetStateRequestParams Params_
                {
                    get { return params_; }
                    set
                    {
                        if (value == null)
                        {
                            throw new System.NullReferenceException("RenameWorksheetStateRequest.Params_");
                        }
                        this.params_ = value;
                    }
                }

                private string id;
                private string jsonrpc;
                private string method;
                private RenameWorksheetStateRequestParams params_;
            }
        }

        public WorksheetStateCommandServiceJsonRpcController(DressDiscover.Api.Services.Worksheet.IWorksheetStateCommandService service) {
            this.service = service;
        }

        [Microsoft.AspNetCore.Mvc.HttpPost]
        [Microsoft.AspNetCore.Mvc.Route("delete_worksheet_state")]
        public void DeleteWorksheetState([Microsoft.AspNetCore.Mvc.FromBody] Messages.DeleteWorksheetStateRequest request) {
            service.DeleteWorksheetState(request.id)
        }
        [Microsoft.AspNetCore.Mvc.HttpPost]
        [Microsoft.AspNetCore.Mvc.Route("put_worksheet_state")]
        public void PutWorksheetState([Microsoft.AspNetCore.Mvc.FromBody] Messages.PutWorksheetStateRequest request) {
            service.PutWorksheetState(request.state)
        }
        [Microsoft.AspNetCore.Mvc.HttpPost]
        [Microsoft.AspNetCore.Mvc.Route("rename_worksheet_state")]
        public void RenameWorksheetState([Microsoft.AspNetCore.Mvc.FromBody] Messages.RenameWorksheetStateRequest request) {
            service.RenameWorksheetState(request.new_id, request.old_id)
        }

        private DressDiscover.Api.Services.Worksheet.IWorksheetStateCommandService service;
    }
}
