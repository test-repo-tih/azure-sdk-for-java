/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.advisor.v2017_03_31;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for Category.
 */
public final class Category extends ExpandableStringEnum<Category> {
    /** Static value HighAvailability for Category. */
    public static final Category HIGH_AVAILABILITY = fromString("HighAvailability");

    /** Static value Security for Category. */
    public static final Category SECURITY = fromString("Security");

    /** Static value Performance for Category. */
    public static final Category PERFORMANCE = fromString("Performance");

    /** Static value Cost for Category. */
    public static final Category COST = fromString("Cost");

    /** Static value OperationalExcellence for Category. */
    public static final Category OPERATIONAL_EXCELLENCE = fromString("OperationalExcellence");

    /**
     * Creates or finds a Category from its string representation.
     * @param name a name to look for
     * @return the corresponding Category
     */
    @JsonCreator
    public static Category fromString(String name) {
        return fromString(name, Category.class);
    }

    /**
     * @return known Category values
     */
    public static Collection<Category> values() {
        return values(Category.class);
    }
}
