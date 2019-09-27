/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.network.v2019_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2019_06_01.ExpressRouteCrossConnectionPeerings;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.network.v2019_06_01.ExpressRouteCrossConnectionPeering;

class ExpressRouteCrossConnectionPeeringsImpl extends WrapperImpl<ExpressRouteCrossConnectionPeeringsInner> implements ExpressRouteCrossConnectionPeerings {
    private final NetworkManager manager;

    ExpressRouteCrossConnectionPeeringsImpl(NetworkManager manager) {
        super(manager.inner().expressRouteCrossConnectionPeerings());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public ExpressRouteCrossConnectionPeeringImpl define(String name) {
        return wrapModel(name);
    }

    private ExpressRouteCrossConnectionPeeringImpl wrapModel(ExpressRouteCrossConnectionPeeringInner inner) {
        return  new ExpressRouteCrossConnectionPeeringImpl(inner, manager());
    }

    private ExpressRouteCrossConnectionPeeringImpl wrapModel(String name) {
        return new ExpressRouteCrossConnectionPeeringImpl(name, this.manager());
    }

    @Override
    public Observable<ExpressRouteCrossConnectionPeering> listAsync(final String resourceGroupName, final String crossConnectionName) {
        ExpressRouteCrossConnectionPeeringsInner client = this.inner();
        return client.listAsync(resourceGroupName, crossConnectionName)
        .flatMapIterable(new Func1<Page<ExpressRouteCrossConnectionPeeringInner>, Iterable<ExpressRouteCrossConnectionPeeringInner>>() {
            @Override
            public Iterable<ExpressRouteCrossConnectionPeeringInner> call(Page<ExpressRouteCrossConnectionPeeringInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ExpressRouteCrossConnectionPeeringInner, ExpressRouteCrossConnectionPeering>() {
            @Override
            public ExpressRouteCrossConnectionPeering call(ExpressRouteCrossConnectionPeeringInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ExpressRouteCrossConnectionPeering> getAsync(String resourceGroupName, String crossConnectionName, String peeringName) {
        ExpressRouteCrossConnectionPeeringsInner client = this.inner();
        return client.getAsync(resourceGroupName, crossConnectionName, peeringName)
        .map(new Func1<ExpressRouteCrossConnectionPeeringInner, ExpressRouteCrossConnectionPeering>() {
            @Override
            public ExpressRouteCrossConnectionPeering call(ExpressRouteCrossConnectionPeeringInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String crossConnectionName, String peeringName) {
        ExpressRouteCrossConnectionPeeringsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, crossConnectionName, peeringName).toCompletable();
    }

}
