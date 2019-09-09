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
import com.microsoft.azure.management.network.v2019_06_01.SecurityRules;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.network.v2019_06_01.NetworkSecurityGroupSecurityRule;

class SecurityRulesImpl extends WrapperImpl<SecurityRulesInner> implements SecurityRules {
    private final NetworkManager manager;

    SecurityRulesImpl(NetworkManager manager) {
        super(manager.inner().securityRules());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public NetworkSecurityGroupSecurityRuleImpl define(String name) {
        return wrapModel(name);
    }

    private NetworkSecurityGroupSecurityRuleImpl wrapModel(SecurityRuleInner inner) {
        return  new NetworkSecurityGroupSecurityRuleImpl(inner, manager());
    }

    private NetworkSecurityGroupSecurityRuleImpl wrapModel(String name) {
        return new NetworkSecurityGroupSecurityRuleImpl(name, this.manager());
    }

    @Override
    public Observable<NetworkSecurityGroupSecurityRule> listAsync(final String resourceGroupName, final String networkSecurityGroupName) {
        SecurityRulesInner client = this.inner();
        return client.listAsync(resourceGroupName, networkSecurityGroupName)
        .flatMapIterable(new Func1<Page<SecurityRuleInner>, Iterable<SecurityRuleInner>>() {
            @Override
            public Iterable<SecurityRuleInner> call(Page<SecurityRuleInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SecurityRuleInner, NetworkSecurityGroupSecurityRule>() {
            @Override
            public NetworkSecurityGroupSecurityRule call(SecurityRuleInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<NetworkSecurityGroupSecurityRule> getAsync(String resourceGroupName, String networkSecurityGroupName, String securityRuleName) {
        SecurityRulesInner client = this.inner();
        return client.getAsync(resourceGroupName, networkSecurityGroupName, securityRuleName)
        .map(new Func1<SecurityRuleInner, NetworkSecurityGroupSecurityRule>() {
            @Override
            public NetworkSecurityGroupSecurityRule call(SecurityRuleInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String networkSecurityGroupName, String securityRuleName) {
        SecurityRulesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, networkSecurityGroupName, securityRuleName).toCompletable();
    }

}
