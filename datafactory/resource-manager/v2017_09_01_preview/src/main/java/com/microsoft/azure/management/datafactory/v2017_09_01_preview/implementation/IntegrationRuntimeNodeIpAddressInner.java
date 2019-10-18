/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The IP address of self-hosted integration runtime node.
 */
public class IntegrationRuntimeNodeIpAddressInner {
    /**
     * The IP address of self-hosted integration runtime node.
     */
    @JsonProperty(value = "ipAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String ipAddress;

    /**
     * Get the IP address of self-hosted integration runtime node.
     *
     * @return the ipAddress value
     */
    public String ipAddress() {
        return this.ipAddress;
    }

}
