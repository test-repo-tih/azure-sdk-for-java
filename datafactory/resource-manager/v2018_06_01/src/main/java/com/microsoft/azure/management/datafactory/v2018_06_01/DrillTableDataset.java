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
 * Drill server dataset.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("DrillTable")
@JsonFlatten
public class DrillTableDataset extends DatasetInner {
    /**
     * This property will be retired. Please consider using schema + table
     * properties instead.
     */
    @JsonProperty(value = "typeProperties.tableName")
    private Object tableName;

    /**
     * The table name of the Drill. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.table")
    private Object table;

    /**
     * The schema name of the Drill. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.schema")
    private Object drillTableDatasetSchema;

    /**
     * Get this property will be retired. Please consider using schema + table properties instead.
     *
     * @return the tableName value
     */
    public Object tableName() {
        return this.tableName;
    }

    /**
     * Set this property will be retired. Please consider using schema + table properties instead.
     *
     * @param tableName the tableName value to set
     * @return the DrillTableDataset object itself.
     */
    public DrillTableDataset withTableName(Object tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Get the table name of the Drill. Type: string (or Expression with resultType string).
     *
     * @return the table value
     */
    public Object table() {
        return this.table;
    }

    /**
     * Set the table name of the Drill. Type: string (or Expression with resultType string).
     *
     * @param table the table value to set
     * @return the DrillTableDataset object itself.
     */
    public DrillTableDataset withTable(Object table) {
        this.table = table;
        return this;
    }

    /**
     * Get the schema name of the Drill. Type: string (or Expression with resultType string).
     *
     * @return the drillTableDatasetSchema value
     */
    public Object drillTableDatasetSchema() {
        return this.drillTableDatasetSchema;
    }

    /**
     * Set the schema name of the Drill. Type: string (or Expression with resultType string).
     *
     * @param drillTableDatasetSchema the drillTableDatasetSchema value to set
     * @return the DrillTableDataset object itself.
     */
    public DrillTableDataset withDrillTableDatasetSchema(Object drillTableDatasetSchema) {
        this.drillTableDatasetSchema = drillTableDatasetSchema;
        return this;
    }

}
