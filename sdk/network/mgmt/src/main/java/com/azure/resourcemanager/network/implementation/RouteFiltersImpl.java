// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.resourcemanager.network.implementation;

import com.azure.resourcemanager.network.RouteFilter;
import com.azure.resourcemanager.network.RouteFilters;
import com.azure.resourcemanager.network.models.RouteFilterInner;
import com.azure.resourcemanager.network.models.RouteFiltersInner;
import com.azure.resourcemanager.resources.fluentcore.arm.collection.implementation.TopLevelModifiableResourcesImpl;

/** Implementation for RouteFilters. */
class RouteFiltersImpl
    extends TopLevelModifiableResourcesImpl<
        RouteFilter, RouteFilterImpl, RouteFilterInner, RouteFiltersInner, NetworkManager>
    implements RouteFilters {

    RouteFiltersImpl(final NetworkManager networkManager) {
        super(networkManager.inner().routeFilters(), networkManager);
    }

    @Override
    public RouteFilterImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected RouteFilterImpl wrapModel(String name) {
        RouteFilterInner inner = new RouteFilterInner();
        return new RouteFilterImpl(name, inner, super.manager());
    }

    @Override
    protected RouteFilterImpl wrapModel(RouteFilterInner inner) {
        if (inner == null) {
            return null;
        }
        return new RouteFilterImpl(inner.name(), inner, this.manager());
    }
}
