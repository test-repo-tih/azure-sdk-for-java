/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.datafactory.v2018_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.datafactory.v2018_06_01.IntegrationRuntimes;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.datafactory.v2018_06_01.IntegrationRuntimeStatusResponse;
import com.microsoft.azure.management.datafactory.v2018_06_01.IntegrationRuntimeConnectionInfo;
import com.microsoft.azure.management.datafactory.v2018_06_01.IntegrationRuntimeAuthKeys;
import com.microsoft.azure.management.datafactory.v2018_06_01.IntegrationRuntimeMonitoringData;
import com.microsoft.azure.management.datafactory.v2018_06_01.CreateLinkedIntegrationRuntimeRequest;
import com.microsoft.azure.management.datafactory.v2018_06_01.IntegrationRuntimeResource;

class IntegrationRuntimesImpl extends WrapperImpl<IntegrationRuntimesInner> implements IntegrationRuntimes {
    private final DataFactoryManager manager;

    IntegrationRuntimesImpl(DataFactoryManager manager) {
        super(manager.inner().integrationRuntimes());
        this.manager = manager;
    }

    public DataFactoryManager manager() {
        return this.manager;
    }

    @Override
    public IntegrationRuntimeResourceImpl define(String name) {
        return wrapModel(name);
    }

    private IntegrationRuntimeResourceImpl wrapModel(IntegrationRuntimeResourceInner inner) {
        return  new IntegrationRuntimeResourceImpl(inner, manager());
    }

    private IntegrationRuntimeResourceImpl wrapModel(String name) {
        return new IntegrationRuntimeResourceImpl(name, this.manager());
    }

    @Override
    public Observable<IntegrationRuntimeStatusResponse> getStatusAsync(String resourceGroupName, String factoryName, String integrationRuntimeName) {
        IntegrationRuntimesInner client = this.inner();
        return client.getStatusAsync(resourceGroupName, factoryName, integrationRuntimeName)
        .map(new Func1<IntegrationRuntimeStatusResponseInner, IntegrationRuntimeStatusResponse>() {
            @Override
            public IntegrationRuntimeStatusResponse call(IntegrationRuntimeStatusResponseInner inner) {
                return new IntegrationRuntimeStatusResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<IntegrationRuntimeConnectionInfo> getConnectionInfoAsync(String resourceGroupName, String factoryName, String integrationRuntimeName) {
        IntegrationRuntimesInner client = this.inner();
        return client.getConnectionInfoAsync(resourceGroupName, factoryName, integrationRuntimeName)
        .map(new Func1<IntegrationRuntimeConnectionInfoInner, IntegrationRuntimeConnectionInfo>() {
            @Override
            public IntegrationRuntimeConnectionInfo call(IntegrationRuntimeConnectionInfoInner inner) {
                return new IntegrationRuntimeConnectionInfoImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<IntegrationRuntimeAuthKeys> regenerateAuthKeyAsync(String resourceGroupName, String factoryName, String integrationRuntimeName) {
        IntegrationRuntimesInner client = this.inner();
        return client.regenerateAuthKeyAsync(resourceGroupName, factoryName, integrationRuntimeName)
        .map(new Func1<IntegrationRuntimeAuthKeysInner, IntegrationRuntimeAuthKeys>() {
            @Override
            public IntegrationRuntimeAuthKeys call(IntegrationRuntimeAuthKeysInner inner) {
                return new IntegrationRuntimeAuthKeysImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<IntegrationRuntimeAuthKeys> listAuthKeysAsync(String resourceGroupName, String factoryName, String integrationRuntimeName) {
        IntegrationRuntimesInner client = this.inner();
        return client.listAuthKeysAsync(resourceGroupName, factoryName, integrationRuntimeName)
        .map(new Func1<IntegrationRuntimeAuthKeysInner, IntegrationRuntimeAuthKeys>() {
            @Override
            public IntegrationRuntimeAuthKeys call(IntegrationRuntimeAuthKeysInner inner) {
                return new IntegrationRuntimeAuthKeysImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<IntegrationRuntimeStatusResponse> startAsync(String resourceGroupName, String factoryName, String integrationRuntimeName) {
        IntegrationRuntimesInner client = this.inner();
        return client.startAsync(resourceGroupName, factoryName, integrationRuntimeName)
        .map(new Func1<IntegrationRuntimeStatusResponseInner, IntegrationRuntimeStatusResponse>() {
            @Override
            public IntegrationRuntimeStatusResponse call(IntegrationRuntimeStatusResponseInner inner) {
                return new IntegrationRuntimeStatusResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable stopAsync(String resourceGroupName, String factoryName, String integrationRuntimeName) {
        IntegrationRuntimesInner client = this.inner();
        return client.stopAsync(resourceGroupName, factoryName, integrationRuntimeName).toCompletable();
    }

    @Override
    public Completable syncCredentialsAsync(String resourceGroupName, String factoryName, String integrationRuntimeName) {
        IntegrationRuntimesInner client = this.inner();
        return client.syncCredentialsAsync(resourceGroupName, factoryName, integrationRuntimeName).toCompletable();
    }

    @Override
    public Observable<IntegrationRuntimeMonitoringData> getMonitoringDataAsync(String resourceGroupName, String factoryName, String integrationRuntimeName) {
        IntegrationRuntimesInner client = this.inner();
        return client.getMonitoringDataAsync(resourceGroupName, factoryName, integrationRuntimeName)
        .map(new Func1<IntegrationRuntimeMonitoringDataInner, IntegrationRuntimeMonitoringData>() {
            @Override
            public IntegrationRuntimeMonitoringData call(IntegrationRuntimeMonitoringDataInner inner) {
                return new IntegrationRuntimeMonitoringDataImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable upgradeAsync(String resourceGroupName, String factoryName, String integrationRuntimeName) {
        IntegrationRuntimesInner client = this.inner();
        return client.upgradeAsync(resourceGroupName, factoryName, integrationRuntimeName).toCompletable();
    }

    @Override
    public Completable removeLinksAsync(String resourceGroupName, String factoryName, String integrationRuntimeName, String linkedFactoryName) {
        IntegrationRuntimesInner client = this.inner();
        return client.removeLinksAsync(resourceGroupName, factoryName, integrationRuntimeName, linkedFactoryName).toCompletable();
    }

    @Override
    public Observable<IntegrationRuntimeStatusResponse> createLinkedIntegrationRuntimeAsync(String resourceGroupName, String factoryName, String integrationRuntimeName, CreateLinkedIntegrationRuntimeRequest createLinkedIntegrationRuntimeRequest) {
        IntegrationRuntimesInner client = this.inner();
        return client.createLinkedIntegrationRuntimeAsync(resourceGroupName, factoryName, integrationRuntimeName, createLinkedIntegrationRuntimeRequest)
        .map(new Func1<IntegrationRuntimeStatusResponseInner, IntegrationRuntimeStatusResponse>() {
            @Override
            public IntegrationRuntimeStatusResponse call(IntegrationRuntimeStatusResponseInner inner) {
                return new IntegrationRuntimeStatusResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<IntegrationRuntimeResource> listByFactoryAsync(final String resourceGroupName, final String factoryName) {
        IntegrationRuntimesInner client = this.inner();
        return client.listByFactoryAsync(resourceGroupName, factoryName)
        .flatMapIterable(new Func1<Page<IntegrationRuntimeResourceInner>, Iterable<IntegrationRuntimeResourceInner>>() {
            @Override
            public Iterable<IntegrationRuntimeResourceInner> call(Page<IntegrationRuntimeResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<IntegrationRuntimeResourceInner, IntegrationRuntimeResource>() {
            @Override
            public IntegrationRuntimeResource call(IntegrationRuntimeResourceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<IntegrationRuntimeResource> getAsync(String resourceGroupName, String factoryName, String integrationRuntimeName) {
        IntegrationRuntimesInner client = this.inner();
        return client.getAsync(resourceGroupName, factoryName, integrationRuntimeName)
        .flatMap(new Func1<IntegrationRuntimeResourceInner, Observable<IntegrationRuntimeResource>>() {
            @Override
            public Observable<IntegrationRuntimeResource> call(IntegrationRuntimeResourceInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((IntegrationRuntimeResource)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String factoryName, String integrationRuntimeName) {
        IntegrationRuntimesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, factoryName, integrationRuntimeName).toCompletable();
    }

}
