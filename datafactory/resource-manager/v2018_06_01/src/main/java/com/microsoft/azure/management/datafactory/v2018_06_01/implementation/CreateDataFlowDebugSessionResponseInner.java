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
 * Response body structure for creating data flow debug session.
 */
public class CreateDataFlowDebugSessionResponseInner {
    /**
     * The state of the debug session.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * The ID of data flow debug session.
     */
    @JsonProperty(value = "sessionId")
    private String sessionId;

    /**
     * Get the state of the debug session.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the state of the debug session.
     *
     * @param status the status value to set
     * @return the CreateDataFlowDebugSessionResponseInner object itself.
     */
    public CreateDataFlowDebugSessionResponseInner withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the ID of data flow debug session.
     *
     * @return the sessionId value
     */
    public String sessionId() {
        return this.sessionId;
    }

    /**
     * Set the ID of data flow debug session.
     *
     * @param sessionId the sessionId value to set
     * @return the CreateDataFlowDebugSessionResponseInner object itself.
     */
    public CreateDataFlowDebugSessionResponseInner withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

}
