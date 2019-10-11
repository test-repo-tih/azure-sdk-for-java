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
 * Magento server linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Magento")
@JsonFlatten
public class MagentoLinkedService extends LinkedServiceInner {
    /**
     * The URL of the Magento instance. (i.e. 192.168.222.110/magento3).
     */
    @JsonProperty(value = "typeProperties.host", required = true)
    private Object host;

    /**
     * The access token from Magento.
     */
    @JsonProperty(value = "typeProperties.accessToken")
    private SecretBase accessToken;

    /**
     * Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     */
    @JsonProperty(value = "typeProperties.useEncryptedEndpoints")
    private Object useEncryptedEndpoints;

    /**
     * Specifies whether to require the host name in the server's certificate
     * to match the host name of the server when connecting over SSL. The
     * default value is true.
     */
    @JsonProperty(value = "typeProperties.useHostVerification")
    private Object useHostVerification;

    /**
     * Specifies whether to verify the identity of the server when connecting
     * over SSL. The default value is true.
     */
    @JsonProperty(value = "typeProperties.usePeerVerification")
    private Object usePeerVerification;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the URL of the Magento instance. (i.e. 192.168.222.110/magento3).
     *
     * @return the host value
     */
    public Object host() {
        return this.host;
    }

    /**
     * Set the URL of the Magento instance. (i.e. 192.168.222.110/magento3).
     *
     * @param host the host value to set
     * @return the MagentoLinkedService object itself.
     */
    public MagentoLinkedService withHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get the access token from Magento.
     *
     * @return the accessToken value
     */
    public SecretBase accessToken() {
        return this.accessToken;
    }

    /**
     * Set the access token from Magento.
     *
     * @param accessToken the accessToken value to set
     * @return the MagentoLinkedService object itself.
     */
    public MagentoLinkedService withAccessToken(SecretBase accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Get specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     *
     * @return the useEncryptedEndpoints value
     */
    public Object useEncryptedEndpoints() {
        return this.useEncryptedEndpoints;
    }

    /**
     * Set specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     *
     * @param useEncryptedEndpoints the useEncryptedEndpoints value to set
     * @return the MagentoLinkedService object itself.
     */
    public MagentoLinkedService withUseEncryptedEndpoints(Object useEncryptedEndpoints) {
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        return this;
    }

    /**
     * Get specifies whether to require the host name in the server's certificate to match the host name of the server when connecting over SSL. The default value is true.
     *
     * @return the useHostVerification value
     */
    public Object useHostVerification() {
        return this.useHostVerification;
    }

    /**
     * Set specifies whether to require the host name in the server's certificate to match the host name of the server when connecting over SSL. The default value is true.
     *
     * @param useHostVerification the useHostVerification value to set
     * @return the MagentoLinkedService object itself.
     */
    public MagentoLinkedService withUseHostVerification(Object useHostVerification) {
        this.useHostVerification = useHostVerification;
        return this;
    }

    /**
     * Get specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     *
     * @return the usePeerVerification value
     */
    public Object usePeerVerification() {
        return this.usePeerVerification;
    }

    /**
     * Set specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     *
     * @param usePeerVerification the usePeerVerification value to set
     * @return the MagentoLinkedService object itself.
     */
    public MagentoLinkedService withUsePeerVerification(Object usePeerVerification) {
        this.usePeerVerification = usePeerVerification;
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
     * @return the MagentoLinkedService object itself.
     */
    public MagentoLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
