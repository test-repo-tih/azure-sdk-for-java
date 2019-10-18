/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.implementation.VMwareCloudSimpleManager;
import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.implementation.DedicatedCloudServiceInner;

/**
 * Type representing DedicatedCloudService.
 */
public interface DedicatedCloudService extends HasInner<DedicatedCloudServiceInner>, Resource, GroupableResourceCore<VMwareCloudSimpleManager, DedicatedCloudServiceInner>, HasResourceGroup, Refreshable<DedicatedCloudService>, Updatable<DedicatedCloudService.Update>, HasManager<VMwareCloudSimpleManager> {
    /**
     * @return the gatewaySubnet value.
     */
    String gatewaySubnet();

    /**
     * @return the isAccountOnboarded value.
     */
    OnboardingStatus isAccountOnboarded();

    /**
     * @return the nodes value.
     */
    Integer nodes();

    /**
     * @return the serviceURL value.
     */
    String serviceURL();

    /**
     * The entirety of the DedicatedCloudService definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithGatewaySubnet, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of DedicatedCloudService definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a DedicatedCloudService definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the DedicatedCloudService definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithGatewaySubnet> {
        }

        /**
         * The stage of the dedicatedcloudservice definition allowing to specify GatewaySubnet.
         */
        interface WithGatewaySubnet {
           /**
            * Specifies gatewaySubnet.
            * @param gatewaySubnet gateway Subnet for the account. It will collect the subnet address and always treat it as /28
            * @return the next definition stage
*/
            WithCreate withGatewaySubnet(String gatewaySubnet);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<DedicatedCloudService>, Resource.DefinitionWithTags<WithCreate> {
        }
    }
    /**
     * The template for a DedicatedCloudService update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<DedicatedCloudService>, Resource.UpdateWithTags<Update> {
    }

    /**
     * Grouping of DedicatedCloudService update stages.
     */
    interface UpdateStages {
    }
}
