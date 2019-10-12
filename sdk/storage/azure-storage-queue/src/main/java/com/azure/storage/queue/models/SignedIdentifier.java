// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.queue.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * signed identifier.
 */
@JacksonXmlRootElement(localName = "SignedIdentifier")
@Fluent
public final class SignedIdentifier {
    /*
     * a unique id
     */
    @JsonProperty(value = "Id", required = true)
    private String id;

    /*
     * The access policy
     */
    @JsonProperty(value = "AccessPolicy", required = true)
    private AccessPolicy accessPolicy;

    /**
     * Get the id property: a unique id.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: a unique id.
     *
     * @param id the id value to set.
     * @return the SignedIdentifier object itself.
     */
    public SignedIdentifier setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the accessPolicy property: The access policy.
     *
     * @return the accessPolicy value.
     */
    public AccessPolicy getAccessPolicy() {
        return this.accessPolicy;
    }

    /**
     * Set the accessPolicy property: The access policy.
     *
     * @param accessPolicy the accessPolicy value to set.
     * @return the SignedIdentifier object itself.
     */
    public SignedIdentifier setAccessPolicy(AccessPolicy accessPolicy) {
        this.accessPolicy = accessPolicy;
        return this;
    }
}
