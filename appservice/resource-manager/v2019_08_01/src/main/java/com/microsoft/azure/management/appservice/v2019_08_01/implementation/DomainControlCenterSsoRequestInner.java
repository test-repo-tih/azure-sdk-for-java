/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Single sign-on request information for domain management.
 */
public class DomainControlCenterSsoRequestInner {
    /**
     * URL where the single sign-on request is to be made.
     */
    @JsonProperty(value = "url", access = JsonProperty.Access.WRITE_ONLY)
    private String url;

    /**
     * Post parameter key.
     */
    @JsonProperty(value = "postParameterKey", access = JsonProperty.Access.WRITE_ONLY)
    private String postParameterKey;

    /**
     * Post parameter value. Client should use
     * 'application/x-www-form-urlencoded' encoding for this value.
     */
    @JsonProperty(value = "postParameterValue", access = JsonProperty.Access.WRITE_ONLY)
    private String postParameterValue;

    /**
     * Get uRL where the single sign-on request is to be made.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Get post parameter key.
     *
     * @return the postParameterKey value
     */
    public String postParameterKey() {
        return this.postParameterKey;
    }

    /**
     * Get post parameter value. Client should use 'application/x-www-form-urlencoded' encoding for this value.
     *
     * @return the postParameterValue value
     */
    public String postParameterValue() {
        return this.postParameterValue;
    }

}
