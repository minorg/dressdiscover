package org.dressdiscover.server.controllers;

import static com.google.common.base.Preconditions.checkNotNull;

import javax.servlet.ServletContext;

import org.dressdiscover.server.controllers.collection.CollectionCommandServiceJsonRpcServlet;
import org.dressdiscover.server.controllers.collection.CollectionQueryServiceJsonRpcServlet;
import org.dressdiscover.server.controllers.institution.InstitutionCommandServiceJsonRpcServlet;
import org.dressdiscover.server.controllers.institution.InstitutionQueryServiceJsonRpcServlet;
import org.dressdiscover.server.controllers.login.OauthLoginController;
import org.dressdiscover.server.controllers.object.ObjectCommandServiceJsonRpcServlet;
import org.dressdiscover.server.controllers.object.ObjectQueryServiceJsonRpcServlet;
import org.dressdiscover.server.security.ServerRealm;
import org.thryft.waf.server.controllers.LocalhostFilter;

import com.google.inject.servlet.ServletModule;

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

        // Must be last
        // bind(DefaultServlet.class).asEagerSingleton();
        // serve("/*").with(DefaultServlet.class, ImmutableMap.of("dirAllowed",
        // "false", "redirectWelcome", "true",
        // "resourceBase", new File(new File(properties.getHomeDirectoryPath(),
        // "ts"), "public").toString()));
    }
}
