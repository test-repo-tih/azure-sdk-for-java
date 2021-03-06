// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DiagnosticSettingsCategorys. */
public final class DiagnosticSettingsCategorysInner {
    private final ClientLogger logger = new ClientLogger(DiagnosticSettingsCategorysInner.class);

    /** The proxy service used to perform REST calls. */
    private final DiagnosticSettingsCategorysService service;

    /** The service client containing this operation class. */
    private final MonitorClientImpl client;

    /**
     * Initializes an instance of DiagnosticSettingsCategorysInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    DiagnosticSettingsCategorysInner(MonitorClientImpl client) {
        this.service =
            RestProxy
                .create(
                    DiagnosticSettingsCategorysService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MonitorClientDiagnosticSettingsCategorys to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MonitorClientDiagnos")
    private interface DiagnosticSettingsCategorysService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("/{resourceUri}/providers/microsoft.insights/diagnosticSettingsCategories/{name}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<DiagnosticSettingsCategoryResourceInner>> get(
            @HostParam("$host") String host,
            @PathParam(value = "resourceUri", encoded = true) String resourceUri,
            @QueryParam("api-version") String apiVersion,
            @PathParam("name") String name,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("/{resourceUri}/providers/microsoft.insights/diagnosticSettingsCategories")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<DiagnosticSettingsCategoryResourceCollectionInner>> list(
            @HostParam("$host") String host,
            @PathParam(value = "resourceUri", encoded = true) String resourceUri,
            @QueryParam("api-version") String apiVersion,
            Context context);
    }

    /**
     * Gets the diagnostic settings category for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the diagnostic settings category for the specified resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<DiagnosticSettingsCategoryResourceInner>> getWithResponseAsync(
        String resourceUri, String name) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        final String apiVersion = "2017-05-01-preview";
        return FluxUtil
            .withContext(context -> service.get(this.client.getHost(), resourceUri, apiVersion, name, context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets the diagnostic settings category for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the diagnostic settings category for the specified resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<DiagnosticSettingsCategoryResourceInner>> getWithResponseAsync(
        String resourceUri, String name, Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        final String apiVersion = "2017-05-01-preview";
        return service.get(this.client.getHost(), resourceUri, apiVersion, name, context);
    }

    /**
     * Gets the diagnostic settings category for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the diagnostic settings category for the specified resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DiagnosticSettingsCategoryResourceInner> getAsync(String resourceUri, String name) {
        return getWithResponseAsync(resourceUri, name)
            .flatMap(
                (SimpleResponse<DiagnosticSettingsCategoryResourceInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the diagnostic settings category for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the diagnostic settings category for the specified resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DiagnosticSettingsCategoryResourceInner get(String resourceUri, String name) {
        return getAsync(resourceUri, name).block();
    }

    /**
     * Lists the diagnostic settings categories for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of diagnostic setting category resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<DiagnosticSettingsCategoryResourceCollectionInner>> listWithResponseAsync(
        String resourceUri) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        final String apiVersion = "2017-05-01-preview";
        return FluxUtil
            .withContext(context -> service.list(this.client.getHost(), resourceUri, apiVersion, context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Lists the diagnostic settings categories for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of diagnostic setting category resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<DiagnosticSettingsCategoryResourceCollectionInner>> listWithResponseAsync(
        String resourceUri, Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        final String apiVersion = "2017-05-01-preview";
        return service.list(this.client.getHost(), resourceUri, apiVersion, context);
    }

    /**
     * Lists the diagnostic settings categories for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of diagnostic setting category resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DiagnosticSettingsCategoryResourceCollectionInner> listAsync(String resourceUri) {
        return listWithResponseAsync(resourceUri)
            .flatMap(
                (SimpleResponse<DiagnosticSettingsCategoryResourceCollectionInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Lists the diagnostic settings categories for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of diagnostic setting category resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DiagnosticSettingsCategoryResourceCollectionInner list(String resourceUri) {
        return listAsync(resourceUri).block();
    }
}
