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
import com.microsoft.azure.CloudException;
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
 * in ServiceTags.
 */
public class ServiceTagsInner {
    /** The Retrofit service to perform REST calls. */
    private ServiceTagsService service;
    /** The service client containing this operation class. */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of ServiceTagsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ServiceTagsInner(Retrofit retrofit, NetworkManagementClientImpl client) {
        this.service = retrofit.create(ServiceTagsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ServiceTags to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ServiceTagsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2019_06_01.ServiceTags list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Network/locations/{location}/serviceTags")
        Observable<Response<ResponseBody>> list(@Path("location") String location, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets a list of service tag information resources.
     *
     * @param location The location that will be used as a reference for version (not as a filter based on location, you will get the list of service tags with prefix details across all regions but limited to the cloud that your subscription belongs to).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServiceTagsListResultInner object if successful.
     */
    public ServiceTagsListResultInner list(String location) {
        return listWithServiceResponseAsync(location).toBlocking().single().body();
    }

    /**
     * Gets a list of service tag information resources.
     *
     * @param location The location that will be used as a reference for version (not as a filter based on location, you will get the list of service tags with prefix details across all regions but limited to the cloud that your subscription belongs to).
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServiceTagsListResultInner> listAsync(String location, final ServiceCallback<ServiceTagsListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(location), serviceCallback);
    }

    /**
     * Gets a list of service tag information resources.
     *
     * @param location The location that will be used as a reference for version (not as a filter based on location, you will get the list of service tags with prefix details across all regions but limited to the cloud that your subscription belongs to).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServiceTagsListResultInner object
     */
    public Observable<ServiceTagsListResultInner> listAsync(String location) {
        return listWithServiceResponseAsync(location).map(new Func1<ServiceResponse<ServiceTagsListResultInner>, ServiceTagsListResultInner>() {
            @Override
            public ServiceTagsListResultInner call(ServiceResponse<ServiceTagsListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a list of service tag information resources.
     *
     * @param location The location that will be used as a reference for version (not as a filter based on location, you will get the list of service tags with prefix details across all regions but limited to the cloud that your subscription belongs to).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServiceTagsListResultInner object
     */
    public Observable<ServiceResponse<ServiceTagsListResultInner>> listWithServiceResponseAsync(String location) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2019-06-01";
        return service.list(location, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ServiceTagsListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<ServiceTagsListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ServiceTagsListResultInner> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ServiceTagsListResultInner> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ServiceTagsListResultInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ServiceTagsListResultInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
