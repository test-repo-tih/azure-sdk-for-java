/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2019_08_01.implementation;

import java.util.Map;
import java.util.List;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.MongoIndex;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.ARMResourceProperties;

/**
 * An Azure Cosmos DB MongoDB collection.
 */
@JsonFlatten
public class MongoDBCollectionGetResultsInner extends ARMResourceProperties {
    /**
     * Name of the Cosmos DB MongoDB collection.
     */
    @JsonProperty(value = "properties.id", required = true)
    private String mongoDBCollectionGetResultsId;

    /**
     * A key-value pair of shard keys to be applied for the request.
     */
    @JsonProperty(value = "properties.shardKey")
    private Map<String, String> shardKey;

    /**
     * List of index keys.
     */
    @JsonProperty(value = "properties.indexes")
    private List<MongoIndex> indexes;

    /**
     * A system generated property. A unique identifier.
     */
    @JsonProperty(value = "properties._rid", access = JsonProperty.Access.WRITE_ONLY)
    private String _rid;

    /**
     * A system generated property that denotes the last updated timestamp of
     * the resource.
     */
    @JsonProperty(value = "properties._ts", access = JsonProperty.Access.WRITE_ONLY)
    private Object _ts;

    /**
     * A system generated property representing the resource etag required for
     * optimistic concurrency control.
     */
    @JsonProperty(value = "properties._etag", access = JsonProperty.Access.WRITE_ONLY)
    private String _etag;

    /**
     * Get name of the Cosmos DB MongoDB collection.
     *
     * @return the mongoDBCollectionGetResultsId value
     */
    public String mongoDBCollectionGetResultsId() {
        return this.mongoDBCollectionGetResultsId;
    }

    /**
     * Set name of the Cosmos DB MongoDB collection.
     *
     * @param mongoDBCollectionGetResultsId the mongoDBCollectionGetResultsId value to set
     * @return the MongoDBCollectionGetResultsInner object itself.
     */
    public MongoDBCollectionGetResultsInner withMongoDBCollectionGetResultsId(String mongoDBCollectionGetResultsId) {
        this.mongoDBCollectionGetResultsId = mongoDBCollectionGetResultsId;
        return this;
    }

    /**
     * Get a key-value pair of shard keys to be applied for the request.
     *
     * @return the shardKey value
     */
    public Map<String, String> shardKey() {
        return this.shardKey;
    }

    /**
     * Set a key-value pair of shard keys to be applied for the request.
     *
     * @param shardKey the shardKey value to set
     * @return the MongoDBCollectionGetResultsInner object itself.
     */
    public MongoDBCollectionGetResultsInner withShardKey(Map<String, String> shardKey) {
        this.shardKey = shardKey;
        return this;
    }

    /**
     * Get list of index keys.
     *
     * @return the indexes value
     */
    public List<MongoIndex> indexes() {
        return this.indexes;
    }

    /**
     * Set list of index keys.
     *
     * @param indexes the indexes value to set
     * @return the MongoDBCollectionGetResultsInner object itself.
     */
    public MongoDBCollectionGetResultsInner withIndexes(List<MongoIndex> indexes) {
        this.indexes = indexes;
        return this;
    }

    /**
     * Get a system generated property. A unique identifier.
     *
     * @return the _rid value
     */
    public String _rid() {
        return this._rid;
    }

    /**
     * Get a system generated property that denotes the last updated timestamp of the resource.
     *
     * @return the _ts value
     */
    public Object _ts() {
        return this._ts;
    }

    /**
     * Get a system generated property representing the resource etag required for optimistic concurrency control.
     *
     * @return the _etag value
     */
    public String _etag() {
        return this._etag;
    }

}
