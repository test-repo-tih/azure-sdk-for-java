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
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.DatasetInner;

/**
 * The MongoDB database dataset.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("MongoDbV2Collection")
@JsonFlatten
public class MongoDbV2CollectionDataset extends DatasetInner {
    /**
     * The collection name of the MongoDB database. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "typeProperties.collection", required = true)
    private Object collection;

    /**
     * Get the collection name of the MongoDB database. Type: string (or Expression with resultType string).
     *
     * @return the collection value
     */
    public Object collection() {
        return this.collection;
    }

    /**
     * Set the collection name of the MongoDB database. Type: string (or Expression with resultType string).
     *
     * @param collection the collection value to set
     * @return the MongoDbV2CollectionDataset object itself.
     */
    public MongoDbV2CollectionDataset withCollection(Object collection) {
        this.collection = collection;
        return this;
    }

}
