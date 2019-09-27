/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.LinkedServiceInner;

/**
 * Azure Databricks linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureDatabricks")
@JsonFlatten
public class AzureDatabricksLinkedService extends LinkedServiceInner {
    /**
     * &lt;REGION&gt;.azuredatabricks.net, domain name of your Databricks
     * deployment. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.domain", required = true)
    private Object domain;

    /**
     * Access token for databricks REST API. Refer to
     * https://docs.azuredatabricks.net/api/latest/authentication.html. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.accessToken", required = true)
    private SecretBase accessToken;

    /**
     * The id of an existing interactive cluster that will be used for all runs
     * of this activity. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.existingClusterId")
    private Object existingClusterId;

    /**
     * The id of an existing instance pool that will be used for all runs of
     * this activity. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.instancePoolId")
    private Object instancePoolId;

    /**
     * If not using an existing interactive cluster, this specifies the Spark
     * version of a new job cluster or instance pool nodes created for each run
     * of this activity. Required if instancePoolId is specified. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.newClusterVersion")
    private Object newClusterVersion;

    /**
     * If not using an existing interactive cluster, this specifies the number
     * of worker nodes to use for the new job cluster or instance pool. For new
     * job clusters, this a string-formatted Int32, like '1' means numOfWorker
     * is 1 or '1:10' means auto-scale from 1 (min) to 10 (max). For instance
     * pools, this is a string-formatted Int32, and can only specify a fixed
     * number of worker nodes, such as '2'. Required if newClusterVersion is
     * specified. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.newClusterNumOfWorker")
    private Object newClusterNumOfWorker;

    /**
     * The node type of the new job cluster. This property is required if
     * newClusterVersion is specified and instancePoolId is not specified. If
     * instancePoolId is specified, this property is ignored. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.newClusterNodeType")
    private Object newClusterNodeType;

    /**
     * A set of optional, user-specified Spark configuration key-value pairs.
     */
    @JsonProperty(value = "typeProperties.newClusterSparkConf")
    private Map<String, Object> newClusterSparkConf;

    /**
     * A set of optional, user-specified Spark environment variables key-value
     * pairs.
     */
    @JsonProperty(value = "typeProperties.newClusterSparkEnvVars")
    private Map<String, Object> newClusterSparkEnvVars;

    /**
     * Additional tags for cluster resources. This property is ignored in
     * instance pool configurations.
     */
    @JsonProperty(value = "typeProperties.newClusterCustomTags")
    private Map<String, Object> newClusterCustomTags;

    /**
     * The driver node type for the new job cluster. This property is ignored
     * in instance pool configurations. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.newClusterDriverNodeType")
    private Object newClusterDriverNodeType;

    /**
     * User-defined initialization scripts for the new cluster. Type: array of
     * strings (or Expression with resultType array of strings).
     */
    @JsonProperty(value = "typeProperties.newClusterInitScripts")
    private Object newClusterInitScripts;

    /**
     * Enable the elastic disk on the new cluster. This property is now
     * ignored, and takes the default elastic disk behavior in Databricks
     * (elastic disks are always enabled). Type: boolean (or Expression with
     * resultType boolean).
     */
    @JsonProperty(value = "typeProperties.newClusterEnableElasticDisk")
    private Object newClusterEnableElasticDisk;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get &lt;REGION&gt;.azuredatabricks.net, domain name of your Databricks deployment. Type: string (or Expression with resultType string).
     *
     * @return the domain value
     */
    public Object domain() {
        return this.domain;
    }

    /**
     * Set &lt;REGION&gt;.azuredatabricks.net, domain name of your Databricks deployment. Type: string (or Expression with resultType string).
     *
     * @param domain the domain value to set
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withDomain(Object domain) {
        this.domain = domain;
        return this;
    }

    /**
     * Get access token for databricks REST API. Refer to https://docs.azuredatabricks.net/api/latest/authentication.html. Type: string (or Expression with resultType string).
     *
     * @return the accessToken value
     */
    public SecretBase accessToken() {
        return this.accessToken;
    }

    /**
     * Set access token for databricks REST API. Refer to https://docs.azuredatabricks.net/api/latest/authentication.html. Type: string (or Expression with resultType string).
     *
     * @param accessToken the accessToken value to set
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withAccessToken(SecretBase accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Get the id of an existing interactive cluster that will be used for all runs of this activity. Type: string (or Expression with resultType string).
     *
     * @return the existingClusterId value
     */
    public Object existingClusterId() {
        return this.existingClusterId;
    }

    /**
     * Set the id of an existing interactive cluster that will be used for all runs of this activity. Type: string (or Expression with resultType string).
     *
     * @param existingClusterId the existingClusterId value to set
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withExistingClusterId(Object existingClusterId) {
        this.existingClusterId = existingClusterId;
        return this;
    }

    /**
     * Get the id of an existing instance pool that will be used for all runs of this activity. Type: string (or Expression with resultType string).
     *
     * @return the instancePoolId value
     */
    public Object instancePoolId() {
        return this.instancePoolId;
    }

    /**
     * Set the id of an existing instance pool that will be used for all runs of this activity. Type: string (or Expression with resultType string).
     *
     * @param instancePoolId the instancePoolId value to set
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withInstancePoolId(Object instancePoolId) {
        this.instancePoolId = instancePoolId;
        return this;
    }

    /**
     * Get if not using an existing interactive cluster, this specifies the Spark version of a new job cluster or instance pool nodes created for each run of this activity. Required if instancePoolId is specified. Type: string (or Expression with resultType string).
     *
     * @return the newClusterVersion value
     */
    public Object newClusterVersion() {
        return this.newClusterVersion;
    }

    /**
     * Set if not using an existing interactive cluster, this specifies the Spark version of a new job cluster or instance pool nodes created for each run of this activity. Required if instancePoolId is specified. Type: string (or Expression with resultType string).
     *
     * @param newClusterVersion the newClusterVersion value to set
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withNewClusterVersion(Object newClusterVersion) {
        this.newClusterVersion = newClusterVersion;
        return this;
    }

    /**
     * Get if not using an existing interactive cluster, this specifies the number of worker nodes to use for the new job cluster or instance pool. For new job clusters, this a string-formatted Int32, like '1' means numOfWorker is 1 or '1:10' means auto-scale from 1 (min) to 10 (max). For instance pools, this is a string-formatted Int32, and can only specify a fixed number of worker nodes, such as '2'. Required if newClusterVersion is specified. Type: string (or Expression with resultType string).
     *
     * @return the newClusterNumOfWorker value
     */
    public Object newClusterNumOfWorker() {
        return this.newClusterNumOfWorker;
    }

    /**
     * Set if not using an existing interactive cluster, this specifies the number of worker nodes to use for the new job cluster or instance pool. For new job clusters, this a string-formatted Int32, like '1' means numOfWorker is 1 or '1:10' means auto-scale from 1 (min) to 10 (max). For instance pools, this is a string-formatted Int32, and can only specify a fixed number of worker nodes, such as '2'. Required if newClusterVersion is specified. Type: string (or Expression with resultType string).
     *
     * @param newClusterNumOfWorker the newClusterNumOfWorker value to set
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withNewClusterNumOfWorker(Object newClusterNumOfWorker) {
        this.newClusterNumOfWorker = newClusterNumOfWorker;
        return this;
    }

    /**
     * Get the node type of the new job cluster. This property is required if newClusterVersion is specified and instancePoolId is not specified. If instancePoolId is specified, this property is ignored. Type: string (or Expression with resultType string).
     *
     * @return the newClusterNodeType value
     */
    public Object newClusterNodeType() {
        return this.newClusterNodeType;
    }

    /**
     * Set the node type of the new job cluster. This property is required if newClusterVersion is specified and instancePoolId is not specified. If instancePoolId is specified, this property is ignored. Type: string (or Expression with resultType string).
     *
     * @param newClusterNodeType the newClusterNodeType value to set
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withNewClusterNodeType(Object newClusterNodeType) {
        this.newClusterNodeType = newClusterNodeType;
        return this;
    }

    /**
     * Get a set of optional, user-specified Spark configuration key-value pairs.
     *
     * @return the newClusterSparkConf value
     */
    public Map<String, Object> newClusterSparkConf() {
        return this.newClusterSparkConf;
    }

    /**
     * Set a set of optional, user-specified Spark configuration key-value pairs.
     *
     * @param newClusterSparkConf the newClusterSparkConf value to set
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withNewClusterSparkConf(Map<String, Object> newClusterSparkConf) {
        this.newClusterSparkConf = newClusterSparkConf;
        return this;
    }

    /**
     * Get a set of optional, user-specified Spark environment variables key-value pairs.
     *
     * @return the newClusterSparkEnvVars value
     */
    public Map<String, Object> newClusterSparkEnvVars() {
        return this.newClusterSparkEnvVars;
    }

    /**
     * Set a set of optional, user-specified Spark environment variables key-value pairs.
     *
     * @param newClusterSparkEnvVars the newClusterSparkEnvVars value to set
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withNewClusterSparkEnvVars(Map<String, Object> newClusterSparkEnvVars) {
        this.newClusterSparkEnvVars = newClusterSparkEnvVars;
        return this;
    }

    /**
     * Get additional tags for cluster resources. This property is ignored in instance pool configurations.
     *
     * @return the newClusterCustomTags value
     */
    public Map<String, Object> newClusterCustomTags() {
        return this.newClusterCustomTags;
    }

    /**
     * Set additional tags for cluster resources. This property is ignored in instance pool configurations.
     *
     * @param newClusterCustomTags the newClusterCustomTags value to set
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withNewClusterCustomTags(Map<String, Object> newClusterCustomTags) {
        this.newClusterCustomTags = newClusterCustomTags;
        return this;
    }

    /**
     * Get the driver node type for the new job cluster. This property is ignored in instance pool configurations. Type: string (or Expression with resultType string).
     *
     * @return the newClusterDriverNodeType value
     */
    public Object newClusterDriverNodeType() {
        return this.newClusterDriverNodeType;
    }

    /**
     * Set the driver node type for the new job cluster. This property is ignored in instance pool configurations. Type: string (or Expression with resultType string).
     *
     * @param newClusterDriverNodeType the newClusterDriverNodeType value to set
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withNewClusterDriverNodeType(Object newClusterDriverNodeType) {
        this.newClusterDriverNodeType = newClusterDriverNodeType;
        return this;
    }

    /**
     * Get user-defined initialization scripts for the new cluster. Type: array of strings (or Expression with resultType array of strings).
     *
     * @return the newClusterInitScripts value
     */
    public Object newClusterInitScripts() {
        return this.newClusterInitScripts;
    }

    /**
     * Set user-defined initialization scripts for the new cluster. Type: array of strings (or Expression with resultType array of strings).
     *
     * @param newClusterInitScripts the newClusterInitScripts value to set
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withNewClusterInitScripts(Object newClusterInitScripts) {
        this.newClusterInitScripts = newClusterInitScripts;
        return this;
    }

    /**
     * Get enable the elastic disk on the new cluster. This property is now ignored, and takes the default elastic disk behavior in Databricks (elastic disks are always enabled). Type: boolean (or Expression with resultType boolean).
     *
     * @return the newClusterEnableElasticDisk value
     */
    public Object newClusterEnableElasticDisk() {
        return this.newClusterEnableElasticDisk;
    }

    /**
     * Set enable the elastic disk on the new cluster. This property is now ignored, and takes the default elastic disk behavior in Databricks (elastic disks are always enabled). Type: boolean (or Expression with resultType boolean).
     *
     * @param newClusterEnableElasticDisk the newClusterEnableElasticDisk value to set
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withNewClusterEnableElasticDisk(Object newClusterEnableElasticDisk) {
        this.newClusterEnableElasticDisk = newClusterEnableElasticDisk;
        return this;
    }

    /**
     * Get the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
