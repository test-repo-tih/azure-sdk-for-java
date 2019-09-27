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
 * Defines values for ParameterType.
 */
public final class ParameterType extends ExpandableStringEnum<ParameterType> {
    /** Static value Object for ParameterType. */
    public static final ParameterType OBJECT = fromString("Object");

    /** Static value String for ParameterType. */
    public static final ParameterType STRING = fromString("String");

    /** Static value Int for ParameterType. */
    public static final ParameterType INT = fromString("Int");

    /** Static value Float for ParameterType. */
    public static final ParameterType FLOAT = fromString("Float");

    /** Static value Bool for ParameterType. */
    public static final ParameterType BOOL = fromString("Bool");

    /** Static value Array for ParameterType. */
    public static final ParameterType ARRAY = fromString("Array");

    /** Static value SecureString for ParameterType. */
    public static final ParameterType SECURE_STRING = fromString("SecureString");

    /**
     * Creates or finds a ParameterType from its string representation.
     * @param name a name to look for
     * @return the corresponding ParameterType
     */
    @JsonCreator
    public static ParameterType fromString(String name) {
        return fromString(name, ParameterType.class);
    }

    /**
     * @return known ParameterType values
     */
    public static Collection<ParameterType> values() {
        return values(ParameterType.class);
    }
}
