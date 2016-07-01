package org.dressdiscover.gui.views.institutions;

import static com.google.common.base.Preconditions.checkNotNull;

import java.math.RoundingMode;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.thryft.native_.Url;
import org.thryft.waf.gui.EventBus;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMultimap;
import com.vaadin.tapio.googlemaps.GoogleMap;
import com.vaadin.tapio.googlemaps.GoogleMap.MapType;
import com.vaadin.tapio.googlemaps.client.LatLon;
import com.vaadin.tapio.googlemaps.client.events.MarkerClickListener;
import com.vaadin.tapio.googlemaps.client.overlays.GoogleMapMarker;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.UI;

import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.api.models.location.Location;
import net.lab1318.costume.api.models.location.LocationCoordinates;
import net.lab1318.costume.api.models.location.LocationSet;
import net.lab1318.costume.api.services.collection.CollectionQueryService;

@SuppressWarnings("serial")
final class InstitutionMap extends CustomComponent {
    public InstitutionMap(final EventBus eventBus, final String googleApiKey,
            final ImmutableMultimap<InstitutionEntry, CollectionEntry> modelTree) {
        setStyleName("institution-map");

        googleMap = new GoogleMap(googleApiKey, null, null);
        googleMap.addMarkerClickListener(new MarkerClickListener() {
            @Override
            public void markerClicked(final GoogleMapMarker clickedMarker) {
                final ImmutablePair<InstitutionEntry, CollectionEntry> collectionMarkersEntry = checkNotNull(
                        collectionMarkers.get(clickedMarker.getId()));
                final InstitutionEntry institutionEntry = collectionMarkersEntry.getKey();
                final CollectionEntry collectionEntry = collectionMarkersEntry.getValue();
                if (collectionEntry.getModel().getExternal().or(Boolean.FALSE)) {
                    final Optional<Url> url = collectionEntry.getModel().getUrl()
                            .or(institutionEntry.getModel().getUrl());
                    if (url.isPresent()) {
                        UI.getCurrent().getPage().setLocation(url.get().toString());
                    }
                } else {
                    eventBus.post(
                            new CollectionQueryService.Messages.GetCollectionByIdRequest(collectionEntry.getId()));
                }
            }
        });

        googleMap.setMapType(MapType.Roadmap);
        googleMap.setZoom(4);

        for (final Map.Entry<InstitutionEntry, Collection<CollectionEntry>> modelTreeEntry : modelTree.asMap()
                .entrySet()) {
            final InstitutionEntry institutionEntry = modelTreeEntry.getKey();

            for (final CollectionEntry collectionEntry : modelTreeEntry.getValue()) {
                final Optional<LocationSet> collectionLocations = collectionEntry.getModel().getLocations()
                        .or(institutionEntry.getModel().getLocations());
                if (!collectionLocations.isPresent()) {
                    continue;
                }

                for (final Location location : collectionLocations.get().getElements()) {
                    if (!location.getCoordinates().isPresent()) {
                        continue;
                    }
                    final LatLon latLon = __toLatLon(location.getCoordinates().get());
                    final GoogleMapMarker marker = new GoogleMapMarker(
                            "Institution: " + institutionEntry.getModel().getTitle() + " > Collection: "
                                    + collectionEntry.getModel().getTitle(),
                            latLon, false);
                    collectionMarkers.put(marker.getId(), ImmutablePair.of(institutionEntry, collectionEntry));
                    googleMap.addMarker(marker);
                    if (!haveSetCenter) {
                        googleMap.setCenter(latLon);
                        haveSetCenter = true;
                    }
                }
            }
        }

        setCompositionRoot(googleMap);
    }

    private LatLon __toLatLon(final LocationCoordinates coordinates) {
        return new LatLon(coordinates.getLatitude().setScale(6, RoundingMode.HALF_UP).doubleValue(),
                coordinates.getLongitude().setScale(6, RoundingMode.HALF_UP).doubleValue());
    }

    private final Map<Long, ImmutablePair<InstitutionEntry, CollectionEntry>> collectionMarkers = new HashMap<>();
    private final GoogleMap googleMap;
    private boolean haveSetCenter = false;
}
