/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric.v2017_07_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Creates a particular correlation between services.
 */
public class ServiceCorrelationDescription {
    /**
     * Possible values include: 'Invalid', 'Affinity', 'AlignedAffinity',
     * 'NonAlignedAffinity'.
     */
    @JsonProperty(value = "Scheme", required = true)
    private String scheme;

    /**
     * The serviceName property.
     */
    @JsonProperty(value = "ServiceName", required = true)
    private String serviceName;

    /**
     * Get possible values include: 'Invalid', 'Affinity', 'AlignedAffinity', 'NonAlignedAffinity'.
     *
     * @return the scheme value
     */
    public String scheme() {
        return this.scheme;
    }

    /**
     * Set possible values include: 'Invalid', 'Affinity', 'AlignedAffinity', 'NonAlignedAffinity'.
     *
     * @param scheme the scheme value to set
     * @return the ServiceCorrelationDescription object itself.
     */
    public ServiceCorrelationDescription withScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }

    /**
     * Get the serviceName value.
     *
     * @return the serviceName value
     */
    public String serviceName() {
        return this.serviceName;
    }

    /**
     * Set the serviceName value.
     *
     * @param serviceName the serviceName value to set
     * @return the ServiceCorrelationDescription object itself.
     */
    public ServiceCorrelationDescription withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

}
