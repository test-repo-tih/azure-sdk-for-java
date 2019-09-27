/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric.v2016_09_01.implementation;

import java.util.List;
import com.microsoft.azure.management.servicefabric.v2016_09_01.ClusterVersionDetails;
import com.microsoft.azure.management.servicefabric.v2016_09_01.CertificateDescription;
import com.microsoft.azure.management.servicefabric.v2016_09_01.ClientCertificateThumbprint;
import com.microsoft.azure.management.servicefabric.v2016_09_01.ClientCertificateCommonName;
import com.microsoft.azure.management.servicefabric.v2016_09_01.SettingsSectionDescription;
import com.microsoft.azure.management.servicefabric.v2016_09_01.NodeTypeDescription;
import com.microsoft.azure.management.servicefabric.v2016_09_01.AzureActiveDirectory;
import com.microsoft.azure.management.servicefabric.v2016_09_01.ProvisioningState;
import com.microsoft.azure.management.servicefabric.v2016_09_01.DiagnosticsStorageAccountConfig;
import com.microsoft.azure.management.servicefabric.v2016_09_01.ClusterUpgradePolicy;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * The cluster resource.
 */
@JsonFlatten
public class ClusterInner extends Resource {
    /**
     * The available cluster code version which the cluster can upgrade to,
     * note that you must choose upgradeMode to manual to upgrade to.
     */
    @JsonProperty(value = "properties.availableClusterVersions", access = JsonProperty.Access.WRITE_ONLY)
    private List<ClusterVersionDetails> availableClusterVersions;

    /**
     * The unique identifier for the cluster resource.
     */
    @JsonProperty(value = "properties.clusterId", access = JsonProperty.Access.WRITE_ONLY)
    private String clusterId;

    /**
     * The state for the cluster. Possible values include: 'WaitingForNodes',
     * 'Deploying', 'BaselineUpgrade', 'UpdatingUserConfiguration',
     * 'UpdatingUserCertificate', 'UpdatingInfrastructure',
     * 'EnforcingClusterVersion', 'UpgradeServiceUnreachable', 'AutoScale',
     * 'Ready'.
     */
    @JsonProperty(value = "properties.clusterState", access = JsonProperty.Access.WRITE_ONLY)
    private String clusterState;

    /**
     * The endpoint for the cluster connecting to servicefabric resource
     * provider.
     */
    @JsonProperty(value = "properties.clusterEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String clusterEndpoint;

    /**
     * The ServiceFabric code version running in your cluster.
     */
    @JsonProperty(value = "properties.clusterCodeVersion")
    private String clusterCodeVersion;

    /**
     * This primary certificate will be used as cluster node to node security,
     * SSL certificate for cluster management endpoint and default admin
     * client.
     */
    @JsonProperty(value = "properties.certificate")
    private CertificateDescription certificate;

    /**
     * Cluster reliability level indicates replica set size of system service.
     * Possible values include: 'Bronze', 'Silver', 'Gold', 'Platinum'.
     */
    @JsonProperty(value = "properties.reliabilityLevel")
    private String reliabilityLevel;

    /**
     * Cluster upgrade mode indicates if fabric upgrade is initiated
     * automatically by the system or not. Possible values include:
     * 'Automatic', 'Manual'.
     */
    @JsonProperty(value = "properties.upgradeMode")
    private String upgradeMode;

    /**
     * The client thumbprint details ,it is used for client access for cluster
     * operation.
     */
    @JsonProperty(value = "properties.clientCertificateThumbprints")
    private List<ClientCertificateThumbprint> clientCertificateThumbprints;

    /**
     * List of client certificates to whitelist based on common names.
     */
    @JsonProperty(value = "properties.clientCertificateCommonNames")
    private List<ClientCertificateCommonName> clientCertificateCommonNames;

    /**
     * List of custom fabric settings to configure the cluster.
     */
    @JsonProperty(value = "properties.fabricSettings")
    private List<SettingsSectionDescription> fabricSettings;

    /**
     * The server certificate used by reverse proxy.
     */
    @JsonProperty(value = "properties.reverseProxyCertificate")
    private CertificateDescription reverseProxyCertificate;

    /**
     * The http management endpoint of the cluster.
     */
    @JsonProperty(value = "properties.managementEndpoint", required = true)
    private String managementEndpoint;

    /**
     * The list of node types that make up the cluster.
     */
    @JsonProperty(value = "properties.nodeTypes", required = true)
    private List<NodeTypeDescription> nodeTypes;

    /**
     * The settings to enable AAD authentication on the cluster.
     */
    @JsonProperty(value = "properties.azureActiveDirectory")
    private AzureActiveDirectory azureActiveDirectory;

    /**
     * The provisioning state of the cluster resource. Possible values include:
     * 'Updating', 'Succeeded', 'Failed', 'Canceled'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The name of VM image VMSS has been configured with. Generic names such
     * as Windows or Linux can be used.
     */
    @JsonProperty(value = "properties.vmImage")
    private String vmImage;

    /**
     * The storage diagnostics account configuration details.
     */
    @JsonProperty(value = "properties.diagnosticsStorageAccountConfig")
    private DiagnosticsStorageAccountConfig diagnosticsStorageAccountConfig;

    /**
     * The policy to use when upgrading the cluster.
     */
    @JsonProperty(value = "properties.upgradeDescription")
    private ClusterUpgradePolicy upgradeDescription;

    /**
     * Get the available cluster code version which the cluster can upgrade to, note that you must choose upgradeMode to manual to upgrade to.
     *
     * @return the availableClusterVersions value
     */
    public List<ClusterVersionDetails> availableClusterVersions() {
        return this.availableClusterVersions;
    }

    /**
     * Get the unique identifier for the cluster resource.
     *
     * @return the clusterId value
     */
    public String clusterId() {
        return this.clusterId;
    }

    /**
     * Get the state for the cluster. Possible values include: 'WaitingForNodes', 'Deploying', 'BaselineUpgrade', 'UpdatingUserConfiguration', 'UpdatingUserCertificate', 'UpdatingInfrastructure', 'EnforcingClusterVersion', 'UpgradeServiceUnreachable', 'AutoScale', 'Ready'.
     *
     * @return the clusterState value
     */
    public String clusterState() {
        return this.clusterState;
    }

    /**
     * Get the endpoint for the cluster connecting to servicefabric resource provider.
     *
     * @return the clusterEndpoint value
     */
    public String clusterEndpoint() {
        return this.clusterEndpoint;
    }

    /**
     * Get the ServiceFabric code version running in your cluster.
     *
     * @return the clusterCodeVersion value
     */
    public String clusterCodeVersion() {
        return this.clusterCodeVersion;
    }

    /**
     * Set the ServiceFabric code version running in your cluster.
     *
     * @param clusterCodeVersion the clusterCodeVersion value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withClusterCodeVersion(String clusterCodeVersion) {
        this.clusterCodeVersion = clusterCodeVersion;
        return this;
    }

    /**
     * Get this primary certificate will be used as cluster node to node security, SSL certificate for cluster management endpoint and default admin client.
     *
     * @return the certificate value
     */
    public CertificateDescription certificate() {
        return this.certificate;
    }

    /**
     * Set this primary certificate will be used as cluster node to node security, SSL certificate for cluster management endpoint and default admin client.
     *
     * @param certificate the certificate value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withCertificate(CertificateDescription certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * Get cluster reliability level indicates replica set size of system service. Possible values include: 'Bronze', 'Silver', 'Gold', 'Platinum'.
     *
     * @return the reliabilityLevel value
     */
    public String reliabilityLevel() {
        return this.reliabilityLevel;
    }

    /**
     * Set cluster reliability level indicates replica set size of system service. Possible values include: 'Bronze', 'Silver', 'Gold', 'Platinum'.
     *
     * @param reliabilityLevel the reliabilityLevel value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withReliabilityLevel(String reliabilityLevel) {
        this.reliabilityLevel = reliabilityLevel;
        return this;
    }

    /**
     * Get cluster upgrade mode indicates if fabric upgrade is initiated automatically by the system or not. Possible values include: 'Automatic', 'Manual'.
     *
     * @return the upgradeMode value
     */
    public String upgradeMode() {
        return this.upgradeMode;
    }

    /**
     * Set cluster upgrade mode indicates if fabric upgrade is initiated automatically by the system or not. Possible values include: 'Automatic', 'Manual'.
     *
     * @param upgradeMode the upgradeMode value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withUpgradeMode(String upgradeMode) {
        this.upgradeMode = upgradeMode;
        return this;
    }

    /**
     * Get the client thumbprint details ,it is used for client access for cluster operation.
     *
     * @return the clientCertificateThumbprints value
     */
    public List<ClientCertificateThumbprint> clientCertificateThumbprints() {
        return this.clientCertificateThumbprints;
    }

    /**
     * Set the client thumbprint details ,it is used for client access for cluster operation.
     *
     * @param clientCertificateThumbprints the clientCertificateThumbprints value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withClientCertificateThumbprints(List<ClientCertificateThumbprint> clientCertificateThumbprints) {
        this.clientCertificateThumbprints = clientCertificateThumbprints;
        return this;
    }

    /**
     * Get list of client certificates to whitelist based on common names.
     *
     * @return the clientCertificateCommonNames value
     */
    public List<ClientCertificateCommonName> clientCertificateCommonNames() {
        return this.clientCertificateCommonNames;
    }

    /**
     * Set list of client certificates to whitelist based on common names.
     *
     * @param clientCertificateCommonNames the clientCertificateCommonNames value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withClientCertificateCommonNames(List<ClientCertificateCommonName> clientCertificateCommonNames) {
        this.clientCertificateCommonNames = clientCertificateCommonNames;
        return this;
    }

    /**
     * Get list of custom fabric settings to configure the cluster.
     *
     * @return the fabricSettings value
     */
    public List<SettingsSectionDescription> fabricSettings() {
        return this.fabricSettings;
    }

    /**
     * Set list of custom fabric settings to configure the cluster.
     *
     * @param fabricSettings the fabricSettings value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withFabricSettings(List<SettingsSectionDescription> fabricSettings) {
        this.fabricSettings = fabricSettings;
        return this;
    }

    /**
     * Get the server certificate used by reverse proxy.
     *
     * @return the reverseProxyCertificate value
     */
    public CertificateDescription reverseProxyCertificate() {
        return this.reverseProxyCertificate;
    }

    /**
     * Set the server certificate used by reverse proxy.
     *
     * @param reverseProxyCertificate the reverseProxyCertificate value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withReverseProxyCertificate(CertificateDescription reverseProxyCertificate) {
        this.reverseProxyCertificate = reverseProxyCertificate;
        return this;
    }

    /**
     * Get the http management endpoint of the cluster.
     *
     * @return the managementEndpoint value
     */
    public String managementEndpoint() {
        return this.managementEndpoint;
    }

    /**
     * Set the http management endpoint of the cluster.
     *
     * @param managementEndpoint the managementEndpoint value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withManagementEndpoint(String managementEndpoint) {
        this.managementEndpoint = managementEndpoint;
        return this;
    }

    /**
     * Get the list of node types that make up the cluster.
     *
     * @return the nodeTypes value
     */
    public List<NodeTypeDescription> nodeTypes() {
        return this.nodeTypes;
    }

    /**
     * Set the list of node types that make up the cluster.
     *
     * @param nodeTypes the nodeTypes value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withNodeTypes(List<NodeTypeDescription> nodeTypes) {
        this.nodeTypes = nodeTypes;
        return this;
    }

    /**
     * Get the settings to enable AAD authentication on the cluster.
     *
     * @return the azureActiveDirectory value
     */
    public AzureActiveDirectory azureActiveDirectory() {
        return this.azureActiveDirectory;
    }

    /**
     * Set the settings to enable AAD authentication on the cluster.
     *
     * @param azureActiveDirectory the azureActiveDirectory value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withAzureActiveDirectory(AzureActiveDirectory azureActiveDirectory) {
        this.azureActiveDirectory = azureActiveDirectory;
        return this;
    }

    /**
     * Get the provisioning state of the cluster resource. Possible values include: 'Updating', 'Succeeded', 'Failed', 'Canceled'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the name of VM image VMSS has been configured with. Generic names such as Windows or Linux can be used.
     *
     * @return the vmImage value
     */
    public String vmImage() {
        return this.vmImage;
    }

    /**
     * Set the name of VM image VMSS has been configured with. Generic names such as Windows or Linux can be used.
     *
     * @param vmImage the vmImage value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withVmImage(String vmImage) {
        this.vmImage = vmImage;
        return this;
    }

    /**
     * Get the storage diagnostics account configuration details.
     *
     * @return the diagnosticsStorageAccountConfig value
     */
    public DiagnosticsStorageAccountConfig diagnosticsStorageAccountConfig() {
        return this.diagnosticsStorageAccountConfig;
    }

    /**
     * Set the storage diagnostics account configuration details.
     *
     * @param diagnosticsStorageAccountConfig the diagnosticsStorageAccountConfig value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withDiagnosticsStorageAccountConfig(DiagnosticsStorageAccountConfig diagnosticsStorageAccountConfig) {
        this.diagnosticsStorageAccountConfig = diagnosticsStorageAccountConfig;
        return this;
    }

    /**
     * Get the policy to use when upgrading the cluster.
     *
     * @return the upgradeDescription value
     */
    public ClusterUpgradePolicy upgradeDescription() {
        return this.upgradeDescription;
    }

    /**
     * Set the policy to use when upgrading the cluster.
     *
     * @param upgradeDescription the upgradeDescription value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withUpgradeDescription(ClusterUpgradePolicy upgradeDescription) {
        this.upgradeDescription = upgradeDescription;
        return this;
    }

}
