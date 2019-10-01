/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azurestack.v2017_06_01.implementation;

import com.microsoft.azure.management.azurestack.v2017_06_01.ProductList;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;

class ProductListImpl extends WrapperImpl<ProductListInner> implements ProductList {
    private final AzureStackManager manager;
    ProductListImpl(ProductListInner inner, AzureStackManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public AzureStackManager manager() {
        return this.manager;
    }

    @Override
    public String nextLink() {
        return this.inner().nextLink();
    }

    @Override
    public List<ProductInner> value() {
        return this.inner().value();
    }

}
