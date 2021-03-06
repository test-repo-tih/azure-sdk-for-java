/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPoolReplicationLinks;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.ReplicationLink;

class SqlPoolReplicationLinksImpl extends WrapperImpl<SqlPoolReplicationLinksInner> implements SqlPoolReplicationLinks {
    private final SynapseManager manager;

    SqlPoolReplicationLinksImpl(SynapseManager manager) {
        super(manager.inner().sqlPoolReplicationLinks());
        this.manager = manager;
    }

    public SynapseManager manager() {
        return this.manager;
    }

    private ReplicationLinkImpl wrapModel(ReplicationLinkInner inner) {
        return  new ReplicationLinkImpl(inner, manager());
    }

    @Override
    public Observable<ReplicationLink> listAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName) {
        SqlPoolReplicationLinksInner client = this.inner();
        return client.listAsync(resourceGroupName, workspaceName, sqlPoolName)
        .flatMapIterable(new Func1<Page<ReplicationLinkInner>, Iterable<ReplicationLinkInner>>() {
            @Override
            public Iterable<ReplicationLinkInner> call(Page<ReplicationLinkInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ReplicationLinkInner, ReplicationLink>() {
            @Override
            public ReplicationLink call(ReplicationLinkInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
