/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2018_01_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.servicebus.v2018_01_01_preview.implementation.ServiceBusManager;
import org.joda.time.DateTime;
import com.microsoft.azure.management.servicebus.v2018_01_01_preview.implementation.SBNamespaceInner;

/**
 * Type representing SBNamespace.
 */
public interface SBNamespace extends HasInner<SBNamespaceInner>, Resource, GroupableResourceCore<ServiceBusManager, SBNamespaceInner>, HasResourceGroup, Refreshable<SBNamespace>, Updatable<SBNamespace.Update>, HasManager<ServiceBusManager> {
    /**
     * @return the createdAt value.
     */
    DateTime createdAt();

    /**
     * @return the encryption value.
     */
    Encryption encryption();

    /**
     * @return the identity value.
     */
    Identity identity();

    /**
     * @return the metricId value.
     */
    String metricId();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the serviceBusEndpoint value.
     */
    String serviceBusEndpoint();

    /**
     * @return the sku value.
     */
    SBSku sku();

    /**
     * @return the updatedAt value.
     */
    DateTime updatedAt();

    /**
     * @return the zoneRedundant value.
     */
    Boolean zoneRedundant();

    /**
     * The entirety of the SBNamespace definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of SBNamespace definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a SBNamespace definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the SBNamespace definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the sbnamespace definition allowing to specify Encryption.
         */
        interface WithEncryption {
            /**
             * Specifies encryption.
             * @param encryption Properties of BYOK Encryption description
             * @return the next definition stage
             */
            WithCreate withEncryption(Encryption encryption);
        }

        /**
         * The stage of the sbnamespace definition allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity Properties of BYOK Identity description
             * @return the next definition stage
             */
            WithCreate withIdentity(Identity identity);
        }

        /**
         * The stage of the sbnamespace definition allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku Properties of SKU
             * @return the next definition stage
             */
            WithCreate withSku(SBSku sku);
        }

        /**
         * The stage of the sbnamespace definition allowing to specify ZoneRedundant.
         */
        interface WithZoneRedundant {
            /**
             * Specifies zoneRedundant.
             * @param zoneRedundant Enabling this property creates a Premium Service Bus Namespace in regions supported availability zones
             * @return the next definition stage
             */
            WithCreate withZoneRedundant(Boolean zoneRedundant);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<SBNamespace>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithEncryption, DefinitionStages.WithIdentity, DefinitionStages.WithSku, DefinitionStages.WithZoneRedundant {
        }
    }
    /**
     * The template for a SBNamespace update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<SBNamespace>, Resource.UpdateWithTags<Update>, UpdateStages.WithEncryption, UpdateStages.WithIdentity, UpdateStages.WithSku, UpdateStages.WithZoneRedundant {
    }

    /**
     * Grouping of SBNamespace update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the sbnamespace update allowing to specify Encryption.
         */
        interface WithEncryption {
            /**
             * Specifies encryption.
             * @param encryption Properties of BYOK Encryption description
             * @return the next update stage
             */
            Update withEncryption(Encryption encryption);
        }

        /**
         * The stage of the sbnamespace update allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity Properties of BYOK Identity description
             * @return the next update stage
             */
            Update withIdentity(Identity identity);
        }

        /**
         * The stage of the sbnamespace update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku Properties of SKU
             * @return the next update stage
             */
            Update withSku(SBSku sku);
        }

        /**
         * The stage of the sbnamespace update allowing to specify ZoneRedundant.
         */
        interface WithZoneRedundant {
            /**
             * Specifies zoneRedundant.
             * @param zoneRedundant Enabling this property creates a Premium Service Bus Namespace in regions supported availability zones
             * @return the next update stage
             */
            Update withZoneRedundant(Boolean zoneRedundant);
        }

    }
}
