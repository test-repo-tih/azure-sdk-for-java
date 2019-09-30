/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.implementation;

import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.OperationResource;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import org.joda.time.DateTime;
import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.OperationError;

class OperationResourceImpl extends IndexableRefreshableWrapperImpl<OperationResource, OperationResourceInner> implements OperationResource {
    private final VMwareCloudSimpleManager manager;
    private String regionId;
    private String operationId;

    OperationResourceImpl(OperationResourceInner inner,  VMwareCloudSimpleManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.regionId = IdParsingUtils.getValueFromIdByName(inner.id(), "locations");
        this.operationId = IdParsingUtils.getValueFromIdByName(inner.id(), "operationResults");
    }

    @Override
    public VMwareCloudSimpleManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<OperationResourceInner> getInnerAsync() {
        OperationsInner client = this.manager().inner().operations();
        return client.getAsync(this.regionId, this.operationId);
    }



    @Override
    public DateTime endTime() {
        return this.inner().endTime();
    }

    @Override
    public OperationError error() {
        return this.inner().error();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public DateTime startTime() {
        return this.inner().startTime();
    }

    @Override
    public String status() {
        return this.inner().status();
    }

}
