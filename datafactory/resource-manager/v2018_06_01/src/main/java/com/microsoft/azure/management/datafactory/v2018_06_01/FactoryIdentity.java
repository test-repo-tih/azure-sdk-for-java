/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Identity properties of the factory resource.
 */
public class FactoryIdentity {
    /**
     * The identity type. Currently the only supported type is
     * 'SystemAssigned'.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * The principal id of the identity.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID principalId;

    /**
     * The client tenant id of the identity.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID tenantId;

    /**
     * Creates an instance of FactoryIdentity class.
     */
    public FactoryIdentity() {
        type = "SystemAssigned";
    }

    /**
     * Get the identity type. Currently the only supported type is 'SystemAssigned'.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the identity type. Currently the only supported type is 'SystemAssigned'.
     *
     * @param type the type value to set
     * @return the FactoryIdentity object itself.
     */
    public FactoryIdentity withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the principal id of the identity.
     *
     * @return the principalId value
     */
    public UUID principalId() {
        return this.principalId;
    }

    /**
     * Get the client tenant id of the identity.
     *
     * @return the tenantId value
     */
    public UUID tenantId() {
        return this.tenantId;
    }

}
