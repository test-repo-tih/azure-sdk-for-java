/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.microsoft.azure.management.appservice.v2019_08_01.AddressResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.appservice.v2019_08_01.VirtualIPMapping;

class AddressResponseImpl extends WrapperImpl<AddressResponseInner> implements AddressResponse {
    private final CertificateRegistrationManager manager;
    AddressResponseImpl(AddressResponseInner inner, CertificateRegistrationManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public CertificateRegistrationManager manager() {
        return this.manager;
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String internalIpAddress() {
        return this.inner().internalIpAddress();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public List<String> outboundIpAddresses() {
        return this.inner().outboundIpAddresses();
    }

    @Override
    public String serviceIpAddress() {
        return this.inner().serviceIpAddress();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public List<VirtualIPMapping> vipMappings() {
        return this.inner().vipMappings();
    }

}
