/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactory.v2017_09_01_preview.implementation.LinkedServiceInner;

/**
 * Hadoop Distributed File System (HDFS) linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Hdfs")
@JsonFlatten
public class HdfsLinkedService extends LinkedServiceInner {
    /**
     * The URL of the HDFS service endpoint, e.g.
     * http://myhostname:50070/webhdfs/v1 . Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.url", required = true)
    private Object url;

    /**
     * Type of authentication used to connect to the HDFS. Possible values are:
     * Anonymous and Windows. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.authenticationType")
    private Object authenticationType;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * User name for Windows authentication. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.userName")
    private Object userName;

    /**
     * Password for Windows authentication.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /**
     * Get the URL of the HDFS service endpoint, e.g. http://myhostname:50070/webhdfs/v1 . Type: string (or Expression with resultType string).
     *
     * @return the url value
     */
    public Object url() {
        return this.url;
    }

    /**
     * Set the URL of the HDFS service endpoint, e.g. http://myhostname:50070/webhdfs/v1 . Type: string (or Expression with resultType string).
     *
     * @param url the url value to set
     * @return the HdfsLinkedService object itself.
     */
    public HdfsLinkedService withUrl(Object url) {
        this.url = url;
        return this;
    }

    /**
     * Get type of authentication used to connect to the HDFS. Possible values are: Anonymous and Windows. Type: string (or Expression with resultType string).
     *
     * @return the authenticationType value
     */
    public Object authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set type of authentication used to connect to the HDFS. Possible values are: Anonymous and Windows. Type: string (or Expression with resultType string).
     *
     * @param authenticationType the authenticationType value to set
     * @return the HdfsLinkedService object itself.
     */
    public HdfsLinkedService withAuthenticationType(Object authenticationType) {
        this.authenticationType = authenticationType;
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
     * @return the HdfsLinkedService object itself.
     */
    public HdfsLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Get user name for Windows authentication. Type: string (or Expression with resultType string).
     *
     * @return the userName value
     */
    public Object userName() {
        return this.userName;
    }

    /**
     * Set user name for Windows authentication. Type: string (or Expression with resultType string).
     *
     * @param userName the userName value to set
     * @return the HdfsLinkedService object itself.
     */
    public HdfsLinkedService withUserName(Object userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get password for Windows authentication.
     *
     * @return the password value
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set password for Windows authentication.
     *
     * @param password the password value to set
     * @return the HdfsLinkedService object itself.
     */
    public HdfsLinkedService withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

}
