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
 * Impala server linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Impala")
@JsonFlatten
public class ImpalaLinkedService extends LinkedServiceInner {
    /**
     * The IP address or host name of the Impala server. (i.e.
     * 192.168.222.160).
     */
    @JsonProperty(value = "typeProperties.host", required = true)
    private Object host;

    /**
     * The TCP port that the Impala server uses to listen for client
     * connections. The default value is 21050.
     */
    @JsonProperty(value = "typeProperties.port")
    private Object port;

    /**
     * The authentication type to use. Possible values include: 'Anonymous',
     * 'SASLUsername', 'UsernameAndPassword'.
     */
    @JsonProperty(value = "typeProperties.authenticationType", required = true)
    private ImpalaAuthenticationType authenticationType;

    /**
     * The user name used to access the Impala server. The default value is
     * anonymous when using SASLUsername.
     */
    @JsonProperty(value = "typeProperties.username")
    private Object username;

    /**
     * The password corresponding to the user name when using
     * UsernameAndPassword.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /**
     * Specifies whether the connections to the server are encrypted using SSL.
     * The default value is false.
     */
    @JsonProperty(value = "typeProperties.enableSsl")
    private Object enableSsl;

    /**
     * The full path of the .pem file containing trusted CA certificates for
     * verifying the server when connecting over SSL. This property can only be
     * set when using SSL on self-hosted IR. The default value is the
     * cacerts.pem file installed with the IR.
     */
    @JsonProperty(value = "typeProperties.trustedCertPath")
    private Object trustedCertPath;

    /**
     * Specifies whether to use a CA certificate from the system trust store or
     * from a specified PEM file. The default value is false.
     */
    @JsonProperty(value = "typeProperties.useSystemTrustStore")
    private Object useSystemTrustStore;

    /**
     * Specifies whether to require a CA-issued SSL certificate name to match
     * the host name of the server when connecting over SSL. The default value
     * is false.
     */
    @JsonProperty(value = "typeProperties.allowHostNameCNMismatch")
    private Object allowHostNameCNMismatch;

    /**
     * Specifies whether to allow self-signed certificates from the server. The
     * default value is false.
     */
    @JsonProperty(value = "typeProperties.allowSelfSignedServerCert")
    private Object allowSelfSignedServerCert;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the IP address or host name of the Impala server. (i.e. 192.168.222.160).
     *
     * @return the host value
     */
    public Object host() {
        return this.host;
    }

    /**
     * Set the IP address or host name of the Impala server. (i.e. 192.168.222.160).
     *
     * @param host the host value to set
     * @return the ImpalaLinkedService object itself.
     */
    public ImpalaLinkedService withHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get the TCP port that the Impala server uses to listen for client connections. The default value is 21050.
     *
     * @return the port value
     */
    public Object port() {
        return this.port;
    }

    /**
     * Set the TCP port that the Impala server uses to listen for client connections. The default value is 21050.
     *
     * @param port the port value to set
     * @return the ImpalaLinkedService object itself.
     */
    public ImpalaLinkedService withPort(Object port) {
        this.port = port;
        return this;
    }

    /**
     * Get the authentication type to use. Possible values include: 'Anonymous', 'SASLUsername', 'UsernameAndPassword'.
     *
     * @return the authenticationType value
     */
    public ImpalaAuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authentication type to use. Possible values include: 'Anonymous', 'SASLUsername', 'UsernameAndPassword'.
     *
     * @param authenticationType the authenticationType value to set
     * @return the ImpalaLinkedService object itself.
     */
    public ImpalaLinkedService withAuthenticationType(ImpalaAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the user name used to access the Impala server. The default value is anonymous when using SASLUsername.
     *
     * @return the username value
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the user name used to access the Impala server. The default value is anonymous when using SASLUsername.
     *
     * @param username the username value to set
     * @return the ImpalaLinkedService object itself.
     */
    public ImpalaLinkedService withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password corresponding to the user name when using UsernameAndPassword.
     *
     * @return the password value
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password corresponding to the user name when using UsernameAndPassword.
     *
     * @param password the password value to set
     * @return the ImpalaLinkedService object itself.
     */
    public ImpalaLinkedService withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get specifies whether the connections to the server are encrypted using SSL. The default value is false.
     *
     * @return the enableSsl value
     */
    public Object enableSsl() {
        return this.enableSsl;
    }

    /**
     * Set specifies whether the connections to the server are encrypted using SSL. The default value is false.
     *
     * @param enableSsl the enableSsl value to set
     * @return the ImpalaLinkedService object itself.
     */
    public ImpalaLinkedService withEnableSsl(Object enableSsl) {
        this.enableSsl = enableSsl;
        return this;
    }

    /**
     * Get the full path of the .pem file containing trusted CA certificates for verifying the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default value is the cacerts.pem file installed with the IR.
     *
     * @return the trustedCertPath value
     */
    public Object trustedCertPath() {
        return this.trustedCertPath;
    }

    /**
     * Set the full path of the .pem file containing trusted CA certificates for verifying the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default value is the cacerts.pem file installed with the IR.
     *
     * @param trustedCertPath the trustedCertPath value to set
     * @return the ImpalaLinkedService object itself.
     */
    public ImpalaLinkedService withTrustedCertPath(Object trustedCertPath) {
        this.trustedCertPath = trustedCertPath;
        return this;
    }

    /**
     * Get specifies whether to use a CA certificate from the system trust store or from a specified PEM file. The default value is false.
     *
     * @return the useSystemTrustStore value
     */
    public Object useSystemTrustStore() {
        return this.useSystemTrustStore;
    }

    /**
     * Set specifies whether to use a CA certificate from the system trust store or from a specified PEM file. The default value is false.
     *
     * @param useSystemTrustStore the useSystemTrustStore value to set
     * @return the ImpalaLinkedService object itself.
     */
    public ImpalaLinkedService withUseSystemTrustStore(Object useSystemTrustStore) {
        this.useSystemTrustStore = useSystemTrustStore;
        return this;
    }

    /**
     * Get specifies whether to require a CA-issued SSL certificate name to match the host name of the server when connecting over SSL. The default value is false.
     *
     * @return the allowHostNameCNMismatch value
     */
    public Object allowHostNameCNMismatch() {
        return this.allowHostNameCNMismatch;
    }

    /**
     * Set specifies whether to require a CA-issued SSL certificate name to match the host name of the server when connecting over SSL. The default value is false.
     *
     * @param allowHostNameCNMismatch the allowHostNameCNMismatch value to set
     * @return the ImpalaLinkedService object itself.
     */
    public ImpalaLinkedService withAllowHostNameCNMismatch(Object allowHostNameCNMismatch) {
        this.allowHostNameCNMismatch = allowHostNameCNMismatch;
        return this;
    }

    /**
     * Get specifies whether to allow self-signed certificates from the server. The default value is false.
     *
     * @return the allowSelfSignedServerCert value
     */
    public Object allowSelfSignedServerCert() {
        return this.allowSelfSignedServerCert;
    }

    /**
     * Set specifies whether to allow self-signed certificates from the server. The default value is false.
     *
     * @param allowSelfSignedServerCert the allowSelfSignedServerCert value to set
     * @return the ImpalaLinkedService object itself.
     */
    public ImpalaLinkedService withAllowSelfSignedServerCert(Object allowSelfSignedServerCert) {
        this.allowSelfSignedServerCert = allowSelfSignedServerCert;
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
     * @return the ImpalaLinkedService object itself.
     */
    public ImpalaLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
