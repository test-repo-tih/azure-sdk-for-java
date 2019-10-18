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
 * Azure File Storage linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureFileStorage")
@JsonFlatten
public class AzureFileStorageLinkedService extends LinkedServiceInner {
    /**
     * Host name of the server. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.host", required = true)
    private Object host;

    /**
     * User ID to logon the server. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.userId")
    private Object userId;

    /**
     * Password to logon the server.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get host name of the server. Type: string (or Expression with resultType string).
     *
     * @return the host value
     */
    public Object host() {
        return this.host;
    }

    /**
     * Set host name of the server. Type: string (or Expression with resultType string).
     *
     * @param host the host value to set
     * @return the AzureFileStorageLinkedService object itself.
     */
    public AzureFileStorageLinkedService withHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get user ID to logon the server. Type: string (or Expression with resultType string).
     *
     * @return the userId value
     */
    public Object userId() {
        return this.userId;
    }

    /**
     * Set user ID to logon the server. Type: string (or Expression with resultType string).
     *
     * @param userId the userId value to set
     * @return the AzureFileStorageLinkedService object itself.
     */
    public AzureFileStorageLinkedService withUserId(Object userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Get password to logon the server.
     *
     * @return the password value
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set password to logon the server.
     *
     * @param password the password value to set
     * @return the AzureFileStorageLinkedService object itself.
     */
    public AzureFileStorageLinkedService withPassword(SecretBase password) {
        this.password = password;
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
     * @return the AzureFileStorageLinkedService object itself.
     */
    public AzureFileStorageLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
