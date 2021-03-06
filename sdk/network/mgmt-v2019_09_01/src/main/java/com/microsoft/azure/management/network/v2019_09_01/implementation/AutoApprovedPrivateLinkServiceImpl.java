/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01.implementation;

import com.microsoft.azure.management.network.v2019_09_01.AutoApprovedPrivateLinkService;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;

class AutoApprovedPrivateLinkServiceImpl extends WrapperImpl<AutoApprovedPrivateLinkServiceInner> implements AutoApprovedPrivateLinkService {
    private final NetworkManager manager;

    AutoApprovedPrivateLinkServiceImpl(AutoApprovedPrivateLinkServiceInner inner,  NetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }



    @Override
    public String privateLinkService() {
        return this.inner().privateLinkService();
    }

}
