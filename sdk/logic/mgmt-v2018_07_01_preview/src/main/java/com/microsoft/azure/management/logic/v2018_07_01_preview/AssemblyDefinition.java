/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.logic.v2018_07_01_preview.implementation.AssemblyDefinitionInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.logic.v2018_07_01_preview.implementation.LogicManager;
import java.util.Map;

/**
 * Type representing AssemblyDefinition.
 */
public interface AssemblyDefinition extends HasInner<AssemblyDefinitionInner>, Indexable, Refreshable<AssemblyDefinition>, Updatable<AssemblyDefinition.Update>, HasManager<LogicManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    AssemblyProperties properties();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the AssemblyDefinition definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithIntegrationAccount, DefinitionStages.WithProperties, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of AssemblyDefinition definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a AssemblyDefinition definition.
         */
        interface Blank extends WithIntegrationAccount {
        }

        /**
         * The stage of the assemblydefinition definition allowing to specify IntegrationAccount.
         */
        interface WithIntegrationAccount {
           /**
            * Specifies resourceGroupName, integrationAccountName.
            * @param resourceGroupName The resource group name
            * @param integrationAccountName The integration account name
            * @return the next definition stage
            */
            WithProperties withExistingIntegrationAccount(String resourceGroupName, String integrationAccountName);
        }

        /**
         * The stage of the assemblydefinition definition allowing to specify Properties.
         */
        interface WithProperties {
           /**
            * Specifies properties.
            * @param properties The assembly properties
            * @return the next definition stage
            */
            WithCreate withProperties(AssemblyProperties properties);
        }

        /**
         * The stage of the assemblydefinition definition allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location The resource location
             * @return the next definition stage
             */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the assemblydefinition definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The resource tags
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<AssemblyDefinition>, DefinitionStages.WithLocation, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a AssemblyDefinition update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<AssemblyDefinition>, UpdateStages.WithLocation, UpdateStages.WithTags {
    }

    /**
     * Grouping of AssemblyDefinition update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the assemblydefinition update allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location The resource location
             * @return the next update stage
             */
            Update withLocation(String location);
        }

        /**
         * The stage of the assemblydefinition update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The resource tags
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

    }
}
