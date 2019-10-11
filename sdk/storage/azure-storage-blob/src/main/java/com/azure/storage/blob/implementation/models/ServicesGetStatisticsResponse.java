// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.storage.blob.models.StorageServiceStats;

/**
 * Contains all response data for the getStatistics operation.
 */
public final class ServicesGetStatisticsResponse extends ResponseBase<ServiceGetStatisticsHeaders, StorageServiceStats> {
    /**
     * Creates an instance of ServicesGetStatisticsResponse.
     *
     * @param request the request which resulted in this ServicesGetStatisticsResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public ServicesGetStatisticsResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, StorageServiceStats value, ServiceGetStatisticsHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * @return the deserialized response body.
     */
    @Override
    public StorageServiceStats getValue() {
        return super.getValue();
    }
}
