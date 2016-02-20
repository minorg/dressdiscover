package net.lab1318.costume.gui.models.wizard;

import net.lab1318.costume.api.services.IoException;

public interface FeatureSetFactory {
    public FeatureSet createFeatureSet() throws IoException;
}
