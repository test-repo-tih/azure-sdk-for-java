/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ManagedServerSecurityAlertPolicies.
 */
public class ManagedServerSecurityAlertPoliciesInner {
    /** The Retrofit service to perform REST calls. */
    private ManagedServerSecurityAlertPoliciesService service;
    /** The service client containing this operation class. */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of ManagedServerSecurityAlertPoliciesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ManagedServerSecurityAlertPoliciesInner(Retrofit retrofit, SqlManagementClientImpl client) {
        this.service = retrofit.create(ManagedServerSecurityAlertPoliciesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ManagedServerSecurityAlertPolicies to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ManagedServerSecurityAlertPoliciesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2017_03_01_preview.ManagedServerSecurityAlertPolicies get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}/securityAlertPolicies/{securityAlertPolicyName}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("managedInstanceName") String managedInstanceName, @Path("securityAlertPolicyName") String securityAlertPolicyName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2017_03_01_preview.ManagedServerSecurityAlertPolicies createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}/securityAlertPolicies/{securityAlertPolicyName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("managedInstanceName") String managedInstanceName, @Path("securityAlertPolicyName") String securityAlertPolicyName, @Path("subscriptionId") String subscriptionId, @Body ManagedServerSecurityAlertPolicyInner parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2017_03_01_preview.ManagedServerSecurityAlertPolicies beginCreateOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}/securityAlertPolicies/{securityAlertPolicyName}")
        Observable<Response<ResponseBody>> beginCreateOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("managedInstanceName") String managedInstanceName, @Path("securityAlertPolicyName") String securityAlertPolicyName, @Path("subscriptionId") String subscriptionId, @Body ManagedServerSecurityAlertPolicyInner parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2017_03_01_preview.ManagedServerSecurityAlertPolicies listByInstance" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}/securityAlertPolicies")
        Observable<Response<ResponseBody>> listByInstance(@Path("resourceGroupName") String resourceGroupName, @Path("managedInstanceName") String managedInstanceName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2017_03_01_preview.ManagedServerSecurityAlertPolicies listByInstanceNext" })
        @GET
        Observable<Response<ResponseBody>> listByInstanceNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Get a managed server's threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ManagedServerSecurityAlertPolicyInner object if successful.
     */
    public ManagedServerSecurityAlertPolicyInner get(String resourceGroupName, String managedInstanceName) {
        return getWithServiceResponseAsync(resourceGroupName, managedInstanceName).toBlocking().single().body();
    }

    /**
     * Get a managed server's threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ManagedServerSecurityAlertPolicyInner> getAsync(String resourceGroupName, String managedInstanceName, final ServiceCallback<ManagedServerSecurityAlertPolicyInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, managedInstanceName), serviceCallback);
    }

    /**
     * Get a managed server's threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ManagedServerSecurityAlertPolicyInner object
     */
    public Observable<ManagedServerSecurityAlertPolicyInner> getAsync(String resourceGroupName, String managedInstanceName) {
        return getWithServiceResponseAsync(resourceGroupName, managedInstanceName).map(new Func1<ServiceResponse<ManagedServerSecurityAlertPolicyInner>, ManagedServerSecurityAlertPolicyInner>() {
            @Override
            public ManagedServerSecurityAlertPolicyInner call(ServiceResponse<ManagedServerSecurityAlertPolicyInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get a managed server's threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ManagedServerSecurityAlertPolicyInner object
     */
    public Observable<ServiceResponse<ManagedServerSecurityAlertPolicyInner>> getWithServiceResponseAsync(String resourceGroupName, String managedInstanceName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (managedInstanceName == null) {
            throw new IllegalArgumentException("Parameter managedInstanceName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String securityAlertPolicyName = "Default";
        return service.get(resourceGroupName, managedInstanceName, securityAlertPolicyName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ManagedServerSecurityAlertPolicyInner>>>() {
                @Override
                public Observable<ServiceResponse<ManagedServerSecurityAlertPolicyInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ManagedServerSecurityAlertPolicyInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ManagedServerSecurityAlertPolicyInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ManagedServerSecurityAlertPolicyInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ManagedServerSecurityAlertPolicyInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Creates or updates a threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param parameters The managed server security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ManagedServerSecurityAlertPolicyInner object if successful.
     */
    public ManagedServerSecurityAlertPolicyInner createOrUpdate(String resourceGroupName, String managedInstanceName, ManagedServerSecurityAlertPolicyInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, managedInstanceName, parameters).toBlocking().last().body();
    }

    /**
     * Creates or updates a threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param parameters The managed server security alert policy.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ManagedServerSecurityAlertPolicyInner> createOrUpdateAsync(String resourceGroupName, String managedInstanceName, ManagedServerSecurityAlertPolicyInner parameters, final ServiceCallback<ManagedServerSecurityAlertPolicyInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, managedInstanceName, parameters), serviceCallback);
    }

    /**
     * Creates or updates a threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param parameters The managed server security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ManagedServerSecurityAlertPolicyInner> createOrUpdateAsync(String resourceGroupName, String managedInstanceName, ManagedServerSecurityAlertPolicyInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, managedInstanceName, parameters).map(new Func1<ServiceResponse<ManagedServerSecurityAlertPolicyInner>, ManagedServerSecurityAlertPolicyInner>() {
            @Override
            public ManagedServerSecurityAlertPolicyInner call(ServiceResponse<ManagedServerSecurityAlertPolicyInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or updates a threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param parameters The managed server security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<ManagedServerSecurityAlertPolicyInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String managedInstanceName, ManagedServerSecurityAlertPolicyInner parameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (managedInstanceName == null) {
            throw new IllegalArgumentException("Parameter managedInstanceName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String securityAlertPolicyName = "Default";
        Observable<Response<ResponseBody>> observable = service.createOrUpdate(resourceGroupName, managedInstanceName, securityAlertPolicyName, this.client.subscriptionId(), parameters, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPutOrPatchResultAsync(observable, new TypeToken<ManagedServerSecurityAlertPolicyInner>() { }.getType());
    }

    /**
     * Creates or updates a threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param parameters The managed server security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ManagedServerSecurityAlertPolicyInner object if successful.
     */
    public ManagedServerSecurityAlertPolicyInner beginCreateOrUpdate(String resourceGroupName, String managedInstanceName, ManagedServerSecurityAlertPolicyInner parameters) {
        return beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, managedInstanceName, parameters).toBlocking().single().body();
    }

    /**
     * Creates or updates a threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param parameters The managed server security alert policy.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ManagedServerSecurityAlertPolicyInner> beginCreateOrUpdateAsync(String resourceGroupName, String managedInstanceName, ManagedServerSecurityAlertPolicyInner parameters, final ServiceCallback<ManagedServerSecurityAlertPolicyInner> serviceCallback) {
        return ServiceFuture.fromResponse(beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, managedInstanceName, parameters), serviceCallback);
    }

    /**
     * Creates or updates a threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param parameters The managed server security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ManagedServerSecurityAlertPolicyInner object
     */
    public Observable<ManagedServerSecurityAlertPolicyInner> beginCreateOrUpdateAsync(String resourceGroupName, String managedInstanceName, ManagedServerSecurityAlertPolicyInner parameters) {
        return beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, managedInstanceName, parameters).map(new Func1<ServiceResponse<ManagedServerSecurityAlertPolicyInner>, ManagedServerSecurityAlertPolicyInner>() {
            @Override
            public ManagedServerSecurityAlertPolicyInner call(ServiceResponse<ManagedServerSecurityAlertPolicyInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or updates a threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param parameters The managed server security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ManagedServerSecurityAlertPolicyInner object
     */
    public Observable<ServiceResponse<ManagedServerSecurityAlertPolicyInner>> beginCreateOrUpdateWithServiceResponseAsync(String resourceGroupName, String managedInstanceName, ManagedServerSecurityAlertPolicyInner parameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (managedInstanceName == null) {
            throw new IllegalArgumentException("Parameter managedInstanceName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String securityAlertPolicyName = "Default";
        return service.beginCreateOrUpdate(resourceGroupName, managedInstanceName, securityAlertPolicyName, this.client.subscriptionId(), parameters, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ManagedServerSecurityAlertPolicyInner>>>() {
                @Override
                public Observable<ServiceResponse<ManagedServerSecurityAlertPolicyInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ManagedServerSecurityAlertPolicyInner> clientResponse = beginCreateOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ManagedServerSecurityAlertPolicyInner> beginCreateOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ManagedServerSecurityAlertPolicyInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ManagedServerSecurityAlertPolicyInner>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Get the managed server's threat detection policies.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ManagedServerSecurityAlertPolicyInner&gt; object if successful.
     */
    public PagedList<ManagedServerSecurityAlertPolicyInner> listByInstance(final String resourceGroupName, final String managedInstanceName) {
        ServiceResponse<Page<ManagedServerSecurityAlertPolicyInner>> response = listByInstanceSinglePageAsync(resourceGroupName, managedInstanceName).toBlocking().single();
        return new PagedList<ManagedServerSecurityAlertPolicyInner>(response.body()) {
            @Override
            public Page<ManagedServerSecurityAlertPolicyInner> nextPage(String nextPageLink) {
                return listByInstanceNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Get the managed server's threat detection policies.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ManagedServerSecurityAlertPolicyInner>> listByInstanceAsync(final String resourceGroupName, final String managedInstanceName, final ListOperationCallback<ManagedServerSecurityAlertPolicyInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByInstanceSinglePageAsync(resourceGroupName, managedInstanceName),
            new Func1<String, Observable<ServiceResponse<Page<ManagedServerSecurityAlertPolicyInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ManagedServerSecurityAlertPolicyInner>>> call(String nextPageLink) {
                    return listByInstanceNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Get the managed server's threat detection policies.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ManagedServerSecurityAlertPolicyInner&gt; object
     */
    public Observable<Page<ManagedServerSecurityAlertPolicyInner>> listByInstanceAsync(final String resourceGroupName, final String managedInstanceName) {
        return listByInstanceWithServiceResponseAsync(resourceGroupName, managedInstanceName)
            .map(new Func1<ServiceResponse<Page<ManagedServerSecurityAlertPolicyInner>>, Page<ManagedServerSecurityAlertPolicyInner>>() {
                @Override
                public Page<ManagedServerSecurityAlertPolicyInner> call(ServiceResponse<Page<ManagedServerSecurityAlertPolicyInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Get the managed server's threat detection policies.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ManagedServerSecurityAlertPolicyInner&gt; object
     */
    public Observable<ServiceResponse<Page<ManagedServerSecurityAlertPolicyInner>>> listByInstanceWithServiceResponseAsync(final String resourceGroupName, final String managedInstanceName) {
        return listByInstanceSinglePageAsync(resourceGroupName, managedInstanceName)
            .concatMap(new Func1<ServiceResponse<Page<ManagedServerSecurityAlertPolicyInner>>, Observable<ServiceResponse<Page<ManagedServerSecurityAlertPolicyInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ManagedServerSecurityAlertPolicyInner>>> call(ServiceResponse<Page<ManagedServerSecurityAlertPolicyInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByInstanceNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Get the managed server's threat detection policies.
     *
    ServiceResponse<PageImpl<ManagedServerSecurityAlertPolicyInner>> * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
    ServiceResponse<PageImpl<ManagedServerSecurityAlertPolicyInner>> * @param managedInstanceName The name of the managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ManagedServerSecurityAlertPolicyInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ManagedServerSecurityAlertPolicyInner>>> listByInstanceSinglePageAsync(final String resourceGroupName, final String managedInstanceName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (managedInstanceName == null) {
            throw new IllegalArgumentException("Parameter managedInstanceName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByInstance(resourceGroupName, managedInstanceName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ManagedServerSecurityAlertPolicyInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ManagedServerSecurityAlertPolicyInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ManagedServerSecurityAlertPolicyInner>> result = listByInstanceDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ManagedServerSecurityAlertPolicyInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ManagedServerSecurityAlertPolicyInner>> listByInstanceDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ManagedServerSecurityAlertPolicyInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ManagedServerSecurityAlertPolicyInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Get the managed server's threat detection policies.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ManagedServerSecurityAlertPolicyInner&gt; object if successful.
     */
    public PagedList<ManagedServerSecurityAlertPolicyInner> listByInstanceNext(final String nextPageLink) {
        ServiceResponse<Page<ManagedServerSecurityAlertPolicyInner>> response = listByInstanceNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<ManagedServerSecurityAlertPolicyInner>(response.body()) {
            @Override
            public Page<ManagedServerSecurityAlertPolicyInner> nextPage(String nextPageLink) {
                return listByInstanceNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Get the managed server's threat detection policies.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ManagedServerSecurityAlertPolicyInner>> listByInstanceNextAsync(final String nextPageLink, final ServiceFuture<List<ManagedServerSecurityAlertPolicyInner>> serviceFuture, final ListOperationCallback<ManagedServerSecurityAlertPolicyInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByInstanceNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<ManagedServerSecurityAlertPolicyInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ManagedServerSecurityAlertPolicyInner>>> call(String nextPageLink) {
                    return listByInstanceNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Get the managed server's threat detection policies.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ManagedServerSecurityAlertPolicyInner&gt; object
     */
    public Observable<Page<ManagedServerSecurityAlertPolicyInner>> listByInstanceNextAsync(final String nextPageLink) {
        return listByInstanceNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<ManagedServerSecurityAlertPolicyInner>>, Page<ManagedServerSecurityAlertPolicyInner>>() {
                @Override
                public Page<ManagedServerSecurityAlertPolicyInner> call(ServiceResponse<Page<ManagedServerSecurityAlertPolicyInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Get the managed server's threat detection policies.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ManagedServerSecurityAlertPolicyInner&gt; object
     */
    public Observable<ServiceResponse<Page<ManagedServerSecurityAlertPolicyInner>>> listByInstanceNextWithServiceResponseAsync(final String nextPageLink) {
        return listByInstanceNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<ManagedServerSecurityAlertPolicyInner>>, Observable<ServiceResponse<Page<ManagedServerSecurityAlertPolicyInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ManagedServerSecurityAlertPolicyInner>>> call(ServiceResponse<Page<ManagedServerSecurityAlertPolicyInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByInstanceNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Get the managed server's threat detection policies.
     *
    ServiceResponse<PageImpl<ManagedServerSecurityAlertPolicyInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ManagedServerSecurityAlertPolicyInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ManagedServerSecurityAlertPolicyInner>>> listByInstanceNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByInstanceNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ManagedServerSecurityAlertPolicyInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ManagedServerSecurityAlertPolicyInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ManagedServerSecurityAlertPolicyInner>> result = listByInstanceNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ManagedServerSecurityAlertPolicyInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ManagedServerSecurityAlertPolicyInner>> listByInstanceNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ManagedServerSecurityAlertPolicyInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ManagedServerSecurityAlertPolicyInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
