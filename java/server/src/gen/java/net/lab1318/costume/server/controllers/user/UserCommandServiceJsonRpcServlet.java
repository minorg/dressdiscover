package net.lab1318.costume.server.controllers.user;

@com.google.inject.Singleton
@SuppressWarnings("serial")
public class UserCommandServiceJsonRpcServlet extends javax.servlet.http.HttpServlet {
    @com.google.inject.Inject
    public UserCommandServiceJsonRpcServlet(final net.lab1318.costume.api.services.user.UserCommandService service) {
        this.service = service;
    }

    @Override
    protected void doPost(final javax.servlet.http.HttpServletRequest httpServletRequest, final javax.servlet.http.HttpServletResponse httpServletResponse) throws java.io.IOException, javax.servlet.ServletException {
        final String httpServletRequestContentEncoding = httpServletRequest.getHeader("Content-Encoding");
        java.io.InputStream httpServletRequestInputStream = httpServletRequest.getInputStream();
        if (httpServletRequestContentEncoding != null) {
            if (httpServletRequestContentEncoding.equals("deflate")) {
                httpServletRequestInputStream = new java.util.zip.InflaterInputStream(httpServletRequestInputStream);
            } else if (httpServletRequestContentEncoding.equals("gzip")) {
                httpServletRequestInputStream = new java.util.zip.GZIPInputStream(httpServletRequestInputStream);
            }
        }

        final String httpServletRequestBody;
        {
            final java.io.InputStreamReader httpServletRequestBodyReader = new java.io.InputStreamReader(httpServletRequestInputStream);
            final java.io.StringWriter httpServletRequestBodyWriter = new java.io.StringWriter();
            final char[] httpServletRequestBodyBuffer = new char[4096];
            int httpServletRequestBodyBufferReadRet = 0;
            while ((httpServletRequestBodyBufferReadRet = httpServletRequestBodyReader.read(httpServletRequestBodyBuffer)) != -1) {
                httpServletRequestBodyWriter.write(httpServletRequestBodyBuffer, 0, httpServletRequestBodyBufferReadRet);
            }
            httpServletRequestBody = httpServletRequestBodyWriter.toString();
        }

        org.thryft.protocol.MessageBegin messageBegin = null;
        try {
            final org.thryft.protocol.JsonRpcInputProtocol iprot;
            try {
                iprot = new org.thryft.protocol.JsonRpcInputProtocol(new org.thryft.protocol.JacksonJsonInputProtocol(httpServletRequestBody));
                messageBegin = iprot.readMessageBegin();
            } catch (final org.thryft.protocol.JsonRpcInputProtocolException e) {
                throw e;
            } catch (final org.thryft.protocol.InputProtocolException e) {
                throw new org.thryft.protocol.JsonRpcInputProtocolException(e, -32600);
            }
            if (messageBegin.getType() != org.thryft.protocol.MessageType.CALL) {
                throw new org.thryft.protocol.JsonRpcInputProtocolException(-32600, "expected request");
            }
            if (messageBegin.getName().equals("delete_user_by_id")) {
                doPostDeleteUserById(httpServletRequest, httpServletResponse, iprot, messageBegin.getId());
            } else if (messageBegin.getName().equals("delete_users")) {
                doPostDeleteUsers(httpServletRequest, httpServletResponse, iprot, messageBegin.getId());
            } else if (messageBegin.getName().equals("post_and_get_user")) {
                doPostPostAndGetUser(httpServletRequest, httpServletResponse, iprot, messageBegin.getId());
            } else if (messageBegin.getName().equals("post_user")) {
                doPostPostUser(httpServletRequest, httpServletResponse, iprot, messageBegin.getId());
            } else if (messageBegin.getName().equals("put_user")) {
                doPostPutUser(httpServletRequest, httpServletResponse, iprot, messageBegin.getId());
            } else {
                __doPostError(httpServletRequest, httpServletResponse, new org.thryft.protocol.JsonRpcErrorResponse(-32601, String.format("the method '%s' does not exist / is not available", messageBegin.getName())), messageBegin.getId());
                return;
            }
        } catch (final org.thryft.protocol.JsonRpcInputProtocolException e) {
            __doPostError(httpServletRequest, httpServletResponse, new org.thryft.protocol.JsonRpcErrorResponse(e), messageBegin != null ? messageBegin.getId() : null);
            return;
        }
    }

    private void __doPostError(final javax.servlet.http.HttpServletRequest httpServletRequest, final javax.servlet.http.HttpServletResponse httpServletResponse, final org.thryft.protocol.JsonRpcErrorResponse jsonRpcErrorResponse, @javax.annotation.Nullable final Object jsonRpcRequestId) throws java.io.IOException {
        final java.io.StringWriter httpServletResponseBodyWriter = new java.io.StringWriter();
        try {
            final org.thryft.protocol.JsonRpcOutputProtocol oprot = new org.thryft.protocol.JsonRpcOutputProtocol(new org.thryft.protocol.JacksonJsonOutputProtocol(httpServletResponseBodyWriter));
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

    private void __doPostResponse(final javax.servlet.http.HttpServletRequest httpServletRequest, final javax.servlet.http.HttpServletResponse httpServletResponse, final String httpServletResponseBody) throws java.io.IOException {
        httpServletResponse.setContentType("application/json; charset=utf-8");

        if (httpServletResponseBody.length() >= 128) {
            final String httpServletRequestAcceptEncoding = httpServletRequest.getHeader("Accept-Encoding");
            if (httpServletRequestAcceptEncoding != null && !httpServletRequestAcceptEncoding.isEmpty()) {
                final String[] contentCodings = httpServletRequestAcceptEncoding.split(",");
                final java.util.TreeMap<java.math.BigDecimal, String> contentCodingsMap = new java.util.TreeMap<java.math.BigDecimal, String>();
                java.math.BigDecimal nextQvalue = new java.math.BigDecimal(Long.MAX_VALUE);
                for (final String contentCoding : contentCodings) {
                    final String[] contentCodingSplit = contentCoding.split(";", 2);
                    final String name = contentCodingSplit[0].trim();
                    final java.math.BigDecimal qvalue;
                    if (contentCodingSplit.length == 2) {
                        final String[] qvalueSplit = contentCodingSplit[1].split("=", 2);
                        if (qvalueSplit.length == 2) {
                            try {
                                qvalue = new java.math.BigDecimal(qvalueSplit[1].trim());
                                if (qvalue == java.math.BigDecimal.ZERO) {
                                    continue;
                                }
                            } catch (final NumberFormatException e) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        qvalue = nextQvalue;
                        nextQvalue = nextQvalue.subtract(java.math.BigDecimal.ONE);
                    }
                    contentCodingsMap.put(qvalue, name);
                }

                if (!contentCodingsMap.isEmpty()) {
                    final String contentCoding = contentCodingsMap.lastEntry().getValue();
                    if (contentCoding.equals("deflate") || contentCoding.equals("gzip")) {
                        final java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();

                        final java.util.zip.DeflaterOutputStream compressingOutputStream;
                        if (contentCoding.equals("deflate")) {
                            compressingOutputStream = new java.util.zip.DeflaterOutputStream(byteArrayOutputStream);
                        } else {
                            compressingOutputStream = new java.util.zip.GZIPOutputStream(byteArrayOutputStream);
                        }

                        byte[] compressedHttpServletResponseBody = null;
                        try {
                            try {
                                compressingOutputStream.write(httpServletResponseBody.getBytes("UTF-8"));
                                compressingOutputStream.finish();
                                compressedHttpServletResponseBody = byteArrayOutputStream.toByteArray();
                            } finally {
                                compressingOutputStream.close();
                            }
                        } catch (java.io.IOException e) {
                        }

                        if (compressedHttpServletResponseBody != null) {
                            httpServletResponse.setHeader("Content-Encoding", contentCoding);
                            httpServletResponse.getOutputStream().write(compressedHttpServletResponseBody);
                            return;
                        }
                    }
                }
            }
        }

        httpServletResponse.getOutputStream().write(httpServletResponseBody.getBytes("UTF-8"));
    }

    public void doPostDeleteUserById(final javax.servlet.http.HttpServletRequest httpServletRequest, final javax.servlet.http.HttpServletResponse httpServletResponse, final org.thryft.protocol.JsonRpcInputProtocol iprot, final Object jsonRpcRequestId) throws java.io.IOException {
        final net.lab1318.costume.api.services.user.UserCommandService.Messages.DeleteUserByIdRequest serviceRequest;
        try {
            serviceRequest = net.lab1318.costume.api.services.user.UserCommandService.Messages.DeleteUserByIdRequest.readAs(iprot, iprot.getCurrentFieldType());
        } catch (final IllegalArgumentException | org.thryft.protocol.InputProtocolException | NullPointerException e) {
            logger.debug("error deserializing service request: ", e);
            __doPostError(httpServletRequest, httpServletResponse, new org.thryft.protocol.JsonRpcErrorResponse(e, -32602, "invalid JSON-RPC request method parameters: " + String.valueOf(e.getMessage())), jsonRpcRequestId);
            return;
        }

        try {
            service.deleteUserById(serviceRequest.getId());
        } catch (final net.lab1318.costume.api.services.IoException e) {
            __doPostError(httpServletRequest, httpServletResponse, new org.thryft.protocol.JsonRpcErrorResponse(e, 1, e.getClass().getCanonicalName() + ": " + String.valueOf(e.getMessage())), jsonRpcRequestId);
            return;
        } catch (final net.lab1318.costume.api.services.user.NoSuchUserException e) {
            __doPostError(httpServletRequest, httpServletResponse, new org.thryft.protocol.JsonRpcErrorResponse(e, 1, e.getClass().getCanonicalName() + ": " + String.valueOf(e.getMessage())), jsonRpcRequestId);
            return;
        }

        final String httpServletResponseBody;
        {
            final java.io.StringWriter httpServletResponseBodyWriter = new java.io.StringWriter();
            try {
                final org.thryft.protocol.JsonRpcOutputProtocol oprot = new org.thryft.protocol.JsonRpcOutputProtocol(new org.thryft.protocol.JacksonJsonOutputProtocol(httpServletResponseBodyWriter));
                oprot.writeMessageBegin("", org.thryft.protocol.MessageType.REPLY, jsonRpcRequestId);
                oprot.writeStructBegin("response");
                oprot.writeStructEnd();
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

    public void doPostDeleteUsers(final javax.servlet.http.HttpServletRequest httpServletRequest, final javax.servlet.http.HttpServletResponse httpServletResponse, final org.thryft.protocol.JsonRpcInputProtocol iprot, final Object jsonRpcRequestId) throws java.io.IOException {
        try {
            service.deleteUsers();
        } catch (final net.lab1318.costume.api.services.IoException e) {
            __doPostError(httpServletRequest, httpServletResponse, new org.thryft.protocol.JsonRpcErrorResponse(e, 1, e.getClass().getCanonicalName() + ": " + String.valueOf(e.getMessage())), jsonRpcRequestId);
            return;
        }

        final String httpServletResponseBody;
        {
            final java.io.StringWriter httpServletResponseBodyWriter = new java.io.StringWriter();
            try {
                final org.thryft.protocol.JsonRpcOutputProtocol oprot = new org.thryft.protocol.JsonRpcOutputProtocol(new org.thryft.protocol.JacksonJsonOutputProtocol(httpServletResponseBodyWriter));
                oprot.writeMessageBegin("", org.thryft.protocol.MessageType.REPLY, jsonRpcRequestId);
                oprot.writeStructBegin("response");
                oprot.writeStructEnd();
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

    public void doPostPostAndGetUser(final javax.servlet.http.HttpServletRequest httpServletRequest, final javax.servlet.http.HttpServletResponse httpServletResponse, final org.thryft.protocol.JsonRpcInputProtocol iprot, final Object jsonRpcRequestId) throws java.io.IOException {
        final net.lab1318.costume.api.services.user.UserCommandService.Messages.PostAndGetUserRequest serviceRequest;
        try {
            serviceRequest = net.lab1318.costume.api.services.user.UserCommandService.Messages.PostAndGetUserRequest.readAs(iprot, iprot.getCurrentFieldType());
        } catch (final IllegalArgumentException | org.thryft.protocol.InputProtocolException | NullPointerException e) {
            logger.debug("error deserializing service request: ", e);
            __doPostError(httpServletRequest, httpServletResponse, new org.thryft.protocol.JsonRpcErrorResponse(e, -32602, "invalid JSON-RPC request method parameters: " + String.valueOf(e.getMessage())), jsonRpcRequestId);
            return;
        }

        final net.lab1318.costume.api.models.user.UserEntry result;
        try {
            result = service.postAndGetUser(serviceRequest.getUser());
        } catch (final net.lab1318.costume.api.services.user.DuplicateUserException e) {
            __doPostError(httpServletRequest, httpServletResponse, new org.thryft.protocol.JsonRpcErrorResponse(e, 1, e.getClass().getCanonicalName() + ": " + String.valueOf(e.getMessage())), jsonRpcRequestId);
            return;
        } catch (final net.lab1318.costume.api.services.IoException e) {
            __doPostError(httpServletRequest, httpServletResponse, new org.thryft.protocol.JsonRpcErrorResponse(e, 1, e.getClass().getCanonicalName() + ": " + String.valueOf(e.getMessage())), jsonRpcRequestId);
            return;
        }

        final String httpServletResponseBody;
        {
            final java.io.StringWriter httpServletResponseBodyWriter = new java.io.StringWriter();
            try {
                final org.thryft.protocol.JsonRpcOutputProtocol oprot = new org.thryft.protocol.JsonRpcOutputProtocol(new org.thryft.protocol.JacksonJsonOutputProtocol(httpServletResponseBodyWriter));
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

    public void doPostPostUser(final javax.servlet.http.HttpServletRequest httpServletRequest, final javax.servlet.http.HttpServletResponse httpServletResponse, final org.thryft.protocol.JsonRpcInputProtocol iprot, final Object jsonRpcRequestId) throws java.io.IOException {
        final net.lab1318.costume.api.services.user.UserCommandService.Messages.PostUserRequest serviceRequest;
        try {
            serviceRequest = net.lab1318.costume.api.services.user.UserCommandService.Messages.PostUserRequest.readAs(iprot, iprot.getCurrentFieldType());
        } catch (final IllegalArgumentException | org.thryft.protocol.InputProtocolException | NullPointerException e) {
            logger.debug("error deserializing service request: ", e);
            __doPostError(httpServletRequest, httpServletResponse, new org.thryft.protocol.JsonRpcErrorResponse(e, -32602, "invalid JSON-RPC request method parameters: " + String.valueOf(e.getMessage())), jsonRpcRequestId);
            return;
        }

        final net.lab1318.costume.api.models.user.UserId result;
        try {
            result = service.postUser(serviceRequest.getUser());
        } catch (final net.lab1318.costume.api.services.user.DuplicateUserException e) {
            __doPostError(httpServletRequest, httpServletResponse, new org.thryft.protocol.JsonRpcErrorResponse(e, 1, e.getClass().getCanonicalName() + ": " + String.valueOf(e.getMessage())), jsonRpcRequestId);
            return;
        } catch (final net.lab1318.costume.api.services.IoException e) {
            __doPostError(httpServletRequest, httpServletResponse, new org.thryft.protocol.JsonRpcErrorResponse(e, 1, e.getClass().getCanonicalName() + ": " + String.valueOf(e.getMessage())), jsonRpcRequestId);
            return;
        }

        final String httpServletResponseBody;
        {
            final java.io.StringWriter httpServletResponseBodyWriter = new java.io.StringWriter();
            try {
                final org.thryft.protocol.JsonRpcOutputProtocol oprot = new org.thryft.protocol.JsonRpcOutputProtocol(new org.thryft.protocol.JacksonJsonOutputProtocol(httpServletResponseBodyWriter));
                oprot.writeMessageBegin("", org.thryft.protocol.MessageType.REPLY, jsonRpcRequestId);
                oprot.writeString(result.toString());
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

    public void doPostPutUser(final javax.servlet.http.HttpServletRequest httpServletRequest, final javax.servlet.http.HttpServletResponse httpServletResponse, final org.thryft.protocol.JsonRpcInputProtocol iprot, final Object jsonRpcRequestId) throws java.io.IOException {
        final net.lab1318.costume.api.services.user.UserCommandService.Messages.PutUserRequest serviceRequest;
        try {
            serviceRequest = net.lab1318.costume.api.services.user.UserCommandService.Messages.PutUserRequest.readAs(iprot, iprot.getCurrentFieldType());
        } catch (final IllegalArgumentException | org.thryft.protocol.InputProtocolException | NullPointerException e) {
            logger.debug("error deserializing service request: ", e);
            __doPostError(httpServletRequest, httpServletResponse, new org.thryft.protocol.JsonRpcErrorResponse(e, -32602, "invalid JSON-RPC request method parameters: " + String.valueOf(e.getMessage())), jsonRpcRequestId);
            return;
        }

        try {
            service.putUser(serviceRequest.getId(), serviceRequest.getUser());
        } catch (final net.lab1318.costume.api.services.IoException e) {
            __doPostError(httpServletRequest, httpServletResponse, new org.thryft.protocol.JsonRpcErrorResponse(e, 1, e.getClass().getCanonicalName() + ": " + String.valueOf(e.getMessage())), jsonRpcRequestId);
            return;
        } catch (final net.lab1318.costume.api.services.user.NoSuchUserException e) {
            __doPostError(httpServletRequest, httpServletResponse, new org.thryft.protocol.JsonRpcErrorResponse(e, 1, e.getClass().getCanonicalName() + ": " + String.valueOf(e.getMessage())), jsonRpcRequestId);
            return;
        }

        final String httpServletResponseBody;
        {
            final java.io.StringWriter httpServletResponseBodyWriter = new java.io.StringWriter();
            try {
                final org.thryft.protocol.JsonRpcOutputProtocol oprot = new org.thryft.protocol.JsonRpcOutputProtocol(new org.thryft.protocol.JacksonJsonOutputProtocol(httpServletResponseBodyWriter));
                oprot.writeMessageBegin("", org.thryft.protocol.MessageType.REPLY, jsonRpcRequestId);
                oprot.writeStructBegin("response");
                oprot.writeStructEnd();
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

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(UserCommandServiceJsonRpcServlet.class);
    private final net.lab1318.costume.api.services.user.UserCommandService service;
}
