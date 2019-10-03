/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview.implementation;

import com.microsoft.azure.management.sql.v2017_03_01_preview.ManagedDatabaseSecurityAlertPolicy;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.sql.v2017_03_01_preview.SecurityAlertPolicyState;
import java.util.List;
import org.joda.time.DateTime;

class ManagedDatabaseSecurityAlertPolicyImpl extends CreatableUpdatableImpl<ManagedDatabaseSecurityAlertPolicy, ManagedDatabaseSecurityAlertPolicyInner, ManagedDatabaseSecurityAlertPolicyImpl> implements ManagedDatabaseSecurityAlertPolicy, ManagedDatabaseSecurityAlertPolicy.Definition, ManagedDatabaseSecurityAlertPolicy.Update {
    private final SqlManager manager;
    private String resourceGroupName;
    private String managedInstanceName;
    private String databaseName;

    ManagedDatabaseSecurityAlertPolicyImpl(String name, SqlManager manager) {
        super(name, new ManagedDatabaseSecurityAlertPolicyInner());
        this.manager = manager;
        // Set resource name
        this.databaseName = name;
        //
    }

    ManagedDatabaseSecurityAlertPolicyImpl(ManagedDatabaseSecurityAlertPolicyInner inner, SqlManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.databaseName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.managedInstanceName = IdParsingUtils.getValueFromIdByName(inner.id(), "managedInstances");
        this.databaseName = IdParsingUtils.getValueFromIdByName(inner.id(), "databases");
        //
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ManagedDatabaseSecurityAlertPolicy> createResourceAsync() {
        ManagedDatabaseSecurityAlertPoliciesInner client = this.manager().inner().managedDatabaseSecurityAlertPolicies();
        return client.createOrUpdateAsync(this.resourceGroupName, this.managedInstanceName, this.databaseName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ManagedDatabaseSecurityAlertPolicy> updateResourceAsync() {
        ManagedDatabaseSecurityAlertPoliciesInner client = this.manager().inner().managedDatabaseSecurityAlertPolicies();
        return client.createOrUpdateAsync(this.resourceGroupName, this.managedInstanceName, this.databaseName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ManagedDatabaseSecurityAlertPolicyInner> getInnerAsync() {
        ManagedDatabaseSecurityAlertPoliciesInner client = this.manager().inner().managedDatabaseSecurityAlertPolicies();
        return client.getAsync(this.resourceGroupName, this.managedInstanceName, this.databaseName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public DateTime creationTime() {
        return this.inner().creationTime();
    }

    @Override
    public List<String> disabledAlerts() {
        return this.inner().disabledAlerts();
    }

    @Override
    public Boolean emailAccountAdmins() {
        return this.inner().emailAccountAdmins();
    }

    @Override
    public List<String> emailAddresses() {
        return this.inner().emailAddresses();
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
    public Integer retentionDays() {
        return this.inner().retentionDays();
    }

    @Override
    public SecurityAlertPolicyState state() {
        return this.inner().state();
    }

    @Override
    public String storageAccountAccessKey() {
        return this.inner().storageAccountAccessKey();
    }

    @Override
    public String storageEndpoint() {
        return this.inner().storageEndpoint();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ManagedDatabaseSecurityAlertPolicyImpl withExistingDatabasis(String resourceGroupName, String managedInstanceName, String databaseName) {
        this.resourceGroupName = resourceGroupName;
        this.managedInstanceName = managedInstanceName;
        this.databaseName = databaseName;
        return this;
    }

    @Override
    public ManagedDatabaseSecurityAlertPolicyImpl withState(SecurityAlertPolicyState state) {
        this.inner().withState(state);
        return this;
    }

    @Override
    public ManagedDatabaseSecurityAlertPolicyImpl withDisabledAlerts(List<String> disabledAlerts) {
        this.inner().withDisabledAlerts(disabledAlerts);
        return this;
    }

    @Override
    public ManagedDatabaseSecurityAlertPolicyImpl withEmailAccountAdmins(Boolean emailAccountAdmins) {
        this.inner().withEmailAccountAdmins(emailAccountAdmins);
        return this;
    }

    @Override
    public ManagedDatabaseSecurityAlertPolicyImpl withEmailAddresses(List<String> emailAddresses) {
        this.inner().withEmailAddresses(emailAddresses);
        return this;
    }

    @Override
    public ManagedDatabaseSecurityAlertPolicyImpl withRetentionDays(Integer retentionDays) {
        this.inner().withRetentionDays(retentionDays);
        return this;
    }

    @Override
    public ManagedDatabaseSecurityAlertPolicyImpl withStorageAccountAccessKey(String storageAccountAccessKey) {
        this.inner().withStorageAccountAccessKey(storageAccountAccessKey);
        return this;
    }

    @Override
    public ManagedDatabaseSecurityAlertPolicyImpl withStorageEndpoint(String storageEndpoint) {
        this.inner().withStorageEndpoint(storageEndpoint);
        return this;
    }

}
