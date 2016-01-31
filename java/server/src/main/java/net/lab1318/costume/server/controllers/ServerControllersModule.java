package net.lab1318.costume.server.controllers;

import static com.google.common.base.Preconditions.checkNotNull;

import javax.servlet.ServletContext;

import org.thryft.waf.server.controllers.LocalhostFilter;

import com.google.inject.servlet.ServletModule;

import net.lab1318.costume.server.controllers.collection.CollectionCommandServiceJsonRpcServlet;
import net.lab1318.costume.server.controllers.collection.CollectionQueryServiceJsonRpcServlet;
import net.lab1318.costume.server.controllers.institution.InstitutionCommandServiceJsonRpcServlet;
import net.lab1318.costume.server.controllers.institution.InstitutionQueryServiceJsonRpcServlet;
import net.lab1318.costume.server.controllers.login.OauthLoginController;
import net.lab1318.costume.server.controllers.object.ObjectCommandServiceJsonRpcServlet;
import net.lab1318.costume.server.controllers.object.ObjectQueryServiceJsonRpcServlet;
import net.lab1318.costume.server.security.ServerRealm;

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

            filter("/api/*").through(LocalhostFilter.class);
        }
    }

    private final static class ShiroWebModule extends org.apache.shiro.guice.web.ShiroWebModule {
        public ShiroWebModule(final ServletContext servletContext) {
            super(servletContext);
        }

        @Override
        protected void configureShiroWeb() {
            bindRealm().to(ServerRealm.class);
        }
    }

    @Override
    protected void configureServlets() {
        install(new JsonRpcControllersModule());

        serve("/api/oauth2/*").with(OauthLoginController.class);

        install(new ShiroWebModule(checkNotNull(getServletContext())));
        org.apache.shiro.guice.web.ShiroWebModule.bindGuiceFilter(binder());
    }
}
