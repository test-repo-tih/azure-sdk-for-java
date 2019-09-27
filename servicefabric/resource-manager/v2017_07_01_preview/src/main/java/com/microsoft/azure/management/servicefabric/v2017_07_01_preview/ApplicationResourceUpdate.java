/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric.v2017_07_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * The application resource for patch operations.
 */
@JsonFlatten
public class ApplicationResourceUpdate extends ProxyResource {
    /**
     * The typeVersion property.
     */
    @JsonProperty(value = "properties.typeVersion")
    private String typeVersion;

    /**
     * The parameters property.
     */
    @JsonProperty(value = "properties.parameters")
    private List<ApplicationParameter> parameters;

    /**
     * The upgradePolicy property.
     */
    @JsonProperty(value = "properties.upgradePolicy")
    private ApplicationUpgradePolicy upgradePolicy;

    /**
     * The minimum number of nodes where Service Fabric will reserve capacity
     * for this application. Note that this does not mean that the services of
     * this application will be placed on all of those nodes. If this property
     * is set to zero, no capacity will be reserved. The value of this property
     * cannot be more than the value of the MaximumNodes property.
     */
    @JsonProperty(value = "properties.minimumNodes")
    private Long minimumNodes;

    /**
     * The maximum number of nodes where Service Fabric will reserve capacity
     * for this application. Note that this does not mean that the services of
     * this application will be placed on all of those nodes. By default, the
     * value of this property is zero and it means that the services can be
     * placed on any node.
     */
    @JsonProperty(value = "properties.maximumNodes")
    private Long maximumNodes;

    /**
     * The version of the application type.
     */
    @JsonProperty(value = "properties.removeApplicationCapacity")
    private Boolean removeApplicationCapacity;

    /**
     * The metrics property.
     */
    @JsonProperty(value = "properties.metrics")
    private List<ApplicationMetricDescription> metrics;

    /**
     * Resource location.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /**
     * Get the typeVersion value.
     *
     * @return the typeVersion value
     */
    public String typeVersion() {
        return this.typeVersion;
    }

    /**
     * Set the typeVersion value.
     *
     * @param typeVersion the typeVersion value to set
     * @return the ApplicationResourceUpdate object itself.
     */
    public ApplicationResourceUpdate withTypeVersion(String typeVersion) {
        this.typeVersion = typeVersion;
        return this;
    }

    /**
     * Get the parameters value.
     *
     * @return the parameters value
     */
    public List<ApplicationParameter> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters value.
     *
     * @param parameters the parameters value to set
     * @return the ApplicationResourceUpdate object itself.
     */
    public ApplicationResourceUpdate withParameters(List<ApplicationParameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the upgradePolicy value.
     *
     * @return the upgradePolicy value
     */
    public ApplicationUpgradePolicy upgradePolicy() {
        return this.upgradePolicy;
    }

    /**
     * Set the upgradePolicy value.
     *
     * @param upgradePolicy the upgradePolicy value to set
     * @return the ApplicationResourceUpdate object itself.
     */
    public ApplicationResourceUpdate withUpgradePolicy(ApplicationUpgradePolicy upgradePolicy) {
        this.upgradePolicy = upgradePolicy;
        return this;
    }

    /**
     * Get the minimum number of nodes where Service Fabric will reserve capacity for this application. Note that this does not mean that the services of this application will be placed on all of those nodes. If this property is set to zero, no capacity will be reserved. The value of this property cannot be more than the value of the MaximumNodes property.
     *
     * @return the minimumNodes value
     */
    public Long minimumNodes() {
        return this.minimumNodes;
    }

    /**
     * Set the minimum number of nodes where Service Fabric will reserve capacity for this application. Note that this does not mean that the services of this application will be placed on all of those nodes. If this property is set to zero, no capacity will be reserved. The value of this property cannot be more than the value of the MaximumNodes property.
     *
     * @param minimumNodes the minimumNodes value to set
     * @return the ApplicationResourceUpdate object itself.
     */
    public ApplicationResourceUpdate withMinimumNodes(Long minimumNodes) {
        this.minimumNodes = minimumNodes;
        return this;
    }

    /**
     * Get the maximum number of nodes where Service Fabric will reserve capacity for this application. Note that this does not mean that the services of this application will be placed on all of those nodes. By default, the value of this property is zero and it means that the services can be placed on any node.
     *
     * @return the maximumNodes value
     */
    public Long maximumNodes() {
        return this.maximumNodes;
    }

    /**
     * Set the maximum number of nodes where Service Fabric will reserve capacity for this application. Note that this does not mean that the services of this application will be placed on all of those nodes. By default, the value of this property is zero and it means that the services can be placed on any node.
     *
     * @param maximumNodes the maximumNodes value to set
     * @return the ApplicationResourceUpdate object itself.
     */
    public ApplicationResourceUpdate withMaximumNodes(Long maximumNodes) {
        this.maximumNodes = maximumNodes;
        return this;
    }

    /**
     * Get the version of the application type.
     *
     * @return the removeApplicationCapacity value
     */
    public Boolean removeApplicationCapacity() {
        return this.removeApplicationCapacity;
    }

    /**
     * Set the version of the application type.
     *
     * @param removeApplicationCapacity the removeApplicationCapacity value to set
     * @return the ApplicationResourceUpdate object itself.
     */
    public ApplicationResourceUpdate withRemoveApplicationCapacity(Boolean removeApplicationCapacity) {
        this.removeApplicationCapacity = removeApplicationCapacity;
        return this;
    }

    /**
     * Get the metrics value.
     *
     * @return the metrics value
     */
    public List<ApplicationMetricDescription> metrics() {
        return this.metrics;
    }

    /**
     * Set the metrics value.
     *
     * @param metrics the metrics value to set
     * @return the ApplicationResourceUpdate object itself.
     */
    public ApplicationResourceUpdate withMetrics(List<ApplicationMetricDescription> metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * Get resource location.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set resource location.
     *
     * @param location the location value to set
     * @return the ApplicationResourceUpdate object itself.
     */
    public ApplicationResourceUpdate withLocation(String location) {
        this.location = location;
        return this;
    }

}
