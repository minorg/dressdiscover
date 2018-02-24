package org.dressdiscover.api.services.worksheet;

@com.google.inject.Singleton
@SuppressWarnings("serial")
public class WorksheetStateQueryServiceJsonRpcServlet extends javax.servlet.http.HttpServlet {
    @com.google.inject.Inject
    public WorksheetStateQueryServiceJsonRpcServlet(final org.dressdiscover.api.services.worksheet.WorksheetStateQueryService service) {
        this.service = service;
    }

    @Override
    protected void doPost(final javax.servlet.http.HttpServletRequest httpServletRequest, final javax.servlet.http.HttpServletResponse httpServletResponse) throws java.io.IOException, javax.servlet.ServletException {
        final String httpServletRequestBody;
        try (final java.io.Reader httpServletRequestBodyReader = httpServletRequest.getReader()) {
            final StringBuilder httpServletRequestBodyBuilder = new StringBuilder();
            final char[] httpServletRequestBodyBuffer = new char[4096];
            int httpServletRequestBodyBufferReadRet;
            while ((httpServletRequestBodyBufferReadRet = httpServletRequestBodyReader.read(httpServletRequestBodyBuffer)) != -1) {
                httpServletRequestBodyBuilder.append(httpServletRequestBodyBuffer, 0, httpServletRequestBodyBufferReadRet);
            }
            httpServletRequestBody = httpServletRequestBodyBuilder.toString();
        }

        org.thryft.protocol.MessageBegin messageBegin = null;
        try {
            final org.thryft.waf.lib.protocols.json.JsonRpcInputProtocol iprot;
            try {
                iprot = new org.thryft.waf.lib.protocols.json.JsonRpcInputProtocol(new org.thryft.waf.lib.protocols.json.JacksonJsonInputProtocol(httpServletRequestBody));
                messageBegin = iprot.readMessageBegin();
            } catch (final org.thryft.waf.lib.protocols.json.JsonRpcInputProtocolException e) {
                throw e;
            } catch (final org.thryft.protocol.InputProtocolException e) {
                throw new org.thryft.waf.lib.protocols.json.JsonRpcInputProtocolException(e, -32600);
            }
            if (messageBegin.getType() != org.thryft.protocol.MessageType.CALL) {
                throw new org.thryft.waf.lib.protocols.json.JsonRpcInputProtocolException(-32600, "expected request");
            }
            if (messageBegin.getName().equals("get_worksheet_accession_numbers")) {
                doPostGetWorksheetAccessionNumbers(httpServletRequest, httpServletResponse, iprot, messageBegin.getId());
            } else if (messageBegin.getName().equals("get_worksheet_state")) {
                doPostGetWorksheetState(httpServletRequest, httpServletResponse, iprot, messageBegin.getId());
            } else {
                __doPostError(httpServletRequest, httpServletResponse, new org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse(-32601, String.format("the method '%s' does not exist / is not available", messageBegin.getName())), messageBegin.getId());
                return;
            }
        } catch (final org.thryft.waf.lib.protocols.json.JsonRpcInputProtocolException e) {
            __doPostError(httpServletRequest, httpServletResponse, new org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse(e), messageBegin != null ? messageBegin.getId() : null);
            return;
        }
    }

    private void __doPostError(final javax.servlet.http.HttpServletRequest httpServletRequest, final javax.servlet.http.HttpServletResponse httpServletResponse, final org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse jsonRpcErrorResponse, @javax.annotation.Nullable final Object jsonRpcRequestId) throws java.io.IOException {
        final java.io.StringWriter httpServletResponseBodyWriter = new java.io.StringWriter();
        try {
            final org.thryft.waf.lib.protocols.json.JsonRpcOutputProtocol oprot = new org.thryft.waf.lib.protocols.json.JsonRpcOutputProtocol(new org.thryft.waf.lib.protocols.json.JacksonJsonOutputProtocol(httpServletResponseBodyWriter));
            oprot.writeMessageBegin("", org.thryft.protocol.MessageType.EXCEPTION, jsonRpcRequestId);
            jsonRpcErrorResponse.writeAsStruct(oprot);
            oprot.writeMessageEnd();
            oprot.flush();
        } catch (final org.thryft.protocol.OutputProtocolException e) {
            logger.error("error serializing service error response: ", e);
            throw new IllegalStateException(e);
        }
        __doPostResponse(httpServletRequest, httpServletResponse, httpServletResponseBodyWriter.toString());
    }

    private static void __doPostResponse(final javax.servlet.http.HttpServletRequest httpServletRequest, final javax.servlet.http.HttpServletResponse httpServletResponse, final String httpServletResponseBody) throws java.io.IOException {
        httpServletResponse.setContentType("application/json; charset=utf-8");

        try (final java.io.OutputStream httpServletResponseOutputStream = httpServletResponse.getOutputStream()) {
            httpServletResponseOutputStream.write(httpServletResponseBody.getBytes("UTF-8"));
        }
    }

    public void doPostGetWorksheetAccessionNumbers(final javax.servlet.http.HttpServletRequest httpServletRequest, final javax.servlet.http.HttpServletResponse httpServletResponse, final org.thryft.waf.lib.protocols.json.JsonRpcInputProtocol iprot, final Object jsonRpcRequestId) throws java.io.IOException {
        final com.google.common.collect.ImmutableList<String> result;
        try {
            result = service.getWorksheetAccessionNumbers();
        } catch (final org.dressdiscover.api.services.IoException e) {
            __doPostError(httpServletRequest, httpServletResponse, new org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse(e, 1, e.getClass().getCanonicalName() + ": " + String.valueOf(e.getMessage())), jsonRpcRequestId);
            return;
        }

        final String httpServletResponseBody;
        {
            final java.io.StringWriter httpServletResponseBodyWriter = new java.io.StringWriter();
            try {
                final org.thryft.waf.lib.protocols.json.JsonRpcOutputProtocol oprot = new org.thryft.waf.lib.protocols.json.JsonRpcOutputProtocol(new org.thryft.waf.lib.protocols.json.JacksonJsonOutputProtocol(httpServletResponseBodyWriter));
                oprot.writeMessageBegin("", org.thryft.protocol.MessageType.REPLY, jsonRpcRequestId);
                oprot.writeListBegin(org.thryft.protocol.Type.STRING, result.size());
                for (final String _iter0 : result) {
                    oprot.writeString(_iter0);
                }
                oprot.writeListEnd();
                oprot.writeMessageEnd();
                oprot.flush();
            } catch (final org.thryft.protocol.OutputProtocolException e) {
                logger.error("error serializing service error response: ", e);
                throw new IllegalStateException(e);
            }
            httpServletResponseBody = httpServletResponseBodyWriter.toString();
        }
        __doPostResponse(httpServletRequest, httpServletResponse, httpServletResponseBody);
    }

    public void doPostGetWorksheetState(final javax.servlet.http.HttpServletRequest httpServletRequest, final javax.servlet.http.HttpServletResponse httpServletResponse, final org.thryft.waf.lib.protocols.json.JsonRpcInputProtocol iprot, final Object jsonRpcRequestId) throws java.io.IOException {
        final org.dressdiscover.api.services.worksheet.WorksheetStateQueryService.Messages.GetWorksheetStateRequest serviceRequest;
        try {
            serviceRequest = org.dressdiscover.api.services.worksheet.WorksheetStateQueryService.Messages.GetWorksheetStateRequest.readAs(iprot, iprot.getCurrentFieldType(), unknownFieldCallback);
        } catch (final IllegalArgumentException | org.thryft.protocol.InputProtocolException | NullPointerException e) {
            logger.debug("error deserializing service request: ", e);
            __doPostError(httpServletRequest, httpServletResponse, new org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse(e, -32602, e.getMessage() != null ? e.getMessage() : "invalid JSON-RPC request method parameters"), jsonRpcRequestId);
            return;
        }

        final org.dressdiscover.api.models.worksheet.WorksheetState result;
        try {
            result = service.getWorksheetState(serviceRequest.getAccessionNumber());
        } catch (final org.dressdiscover.api.services.IoException e) {
            __doPostError(httpServletRequest, httpServletResponse, new org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse(e, 1, e.getClass().getCanonicalName() + ": " + String.valueOf(e.getMessage())), jsonRpcRequestId);
            return;
        }

        final String httpServletResponseBody;
        {
            final java.io.StringWriter httpServletResponseBodyWriter = new java.io.StringWriter();
            try {
                final org.thryft.waf.lib.protocols.json.JsonRpcOutputProtocol oprot = new org.thryft.waf.lib.protocols.json.JsonRpcOutputProtocol(new org.thryft.waf.lib.protocols.json.JacksonJsonOutputProtocol(httpServletResponseBodyWriter));
                oprot.writeMessageBegin("", org.thryft.protocol.MessageType.REPLY, jsonRpcRequestId);
                result.writeAsStruct(oprot);
                oprot.writeMessageEnd();
                oprot.flush();
            } catch (final org.thryft.protocol.OutputProtocolException e) {
                logger.error("error serializing service error response: ", e);
                throw new IllegalStateException(e);
            }
            httpServletResponseBody = httpServletResponseBodyWriter.toString();
        }
        __doPostResponse(httpServletRequest, httpServletResponse, httpServletResponseBody);
    }

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(WorksheetStateQueryServiceJsonRpcServlet.class);
    private final static com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback = com.google.common.base.Optional.of(new org.thryft.CompoundType.UnknownFieldCallback() { @Override public void apply(final org.thryft.protocol.FieldBegin field) throws org.thryft.protocol.InputProtocolException { throw new org.thryft.protocol.InputProtocolException("unknown field " + field); } });
    private final org.dressdiscover.api.services.worksheet.WorksheetStateQueryService service;
}
