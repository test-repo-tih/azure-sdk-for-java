// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.models.RunCommandParameterDefinition;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The RunCommandDocument model. */
@Fluent
public final class RunCommandDocumentInner extends RunCommandDocumentBaseInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RunCommandDocumentInner.class);

    /*
     * The script to be executed.
     */
    @JsonProperty(value = "script", required = true)
    private List<String> script;

    /*
     * The parameters used by the script.
     */
    @JsonProperty(value = "parameters")
    private List<RunCommandParameterDefinition> parameters;

    /**
     * Get the script property: The script to be executed.
     *
     * @return the script value.
     */
    public List<String> script() {
        return this.script;
    }

    /**
     * Set the script property: The script to be executed.
     *
     * @param script the script value to set.
     * @return the RunCommandDocumentInner object itself.
     */
    public RunCommandDocumentInner withScript(List<String> script) {
        this.script = script;
        return this;
    }

    /**
     * Get the parameters property: The parameters used by the script.
     *
     * @return the parameters value.
     */
    public List<RunCommandParameterDefinition> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: The parameters used by the script.
     *
     * @param parameters the parameters value to set.
     * @return the RunCommandDocumentInner object itself.
     */
    public RunCommandDocumentInner withParameters(List<RunCommandParameterDefinition> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (script() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property script in model RunCommandDocumentInner"));
        }
        if (parameters() != null) {
            parameters().forEach(e -> e.validate());
        }
    }
}
