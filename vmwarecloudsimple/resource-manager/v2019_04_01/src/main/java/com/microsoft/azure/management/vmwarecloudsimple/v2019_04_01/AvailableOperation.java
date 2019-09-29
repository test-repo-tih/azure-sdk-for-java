/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.implementation.VMwareCloudSimpleManager;
import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.implementation.AvailableOperationInner;

/**
 * Type representing AvailableOperation.
 */
public interface AvailableOperation extends HasInner<AvailableOperationInner>, HasManager<VMwareCloudSimpleManager> {
    /**
     * @return the display value.
     */
    AvailableOperationDisplay display();

    /**
     * @return the isDataAction value.
     */
    Boolean isDataAction();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the origin value.
     */
    OperationOrigin origin();

    /**
     * @return the serviceSpecification value.
     */
    AvailableOperationDisplayPropertyServiceSpecificationMetricsList serviceSpecification();

}
