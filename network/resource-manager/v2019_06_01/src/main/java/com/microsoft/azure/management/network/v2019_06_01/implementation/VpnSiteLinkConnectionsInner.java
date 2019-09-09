/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_06_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.network.v2019_06_01.ErrorException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;
import rx.functions.Func1;

/**
 * An instance of this class provides access to all the operations defined
 * in VpnSiteLinkConnections.
 */
public class VpnSiteLinkConnectionsInner {
    /** The Retrofit service to perform REST calls. */
    private VpnSiteLinkConnectionsService service;
    /** The service client containing this operation class. */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of VpnSiteLinkConnectionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public VpnSiteLinkConnectionsInner(Retrofit retrofit, NetworkManagementClientImpl client) {
        this.service = retrofit.create(VpnSiteLinkConnectionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for VpnSiteLinkConnections to be
     * used by Retrofit to perform actually REST calls.
     */
    interface VpnSiteLinkConnectionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2019_06_01.VpnSiteLinkConnections get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/vpnGateways/{gatewayName}/vpnConnections/{connectionName}/vpnLinkConnections/{linkConnectionName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("gatewayName") String gatewayName, @Path("connectionName") String connectionName, @Path("linkConnectionName") String linkConnectionName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Retrieves the details of a vpn site link connection.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @param linkConnectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VpnSiteLinkConnectionInner object if successful.
     */
    public VpnSiteLinkConnectionInner get(String resourceGroupName, String gatewayName, String connectionName, String linkConnectionName) {
        return getWithServiceResponseAsync(resourceGroupName, gatewayName, connectionName, linkConnectionName).toBlocking().single().body();
    }

    /**
     * Retrieves the details of a vpn site link connection.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @param linkConnectionName The name of the vpn connection.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VpnSiteLinkConnectionInner> getAsync(String resourceGroupName, String gatewayName, String connectionName, String linkConnectionName, final ServiceCallback<VpnSiteLinkConnectionInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, gatewayName, connectionName, linkConnectionName), serviceCallback);
    }

    /**
     * Retrieves the details of a vpn site link connection.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @param linkConnectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpnSiteLinkConnectionInner object
     */
    public Observable<VpnSiteLinkConnectionInner> getAsync(String resourceGroupName, String gatewayName, String connectionName, String linkConnectionName) {
        return getWithServiceResponseAsync(resourceGroupName, gatewayName, connectionName, linkConnectionName).map(new Func1<ServiceResponse<VpnSiteLinkConnectionInner>, VpnSiteLinkConnectionInner>() {
            @Override
            public VpnSiteLinkConnectionInner call(ServiceResponse<VpnSiteLinkConnectionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Retrieves the details of a vpn site link connection.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @param linkConnectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpnSiteLinkConnectionInner object
     */
    public Observable<ServiceResponse<VpnSiteLinkConnectionInner>> getWithServiceResponseAsync(String resourceGroupName, String gatewayName, String connectionName, String linkConnectionName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (gatewayName == null) {
            throw new IllegalArgumentException("Parameter gatewayName is required and cannot be null.");
        }
        if (connectionName == null) {
            throw new IllegalArgumentException("Parameter connectionName is required and cannot be null.");
        }
        if (linkConnectionName == null) {
            throw new IllegalArgumentException("Parameter linkConnectionName is required and cannot be null.");
        }
        final String apiVersion = "2019-06-01";
        return service.get(this.client.subscriptionId(), resourceGroupName, gatewayName, connectionName, linkConnectionName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VpnSiteLinkConnectionInner>>>() {
                @Override
                public Observable<ServiceResponse<VpnSiteLinkConnectionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<VpnSiteLinkConnectionInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<VpnSiteLinkConnectionInner> getDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<VpnSiteLinkConnectionInner, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<VpnSiteLinkConnectionInner>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
