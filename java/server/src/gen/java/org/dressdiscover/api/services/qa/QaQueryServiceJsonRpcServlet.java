package org.dressdiscover.api.services.qa;

@com.google.inject.Singleton
@SuppressWarnings("serial")
public class QaQueryServiceJsonRpcServlet extends javax.servlet.http.HttpServlet {
    @com.google.inject.Inject
    public QaQueryServiceJsonRpcServlet(final org.dressdiscover.api.services.qa.QaQueryService service) {
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
            if (messageBegin.getName().equals("get_answers")) {
                doPostGetAnswers(httpServletRequest, httpServletResponse, iprot, messageBegin.getId());
            } else if (messageBegin.getName().equals("get_object_by_id")) {
                doPostGetObjectById(httpServletRequest, httpServletResponse, iprot, messageBegin.getId());
            } else if (messageBegin.getName().equals("get_objects")) {
                doPostGetObjects(httpServletRequest, httpServletResponse, iprot, messageBegin.getId());
            } else if (messageBegin.getName().equals("get_question_sets")) {
                doPostGetQuestionSets(httpServletRequest, httpServletResponse, iprot, messageBegin.getId());
            } else if (messageBegin.getName().equals("get_questions")) {
                doPostGetQuestions(httpServletRequest, httpServletResponse, iprot, messageBegin.getId());
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

    public void doPostGetAnswers(final javax.servlet.http.HttpServletRequest httpServletRequest, final javax.servlet.http.HttpServletResponse httpServletResponse, final org.thryft.waf.lib.protocols.json.JsonRpcInputProtocol iprot, final Object jsonRpcRequestId) throws java.io.IOException {
        final org.dressdiscover.api.services.qa.QaQueryService.Messages.GetAnswersRequest serviceRequest;
        try {
            serviceRequest = org.dressdiscover.api.services.qa.QaQueryService.Messages.GetAnswersRequest.readAs(iprot, iprot.getCurrentFieldType(), unknownFieldCallback);
        } catch (final IllegalArgumentException | org.thryft.protocol.InputProtocolException | NullPointerException e) {
            logger.debug("error deserializing service request: ", e);
            __doPostError(httpServletRequest, httpServletResponse, new org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse(e, -32602, "invalid JSON-RPC request method parameters: " + String.valueOf(e.getMessage())), jsonRpcRequestId);
            return;
        }

        final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Answer> result;
        try {
            result = service.getAnswers(serviceRequest.getObjectId(), serviceRequest.getQuestionSetId(), serviceRequest.getQuestionIds(), serviceRequest.getUserId());
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
                oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, result.size());
                for (final org.dressdiscover.api.models.qa.Answer _iter0 : result) {
                    _iter0.writeAsStruct(oprot);
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

    public void doPostGetObjectById(final javax.servlet.http.HttpServletRequest httpServletRequest, final javax.servlet.http.HttpServletResponse httpServletResponse, final org.thryft.waf.lib.protocols.json.JsonRpcInputProtocol iprot, final Object jsonRpcRequestId) throws java.io.IOException {
        final org.dressdiscover.api.services.qa.QaQueryService.Messages.GetObjectByIdRequest serviceRequest;
        try {
            serviceRequest = org.dressdiscover.api.services.qa.QaQueryService.Messages.GetObjectByIdRequest.readAs(iprot, iprot.getCurrentFieldType(), unknownFieldCallback);
        } catch (final IllegalArgumentException | org.thryft.protocol.InputProtocolException | NullPointerException e) {
            logger.debug("error deserializing service request: ", e);
            __doPostError(httpServletRequest, httpServletResponse, new org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse(e, -32602, "invalid JSON-RPC request method parameters: " + String.valueOf(e.getMessage())), jsonRpcRequestId);
            return;
        }

        final org.dressdiscover.api.models.qa.QaObject result;
        try {
            result = service.getObjectById(serviceRequest.getId());
        } catch (final org.dressdiscover.api.services.IoException e) {
            __doPostError(httpServletRequest, httpServletResponse, new org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse(e, 1, e.getClass().getCanonicalName() + ": " + String.valueOf(e.getMessage())), jsonRpcRequestId);
            return;
        } catch (final org.dressdiscover.api.services.qa.NoSuchObjectException e) {
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

    public void doPostGetObjects(final javax.servlet.http.HttpServletRequest httpServletRequest, final javax.servlet.http.HttpServletResponse httpServletResponse, final org.thryft.waf.lib.protocols.json.JsonRpcInputProtocol iprot, final Object jsonRpcRequestId) throws java.io.IOException {
        final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QaObject> result;
        try {
            result = service.getObjects();
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
                oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, result.size());
                for (final org.dressdiscover.api.models.qa.QaObject _iter0 : result) {
                    _iter0.writeAsStruct(oprot);
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

    public void doPostGetQuestionSets(final javax.servlet.http.HttpServletRequest httpServletRequest, final javax.servlet.http.HttpServletResponse httpServletResponse, final org.thryft.waf.lib.protocols.json.JsonRpcInputProtocol iprot, final Object jsonRpcRequestId) throws java.io.IOException {
        final org.dressdiscover.api.services.qa.QaQueryService.Messages.GetQuestionSetsRequest serviceRequest;
        try {
            serviceRequest = org.dressdiscover.api.services.qa.QaQueryService.Messages.GetQuestionSetsRequest.readAs(iprot, iprot.getCurrentFieldType(), unknownFieldCallback);
        } catch (final IllegalArgumentException | org.thryft.protocol.InputProtocolException | NullPointerException e) {
            logger.debug("error deserializing service request: ", e);
            __doPostError(httpServletRequest, httpServletResponse, new org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse(e, -32602, "invalid JSON-RPC request method parameters: " + String.valueOf(e.getMessage())), jsonRpcRequestId);
            return;
        }

        final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.QuestionSet> result;
        try {
            result = service.getQuestionSets(serviceRequest.getIds());
        } catch (final org.dressdiscover.api.services.IoException e) {
            __doPostError(httpServletRequest, httpServletResponse, new org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse(e, 1, e.getClass().getCanonicalName() + ": " + String.valueOf(e.getMessage())), jsonRpcRequestId);
            return;
        } catch (final org.dressdiscover.api.services.qa.NoSuchQuestionSetException e) {
            __doPostError(httpServletRequest, httpServletResponse, new org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse(e, 1, e.getClass().getCanonicalName() + ": " + String.valueOf(e.getMessage())), jsonRpcRequestId);
            return;
        }

        final String httpServletResponseBody;
        {
            final java.io.StringWriter httpServletResponseBodyWriter = new java.io.StringWriter();
            try {
                final org.thryft.waf.lib.protocols.json.JsonRpcOutputProtocol oprot = new org.thryft.waf.lib.protocols.json.JsonRpcOutputProtocol(new org.thryft.waf.lib.protocols.json.JacksonJsonOutputProtocol(httpServletResponseBodyWriter));
                oprot.writeMessageBegin("", org.thryft.protocol.MessageType.REPLY, jsonRpcRequestId);
                oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, result.size());
                for (final org.dressdiscover.api.models.qa.QuestionSet _iter0 : result) {
                    _iter0.writeAsStruct(oprot);
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

    public void doPostGetQuestions(final javax.servlet.http.HttpServletRequest httpServletRequest, final javax.servlet.http.HttpServletResponse httpServletResponse, final org.thryft.waf.lib.protocols.json.JsonRpcInputProtocol iprot, final Object jsonRpcRequestId) throws java.io.IOException {
        final org.dressdiscover.api.services.qa.QaQueryService.Messages.GetQuestionsRequest serviceRequest;
        try {
            serviceRequest = org.dressdiscover.api.services.qa.QaQueryService.Messages.GetQuestionsRequest.readAs(iprot, iprot.getCurrentFieldType(), unknownFieldCallback);
        } catch (final IllegalArgumentException | org.thryft.protocol.InputProtocolException | NullPointerException e) {
            logger.debug("error deserializing service request: ", e);
            __doPostError(httpServletRequest, httpServletResponse, new org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse(e, -32602, "invalid JSON-RPC request method parameters: " + String.valueOf(e.getMessage())), jsonRpcRequestId);
            return;
        }

        final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.qa.Question> result;
        try {
            result = service.getQuestions(serviceRequest.getIds());
        } catch (final org.dressdiscover.api.services.IoException e) {
            __doPostError(httpServletRequest, httpServletResponse, new org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse(e, 1, e.getClass().getCanonicalName() + ": " + String.valueOf(e.getMessage())), jsonRpcRequestId);
            return;
        } catch (final org.dressdiscover.api.services.qa.NoSuchQuestionException e) {
            __doPostError(httpServletRequest, httpServletResponse, new org.thryft.waf.lib.protocols.json.JsonRpcErrorResponse(e, 1, e.getClass().getCanonicalName() + ": " + String.valueOf(e.getMessage())), jsonRpcRequestId);
            return;
        }

        final String httpServletResponseBody;
        {
            final java.io.StringWriter httpServletResponseBodyWriter = new java.io.StringWriter();
            try {
                final org.thryft.waf.lib.protocols.json.JsonRpcOutputProtocol oprot = new org.thryft.waf.lib.protocols.json.JsonRpcOutputProtocol(new org.thryft.waf.lib.protocols.json.JacksonJsonOutputProtocol(httpServletResponseBodyWriter));
                oprot.writeMessageBegin("", org.thryft.protocol.MessageType.REPLY, jsonRpcRequestId);
                oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, result.size());
                for (final org.dressdiscover.api.models.qa.Question _iter0 : result) {
                    _iter0.writeAsStruct(oprot);
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

    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(QaQueryServiceJsonRpcServlet.class);
    private final static com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback = com.google.common.base.Optional.of(new org.thryft.CompoundType.UnknownFieldCallback() { public void apply(final org.thryft.protocol.FieldBegin field) throws org.thryft.protocol.InputProtocolException { throw new org.thryft.protocol.InputProtocolException("unknown field " + field); } });
    private final org.dressdiscover.api.services.qa.QaQueryService service;
}