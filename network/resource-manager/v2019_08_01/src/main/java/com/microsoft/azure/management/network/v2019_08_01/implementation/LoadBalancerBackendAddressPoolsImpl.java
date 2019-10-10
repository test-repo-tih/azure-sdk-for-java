/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.network.v2019_08_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2019_08_01.LoadBalancerBackendAddressPools;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.network.v2019_08_01.BackendAddressPool;

class LoadBalancerBackendAddressPoolsImpl extends WrapperImpl<LoadBalancerBackendAddressPoolsInner> implements LoadBalancerBackendAddressPools {
    private final NetworkManager manager;

    LoadBalancerBackendAddressPoolsImpl(NetworkManager manager) {
        super(manager.inner().loadBalancerBackendAddressPools());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    private BackendAddressPoolImpl wrapModel(BackendAddressPoolInner inner) {
        return  new BackendAddressPoolImpl(inner, manager());
    }

    @Override
    public Observable<BackendAddressPool> listAsync(final String resourceGroupName, final String loadBalancerName) {
        LoadBalancerBackendAddressPoolsInner client = this.inner();
        return client.listAsync(resourceGroupName, loadBalancerName)
        .flatMapIterable(new Func1<Page<BackendAddressPoolInner>, Iterable<BackendAddressPoolInner>>() {
            @Override
            public Iterable<BackendAddressPoolInner> call(Page<BackendAddressPoolInner> page) {
                return page.items();
            }
        })
        .map(new Func1<BackendAddressPoolInner, BackendAddressPool>() {
            @Override
            public BackendAddressPool call(BackendAddressPoolInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<BackendAddressPool> getAsync(String resourceGroupName, String loadBalancerName, String backendAddressPoolName) {
        LoadBalancerBackendAddressPoolsInner client = this.inner();
        return client.getAsync(resourceGroupName, loadBalancerName, backendAddressPoolName)
        .map(new Func1<BackendAddressPoolInner, BackendAddressPool>() {
            @Override
            public BackendAddressPool call(BackendAddressPoolInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
