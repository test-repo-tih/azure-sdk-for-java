/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.customvision.prediction.models;

import java.util.UUID;
import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Result of an image prediction request.
 */
public class ImagePrediction {
    /**
     * Prediction Id.
     */
    @JsonProperty(value = "id", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private UUID id;

    /**
     * Project Id.
     */
    @JsonProperty(value = "project", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private UUID project;

    /**
     * Iteration Id.
     */
    @JsonProperty(value = "iteration", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private UUID iteration;

    /**
     * Date this prediction was created.
     */
    @JsonProperty(value = "created", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private DateTime created;

    /**
     * List of predictions.
     */
    @JsonProperty(value = "predictions", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private List<Prediction> predictions;

    /**
     * Get prediction Id.
     *
     * @return the id value
     */
    public UUID id() {
        return this.id;
    }

    /**
     * Get project Id.
     *
     * @return the project value
     */
    public UUID project() {
        return this.project;
    }

    /**
     * Get iteration Id.
     *
     * @return the iteration value
     */
    public UUID iteration() {
        return this.iteration;
    }

    /**
     * Get date this prediction was created.
     *
     * @return the created value
     */
    public DateTime created() {
        return this.created;
    }

    /**
     * Get list of predictions.
     *
     * @return the predictions value
     */
    public List<Prediction> predictions() {
        return this.predictions;
    }

}
