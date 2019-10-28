/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The settings that will be leveraged for SAP table source partitioning.
 */
public class SapTablePartitionSettings {
    /**
     * The name of the column that will be used for proceeding range
     * partitioning. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "partitionColumnName")
    private Object partitionColumnName;

    /**
     * The maximum value of column specified in partitionColumnName that will
     * be used for proceeding range partitioning. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "partitionUpperBound")
    private Object partitionUpperBound;

    /**
     * The minimum value of column specified in partitionColumnName that will
     * be used for proceeding range partitioning. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "partitionLowerBound")
    private Object partitionLowerBound;

    /**
     * The maximum value of partitions the table will be split into. Type:
     * integer (or Expression with resultType string).
     */
    @JsonProperty(value = "maxPartitionsNumber")
    private Object maxPartitionsNumber;

    /**
     * Get the name of the column that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     *
     * @return the partitionColumnName value
     */
    public Object partitionColumnName() {
        return this.partitionColumnName;
    }

    /**
     * Set the name of the column that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     *
     * @param partitionColumnName the partitionColumnName value to set
     * @return the SapTablePartitionSettings object itself.
     */
    public SapTablePartitionSettings withPartitionColumnName(Object partitionColumnName) {
        this.partitionColumnName = partitionColumnName;
        return this;
    }

    /**
     * Get the maximum value of column specified in partitionColumnName that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     *
     * @return the partitionUpperBound value
     */
    public Object partitionUpperBound() {
        return this.partitionUpperBound;
    }

    /**
     * Set the maximum value of column specified in partitionColumnName that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     *
     * @param partitionUpperBound the partitionUpperBound value to set
     * @return the SapTablePartitionSettings object itself.
     */
    public SapTablePartitionSettings withPartitionUpperBound(Object partitionUpperBound) {
        this.partitionUpperBound = partitionUpperBound;
        return this;
    }

    /**
     * Get the minimum value of column specified in partitionColumnName that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     *
     * @return the partitionLowerBound value
     */
    public Object partitionLowerBound() {
        return this.partitionLowerBound;
    }

    /**
     * Set the minimum value of column specified in partitionColumnName that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     *
     * @param partitionLowerBound the partitionLowerBound value to set
     * @return the SapTablePartitionSettings object itself.
     */
    public SapTablePartitionSettings withPartitionLowerBound(Object partitionLowerBound) {
        this.partitionLowerBound = partitionLowerBound;
        return this;
    }

    /**
     * Get the maximum value of partitions the table will be split into. Type: integer (or Expression with resultType string).
     *
     * @return the maxPartitionsNumber value
     */
    public Object maxPartitionsNumber() {
        return this.maxPartitionsNumber;
    }

    /**
     * Set the maximum value of partitions the table will be split into. Type: integer (or Expression with resultType string).
     *
     * @param maxPartitionsNumber the maxPartitionsNumber value to set
     * @return the SapTablePartitionSettings object itself.
     */
    public SapTablePartitionSettings withMaxPartitionsNumber(Object maxPartitionsNumber) {
        this.maxPartitionsNumber = maxPartitionsNumber;
        return this;
    }

}
