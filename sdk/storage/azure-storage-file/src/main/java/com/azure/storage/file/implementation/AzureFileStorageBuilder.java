// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.implementation;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpPipeline;
import com.azure.core.implementation.RestProxy;

/**
 * A builder for creating a new instance of the AzureFileStorage type.
 */
@ServiceClientBuilder(serviceClients = AzureFileStorageImpl.class)
public final class AzureFileStorageBuilder {
    /*
     * Specifies the version of the operation to use for this request.
     */
    private String version;

    /**
     * Sets Specifies the version of the operation to use for this request.
     *
     * @param version the version value.
     * @return the AzureFileStorageBuilder.
     */
    public AzureFileStorageBuilder version(String version) {
        this.version = version;
        return this;
    }

    /*
     * The URL of the service account, share, directory or file that is the target of the desired operation.
     */
    private String url;

    /**
     * Sets The URL of the service account, share, directory or file that is the target of the desired operation.
     *
     * @param url the url value.
     * @return the AzureFileStorageBuilder.
     */
    public AzureFileStorageBuilder url(String url) {
        this.url = url;
        return this;
    }

    /*
     * The HTTP pipeline to send requests through
     */
    private HttpPipeline pipeline;

    /**
     * Sets The HTTP pipeline to send requests through.
     *
     * @param pipeline the pipeline value.
     * @return the AzureFileStorageBuilder.
     */
    public AzureFileStorageBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * Builds an instance of AzureFileStorageImpl with the provided parameters.
     *
     * @return an instance of AzureFileStorageImpl.
     */
    public AzureFileStorageImpl build() {
        if (pipeline == null) {
            this.pipeline = RestProxy.createDefaultPipeline();
        }
        AzureFileStorageImpl client = new AzureFileStorageImpl(pipeline);
        if (this.version != null) {
            client.setVersion(this.version);
        } else {
            client.setVersion("2019-02-02");
        }
        if (this.url != null) {
            client.setUrl(this.url);
        }
        return client;
    }
}
