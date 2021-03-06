// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.AzureEnvironment;

/** A builder for creating a new instance of the MonitorClientImpl type. */
@ServiceClientBuilder(serviceClients = {MonitorClientImpl.class})
public final class MonitorClientBuilder {
    /*
     * The Azure subscription Id.
     */
    private String subscriptionId;

    /**
     * Sets The Azure subscription Id.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the MonitorClientBuilder.
     */
    public MonitorClientBuilder subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /*
     * server parameter
     */
    private String host;

    /**
     * Sets server parameter.
     *
     * @param host the host value.
     * @return the MonitorClientBuilder.
     */
    public MonitorClientBuilder host(String host) {
        this.host = host;
        return this;
    }

    /*
     * The environment to connect to
     */
    private AzureEnvironment environment;

    /**
     * Sets The environment to connect to.
     *
     * @param environment the environment value.
     * @return the MonitorClientBuilder.
     */
    public MonitorClientBuilder environment(AzureEnvironment environment) {
        this.environment = environment;
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
     * @return the MonitorClientBuilder.
     */
    public MonitorClientBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * Builds an instance of MonitorClientImpl with the provided parameters.
     *
     * @return an instance of MonitorClientImpl.
     */
    public MonitorClientImpl buildClient() {
        if (host == null) {
            this.host = "https://management.azure.com";
        }
        if (environment == null) {
            this.environment = AzureEnvironment.AZURE;
        }
        if (pipeline == null) {
            this.pipeline =
                new HttpPipelineBuilder()
                    .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                    .build();
        }
        MonitorClientImpl client = new MonitorClientImpl(pipeline, environment);
        client.setSubscriptionId(this.subscriptionId);
        client.setHost(this.host);
        return client;
    }
}
