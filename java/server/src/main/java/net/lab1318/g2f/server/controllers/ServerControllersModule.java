package net.lab1318.g2f.server.controllers;

import com.google.inject.servlet.ServletModule;

import net.lab1318.costume.server.controllers.collection.CollectionCommandServiceJsonRpcServlet;
import net.lab1318.costume.server.controllers.collection.CollectionQueryServiceJsonRpcServlet;
import net.lab1318.costume.server.controllers.institution.InstitutionCommandServiceJsonRpcServlet;
import net.lab1318.costume.server.controllers.institution.InstitutionQueryServiceJsonRpcServlet;
import net.lab1318.costume.server.controllers.object.ObjectCommandServiceJsonRpcServlet;
import net.lab1318.costume.server.controllers.object.ObjectQueryServiceJsonRpcServlet;

public final class ServerControllersModule extends ServletModule {
    private final static class JsonRpcControllersModule extends ServletModule {
        @Override
        protected void configureServlets() {
            serve("/api/jsonrpc/collection_command").with(CollectionCommandServiceJsonRpcServlet.class);
            serve("/api/jsonrpc/collection_query").with(CollectionQueryServiceJsonRpcServlet.class);
            serve("/api/jsonrpc/institution_command").with(InstitutionCommandServiceJsonRpcServlet.class);
            serve("/api/jsonrpc/institution_query").with(InstitutionQueryServiceJsonRpcServlet.class);
            serve("/api/jsonrpc/object_command").with(ObjectCommandServiceJsonRpcServlet.class);
            serve("/api/jsonrpc/object_query").with(ObjectQueryServiceJsonRpcServlet.class);
        }
    }

    @Override
    protected void configureServlets() {
        install(new JsonRpcControllersModule());
    }
}
