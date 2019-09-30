/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Properties of the rule.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ruleType")
@JsonTypeName("FirewallPolicyRule")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "FirewallPolicyNatRule", value = FirewallPolicyNatRule.class),
    @JsonSubTypes.Type(name = "FirewallPolicyFilterRule", value = FirewallPolicyFilterRule.class)
})
public class FirewallPolicyRule {
    /**
     * The name of the rule.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Priority of the Firewall Policy Rule resource.
     */
    @JsonProperty(value = "priority")
    private Integer priority;

    /**
     * Get the name of the rule.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the rule.
     *
     * @param name the name value to set
     * @return the FirewallPolicyRule object itself.
     */
    public FirewallPolicyRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get priority of the Firewall Policy Rule resource.
     *
     * @return the priority value
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set priority of the Firewall Policy Rule resource.
     *
     * @param priority the priority value to set
     * @return the FirewallPolicyRule object itself.
     */
    public FirewallPolicyRule withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

}
