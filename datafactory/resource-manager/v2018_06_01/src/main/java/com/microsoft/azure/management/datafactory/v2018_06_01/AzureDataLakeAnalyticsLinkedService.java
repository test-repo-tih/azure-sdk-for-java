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
import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.LinkedServiceInner;

/**
 * Azure Data Lake Analytics linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureDataLakeAnalytics")
@JsonFlatten
public class AzureDataLakeAnalyticsLinkedService extends LinkedServiceInner {
    /**
     * The Azure Data Lake Analytics account name. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "typeProperties.accountName", required = true)
    private Object accountName;

    /**
     * The ID of the application used to authenticate against the Azure Data
     * Lake Analytics account. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.servicePrincipalId")
    private Object servicePrincipalId;

    /**
     * The Key of the application used to authenticate against the Azure Data
     * Lake Analytics account.
     */
    @JsonProperty(value = "typeProperties.servicePrincipalKey")
    private SecretBase servicePrincipalKey;

    /**
     * The name or ID of the tenant to which the service principal belongs.
     * Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.tenant", required = true)
    private Object tenant;

    /**
     * Data Lake Analytics account subscription ID (if different from Data
     * Factory account). Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.subscriptionId")
    private Object subscriptionId;

    /**
     * Data Lake Analytics account resource group name (if different from Data
     * Factory account). Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.resourceGroupName")
    private Object resourceGroupName;

    /**
     * Azure Data Lake Analytics URI Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.dataLakeAnalyticsUri")
    private Object dataLakeAnalyticsUri;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the Azure Data Lake Analytics account name. Type: string (or Expression with resultType string).
     *
     * @return the accountName value
     */
    public Object accountName() {
        return this.accountName;
    }

    /**
     * Set the Azure Data Lake Analytics account name. Type: string (or Expression with resultType string).
     *
     * @param accountName the accountName value to set
     * @return the AzureDataLakeAnalyticsLinkedService object itself.
     */
    public AzureDataLakeAnalyticsLinkedService withAccountName(Object accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get the ID of the application used to authenticate against the Azure Data Lake Analytics account. Type: string (or Expression with resultType string).
     *
     * @return the servicePrincipalId value
     */
    public Object servicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the ID of the application used to authenticate against the Azure Data Lake Analytics account. Type: string (or Expression with resultType string).
     *
     * @param servicePrincipalId the servicePrincipalId value to set
     * @return the AzureDataLakeAnalyticsLinkedService object itself.
     */
    public AzureDataLakeAnalyticsLinkedService withServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the Key of the application used to authenticate against the Azure Data Lake Analytics account.
     *
     * @return the servicePrincipalKey value
     */
    public SecretBase servicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set the Key of the application used to authenticate against the Azure Data Lake Analytics account.
     *
     * @param servicePrincipalKey the servicePrincipalKey value to set
     * @return the AzureDataLakeAnalyticsLinkedService object itself.
     */
    public AzureDataLakeAnalyticsLinkedService withServicePrincipalKey(SecretBase servicePrincipalKey) {
        this.servicePrincipalKey = servicePrincipalKey;
        return this;
    }

    /**
     * Get the name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     *
     * @return the tenant value
     */
    public Object tenant() {
        return this.tenant;
    }

    /**
     * Set the name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     *
     * @param tenant the tenant value to set
     * @return the AzureDataLakeAnalyticsLinkedService object itself.
     */
    public AzureDataLakeAnalyticsLinkedService withTenant(Object tenant) {
        this.tenant = tenant;
        return this;
    }

    /**
     * Get data Lake Analytics account subscription ID (if different from Data Factory account). Type: string (or Expression with resultType string).
     *
     * @return the subscriptionId value
     */
    public Object subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set data Lake Analytics account subscription ID (if different from Data Factory account). Type: string (or Expression with resultType string).
     *
     * @param subscriptionId the subscriptionId value to set
     * @return the AzureDataLakeAnalyticsLinkedService object itself.
     */
    public AzureDataLakeAnalyticsLinkedService withSubscriptionId(Object subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get data Lake Analytics account resource group name (if different from Data Factory account). Type: string (or Expression with resultType string).
     *
     * @return the resourceGroupName value
     */
    public Object resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Set data Lake Analytics account resource group name (if different from Data Factory account). Type: string (or Expression with resultType string).
     *
     * @param resourceGroupName the resourceGroupName value to set
     * @return the AzureDataLakeAnalyticsLinkedService object itself.
     */
    public AzureDataLakeAnalyticsLinkedService withResourceGroupName(Object resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    /**
     * Get azure Data Lake Analytics URI Type: string (or Expression with resultType string).
     *
     * @return the dataLakeAnalyticsUri value
     */
    public Object dataLakeAnalyticsUri() {
        return this.dataLakeAnalyticsUri;
    }

    /**
     * Set azure Data Lake Analytics URI Type: string (or Expression with resultType string).
     *
     * @param dataLakeAnalyticsUri the dataLakeAnalyticsUri value to set
     * @return the AzureDataLakeAnalyticsLinkedService object itself.
     */
    public AzureDataLakeAnalyticsLinkedService withDataLakeAnalyticsUri(Object dataLakeAnalyticsUri) {
        this.dataLakeAnalyticsUri = dataLakeAnalyticsUri;
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
     * @return the AzureDataLakeAnalyticsLinkedService object itself.
     */
    public AzureDataLakeAnalyticsLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
