package net.lab1318.costume.lib;

import java.io.File;

import org.slf4j.Marker;

import com.google.common.base.Optional;

public abstract class AbstractMain extends org.notaweb.lib.AbstractMain {
    protected AbstractMain(final Marker logMarker) {
        super(logMarker);
    }

    protected final CostumeProperties _parseArgs(final Args args) throws Exception {
        _configureSlf4j();

        final CostumeProperties properties = CostumeProperties.load(Optional.fromNullable(args.properties));
        _getLogger().debug(_getLogMarker(), "properties: {}", properties);

        if (!properties.getApiUrl().getAuthority().isPresent()
                || !properties.getApiUrl().getAuthority().get().getPort().isPresent()) {
            throw new IllegalArgumentException("must specify api_url with port in notablist.properties");
        }

        _configureLogback(new File(properties.getLogbackXmlFilePath().or("/etc/costume/logback.xml")));

        return properties;
    }
}
