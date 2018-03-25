namespace DressDiscover.Server.Controllers.Worksheet
{
    public sealed class WorksheetStateCommandServiceJsonRpcController : Microsoft.AspNetCore.Mvc.Controller
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

            public sealed class DeleteWorksheetStateResponse
            {
                public DeleteWorksheetStateResponse(string id)
                {
                    this.Id = id;
                }

                public DeleteWorksheetStateResponse(string id, string result, string jsonrpc = "2.0") {
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
                            throw new System.NullReferenceException("DeleteWorksheetStateResponse.Id");
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
                            throw new System.NullReferenceException("DeleteWorksheetStateResponse.Jsonrpc");
                        }
                        this.jsonrpc = value;
                    }
                }

                [Newtonsoft.Json.JsonProperty(PropertyName = "result")]
                public string Result
                {
                    get { return result; }
                    set { this.result = value; }
                }

                private string id;
                private string jsonrpc = "2.0";
                private string result;
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

            public sealed class PutWorksheetStateResponse
            {
                public PutWorksheetStateResponse(string id)
                {
                    this.Id = id;
                }

                public PutWorksheetStateResponse(string id, string result, string jsonrpc = "2.0") {
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
                            throw new System.NullReferenceException("PutWorksheetStateResponse.Id");
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
                            throw new System.NullReferenceException("PutWorksheetStateResponse.Jsonrpc");
                        }
                        this.jsonrpc = value;
                    }
                }

                [Newtonsoft.Json.JsonProperty(PropertyName = "result")]
                public string Result
                {
                    get { return result; }
                    set { this.result = value; }
                }

                private string id;
                private string jsonrpc = "2.0";
                private string result;
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

            public sealed class RenameWorksheetStateResponse
            {
                public RenameWorksheetStateResponse(string id)
                {
                    this.Id = id;
                }

                public RenameWorksheetStateResponse(string id, string result, string jsonrpc = "2.0") {
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
                            throw new System.NullReferenceException("RenameWorksheetStateResponse.Id");
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
                            throw new System.NullReferenceException("RenameWorksheetStateResponse.Jsonrpc");
                        }
                        this.jsonrpc = value;
                    }
                }

                [Newtonsoft.Json.JsonProperty(PropertyName = "result")]
                public string Result
                {
                    get { return result; }
                    set { this.result = value; }
                }

                private string id;
                private string jsonrpc = "2.0";
                private string result;
            }
        }

        public WorksheetStateCommandServiceJsonRpcController(DressDiscover.Api.Services.Worksheet.IWorksheetStateCommandService service)
        {
            this.service = service;
        }

        [Microsoft.AspNetCore.Mvc.HttpPost]
        [Microsoft.AspNetCore.Mvc.Route("delete_worksheet_state")]
        public Microsoft.AspNetCore.Mvc.JsonResult DeleteWorksheetState([Microsoft.AspNetCore.Mvc.FromBody] Messages.DeleteWorksheetStateRequest request)
        {
            try
            {
                    service.DeleteWorksheetState(request.Params_.Id);
                    return new Microsoft.AspNetCore.Mvc.JsonResult(new Messages.DeleteWorksheetStateResponse(id: request.Id, result: null));
            }
            catch (DressDiscover.Api.Services.IoException e)
            {
                return new Microsoft.AspNetCore.Mvc.JsonResult(new Messages.JsonRpcErrorResponse(error: new Messages.JsonRpcError(code: 1, message: e.ToString()) { Class = "dressdiscover.api.services.io_exception.IoException", Data = e }, id: request.Id));
            }
        }
        [Microsoft.AspNetCore.Mvc.HttpPost]
        [Microsoft.AspNetCore.Mvc.Route("put_worksheet_state")]
        public Microsoft.AspNetCore.Mvc.JsonResult PutWorksheetState([Microsoft.AspNetCore.Mvc.FromBody] Messages.PutWorksheetStateRequest request)
        {
            try
            {
                    service.PutWorksheetState(request.Params_.State);
                    return new Microsoft.AspNetCore.Mvc.JsonResult(new Messages.PutWorksheetStateResponse(id: request.Id, result: null));
            }
            catch (DressDiscover.Api.Services.IoException e)
            {
                return new Microsoft.AspNetCore.Mvc.JsonResult(new Messages.JsonRpcErrorResponse(error: new Messages.JsonRpcError(code: 1, message: e.ToString()) { Class = "dressdiscover.api.services.io_exception.IoException", Data = e }, id: request.Id));
            }
        }
        [Microsoft.AspNetCore.Mvc.HttpPost]
        [Microsoft.AspNetCore.Mvc.Route("rename_worksheet_state")]
        public Microsoft.AspNetCore.Mvc.JsonResult RenameWorksheetState([Microsoft.AspNetCore.Mvc.FromBody] Messages.RenameWorksheetStateRequest request)
        {
            try
            {
                    service.RenameWorksheetState(request.Params_.NewId, request.Params_.OldId);
                    return new Microsoft.AspNetCore.Mvc.JsonResult(new Messages.RenameWorksheetStateResponse(id: request.Id, result: null));
            }
            catch (DressDiscover.Api.Services.Worksheet.DuplicateWorksheetStateException e)
            {
                return new Microsoft.AspNetCore.Mvc.JsonResult(new Messages.JsonRpcErrorResponse(error: new Messages.JsonRpcError(code: 1, message: e.ToString()) { Class = "dressdiscover.api.services.worksheet.duplicate_worksheet_state_exception.DuplicateWorksheetStateException", Data = e }, id: request.Id));
            }

            catch (DressDiscover.Api.Services.IoException e)
            {
                return new Microsoft.AspNetCore.Mvc.JsonResult(new Messages.JsonRpcErrorResponse(error: new Messages.JsonRpcError(code: 1, message: e.ToString()) { Class = "dressdiscover.api.services.io_exception.IoException", Data = e }, id: request.Id));
            }

            catch (DressDiscover.Api.Services.Worksheet.NoSuchWorksheetStateException e)
            {
                return new Microsoft.AspNetCore.Mvc.JsonResult(new Messages.JsonRpcErrorResponse(error: new Messages.JsonRpcError(code: 1, message: e.ToString()) { Class = "dressdiscover.api.services.worksheet.no_such_worksheet_state_exception.NoSuchWorksheetStateException", Data = e }, id: request.Id));
            }
        }

        private DressDiscover.Api.Services.Worksheet.IWorksheetStateCommandService service;
    }
}
