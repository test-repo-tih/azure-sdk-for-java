/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity ServiceNow server source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("ServiceNowSource")
public class ServiceNowSource extends TabularSource {
    /**
     * A query to retrieve data from source. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "query")
    private Object query;

    /**
     * Get a query to retrieve data from source. Type: string (or Expression with resultType string).
     *
     * @return the query value
     */
    public Object query() {
        return this.query;
    }

    /**
     * Set a query to retrieve data from source. Type: string (or Expression with resultType string).
     *
     * @param query the query value to set
     * @return the ServiceNowSource object itself.
     */
    public ServiceNowSource withQuery(Object query) {
        this.query = query;
        return this;
    }

}
