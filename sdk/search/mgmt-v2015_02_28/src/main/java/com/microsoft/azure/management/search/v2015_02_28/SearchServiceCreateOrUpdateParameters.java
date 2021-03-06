/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.search.v2015_02_28;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties that describe an Azure Search service.
 */
public class SearchServiceCreateOrUpdateParameters {
    /**
     * The geographic location of the Search service.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Tags to help categorize the Search service in the Azure Portal.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Properties of the Search service.
     */
    @JsonProperty(value = "properties")
    private SearchServiceProperties properties;

    /**
     * Get the geographic location of the Search service.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the geographic location of the Search service.
     *
     * @param location the location value to set
     * @return the SearchServiceCreateOrUpdateParameters object itself.
     */
    public SearchServiceCreateOrUpdateParameters withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get tags to help categorize the Search service in the Azure Portal.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set tags to help categorize the Search service in the Azure Portal.
     *
     * @param tags the tags value to set
     * @return the SearchServiceCreateOrUpdateParameters object itself.
     */
    public SearchServiceCreateOrUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get properties of the Search service.
     *
     * @return the properties value
     */
    public SearchServiceProperties properties() {
        return this.properties;
    }

    /**
     * Set properties of the Search service.
     *
     * @param properties the properties value to set
     * @return the SearchServiceCreateOrUpdateParameters object itself.
     */
    public SearchServiceCreateOrUpdateParameters withProperties(SearchServiceProperties properties) {
        this.properties = properties;
        return this;
    }

}
