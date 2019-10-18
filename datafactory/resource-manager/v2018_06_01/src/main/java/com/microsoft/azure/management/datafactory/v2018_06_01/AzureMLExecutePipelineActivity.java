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

/**
 * Azure ML Execute Pipeline activity.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureMLExecutePipeline")
@JsonFlatten
public class AzureMLExecutePipelineActivity extends ExecutionActivity {
    /**
     * ID of the published Azure ML pipeline. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.mlPipelineId", required = true)
    private Object mlPipelineId;

    /**
     * Run history experiment name of the pipeline run. This information will
     * be passed in the ExperimentName property of the published pipeline
     * execution request. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.experimentName")
    private Object experimentName;

    /**
     * Key,Value pairs to be passed to the published Azure ML pipeline
     * endpoint. Keys must match the names of pipeline parameters defined in
     * the published pipeline. Values will be passed in the
     * ParameterAssignments property of the published pipeline execution
     * request. Type: object with key value pairs (or Expression with
     * resultType object).
     */
    @JsonProperty(value = "typeProperties.mlPipelineParameters")
    private Object mlPipelineParameters;

    /**
     * The parent Azure ML Service pipeline run id. This information will be
     * passed in the ParentRunId property of the published pipeline execution
     * request. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.mlParentRunId")
    private Object mlParentRunId;

    /**
     * Whether to continue execution of other steps in the PipelineRun if a
     * step fails. This information will be passed in the continueOnStepFailure
     * property of the published pipeline execution request. Type: boolean (or
     * Expression with resultType boolean).
     */
    @JsonProperty(value = "typeProperties.continueOnStepFailure")
    private Object continueOnStepFailure;

    /**
     * Get iD of the published Azure ML pipeline. Type: string (or Expression with resultType string).
     *
     * @return the mlPipelineId value
     */
    public Object mlPipelineId() {
        return this.mlPipelineId;
    }

    /**
     * Set iD of the published Azure ML pipeline. Type: string (or Expression with resultType string).
     *
     * @param mlPipelineId the mlPipelineId value to set
     * @return the AzureMLExecutePipelineActivity object itself.
     */
    public AzureMLExecutePipelineActivity withMlPipelineId(Object mlPipelineId) {
        this.mlPipelineId = mlPipelineId;
        return this;
    }

    /**
     * Get run history experiment name of the pipeline run. This information will be passed in the ExperimentName property of the published pipeline execution request. Type: string (or Expression with resultType string).
     *
     * @return the experimentName value
     */
    public Object experimentName() {
        return this.experimentName;
    }

    /**
     * Set run history experiment name of the pipeline run. This information will be passed in the ExperimentName property of the published pipeline execution request. Type: string (or Expression with resultType string).
     *
     * @param experimentName the experimentName value to set
     * @return the AzureMLExecutePipelineActivity object itself.
     */
    public AzureMLExecutePipelineActivity withExperimentName(Object experimentName) {
        this.experimentName = experimentName;
        return this;
    }

    /**
     * Get key,Value pairs to be passed to the published Azure ML pipeline endpoint. Keys must match the names of pipeline parameters defined in the published pipeline. Values will be passed in the ParameterAssignments property of the published pipeline execution request. Type: object with key value pairs (or Expression with resultType object).
     *
     * @return the mlPipelineParameters value
     */
    public Object mlPipelineParameters() {
        return this.mlPipelineParameters;
    }

    /**
     * Set key,Value pairs to be passed to the published Azure ML pipeline endpoint. Keys must match the names of pipeline parameters defined in the published pipeline. Values will be passed in the ParameterAssignments property of the published pipeline execution request. Type: object with key value pairs (or Expression with resultType object).
     *
     * @param mlPipelineParameters the mlPipelineParameters value to set
     * @return the AzureMLExecutePipelineActivity object itself.
     */
    public AzureMLExecutePipelineActivity withMlPipelineParameters(Object mlPipelineParameters) {
        this.mlPipelineParameters = mlPipelineParameters;
        return this;
    }

    /**
     * Get the parent Azure ML Service pipeline run id. This information will be passed in the ParentRunId property of the published pipeline execution request. Type: string (or Expression with resultType string).
     *
     * @return the mlParentRunId value
     */
    public Object mlParentRunId() {
        return this.mlParentRunId;
    }

    /**
     * Set the parent Azure ML Service pipeline run id. This information will be passed in the ParentRunId property of the published pipeline execution request. Type: string (or Expression with resultType string).
     *
     * @param mlParentRunId the mlParentRunId value to set
     * @return the AzureMLExecutePipelineActivity object itself.
     */
    public AzureMLExecutePipelineActivity withMlParentRunId(Object mlParentRunId) {
        this.mlParentRunId = mlParentRunId;
        return this;
    }

    /**
     * Get whether to continue execution of other steps in the PipelineRun if a step fails. This information will be passed in the continueOnStepFailure property of the published pipeline execution request. Type: boolean (or Expression with resultType boolean).
     *
     * @return the continueOnStepFailure value
     */
    public Object continueOnStepFailure() {
        return this.continueOnStepFailure;
    }

    /**
     * Set whether to continue execution of other steps in the PipelineRun if a step fails. This information will be passed in the continueOnStepFailure property of the published pipeline execution request. Type: boolean (or Expression with resultType boolean).
     *
     * @param continueOnStepFailure the continueOnStepFailure value to set
     * @return the AzureMLExecutePipelineActivity object itself.
     */
    public AzureMLExecutePipelineActivity withContinueOnStepFailure(Object continueOnStepFailure) {
        this.continueOnStepFailure = continueOnStepFailure;
        return this;
    }

}
