/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.CertificateRegistrationManager;
import java.util.List;
import org.joda.time.DateTime;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.CertificateInner;

/**
 * Type representing Certificate.
 */
public interface Certificate extends HasInner<CertificateInner>, Resource, GroupableResourceCore<CertificateRegistrationManager, CertificateInner>, HasResourceGroup, Refreshable<Certificate>, Updatable<Certificate.Update>, HasManager<CertificateRegistrationManager> {
    /**
     * @return the cerBlob value.
     */
    byte[] cerBlob();

    /**
     * @return the expirationDate value.
     */
    DateTime expirationDate();

    /**
     * @return the friendlyName value.
     */
    String friendlyName();

    /**
     * @return the hostingEnvironmentProfile value.
     */
    HostingEnvironmentProfile hostingEnvironmentProfile();

    /**
     * @return the hostNames value.
     */
    List<String> hostNames();

    /**
     * @return the issueDate value.
     */
    DateTime issueDate();

    /**
     * @return the issuer value.
     */
    String issuer();

    /**
     * @return the keyVaultId value.
     */
    String keyVaultId();

    /**
     * @return the keyVaultSecretName value.
     */
    String keyVaultSecretName();

    /**
     * @return the keyVaultSecretStatus value.
     */
    KeyVaultSecretStatus keyVaultSecretStatus();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the password value.
     */
    String password();

    /**
     * @return the pfxBlob value.
     */
    byte[] pfxBlob();

    /**
     * @return the publicKeyHash value.
     */
    String publicKeyHash();

    /**
     * @return the selfLink value.
     */
    String selfLink();

    /**
     * @return the serverFarmId value.
     */
    String serverFarmId();

    /**
     * @return the siteName value.
     */
    String siteName();

    /**
     * @return the subjectName value.
     */
    String subjectName();

    /**
     * @return the thumbprint value.
     */
    String thumbprint();

    /**
     * @return the valid value.
     */
    Boolean valid();

    /**
     * The entirety of the Certificate definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithPassword, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Certificate definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Certificate definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the Certificate definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithPassword> {
        }

        /**
         * The stage of the certificate definition allowing to specify Password.
         */
        interface WithPassword {
           /**
            * Specifies password.
            * @param password Certificate password
            * @return the next definition stage
*/
            WithCreate withPassword(String password);
        }

        /**
         * The stage of the certificate definition allowing to specify HostNames.
         */
        interface WithHostNames {
            /**
             * Specifies hostNames.
             * @param hostNames Host names the certificate applies to
             * @return the next definition stage
             */
            WithCreate withHostNames(List<String> hostNames);
        }

        /**
         * The stage of the certificate definition allowing to specify KeyVaultId.
         */
        interface WithKeyVaultId {
            /**
             * Specifies keyVaultId.
             * @param keyVaultId Key Vault Csm resource Id
             * @return the next definition stage
             */
            WithCreate withKeyVaultId(String keyVaultId);
        }

        /**
         * The stage of the certificate definition allowing to specify KeyVaultSecretName.
         */
        interface WithKeyVaultSecretName {
            /**
             * Specifies keyVaultSecretName.
             * @param keyVaultSecretName Key Vault secret name
             * @return the next definition stage
             */
            WithCreate withKeyVaultSecretName(String keyVaultSecretName);
        }

        /**
         * The stage of the certificate definition allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             * @param kind Kind of resource
             * @return the next definition stage
             */
            WithCreate withKind(String kind);
        }

        /**
         * The stage of the certificate definition allowing to specify PfxBlob.
         */
        interface WithPfxBlob {
            /**
             * Specifies pfxBlob.
             * @param pfxBlob Pfx blob
             * @return the next definition stage
             */
            WithCreate withPfxBlob(byte[] pfxBlob);
        }

        /**
         * The stage of the certificate definition allowing to specify ServerFarmId.
         */
        interface WithServerFarmId {
            /**
             * Specifies serverFarmId.
             * @param serverFarmId Resource ID of the associated App Service plan, formatted as: "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}"
             * @return the next definition stage
             */
            WithCreate withServerFarmId(String serverFarmId);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Certificate>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithHostNames, DefinitionStages.WithKeyVaultId, DefinitionStages.WithKeyVaultSecretName, DefinitionStages.WithKind, DefinitionStages.WithPfxBlob, DefinitionStages.WithServerFarmId {
        }
    }
    /**
     * The template for a Certificate update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Certificate>, Resource.UpdateWithTags<Update>, UpdateStages.WithHostNames, UpdateStages.WithKeyVaultId, UpdateStages.WithKeyVaultSecretName, UpdateStages.WithKind, UpdateStages.WithPfxBlob, UpdateStages.WithServerFarmId {
    }

    /**
     * Grouping of Certificate update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the certificate update allowing to specify HostNames.
         */
        interface WithHostNames {
            /**
             * Specifies hostNames.
             * @param hostNames Host names the certificate applies to
             * @return the next update stage
             */
            Update withHostNames(List<String> hostNames);
        }

        /**
         * The stage of the certificate update allowing to specify KeyVaultId.
         */
        interface WithKeyVaultId {
            /**
             * Specifies keyVaultId.
             * @param keyVaultId Key Vault Csm resource Id
             * @return the next update stage
             */
            Update withKeyVaultId(String keyVaultId);
        }

        /**
         * The stage of the certificate update allowing to specify KeyVaultSecretName.
         */
        interface WithKeyVaultSecretName {
            /**
             * Specifies keyVaultSecretName.
             * @param keyVaultSecretName Key Vault secret name
             * @return the next update stage
             */
            Update withKeyVaultSecretName(String keyVaultSecretName);
        }

        /**
         * The stage of the certificate update allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             * @param kind Kind of resource
             * @return the next update stage
             */
            Update withKind(String kind);
        }

        /**
         * The stage of the certificate update allowing to specify PfxBlob.
         */
        interface WithPfxBlob {
            /**
             * Specifies pfxBlob.
             * @param pfxBlob Pfx blob
             * @return the next update stage
             */
            Update withPfxBlob(byte[] pfxBlob);
        }

        /**
         * The stage of the certificate update allowing to specify ServerFarmId.
         */
        interface WithServerFarmId {
            /**
             * Specifies serverFarmId.
             * @param serverFarmId Resource ID of the associated App Service plan, formatted as: "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}"
             * @return the next update stage
             */
            Update withServerFarmId(String serverFarmId);
        }

    }
}
