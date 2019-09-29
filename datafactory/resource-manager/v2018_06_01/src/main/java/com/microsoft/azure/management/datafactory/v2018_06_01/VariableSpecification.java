/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Definition of a single variable for a Pipeline.
 */
public class VariableSpecification {
    /**
     * Variable type. Possible values include: 'String', 'Bool', 'Array'.
     */
    @JsonProperty(value = "type", required = true)
    private VariableType type;

    /**
     * Default value of variable.
     */
    @JsonProperty(value = "defaultValue")
    private Object defaultValue;

    /**
     * Get variable type. Possible values include: 'String', 'Bool', 'Array'.
     *
     * @return the type value
     */
    public VariableType type() {
        return this.type;
    }

    /**
     * Set variable type. Possible values include: 'String', 'Bool', 'Array'.
     *
     * @param type the type value to set
     * @return the VariableSpecification object itself.
     */
    public VariableSpecification withType(VariableType type) {
        this.type = type;
        return this;
    }

    /**
     * Get default value of variable.
     *
     * @return the defaultValue value
     */
    public Object defaultValue() {
        return this.defaultValue;
    }

    /**
     * Set default value of variable.
     *
     * @param defaultValue the defaultValue value to set
     * @return the VariableSpecification object itself.
     */
    public VariableSpecification withDefaultValue(Object defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

}
