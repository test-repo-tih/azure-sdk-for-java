/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Referenced dependency.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = DependencyReference.class)
@JsonTypeName("DependencyReference")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "SelfDependencyTumblingWindowTriggerReference", value = SelfDependencyTumblingWindowTriggerReference.class),
    @JsonSubTypes.Type(name = "TriggerDependencyReference", value = TriggerDependencyReference.class)
})
public class DependencyReference {
}
