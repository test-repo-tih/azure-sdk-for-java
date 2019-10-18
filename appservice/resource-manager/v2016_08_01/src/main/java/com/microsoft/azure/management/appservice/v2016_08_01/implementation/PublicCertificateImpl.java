/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_08_01.implementation;

import com.microsoft.azure.management.appservice.v2016_08_01.PublicCertificate;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.appservice.v2016_08_01.PublicCertificateLocation;

class PublicCertificateImpl extends CreatableUpdatableImpl<PublicCertificate, PublicCertificateInner, PublicCertificateImpl> implements PublicCertificate, PublicCertificate.Definition, PublicCertificate.Update {
    private final WebManager manager;
    private String resourceGroupName;
    private String name;
    private String publicCertificateName;

    PublicCertificateImpl(String name, WebManager manager) {
        super(name, new PublicCertificateInner());
        this.manager = manager;
        // Set resource name
        this.publicCertificateName = name;
        //
    }

    PublicCertificateImpl(PublicCertificateInner inner, WebManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.publicCertificateName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "sites");
        this.publicCertificateName = IdParsingUtils.getValueFromIdByName(inner.id(), "publicCertificates");
        //
    }

    @Override
    public WebManager manager() {
        return this.manager;
    }

    @Override
    public Observable<PublicCertificate> createResourceAsync() {
        WebAppsInner client = this.manager().inner().webApps();
        return client.createOrUpdatePublicCertificateAsync(this.resourceGroupName, this.name, this.publicCertificateName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<PublicCertificate> updateResourceAsync() {
        WebAppsInner client = this.manager().inner().webApps();
        return client.createOrUpdatePublicCertificateAsync(this.resourceGroupName, this.name, this.publicCertificateName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<PublicCertificateInner> getInnerAsync() {
        WebAppsInner client = this.manager().inner().webApps();
        return client.getPublicCertificateAsync(this.resourceGroupName, this.name, this.publicCertificateName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public byte[] blob() {
        return this.inner().blob();
    }

    @Override
    public String id() {
        return this.inner().id();
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
    public PublicCertificateLocation publicCertificateLocation() {
        return this.inner().publicCertificateLocation();
    }

    @Override
    public String thumbprint() {
        return this.inner().thumbprint();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public PublicCertificateImpl withExistingSite(String resourceGroupName, String name) {
        this.resourceGroupName = resourceGroupName;
        this.name = name;
        return this;
    }

    @Override
    public PublicCertificateImpl withBlob(byte[] blob) {
        this.inner().withBlob(blob);
        return this;
    }

    @Override
    public PublicCertificateImpl withKind(String kind) {
        this.inner().withKind(kind);
        return this;
    }

    @Override
    public PublicCertificateImpl withPublicCertificateLocation(PublicCertificateLocation publicCertificateLocation) {
        this.inner().withPublicCertificateLocation(publicCertificateLocation);
        return this;
    }

}
