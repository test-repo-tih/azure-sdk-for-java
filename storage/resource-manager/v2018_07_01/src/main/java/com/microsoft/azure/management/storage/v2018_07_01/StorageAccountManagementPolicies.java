/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2018_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.storage.v2018_07_01.implementation.StorageAccountManagementPoliciesInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.storage.v2018_07_01.implementation.StorageManager;
import org.joda.time.DateTime;

/**
 * Type representing StorageAccountManagementPolicies.
 */
public interface StorageAccountManagementPolicies extends HasInner<StorageAccountManagementPoliciesInner>, Indexable, Refreshable<StorageAccountManagementPolicies>, Updatable<StorageAccountManagementPolicies.Update>, HasManager<StorageManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the lastModifiedTime value.
     */
    DateTime lastModifiedTime();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the policy value.
     */
    Object policy();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the StorageAccountManagementPolicies definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithStorageAccount, DefinitionStages.WithPolicy, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of StorageAccountManagementPolicies definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a StorageAccountManagementPolicies definition.
         */
        interface Blank extends WithStorageAccount {
        }

        /**
         * The stage of the storageaccountmanagementpolicies definition allowing to specify StorageAccount.
         */
        interface WithStorageAccount {
           /**
            * Specifies resourceGroupName, accountName.
            * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive
            * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only
            * @return the next definition stage
            */
            WithPolicy withExistingStorageAccount(String resourceGroupName, String accountName);
        }

        /**
         * The stage of the storageaccountmanagementpolicies definition allowing to specify Policy.
         */
        interface WithPolicy {
           /**
            * Specifies policy.
            * @param policy The Storage Account ManagementPolicies Rules, in JSON format. See more details in: https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts
            * @return the next definition stage
            */
            WithCreate withPolicy(Object policy);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<StorageAccountManagementPolicies> {
        }
    }
    /**
     * The template for a StorageAccountManagementPolicies update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<StorageAccountManagementPolicies>, UpdateStages.WithPolicy {
    }

    /**
     * Grouping of StorageAccountManagementPolicies update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the storageaccountmanagementpolicies update allowing to specify Policy.
         */
        interface WithPolicy {
            /**
             * Specifies policy.
             * @param policy The Storage Account ManagementPolicies Rules, in JSON format. See more details in: https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts
             * @return the next update stage
             */
            Update withPolicy(Object policy);
        }

    }
}
