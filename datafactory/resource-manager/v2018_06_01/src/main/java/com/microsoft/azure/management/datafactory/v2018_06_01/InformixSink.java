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
 * A copy activity Informix sink.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("InformixSink")
public class InformixSink extends CopySink {
    /**
     * A query to execute before starting the copy. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "preCopyScript")
    private Object preCopyScript;

    /**
     * Get a query to execute before starting the copy. Type: string (or Expression with resultType string).
     *
     * @return the preCopyScript value
     */
    public Object preCopyScript() {
        return this.preCopyScript;
    }

    /**
     * Set a query to execute before starting the copy. Type: string (or Expression with resultType string).
     *
     * @param preCopyScript the preCopyScript value to set
     * @return the InformixSink object itself.
     */
    public InformixSink withPreCopyScript(Object preCopyScript) {
        this.preCopyScript = preCopyScript;
        return this;
    }

}
