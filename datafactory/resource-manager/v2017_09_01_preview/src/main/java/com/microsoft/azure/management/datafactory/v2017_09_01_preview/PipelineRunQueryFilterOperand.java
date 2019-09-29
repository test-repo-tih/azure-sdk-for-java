/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for PipelineRunQueryFilterOperand.
 */
public final class PipelineRunQueryFilterOperand extends ExpandableStringEnum<PipelineRunQueryFilterOperand> {
    /** Static value PipelineName for PipelineRunQueryFilterOperand. */
    public static final PipelineRunQueryFilterOperand PIPELINE_NAME = fromString("PipelineName");

    /** Static value Status for PipelineRunQueryFilterOperand. */
    public static final PipelineRunQueryFilterOperand STATUS = fromString("Status");

    /** Static value RunStart for PipelineRunQueryFilterOperand. */
    public static final PipelineRunQueryFilterOperand RUN_START = fromString("RunStart");

    /** Static value RunEnd for PipelineRunQueryFilterOperand. */
    public static final PipelineRunQueryFilterOperand RUN_END = fromString("RunEnd");

    /**
     * Creates or finds a PipelineRunQueryFilterOperand from its string representation.
     * @param name a name to look for
     * @return the corresponding PipelineRunQueryFilterOperand
     */
    @JsonCreator
    public static PipelineRunQueryFilterOperand fromString(String name) {
        return fromString(name, PipelineRunQueryFilterOperand.class);
    }

    /**
     * @return known PipelineRunQueryFilterOperand values
     */
    public static Collection<PipelineRunQueryFilterOperand> values() {
        return values(PipelineRunQueryFilterOperand.class);
    }
}
