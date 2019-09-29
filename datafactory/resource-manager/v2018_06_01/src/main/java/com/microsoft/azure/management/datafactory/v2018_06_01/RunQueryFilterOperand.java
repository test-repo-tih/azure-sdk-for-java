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
 * Defines values for RunQueryFilterOperand.
 */
public final class RunQueryFilterOperand extends ExpandableStringEnum<RunQueryFilterOperand> {
    /** Static value PipelineName for RunQueryFilterOperand. */
    public static final RunQueryFilterOperand PIPELINE_NAME = fromString("PipelineName");

    /** Static value Status for RunQueryFilterOperand. */
    public static final RunQueryFilterOperand STATUS = fromString("Status");

    /** Static value RunStart for RunQueryFilterOperand. */
    public static final RunQueryFilterOperand RUN_START = fromString("RunStart");

    /** Static value RunEnd for RunQueryFilterOperand. */
    public static final RunQueryFilterOperand RUN_END = fromString("RunEnd");

    /** Static value ActivityName for RunQueryFilterOperand. */
    public static final RunQueryFilterOperand ACTIVITY_NAME = fromString("ActivityName");

    /** Static value ActivityRunStart for RunQueryFilterOperand. */
    public static final RunQueryFilterOperand ACTIVITY_RUN_START = fromString("ActivityRunStart");

    /** Static value ActivityRunEnd for RunQueryFilterOperand. */
    public static final RunQueryFilterOperand ACTIVITY_RUN_END = fromString("ActivityRunEnd");

    /** Static value ActivityType for RunQueryFilterOperand. */
    public static final RunQueryFilterOperand ACTIVITY_TYPE = fromString("ActivityType");

    /** Static value TriggerName for RunQueryFilterOperand. */
    public static final RunQueryFilterOperand TRIGGER_NAME = fromString("TriggerName");

    /** Static value TriggerRunTimestamp for RunQueryFilterOperand. */
    public static final RunQueryFilterOperand TRIGGER_RUN_TIMESTAMP = fromString("TriggerRunTimestamp");

    /** Static value RunGroupId for RunQueryFilterOperand. */
    public static final RunQueryFilterOperand RUN_GROUP_ID = fromString("RunGroupId");

    /** Static value LatestOnly for RunQueryFilterOperand. */
    public static final RunQueryFilterOperand LATEST_ONLY = fromString("LatestOnly");

    /**
     * Creates or finds a RunQueryFilterOperand from its string representation.
     * @param name a name to look for
     * @return the corresponding RunQueryFilterOperand
     */
    @JsonCreator
    public static RunQueryFilterOperand fromString(String name) {
        return fromString(name, RunQueryFilterOperand.class);
    }

    /**
     * @return known RunQueryFilterOperand values
     */
    public static Collection<RunQueryFilterOperand> values() {
        return values(RunQueryFilterOperand.class);
    }
}
