/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_04_01.implementation;

import com.microsoft.azure.management.network.v2019_04_01.PrivateLinkServiceVisibility;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class PrivateLinkServiceVisibilityImpl extends WrapperImpl<PrivateLinkServiceVisibilityInner> implements PrivateLinkServiceVisibility {
    private final NetworkManager manager;
    PrivateLinkServiceVisibilityImpl(PrivateLinkServiceVisibilityInner inner, NetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Boolean visible() {
        return this.inner().visible();
    }

}
