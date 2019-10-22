/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2018_03_01_preview.implementation;

import com.microsoft.azure.management.storage.v2018_03_01_preview.LeaseContainerResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class LeaseContainerResponseImpl extends WrapperImpl<LeaseContainerResponseInner> implements LeaseContainerResponse {
    private final StorageManager manager;
    LeaseContainerResponseImpl(LeaseContainerResponseInner inner, StorageManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public StorageManager manager() {
        return this.manager;
    }

    @Override
    public String leaseId() {
        return this.inner().leaseId();
    }

    @Override
    public String leaseTimeSeconds() {
        return this.inner().leaseTimeSeconds();
    }

}
