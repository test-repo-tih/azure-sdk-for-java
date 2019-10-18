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
 * The on-premises Oracle database dataset.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("OracleTable")
@JsonFlatten
public class OracleTableDataset extends DatasetInner {
    /**
     * This property will be retired. Please consider using schema + table
     * properties instead.
     */
    @JsonProperty(value = "typeProperties.tableName")
    private Object tableName;

    /**
     * The schema name of the on-premises Oracle database. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.schema")
    private Object oracleTableDatasetSchema;

    /**
     * The table name of the on-premises Oracle database. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.table")
    private Object table;

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
     * @return the OracleTableDataset object itself.
     */
    public OracleTableDataset withTableName(Object tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Get the schema name of the on-premises Oracle database. Type: string (or Expression with resultType string).
     *
     * @return the oracleTableDatasetSchema value
     */
    public Object oracleTableDatasetSchema() {
        return this.oracleTableDatasetSchema;
    }

    /**
     * Set the schema name of the on-premises Oracle database. Type: string (or Expression with resultType string).
     *
     * @param oracleTableDatasetSchema the oracleTableDatasetSchema value to set
     * @return the OracleTableDataset object itself.
     */
    public OracleTableDataset withOracleTableDatasetSchema(Object oracleTableDatasetSchema) {
        this.oracleTableDatasetSchema = oracleTableDatasetSchema;
        return this;
    }

    /**
     * Get the table name of the on-premises Oracle database. Type: string (or Expression with resultType string).
     *
     * @return the table value
     */
    public Object table() {
        return this.table;
    }

    /**
     * Set the table name of the on-premises Oracle database. Type: string (or Expression with resultType string).
     *
     * @param table the table value to set
     * @return the OracleTableDataset object itself.
     */
    public OracleTableDataset withTable(Object table) {
        this.table = table;
        return this;
    }

}
