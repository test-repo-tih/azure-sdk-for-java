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
 * A copy activity Azure Search Index sink.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureSearchIndexSink")
public class AzureSearchIndexSink extends CopySink {
    /**
     * Specify the write behavior when upserting documents into Azure Search
     * Index. Possible values include: 'Merge', 'Upload'.
     */
    @JsonProperty(value = "writeBehavior")
    private AzureSearchIndexWriteBehaviorType writeBehavior;

    /**
     * Get specify the write behavior when upserting documents into Azure Search Index. Possible values include: 'Merge', 'Upload'.
     *
     * @return the writeBehavior value
     */
    public AzureSearchIndexWriteBehaviorType writeBehavior() {
        return this.writeBehavior;
    }

    /**
     * Set specify the write behavior when upserting documents into Azure Search Index. Possible values include: 'Merge', 'Upload'.
     *
     * @param writeBehavior the writeBehavior value to set
     * @return the AzureSearchIndexSink object itself.
     */
    public AzureSearchIndexSink withWriteBehavior(AzureSearchIndexWriteBehaviorType writeBehavior) {
        this.writeBehavior = writeBehavior;
        return this;
    }

}
