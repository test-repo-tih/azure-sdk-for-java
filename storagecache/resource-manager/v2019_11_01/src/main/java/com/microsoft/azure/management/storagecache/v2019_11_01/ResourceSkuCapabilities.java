/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagecache.v2019_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A resource SKU capability.
 */
public class ResourceSkuCapabilities {
    /**
     * Name of a capability, such as ops/sec.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Quantity, if the capability is measured by quantity.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get name of a capability, such as ops/sec.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of a capability, such as ops/sec.
     *
     * @param name the name value to set
     * @return the ResourceSkuCapabilities object itself.
     */
    public ResourceSkuCapabilities withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get quantity, if the capability is measured by quantity.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set quantity, if the capability is measured by quantity.
     *
     * @param value the value value to set
     * @return the ResourceSkuCapabilities object itself.
     */
    public ResourceSkuCapabilities withValue(String value) {
        this.value = value;
        return this;
    }

}
