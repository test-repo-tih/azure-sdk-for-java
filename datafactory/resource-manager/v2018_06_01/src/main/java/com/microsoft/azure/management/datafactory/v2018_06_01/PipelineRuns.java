/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import rx.Observable;
import rx.Completable;
import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.PipelineRunsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing PipelineRuns.
 */
public interface PipelineRuns extends HasInner<PipelineRunsInner> {
    /**
     * Cancel a pipeline run by its run ID.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param runId The pipeline run identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable cancelAsync(String resourceGroupName, String factoryName, String runId);

    /**
     * Get a pipeline run by its run ID.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param runId The pipeline run identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PipelineRun> getAsync(String resourceGroupName, String factoryName, String runId);

    /**
     * Query pipeline runs in the factory based on input filter conditions.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param filterParameters Parameters to filter the pipeline run.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PipelineRunsQueryResponse> queryByFactoryAsync(String resourceGroupName, String factoryName, RunFilterParameters filterParameters);

}
