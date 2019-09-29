/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.compute.v2017_12_01.implementation.VirtualMachineScaleSetExtensionInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.compute.v2017_12_01.implementation.ComputeManager;

/**
 * Type representing VirtualMachineScaleSetExtension.
 */
public interface VirtualMachineScaleSetExtension extends HasInner<VirtualMachineScaleSetExtensionInner>, Indexable, Refreshable<VirtualMachineScaleSetExtension>, Updatable<VirtualMachineScaleSetExtension.Update>, HasManager<ComputeManager> {
    /**
     * @return the autoUpgradeMinorVersion value.
     */
    Boolean autoUpgradeMinorVersion();

    /**
     * @return the forceUpdateTag value.
     */
    String forceUpdateTag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the protectedSettings value.
     */
    Object protectedSettings();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the publisher value.
     */
    String publisher();

    /**
     * @return the settings value.
     */
    Object settings();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the typeHandlerVersion value.
     */
    String typeHandlerVersion();

    /**
     * The entirety of the VirtualMachineScaleSetExtension definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithVirtualMachineScaleSet, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of VirtualMachineScaleSetExtension definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a VirtualMachineScaleSetExtension definition.
         */
        interface Blank extends WithVirtualMachineScaleSet {
        }

        /**
         * The stage of the virtualmachinescalesetextension definition allowing to specify VirtualMachineScaleSet.
         */
        interface WithVirtualMachineScaleSet {
           /**
            * Specifies resourceGroupName, vmScaleSetName.
            * @param resourceGroupName The name of the resource group
            * @param vmScaleSetName The name of the VM scale set where the extension should be create or updated
            * @return the next definition stage
            */
            WithCreate withExistingVirtualMachineScaleSet(String resourceGroupName, String vmScaleSetName);
        }

        /**
         * The stage of the virtualmachinescalesetextension definition allowing to specify AutoUpgradeMinorVersion.
         */
        interface WithAutoUpgradeMinorVersion {
            /**
             * Specifies autoUpgradeMinorVersion.
             * @param autoUpgradeMinorVersion Indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true
             * @return the next definition stage
             */
            WithCreate withAutoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion);
        }

        /**
         * The stage of the virtualmachinescalesetextension definition allowing to specify ForceUpdateTag.
         */
        interface WithForceUpdateTag {
            /**
             * Specifies forceUpdateTag.
             * @param forceUpdateTag If a value is provided and is different from the previous value, the extension handler will be forced to update even if the extension configuration has not changed
             * @return the next definition stage
             */
            WithCreate withForceUpdateTag(String forceUpdateTag);
        }

        /**
         * The stage of the virtualmachinescalesetextension definition allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name The name of the extension
             * @return the next definition stage
             */
            WithCreate withName(String name);
        }

        /**
         * The stage of the virtualmachinescalesetextension definition allowing to specify ProtectedSettings.
         */
        interface WithProtectedSettings {
            /**
             * Specifies protectedSettings.
             * @param protectedSettings The extension can contain either protectedSettings or protectedSettingsFromKeyVault or no protected settings at all
             * @return the next definition stage
             */
            WithCreate withProtectedSettings(Object protectedSettings);
        }

        /**
         * The stage of the virtualmachinescalesetextension definition allowing to specify Publisher.
         */
        interface WithPublisher {
            /**
             * Specifies publisher.
             * @param publisher The name of the extension handler publisher
             * @return the next definition stage
             */
            WithCreate withPublisher(String publisher);
        }

        /**
         * The stage of the virtualmachinescalesetextension definition allowing to specify Settings.
         */
        interface WithSettings {
            /**
             * Specifies settings.
             * @param settings Json formatted public settings for the extension
             * @return the next definition stage
             */
            WithCreate withSettings(Object settings);
        }

        /**
         * The stage of the virtualmachinescalesetextension definition allowing to specify Type.
         */
        interface WithType {
            /**
             * Specifies type.
             * @param type Specifies the type of the extension; an example is "CustomScriptExtension"
             * @return the next definition stage
             */
            WithCreate withType(String type);
        }

        /**
         * The stage of the virtualmachinescalesetextension definition allowing to specify TypeHandlerVersion.
         */
        interface WithTypeHandlerVersion {
            /**
             * Specifies typeHandlerVersion.
             * @param typeHandlerVersion Specifies the version of the script handler
             * @return the next definition stage
             */
            WithCreate withTypeHandlerVersion(String typeHandlerVersion);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<VirtualMachineScaleSetExtension>, DefinitionStages.WithAutoUpgradeMinorVersion, DefinitionStages.WithForceUpdateTag, DefinitionStages.WithName, DefinitionStages.WithProtectedSettings, DefinitionStages.WithPublisher, DefinitionStages.WithSettings, DefinitionStages.WithType, DefinitionStages.WithTypeHandlerVersion {
        }
    }
    /**
     * The template for a VirtualMachineScaleSetExtension update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<VirtualMachineScaleSetExtension>, UpdateStages.WithAutoUpgradeMinorVersion, UpdateStages.WithForceUpdateTag, UpdateStages.WithName, UpdateStages.WithProtectedSettings, UpdateStages.WithPublisher, UpdateStages.WithSettings, UpdateStages.WithType, UpdateStages.WithTypeHandlerVersion {
    }

    /**
     * Grouping of VirtualMachineScaleSetExtension update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the virtualmachinescalesetextension update allowing to specify AutoUpgradeMinorVersion.
         */
        interface WithAutoUpgradeMinorVersion {
            /**
             * Specifies autoUpgradeMinorVersion.
             * @param autoUpgradeMinorVersion Indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true
             * @return the next update stage
             */
            Update withAutoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion);
        }

        /**
         * The stage of the virtualmachinescalesetextension update allowing to specify ForceUpdateTag.
         */
        interface WithForceUpdateTag {
            /**
             * Specifies forceUpdateTag.
             * @param forceUpdateTag If a value is provided and is different from the previous value, the extension handler will be forced to update even if the extension configuration has not changed
             * @return the next update stage
             */
            Update withForceUpdateTag(String forceUpdateTag);
        }

        /**
         * The stage of the virtualmachinescalesetextension update allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name The name of the extension
             * @return the next update stage
             */
            Update withName(String name);
        }

        /**
         * The stage of the virtualmachinescalesetextension update allowing to specify ProtectedSettings.
         */
        interface WithProtectedSettings {
            /**
             * Specifies protectedSettings.
             * @param protectedSettings The extension can contain either protectedSettings or protectedSettingsFromKeyVault or no protected settings at all
             * @return the next update stage
             */
            Update withProtectedSettings(Object protectedSettings);
        }

        /**
         * The stage of the virtualmachinescalesetextension update allowing to specify Publisher.
         */
        interface WithPublisher {
            /**
             * Specifies publisher.
             * @param publisher The name of the extension handler publisher
             * @return the next update stage
             */
            Update withPublisher(String publisher);
        }

        /**
         * The stage of the virtualmachinescalesetextension update allowing to specify Settings.
         */
        interface WithSettings {
            /**
             * Specifies settings.
             * @param settings Json formatted public settings for the extension
             * @return the next update stage
             */
            Update withSettings(Object settings);
        }

        /**
         * The stage of the virtualmachinescalesetextension update allowing to specify Type.
         */
        interface WithType {
            /**
             * Specifies type.
             * @param type Specifies the type of the extension; an example is "CustomScriptExtension"
             * @return the next update stage
             */
            Update withType(String type);
        }

        /**
         * The stage of the virtualmachinescalesetextension update allowing to specify TypeHandlerVersion.
         */
        interface WithTypeHandlerVersion {
            /**
             * Specifies typeHandlerVersion.
             * @param typeHandlerVersion Specifies the version of the script handler
             * @return the next update stage
             */
            Update withTypeHandlerVersion(String typeHandlerVersion);
        }

    }
}
