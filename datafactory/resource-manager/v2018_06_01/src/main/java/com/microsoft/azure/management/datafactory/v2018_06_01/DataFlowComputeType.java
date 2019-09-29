/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for DataFlowComputeType.
 */
public final class DataFlowComputeType extends ExpandableStringEnum<DataFlowComputeType> {
    /** Static value General for DataFlowComputeType. */
    public static final DataFlowComputeType GENERAL = fromString("General");

    /** Static value MemoryOptimized for DataFlowComputeType. */
    public static final DataFlowComputeType MEMORY_OPTIMIZED = fromString("MemoryOptimized");

    /** Static value ComputeOptimized for DataFlowComputeType. */
    public static final DataFlowComputeType COMPUTE_OPTIMIZED = fromString("ComputeOptimized");

    /**
     * Creates or finds a DataFlowComputeType from its string representation.
     * @param name a name to look for
     * @return the corresponding DataFlowComputeType
     */
    @JsonCreator
    public static DataFlowComputeType fromString(String name) {
        return fromString(name, DataFlowComputeType.class);
    }

    /**
     * @return known DataFlowComputeType values
     */
    public static Collection<DataFlowComputeType> values() {
        return values(DataFlowComputeType.class);
    }
}
