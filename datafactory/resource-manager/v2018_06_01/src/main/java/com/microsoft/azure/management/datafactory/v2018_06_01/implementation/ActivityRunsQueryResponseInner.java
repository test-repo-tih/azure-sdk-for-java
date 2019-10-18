/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A list activity runs.
 */
public class ActivityRunsQueryResponseInner {
    /**
     * List of activity runs.
     */
    @JsonProperty(value = "value", required = true)
    private List<ActivityRunInner> value;

    /**
     * The continuation token for getting the next page of results, if any
     * remaining results exist, null otherwise.
     */
    @JsonProperty(value = "continuationToken")
    private String continuationToken;

    /**
     * Get list of activity runs.
     *
     * @return the value value
     */
    public List<ActivityRunInner> value() {
        return this.value;
    }

    /**
     * Set list of activity runs.
     *
     * @param value the value value to set
     * @return the ActivityRunsQueryResponseInner object itself.
     */
    public ActivityRunsQueryResponseInner withValue(List<ActivityRunInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the continuation token for getting the next page of results, if any remaining results exist, null otherwise.
     *
     * @return the continuationToken value
     */
    public String continuationToken() {
        return this.continuationToken;
    }

    /**
     * Set the continuation token for getting the next page of results, if any remaining results exist, null otherwise.
     *
     * @param continuationToken the continuationToken value to set
     * @return the ActivityRunsQueryResponseInner object itself.
     */
    public ActivityRunsQueryResponseInner withContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
        return this;
    }

}
