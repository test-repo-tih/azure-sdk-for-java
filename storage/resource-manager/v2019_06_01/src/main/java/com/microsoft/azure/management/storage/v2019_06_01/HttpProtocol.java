/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_06_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for HttpProtocol.
 */
public enum HttpProtocol {
    /** Enum value https,http. */
    HTTPSHTTP("https,http"),

    /** Enum value https. */
    HTTPS("https");

    /** The actual serialized value for a HttpProtocol instance. */
    private String value;

    HttpProtocol(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a HttpProtocol instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed HttpProtocol object, or null if unable to parse.
     */
    @JsonCreator
    public static HttpProtocol fromString(String value) {
        HttpProtocol[] items = HttpProtocol.values();
        for (HttpProtocol item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
