/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights.v2018_04_04.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * List of available operations.
 */
public class OperationsListResultsInner {
    /**
     * OData entity count; represents the number of operations returned.
     */
    @JsonProperty(value = "@odata\\.count")
    private Integer odatacount;

    /**
     * List of available operations.
     */
    @JsonProperty(value = "value")
    private List<OperationInner> value;

    /**
     * Get oData entity count; represents the number of operations returned.
     *
     * @return the odatacount value
     */
    public Integer odatacount() {
        return this.odatacount;
    }

    /**
     * Set oData entity count; represents the number of operations returned.
     *
     * @param odatacount the odatacount value to set
     * @return the OperationsListResultsInner object itself.
     */
    public OperationsListResultsInner withOdatacount(Integer odatacount) {
        this.odatacount = odatacount;
        return this;
    }

    /**
     * Get list of available operations.
     *
     * @return the value value
     */
    public List<OperationInner> value() {
        return this.value;
    }

    /**
     * Set list of available operations.
     *
     * @param value the value value to set
     * @return the OperationsListResultsInner object itself.
     */
    public OperationsListResultsInner withValue(List<OperationInner> value) {
        this.value = value;
        return this;
    }

}
