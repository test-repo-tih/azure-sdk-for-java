/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.implementation;

import com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.Operation;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.OperationDisplay;
import com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.OperationOrigin;
import java.util.Map;

class OperationImpl extends WrapperImpl<OperationInner> implements Operation {
    private final SqlVirtualMachineManager manager;
    OperationImpl(OperationInner inner, SqlVirtualMachineManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public SqlVirtualMachineManager manager() {
        return this.manager;
    }

    @Override
    public OperationDisplay display() {
        return this.inner().display();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public OperationOrigin origin() {
        return this.inner().origin();
    }

    @Override
    public Map<String, Object> properties() {
        return this.inner().properties();
    }

}
