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
 * Ssis variable.
 */
public class SsisVariable {
    /**
     * Variable id.
     */
    @JsonProperty(value = "id")
    private Long id;

    /**
     * Variable name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Variable description.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Variable type.
     */
    @JsonProperty(value = "dataType")
    private String dataType;

    /**
     * Whether variable is sensitive.
     */
    @JsonProperty(value = "sensitive")
    private Boolean sensitive;

    /**
     * Variable value.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Variable sensitive value.
     */
    @JsonProperty(value = "sensitiveValue")
    private String sensitiveValue;

    /**
     * Get variable id.
     *
     * @return the id value
     */
    public Long id() {
        return this.id;
    }

    /**
     * Set variable id.
     *
     * @param id the id value to set
     * @return the SsisVariable object itself.
     */
    public SsisVariable withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get variable name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set variable name.
     *
     * @param name the name value to set
     * @return the SsisVariable object itself.
     */
    public SsisVariable withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get variable description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set variable description.
     *
     * @param description the description value to set
     * @return the SsisVariable object itself.
     */
    public SsisVariable withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get variable type.
     *
     * @return the dataType value
     */
    public String dataType() {
        return this.dataType;
    }

    /**
     * Set variable type.
     *
     * @param dataType the dataType value to set
     * @return the SsisVariable object itself.
     */
    public SsisVariable withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * Get whether variable is sensitive.
     *
     * @return the sensitive value
     */
    public Boolean sensitive() {
        return this.sensitive;
    }

    /**
     * Set whether variable is sensitive.
     *
     * @param sensitive the sensitive value to set
     * @return the SsisVariable object itself.
     */
    public SsisVariable withSensitive(Boolean sensitive) {
        this.sensitive = sensitive;
        return this;
    }

    /**
     * Get variable value.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set variable value.
     *
     * @param value the value value to set
     * @return the SsisVariable object itself.
     */
    public SsisVariable withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get variable sensitive value.
     *
     * @return the sensitiveValue value
     */
    public String sensitiveValue() {
        return this.sensitiveValue;
    }

    /**
     * Set variable sensitive value.
     *
     * @param sensitiveValue the sensitiveValue value to set
     * @return the SsisVariable object itself.
     */
    public SsisVariable withSensitiveValue(String sensitiveValue) {
        this.sensitiveValue = sensitiveValue;
        return this;
    }

}
