/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagesync.v2019_02_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for List operation.
 */
public class OperationsListHeaders {
    /**
     * request id.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String xMsRequestId;

    /**
     * correlation request id.
     */
    @JsonProperty(value = "x-ms-correlation-request-id")
    private String xMsCorrelationRequestId;

    /**
     * Get request id.
     *
     * @return the xMsRequestId value
     */
    public String xMsRequestId() {
        return this.xMsRequestId;
    }

    /**
     * Set request id.
     *
     * @param xMsRequestId the xMsRequestId value to set
     * @return the OperationsListHeaders object itself.
     */
    public OperationsListHeaders withXMsRequestId(String xMsRequestId) {
        this.xMsRequestId = xMsRequestId;
        return this;
    }

    /**
     * Get correlation request id.
     *
     * @return the xMsCorrelationRequestId value
     */
    public String xMsCorrelationRequestId() {
        return this.xMsCorrelationRequestId;
    }

    /**
     * Set correlation request id.
     *
     * @param xMsCorrelationRequestId the xMsCorrelationRequestId value to set
     * @return the OperationsListHeaders object itself.
     */
    public OperationsListHeaders withXMsCorrelationRequestId(String xMsCorrelationRequestId) {
        this.xMsCorrelationRequestId = xMsCorrelationRequestId;
        return this;
    }

}
