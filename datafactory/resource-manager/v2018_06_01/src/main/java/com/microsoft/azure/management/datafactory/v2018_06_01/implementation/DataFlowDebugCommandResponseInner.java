/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response body structure of data flow result for data preview, statistics or
 * expression preview.
 */
public class DataFlowDebugCommandResponseInner {
    /**
     * The run status of data preview, statistics or expression preview.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * The result data of data preview, statistics or expression preview.
     */
    @JsonProperty(value = "data")
    private String data;

    /**
     * Get the run status of data preview, statistics or expression preview.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the run status of data preview, statistics or expression preview.
     *
     * @param status the status value to set
     * @return the DataFlowDebugCommandResponseInner object itself.
     */
    public DataFlowDebugCommandResponseInner withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the result data of data preview, statistics or expression preview.
     *
     * @return the data value
     */
    public String data() {
        return this.data;
    }

    /**
     * Set the result data of data preview, statistics or expression preview.
     *
     * @param data the data value to set
     * @return the DataFlowDebugCommandResponseInner object itself.
     */
    public DataFlowDebugCommandResponseInner withData(String data) {
        this.data = data;
        return this;
    }

}
