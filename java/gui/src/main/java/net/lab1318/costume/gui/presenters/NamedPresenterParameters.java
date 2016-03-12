package net.lab1318.costume.gui.presenters;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.lang3.tuple.ImmutablePair;

import com.google.common.base.Charsets;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;

public final class NamedPresenterParameters implements Iterable<ImmutablePair<String, String>> {
    public static NamedPresenterParameters fromUrlEncodedString(final String urlEncodedString) {
        final ImmutableList.Builder<ImmutablePair<String, String>> listBuilder = ImmutableList.builder();

        for (final String nameValuePairString : urlEncodedString.split("&")) {
            final String[] nameValuePairSplit = nameValuePairString.split("=", 2);
            if (nameValuePairSplit.length == 1) {
                continue;
            }

            String name, value;
            try {
                name = URLDecoder.decode(nameValuePairSplit[0], Charsets.UTF_8.name());
                if (name.isEmpty()) {
                    continue;
                }
                value = URLDecoder.decode(nameValuePairSplit[1], Charsets.UTF_8.name());
            } catch (final UnsupportedEncodingException e) {
                throw new IllegalStateException(e);
            }

            listBuilder.add(ImmutablePair.of(name, value));
        }

        return new NamedPresenterParameters(listBuilder.build());
    }

    public NamedPresenterParameters(final Map<String, String> map) {
        final ImmutableList.Builder<ImmutablePair<String, String>> listBuilder = ImmutableList.builder();
        for (final Map.Entry<String, String> entry : map.entrySet()) {
            listBuilder.add(ImmutablePair.of(entry.getKey(), entry.getValue()));
        }
        list = listBuilder.build();
    }

    private NamedPresenterParameters(final ImmutableList<ImmutablePair<String, String>> list) {
        this.list = checkNotNull(list);
    }

    public Optional<String> getFirst(final String name) {
        for (final ImmutablePair<String, String> nameValuePair : list) {
            if (nameValuePair.getKey().equals(name)) {
                return Optional.of(nameValuePair.getValue());
            }
        }
        return Optional.absent();
    }

    @Override
    public Iterator<ImmutablePair<String, String>> iterator() {
        return list.iterator();
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).addValue(list).toString();
    }

    public String toUrlEncodedString() {
        final StringBuilder stringBuilder = new StringBuilder();

        int nameValuePairI = 0;
        for (final ImmutablePair<String, String> nameValuePair : list) {
            if (nameValuePair.getKey().isEmpty()) {
                continue;
            }

            if (nameValuePairI > 0) {
                stringBuilder.append('&');
            }
            try {
                stringBuilder.append(URLEncoder.encode(nameValuePair.getKey(), Charsets.UTF_8.name()));
                stringBuilder.append('=');
                stringBuilder.append(URLEncoder.encode(nameValuePair.getValue(), Charsets.UTF_8.name()));
            } catch (final UnsupportedEncodingException e) {
                throw new IllegalStateException(e);
            }

            nameValuePairI++;
        }

        return stringBuilder.toString();
    }

    private final ImmutableList<ImmutablePair<String, String>> list;
}