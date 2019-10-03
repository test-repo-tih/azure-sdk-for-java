/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.billing.v2019_10_01_preview.Customers;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.billing.v2019_10_01_preview.Customer;

class CustomersImpl extends WrapperImpl<CustomersInner> implements Customers {
    private final BillingManager manager;

    CustomersImpl(BillingManager manager) {
        super(manager.inner().customers());
        this.manager = manager;
    }

    public BillingManager manager() {
        return this.manager;
    }

    private CustomerImpl wrapModel(CustomerInner inner) {
        return  new CustomerImpl(inner, manager());
    }

    @Override
    public Observable<Customer> listByBillingAccountAsync(final String billingAccountName) {
        CustomersInner client = this.inner();
        return client.listByBillingAccountAsync(billingAccountName)
        .flatMapIterable(new Func1<Page<CustomerInner>, Iterable<CustomerInner>>() {
            @Override
            public Iterable<CustomerInner> call(Page<CustomerInner> page) {
                return page.items();
            }
        })
        .map(new Func1<CustomerInner, Customer>() {
            @Override
            public Customer call(CustomerInner inner) {
                return new CustomerImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Customer> getAsync(String billingAccountName, String customerName) {
        CustomersInner client = this.inner();
        return client.getAsync(billingAccountName, customerName)
        .map(new Func1<CustomerInner, Customer>() {
            @Override
            public Customer call(CustomerInner inner) {
                return new CustomerImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Customer> listByBillingProfileAsync(final String billingAccountName, final String billingProfileName) {
        CustomersInner client = this.inner();
        return client.listByBillingProfileAsync(billingAccountName, billingProfileName)
        .flatMapIterable(new Func1<Page<CustomerInner>, Iterable<CustomerInner>>() {
            @Override
            public Iterable<CustomerInner> call(Page<CustomerInner> page) {
                return page.items();
            }
        })
        .map(new Func1<CustomerInner, Customer>() {
            @Override
            public Customer call(CustomerInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
