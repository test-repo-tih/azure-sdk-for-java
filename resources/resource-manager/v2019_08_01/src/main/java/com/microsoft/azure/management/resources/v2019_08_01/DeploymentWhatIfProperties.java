/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2019_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Deployment What-if properties.
 */
public class DeploymentWhatIfProperties extends DeploymentProperties {
    /**
     * Optional What-If operation settings.
     */
    @JsonProperty(value = "whatIfSettings")
    private DeploymentWhatIfSettings whatIfSettings;

    /**
     * Get optional What-If operation settings.
     *
     * @return the whatIfSettings value
     */
    public DeploymentWhatIfSettings whatIfSettings() {
        return this.whatIfSettings;
    }

    /**
     * Set optional What-If operation settings.
     *
     * @param whatIfSettings the whatIfSettings value to set
     * @return the DeploymentWhatIfProperties object itself.
     */
    public DeploymentWhatIfProperties withWhatIfSettings(DeploymentWhatIfSettings whatIfSettings) {
        this.whatIfSettings = whatIfSettings;
        return this;
    }

}
