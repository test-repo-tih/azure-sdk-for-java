/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Format write settings.
 */
public class FormatWriteSettings {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * The write setting type.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * Get unmatched properties from the message are deserialized this collection.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set unmatched properties from the message are deserialized this collection.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the FormatWriteSettings object itself.
     */
    public FormatWriteSettings withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get the write setting type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the write setting type.
     *
     * @param type the type value to set
     * @return the FormatWriteSettings object itself.
     */
    public FormatWriteSettings withType(String type) {
        this.type = type;
        return this;
    }

}
