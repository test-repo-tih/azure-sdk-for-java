/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.implementation;

import org.joda.time.DateTime;
import java.util.List;
import java.util.UUID;
import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.PrivateCloudResourceType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Private cloud model.
 */
@JsonFlatten
public class PrivateCloudInner {
    /**
     * Azure Id, e.g.
     * "/subscriptions/4da99247-a172-4ed6-8ae9-ebed2d12f839/providers/Microsoft.VMwareCloudSimple/privateClouds/cloud123".
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Location where private cloud created, e.g "westus".
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Private cloud name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Availability Zone id, e.g. "az1".
     */
    @JsonProperty(value = "properties.availabilityZoneId")
    private String availabilityZoneId;

    /**
     * Availability Zone name, e.g. "Availability Zone 1".
     */
    @JsonProperty(value = "properties.availabilityZoneName")
    private String availabilityZoneName;

    /**
     * Number of clusters.
     */
    @JsonProperty(value = "properties.clustersNumber")
    private Integer clustersNumber;

    /**
     * User's emails who created cloud.
     */
    @JsonProperty(value = "properties.createdBy")
    private String createdBy;

    /**
     * When private cloud was created.
     */
    @JsonProperty(value = "properties.createdOn")
    private DateTime createdOn;

    /**
     * Array of DNS servers.
     */
    @JsonProperty(value = "properties.dnsServers")
    private List<String> dnsServers;

    /**
     * Expiration date of PC.
     */
    @JsonProperty(value = "properties.expires")
    private String expires;

    /**
     * Nsx Type, e.g. "Advanced".
     */
    @JsonProperty(value = "properties.nsxType")
    private String nsxType;

    /**
     * Placement Group id, e.g. "n1".
     */
    @JsonProperty(value = "properties.placementGroupId")
    private String placementGroupId;

    /**
     * Placement Group name.
     */
    @JsonProperty(value = "properties.placementGroupName")
    private String placementGroupName;

    /**
     * Id of a private cloud.
     */
    @JsonProperty(value = "properties.privateCloudId")
    private UUID privateCloudId;

    /**
     * The list of Resource Pools.
     */
    @JsonProperty(value = "properties.resourcePools")
    private List<ResourcePoolInner> resourcePools;

    /**
     * Private Cloud state, e.g. "operational".
     */
    @JsonProperty(value = "properties.state")
    private String state;

    /**
     * Number of cores.
     */
    @JsonProperty(value = "properties.totalCpuCores")
    private Integer totalCpuCores;

    /**
     * Number of nodes.
     */
    @JsonProperty(value = "properties.totalNodes")
    private Integer totalNodes;

    /**
     * Memory size.
     */
    @JsonProperty(value = "properties.totalRam")
    private Integer totalRam;

    /**
     * Disk space in TB.
     */
    @JsonProperty(value = "properties.totalStorage")
    private Double totalStorage;

    /**
     * Virtualization type e.g. "vSphere".
     */
    @JsonProperty(value = "properties.type")
    private String privateCloudPropertiesType;

    /**
     * e.g. "6.5u2".
     */
    @JsonProperty(value = "properties.vSphereVersion")
    private String vSphereVersion;

    /**
     * FQDN for vcenter access.
     */
    @JsonProperty(value = "properties.vcenterFqdn")
    private String vcenterFqdn;

    /**
     * Vcenter ip address.
     */
    @JsonProperty(value = "properties.vcenterRefid")
    private String vcenterRefid;

    /**
     * The list of Virtual Machine Templates.
     */
    @JsonProperty(value = "properties.virtualMachineTemplates")
    private List<VirtualMachineTemplateInner> virtualMachineTemplates;

    /**
     * The list of Virtual Networks.
     */
    @JsonProperty(value = "properties.virtualNetworks")
    private List<VirtualNetworkInner> virtualNetworks;

    /**
     * Is Vrops enabled/disabled.
     */
    @JsonProperty(value = "properties.vrOpsEnabled")
    private Boolean vrOpsEnabled;

    /**
     * Azure Resource type. Possible values include:
     * 'Microsoft.VMwareCloudSimple/privateClouds'.
     */
    @JsonProperty(value = "type")
    private PrivateCloudResourceType type;

    /**
     * Get azure Id, e.g. "/subscriptions/4da99247-a172-4ed6-8ae9-ebed2d12f839/providers/Microsoft.VMwareCloudSimple/privateClouds/cloud123".
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set azure Id, e.g. "/subscriptions/4da99247-a172-4ed6-8ae9-ebed2d12f839/providers/Microsoft.VMwareCloudSimple/privateClouds/cloud123".
     *
     * @param id the id value to set
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get location where private cloud created, e.g "westus".
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set location where private cloud created, e.g "westus".
     *
     * @param location the location value to set
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get private cloud name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set private cloud name.
     *
     * @param name the name value to set
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get availability Zone id, e.g. "az1".
     *
     * @return the availabilityZoneId value
     */
    public String availabilityZoneId() {
        return this.availabilityZoneId;
    }

    /**
     * Set availability Zone id, e.g. "az1".
     *
     * @param availabilityZoneId the availabilityZoneId value to set
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
        return this;
    }

    /**
     * Get availability Zone name, e.g. "Availability Zone 1".
     *
     * @return the availabilityZoneName value
     */
    public String availabilityZoneName() {
        return this.availabilityZoneName;
    }

    /**
     * Set availability Zone name, e.g. "Availability Zone 1".
     *
     * @param availabilityZoneName the availabilityZoneName value to set
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withAvailabilityZoneName(String availabilityZoneName) {
        this.availabilityZoneName = availabilityZoneName;
        return this;
    }

    /**
     * Get number of clusters.
     *
     * @return the clustersNumber value
     */
    public Integer clustersNumber() {
        return this.clustersNumber;
    }

    /**
     * Set number of clusters.
     *
     * @param clustersNumber the clustersNumber value to set
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withClustersNumber(Integer clustersNumber) {
        this.clustersNumber = clustersNumber;
        return this;
    }

    /**
     * Get user's emails who created cloud.
     *
     * @return the createdBy value
     */
    public String createdBy() {
        return this.createdBy;
    }

    /**
     * Set user's emails who created cloud.
     *
     * @param createdBy the createdBy value to set
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Get when private cloud was created.
     *
     * @return the createdOn value
     */
    public DateTime createdOn() {
        return this.createdOn;
    }

    /**
     * Set when private cloud was created.
     *
     * @param createdOn the createdOn value to set
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withCreatedOn(DateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Get array of DNS servers.
     *
     * @return the dnsServers value
     */
    public List<String> dnsServers() {
        return this.dnsServers;
    }

    /**
     * Set array of DNS servers.
     *
     * @param dnsServers the dnsServers value to set
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withDnsServers(List<String> dnsServers) {
        this.dnsServers = dnsServers;
        return this;
    }

    /**
     * Get expiration date of PC.
     *
     * @return the expires value
     */
    public String expires() {
        return this.expires;
    }

    /**
     * Set expiration date of PC.
     *
     * @param expires the expires value to set
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withExpires(String expires) {
        this.expires = expires;
        return this;
    }

    /**
     * Get nsx Type, e.g. "Advanced".
     *
     * @return the nsxType value
     */
    public String nsxType() {
        return this.nsxType;
    }

    /**
     * Set nsx Type, e.g. "Advanced".
     *
     * @param nsxType the nsxType value to set
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withNsxType(String nsxType) {
        this.nsxType = nsxType;
        return this;
    }

    /**
     * Get placement Group id, e.g. "n1".
     *
     * @return the placementGroupId value
     */
    public String placementGroupId() {
        return this.placementGroupId;
    }

    /**
     * Set placement Group id, e.g. "n1".
     *
     * @param placementGroupId the placementGroupId value to set
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withPlacementGroupId(String placementGroupId) {
        this.placementGroupId = placementGroupId;
        return this;
    }

    /**
     * Get placement Group name.
     *
     * @return the placementGroupName value
     */
    public String placementGroupName() {
        return this.placementGroupName;
    }

    /**
     * Set placement Group name.
     *
     * @param placementGroupName the placementGroupName value to set
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withPlacementGroupName(String placementGroupName) {
        this.placementGroupName = placementGroupName;
        return this;
    }

    /**
     * Get id of a private cloud.
     *
     * @return the privateCloudId value
     */
    public UUID privateCloudId() {
        return this.privateCloudId;
    }

    /**
     * Set id of a private cloud.
     *
     * @param privateCloudId the privateCloudId value to set
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withPrivateCloudId(UUID privateCloudId) {
        this.privateCloudId = privateCloudId;
        return this;
    }

    /**
     * Get the list of Resource Pools.
     *
     * @return the resourcePools value
     */
    public List<ResourcePoolInner> resourcePools() {
        return this.resourcePools;
    }

    /**
     * Set the list of Resource Pools.
     *
     * @param resourcePools the resourcePools value to set
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withResourcePools(List<ResourcePoolInner> resourcePools) {
        this.resourcePools = resourcePools;
        return this;
    }

    /**
     * Get private Cloud state, e.g. "operational".
     *
     * @return the state value
     */
    public String state() {
        return this.state;
    }

    /**
     * Set private Cloud state, e.g. "operational".
     *
     * @param state the state value to set
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get number of cores.
     *
     * @return the totalCpuCores value
     */
    public Integer totalCpuCores() {
        return this.totalCpuCores;
    }

    /**
     * Set number of cores.
     *
     * @param totalCpuCores the totalCpuCores value to set
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withTotalCpuCores(Integer totalCpuCores) {
        this.totalCpuCores = totalCpuCores;
        return this;
    }

    /**
     * Get number of nodes.
     *
     * @return the totalNodes value
     */
    public Integer totalNodes() {
        return this.totalNodes;
    }

    /**
     * Set number of nodes.
     *
     * @param totalNodes the totalNodes value to set
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withTotalNodes(Integer totalNodes) {
        this.totalNodes = totalNodes;
        return this;
    }

    /**
     * Get memory size.
     *
     * @return the totalRam value
     */
    public Integer totalRam() {
        return this.totalRam;
    }

    /**
     * Set memory size.
     *
     * @param totalRam the totalRam value to set
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withTotalRam(Integer totalRam) {
        this.totalRam = totalRam;
        return this;
    }

    /**
     * Get disk space in TB.
     *
     * @return the totalStorage value
     */
    public Double totalStorage() {
        return this.totalStorage;
    }

    /**
     * Set disk space in TB.
     *
     * @param totalStorage the totalStorage value to set
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withTotalStorage(Double totalStorage) {
        this.totalStorage = totalStorage;
        return this;
    }

    /**
     * Get virtualization type e.g. "vSphere".
     *
     * @return the privateCloudPropertiesType value
     */
    public String privateCloudPropertiesType() {
        return this.privateCloudPropertiesType;
    }

    /**
     * Set virtualization type e.g. "vSphere".
     *
     * @param privateCloudPropertiesType the privateCloudPropertiesType value to set
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withPrivateCloudPropertiesType(String privateCloudPropertiesType) {
        this.privateCloudPropertiesType = privateCloudPropertiesType;
        return this;
    }

    /**
     * Get e.g. "6.5u2".
     *
     * @return the vSphereVersion value
     */
    public String vSphereVersion() {
        return this.vSphereVersion;
    }

    /**
     * Set e.g. "6.5u2".
     *
     * @param vSphereVersion the vSphereVersion value to set
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withVSphereVersion(String vSphereVersion) {
        this.vSphereVersion = vSphereVersion;
        return this;
    }

    /**
     * Get fQDN for vcenter access.
     *
     * @return the vcenterFqdn value
     */
    public String vcenterFqdn() {
        return this.vcenterFqdn;
    }

    /**
     * Set fQDN for vcenter access.
     *
     * @param vcenterFqdn the vcenterFqdn value to set
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withVcenterFqdn(String vcenterFqdn) {
        this.vcenterFqdn = vcenterFqdn;
        return this;
    }

    /**
     * Get vcenter ip address.
     *
     * @return the vcenterRefid value
     */
    public String vcenterRefid() {
        return this.vcenterRefid;
    }

    /**
     * Set vcenter ip address.
     *
     * @param vcenterRefid the vcenterRefid value to set
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withVcenterRefid(String vcenterRefid) {
        this.vcenterRefid = vcenterRefid;
        return this;
    }

    /**
     * Get the list of Virtual Machine Templates.
     *
     * @return the virtualMachineTemplates value
     */
    public List<VirtualMachineTemplateInner> virtualMachineTemplates() {
        return this.virtualMachineTemplates;
    }

    /**
     * Set the list of Virtual Machine Templates.
     *
     * @param virtualMachineTemplates the virtualMachineTemplates value to set
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withVirtualMachineTemplates(List<VirtualMachineTemplateInner> virtualMachineTemplates) {
        this.virtualMachineTemplates = virtualMachineTemplates;
        return this;
    }

    /**
     * Get the list of Virtual Networks.
     *
     * @return the virtualNetworks value
     */
    public List<VirtualNetworkInner> virtualNetworks() {
        return this.virtualNetworks;
    }

    /**
     * Set the list of Virtual Networks.
     *
     * @param virtualNetworks the virtualNetworks value to set
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withVirtualNetworks(List<VirtualNetworkInner> virtualNetworks) {
        this.virtualNetworks = virtualNetworks;
        return this;
    }

    /**
     * Get is Vrops enabled/disabled.
     *
     * @return the vrOpsEnabled value
     */
    public Boolean vrOpsEnabled() {
        return this.vrOpsEnabled;
    }

    /**
     * Set is Vrops enabled/disabled.
     *
     * @param vrOpsEnabled the vrOpsEnabled value to set
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withVrOpsEnabled(Boolean vrOpsEnabled) {
        this.vrOpsEnabled = vrOpsEnabled;
        return this;
    }

    /**
     * Get azure Resource type. Possible values include: 'Microsoft.VMwareCloudSimple/privateClouds'.
     *
     * @return the type value
     */
    public PrivateCloudResourceType type() {
        return this.type;
    }

    /**
     * Set azure Resource type. Possible values include: 'Microsoft.VMwareCloudSimple/privateClouds'.
     *
     * @param type the type value to set
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withType(PrivateCloudResourceType type) {
        this.type = type;
        return this;
    }

}
