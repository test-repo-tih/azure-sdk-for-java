/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * A copy activity source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("CopySource")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AmazonRedshiftSource", value = AmazonRedshiftSource.class),
    @JsonSubTypes.Type(name = "ResponsysSource", value = ResponsysSource.class),
    @JsonSubTypes.Type(name = "SalesforceMarketingCloudSource", value = SalesforceMarketingCloudSource.class),
    @JsonSubTypes.Type(name = "VerticaSource", value = VerticaSource.class),
    @JsonSubTypes.Type(name = "NetezzaSource", value = NetezzaSource.class),
    @JsonSubTypes.Type(name = "ZohoSource", value = ZohoSource.class),
    @JsonSubTypes.Type(name = "XeroSource", value = XeroSource.class),
    @JsonSubTypes.Type(name = "SquareSource", value = SquareSource.class),
    @JsonSubTypes.Type(name = "SparkSource", value = SparkSource.class),
    @JsonSubTypes.Type(name = "ShopifySource", value = ShopifySource.class),
    @JsonSubTypes.Type(name = "ServiceNowSource", value = ServiceNowSource.class),
    @JsonSubTypes.Type(name = "QuickBooksSource", value = QuickBooksSource.class),
    @JsonSubTypes.Type(name = "PrestoSource", value = PrestoSource.class),
    @JsonSubTypes.Type(name = "PhoenixSource", value = PhoenixSource.class),
    @JsonSubTypes.Type(name = "PaypalSource", value = PaypalSource.class),
    @JsonSubTypes.Type(name = "MarketoSource", value = MarketoSource.class),
    @JsonSubTypes.Type(name = "MariaDBSource", value = MariaDBSource.class),
    @JsonSubTypes.Type(name = "MagentoSource", value = MagentoSource.class),
    @JsonSubTypes.Type(name = "JiraSource", value = JiraSource.class),
    @JsonSubTypes.Type(name = "ImpalaSource", value = ImpalaSource.class),
    @JsonSubTypes.Type(name = "HubspotSource", value = HubspotSource.class),
    @JsonSubTypes.Type(name = "HiveSource", value = HiveSource.class),
    @JsonSubTypes.Type(name = "HBaseSource", value = HBaseSource.class),
    @JsonSubTypes.Type(name = "GreenplumSource", value = GreenplumSource.class),
    @JsonSubTypes.Type(name = "GoogleBigQuerySource", value = GoogleBigQuerySource.class),
    @JsonSubTypes.Type(name = "EloquaSource", value = EloquaSource.class),
    @JsonSubTypes.Type(name = "DrillSource", value = DrillSource.class),
    @JsonSubTypes.Type(name = "CouchbaseSource", value = CouchbaseSource.class),
    @JsonSubTypes.Type(name = "ConcurSource", value = ConcurSource.class),
    @JsonSubTypes.Type(name = "AzurePostgreSqlSource", value = AzurePostgreSqlSource.class),
    @JsonSubTypes.Type(name = "AmazonMWSSource", value = AmazonMWSSource.class),
    @JsonSubTypes.Type(name = "HttpSource", value = HttpSource.class),
    @JsonSubTypes.Type(name = "AzureDataLakeStoreSource", value = AzureDataLakeStoreSource.class),
    @JsonSubTypes.Type(name = "MongoDbSource", value = MongoDbSource.class),
    @JsonSubTypes.Type(name = "CassandraSource", value = CassandraSource.class),
    @JsonSubTypes.Type(name = "WebSource", value = WebSource.class),
    @JsonSubTypes.Type(name = "OracleSource", value = OracleSource.class),
    @JsonSubTypes.Type(name = "AzureMySqlSource", value = AzureMySqlSource.class),
    @JsonSubTypes.Type(name = "HdfsSource", value = HdfsSource.class),
    @JsonSubTypes.Type(name = "FileSystemSource", value = FileSystemSource.class),
    @JsonSubTypes.Type(name = "SqlDWSource", value = SqlDWSource.class),
    @JsonSubTypes.Type(name = "SqlSource", value = SqlSource.class),
    @JsonSubTypes.Type(name = "SapEccSource", value = SapEccSource.class),
    @JsonSubTypes.Type(name = "SapCloudForCustomerSource", value = SapCloudForCustomerSource.class),
    @JsonSubTypes.Type(name = "SalesforceSource", value = SalesforceSource.class),
    @JsonSubTypes.Type(name = "RelationalSource", value = RelationalSource.class),
    @JsonSubTypes.Type(name = "DynamicsSource", value = DynamicsSource.class),
    @JsonSubTypes.Type(name = "DocumentDbCollectionSource", value = DocumentDbCollectionSource.class),
    @JsonSubTypes.Type(name = "BlobSource", value = BlobSource.class),
    @JsonSubTypes.Type(name = "AzureTableSource", value = AzureTableSource.class)
})
public class CopySource {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * Source retry count. Type: integer (or Expression with resultType
     * integer).
     */
    @JsonProperty(value = "sourceRetryCount")
    private Object sourceRetryCount;

    /**
     * Source retry wait. Type: string (or Expression with resultType string),
     * pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     */
    @JsonProperty(value = "sourceRetryWait")
    private Object sourceRetryWait;

    /**
     * Get unmatched properties from the message are deserialized this collection.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set unmatched properties from the message are deserialized this collection.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the CopySource object itself.
     */
    public CopySource withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get source retry count. Type: integer (or Expression with resultType integer).
     *
     * @return the sourceRetryCount value
     */
    public Object sourceRetryCount() {
        return this.sourceRetryCount;
    }

    /**
     * Set source retry count. Type: integer (or Expression with resultType integer).
     *
     * @param sourceRetryCount the sourceRetryCount value to set
     * @return the CopySource object itself.
     */
    public CopySource withSourceRetryCount(Object sourceRetryCount) {
        this.sourceRetryCount = sourceRetryCount;
        return this;
    }

    /**
     * Get source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @return the sourceRetryWait value
     */
    public Object sourceRetryWait() {
        return this.sourceRetryWait;
    }

    /**
     * Set source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @param sourceRetryWait the sourceRetryWait value to set
     * @return the CopySource object itself.
     */
    public CopySource withSourceRetryWait(Object sourceRetryWait) {
        this.sourceRetryWait = sourceRetryWait;
        return this;
    }

}
