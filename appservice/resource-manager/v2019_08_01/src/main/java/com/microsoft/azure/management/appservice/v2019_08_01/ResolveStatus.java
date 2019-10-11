/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ResolveStatus.
 */
public enum ResolveStatus {
    /** Enum value Initialized. */
    INITIALIZED("Initialized"),

    /** Enum value Resolved. */
    RESOLVED("Resolved"),

    /** Enum value InvalidSyntax. */
    INVALID_SYNTAX("InvalidSyntax"),

    /** Enum value MSINotEnabled. */
    MSINOT_ENABLED("MSINotEnabled"),

    /** Enum value VaultNotFound. */
    VAULT_NOT_FOUND("VaultNotFound"),

    /** Enum value SecretNotFound. */
    SECRET_NOT_FOUND("SecretNotFound"),

    /** Enum value SecretVersionNotFound. */
    SECRET_VERSION_NOT_FOUND("SecretVersionNotFound"),

    /** Enum value AccessToKeyVaultDenied. */
    ACCESS_TO_KEY_VAULT_DENIED("AccessToKeyVaultDenied"),

    /** Enum value OtherReasons. */
    OTHER_REASONS("OtherReasons");

    /** The actual serialized value for a ResolveStatus instance. */
    private String value;

    ResolveStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ResolveStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ResolveStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static ResolveStatus fromString(String value) {
        ResolveStatus[] items = ResolveStatus.values();
        for (ResolveStatus item : items) {
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
