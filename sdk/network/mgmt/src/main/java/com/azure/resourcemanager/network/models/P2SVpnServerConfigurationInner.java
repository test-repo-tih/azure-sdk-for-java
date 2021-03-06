// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.IpsecPolicy;
import com.azure.resourcemanager.network.P2SVpnServerConfigRadiusClientRootCertificate;
import com.azure.resourcemanager.network.P2SVpnServerConfigRadiusServerRootCertificate;
import com.azure.resourcemanager.network.P2SVpnServerConfigVpnClientRevokedCertificate;
import com.azure.resourcemanager.network.P2SVpnServerConfigVpnClientRootCertificate;
import com.azure.resourcemanager.network.VpnGatewayTunnelingProtocol;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The P2SVpnServerConfiguration model. */
@JsonFlatten
@Fluent
public class P2SVpnServerConfigurationInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(P2SVpnServerConfigurationInner.class);

    /*
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The name of the P2SVpnServerConfiguration that is unique within a
     * VirtualWan in a resource group. This name can be used to access the
     * resource along with Paren VirtualWan resource name.
     */
    @JsonProperty(value = "properties.name")
    private String namePropertiesName;

    /*
     * VPN protocols for the P2SVpnServerConfiguration.
     */
    @JsonProperty(value = "properties.vpnProtocols")
    private List<VpnGatewayTunnelingProtocol> vpnProtocols;

    /*
     * VPN client root certificate of P2SVpnServerConfiguration.
     */
    @JsonProperty(value = "properties.p2SVpnServerConfigVpnClientRootCertificates")
    private List<P2SVpnServerConfigVpnClientRootCertificate> p2SVpnServerConfigVpnClientRootCertificates;

    /*
     * VPN client revoked certificate of P2SVpnServerConfiguration.
     */
    @JsonProperty(value = "properties.p2SVpnServerConfigVpnClientRevokedCertificates")
    private List<P2SVpnServerConfigVpnClientRevokedCertificate> p2SVpnServerConfigVpnClientRevokedCertificates;

    /*
     * Radius Server root certificate of P2SVpnServerConfiguration.
     */
    @JsonProperty(value = "properties.p2SVpnServerConfigRadiusServerRootCertificates")
    private List<P2SVpnServerConfigRadiusServerRootCertificate> p2SVpnServerConfigRadiusServerRootCertificates;

    /*
     * Radius client root certificate of P2SVpnServerConfiguration.
     */
    @JsonProperty(value = "properties.p2SVpnServerConfigRadiusClientRootCertificates")
    private List<P2SVpnServerConfigRadiusClientRootCertificate> p2SVpnServerConfigRadiusClientRootCertificates;

    /*
     * VpnClientIpsecPolicies for P2SVpnServerConfiguration.
     */
    @JsonProperty(value = "properties.vpnClientIpsecPolicies")
    private List<IpsecPolicy> vpnClientIpsecPolicies;

    /*
     * The radius server address property of the P2SVpnServerConfiguration
     * resource for point to site client connection.
     */
    @JsonProperty(value = "properties.radiusServerAddress")
    private String radiusServerAddress;

    /*
     * The radius secret property of the P2SVpnServerConfiguration resource for
     * point to site client connection.
     */
    @JsonProperty(value = "properties.radiusServerSecret")
    private String radiusServerSecret;

    /*
     * The provisioning state of the P2SVpnServerConfiguration resource.
     * Possible values are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * List of references to P2SVpnGateways.
     */
    @JsonProperty(value = "properties.p2SVpnGateways", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> p2SVpnGateways;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "properties.etag")
    private String etagPropertiesEtag;

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @param name the name value to set.
     * @return the P2SVpnServerConfigurationInner object itself.
     */
    public P2SVpnServerConfigurationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: Gets a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the namePropertiesName property: The name of the P2SVpnServerConfiguration that is unique within a VirtualWan
     * in a resource group. This name can be used to access the resource along with Paren VirtualWan resource name.
     *
     * @return the namePropertiesName value.
     */
    public String namePropertiesName() {
        return this.namePropertiesName;
    }

    /**
     * Set the namePropertiesName property: The name of the P2SVpnServerConfiguration that is unique within a VirtualWan
     * in a resource group. This name can be used to access the resource along with Paren VirtualWan resource name.
     *
     * @param namePropertiesName the namePropertiesName value to set.
     * @return the P2SVpnServerConfigurationInner object itself.
     */
    public P2SVpnServerConfigurationInner withNamePropertiesName(String namePropertiesName) {
        this.namePropertiesName = namePropertiesName;
        return this;
    }

    /**
     * Get the vpnProtocols property: VPN protocols for the P2SVpnServerConfiguration.
     *
     * @return the vpnProtocols value.
     */
    public List<VpnGatewayTunnelingProtocol> vpnProtocols() {
        return this.vpnProtocols;
    }

    /**
     * Set the vpnProtocols property: VPN protocols for the P2SVpnServerConfiguration.
     *
     * @param vpnProtocols the vpnProtocols value to set.
     * @return the P2SVpnServerConfigurationInner object itself.
     */
    public P2SVpnServerConfigurationInner withVpnProtocols(List<VpnGatewayTunnelingProtocol> vpnProtocols) {
        this.vpnProtocols = vpnProtocols;
        return this;
    }

    /**
     * Get the p2SVpnServerConfigVpnClientRootCertificates property: VPN client root certificate of
     * P2SVpnServerConfiguration.
     *
     * @return the p2SVpnServerConfigVpnClientRootCertificates value.
     */
    public List<P2SVpnServerConfigVpnClientRootCertificate> p2SVpnServerConfigVpnClientRootCertificates() {
        return this.p2SVpnServerConfigVpnClientRootCertificates;
    }

    /**
     * Set the p2SVpnServerConfigVpnClientRootCertificates property: VPN client root certificate of
     * P2SVpnServerConfiguration.
     *
     * @param p2SVpnServerConfigVpnClientRootCertificates the p2SVpnServerConfigVpnClientRootCertificates value to set.
     * @return the P2SVpnServerConfigurationInner object itself.
     */
    public P2SVpnServerConfigurationInner withP2SVpnServerConfigVpnClientRootCertificates(
        List<P2SVpnServerConfigVpnClientRootCertificate> p2SVpnServerConfigVpnClientRootCertificates) {
        this.p2SVpnServerConfigVpnClientRootCertificates = p2SVpnServerConfigVpnClientRootCertificates;
        return this;
    }

    /**
     * Get the p2SVpnServerConfigVpnClientRevokedCertificates property: VPN client revoked certificate of
     * P2SVpnServerConfiguration.
     *
     * @return the p2SVpnServerConfigVpnClientRevokedCertificates value.
     */
    public List<P2SVpnServerConfigVpnClientRevokedCertificate> p2SVpnServerConfigVpnClientRevokedCertificates() {
        return this.p2SVpnServerConfigVpnClientRevokedCertificates;
    }

    /**
     * Set the p2SVpnServerConfigVpnClientRevokedCertificates property: VPN client revoked certificate of
     * P2SVpnServerConfiguration.
     *
     * @param p2SVpnServerConfigVpnClientRevokedCertificates the p2SVpnServerConfigVpnClientRevokedCertificates value to
     *     set.
     * @return the P2SVpnServerConfigurationInner object itself.
     */
    public P2SVpnServerConfigurationInner withP2SVpnServerConfigVpnClientRevokedCertificates(
        List<P2SVpnServerConfigVpnClientRevokedCertificate> p2SVpnServerConfigVpnClientRevokedCertificates) {
        this.p2SVpnServerConfigVpnClientRevokedCertificates = p2SVpnServerConfigVpnClientRevokedCertificates;
        return this;
    }

    /**
     * Get the p2SVpnServerConfigRadiusServerRootCertificates property: Radius Server root certificate of
     * P2SVpnServerConfiguration.
     *
     * @return the p2SVpnServerConfigRadiusServerRootCertificates value.
     */
    public List<P2SVpnServerConfigRadiusServerRootCertificate> p2SVpnServerConfigRadiusServerRootCertificates() {
        return this.p2SVpnServerConfigRadiusServerRootCertificates;
    }

    /**
     * Set the p2SVpnServerConfigRadiusServerRootCertificates property: Radius Server root certificate of
     * P2SVpnServerConfiguration.
     *
     * @param p2SVpnServerConfigRadiusServerRootCertificates the p2SVpnServerConfigRadiusServerRootCertificates value to
     *     set.
     * @return the P2SVpnServerConfigurationInner object itself.
     */
    public P2SVpnServerConfigurationInner withP2SVpnServerConfigRadiusServerRootCertificates(
        List<P2SVpnServerConfigRadiusServerRootCertificate> p2SVpnServerConfigRadiusServerRootCertificates) {
        this.p2SVpnServerConfigRadiusServerRootCertificates = p2SVpnServerConfigRadiusServerRootCertificates;
        return this;
    }

    /**
     * Get the p2SVpnServerConfigRadiusClientRootCertificates property: Radius client root certificate of
     * P2SVpnServerConfiguration.
     *
     * @return the p2SVpnServerConfigRadiusClientRootCertificates value.
     */
    public List<P2SVpnServerConfigRadiusClientRootCertificate> p2SVpnServerConfigRadiusClientRootCertificates() {
        return this.p2SVpnServerConfigRadiusClientRootCertificates;
    }

    /**
     * Set the p2SVpnServerConfigRadiusClientRootCertificates property: Radius client root certificate of
     * P2SVpnServerConfiguration.
     *
     * @param p2SVpnServerConfigRadiusClientRootCertificates the p2SVpnServerConfigRadiusClientRootCertificates value to
     *     set.
     * @return the P2SVpnServerConfigurationInner object itself.
     */
    public P2SVpnServerConfigurationInner withP2SVpnServerConfigRadiusClientRootCertificates(
        List<P2SVpnServerConfigRadiusClientRootCertificate> p2SVpnServerConfigRadiusClientRootCertificates) {
        this.p2SVpnServerConfigRadiusClientRootCertificates = p2SVpnServerConfigRadiusClientRootCertificates;
        return this;
    }

    /**
     * Get the vpnClientIpsecPolicies property: VpnClientIpsecPolicies for P2SVpnServerConfiguration.
     *
     * @return the vpnClientIpsecPolicies value.
     */
    public List<IpsecPolicy> vpnClientIpsecPolicies() {
        return this.vpnClientIpsecPolicies;
    }

    /**
     * Set the vpnClientIpsecPolicies property: VpnClientIpsecPolicies for P2SVpnServerConfiguration.
     *
     * @param vpnClientIpsecPolicies the vpnClientIpsecPolicies value to set.
     * @return the P2SVpnServerConfigurationInner object itself.
     */
    public P2SVpnServerConfigurationInner withVpnClientIpsecPolicies(List<IpsecPolicy> vpnClientIpsecPolicies) {
        this.vpnClientIpsecPolicies = vpnClientIpsecPolicies;
        return this;
    }

    /**
     * Get the radiusServerAddress property: The radius server address property of the P2SVpnServerConfiguration
     * resource for point to site client connection.
     *
     * @return the radiusServerAddress value.
     */
    public String radiusServerAddress() {
        return this.radiusServerAddress;
    }

    /**
     * Set the radiusServerAddress property: The radius server address property of the P2SVpnServerConfiguration
     * resource for point to site client connection.
     *
     * @param radiusServerAddress the radiusServerAddress value to set.
     * @return the P2SVpnServerConfigurationInner object itself.
     */
    public P2SVpnServerConfigurationInner withRadiusServerAddress(String radiusServerAddress) {
        this.radiusServerAddress = radiusServerAddress;
        return this;
    }

    /**
     * Get the radiusServerSecret property: The radius secret property of the P2SVpnServerConfiguration resource for
     * point to site client connection.
     *
     * @return the radiusServerSecret value.
     */
    public String radiusServerSecret() {
        return this.radiusServerSecret;
    }

    /**
     * Set the radiusServerSecret property: The radius secret property of the P2SVpnServerConfiguration resource for
     * point to site client connection.
     *
     * @param radiusServerSecret the radiusServerSecret value to set.
     * @return the P2SVpnServerConfigurationInner object itself.
     */
    public P2SVpnServerConfigurationInner withRadiusServerSecret(String radiusServerSecret) {
        this.radiusServerSecret = radiusServerSecret;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the P2SVpnServerConfiguration resource. Possible
     * values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the p2SVpnGateways property: List of references to P2SVpnGateways.
     *
     * @return the p2SVpnGateways value.
     */
    public List<SubResource> p2SVpnGateways() {
        return this.p2SVpnGateways;
    }

    /**
     * Get the etagPropertiesEtag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etagPropertiesEtag value.
     */
    public String etagPropertiesEtag() {
        return this.etagPropertiesEtag;
    }

    /**
     * Set the etagPropertiesEtag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @param etagPropertiesEtag the etagPropertiesEtag value to set.
     * @return the P2SVpnServerConfigurationInner object itself.
     */
    public P2SVpnServerConfigurationInner withEtagPropertiesEtag(String etagPropertiesEtag) {
        this.etagPropertiesEtag = etagPropertiesEtag;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (p2SVpnServerConfigVpnClientRootCertificates() != null) {
            p2SVpnServerConfigVpnClientRootCertificates().forEach(e -> e.validate());
        }
        if (p2SVpnServerConfigVpnClientRevokedCertificates() != null) {
            p2SVpnServerConfigVpnClientRevokedCertificates().forEach(e -> e.validate());
        }
        if (p2SVpnServerConfigRadiusServerRootCertificates() != null) {
            p2SVpnServerConfigRadiusServerRootCertificates().forEach(e -> e.validate());
        }
        if (p2SVpnServerConfigRadiusClientRootCertificates() != null) {
            p2SVpnServerConfigRadiusClientRootCertificates().forEach(e -> e.validate());
        }
        if (vpnClientIpsecPolicies() != null) {
            vpnClientIpsecPolicies().forEach(e -> e.validate());
        }
    }
}
