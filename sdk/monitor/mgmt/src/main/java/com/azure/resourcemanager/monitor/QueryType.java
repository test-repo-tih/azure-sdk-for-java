// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for QueryType. */
public enum QueryType {
    /** Enum value ResultCount. */
    RESULT_COUNT("ResultCount");

    /** The actual serialized value for a QueryType instance. */
    private final String value;

    QueryType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a QueryType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed QueryType object, or null if unable to parse.
     */
    @JsonCreator
    public static QueryType fromString(String value) {
        QueryType[] items = QueryType.values();
        for (QueryType item : items) {
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
