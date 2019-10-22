/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.redis.v2017_10_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.redis.v2017_10_01.implementation.CacheManager;
import java.util.Map;
import java.util.List;
import com.microsoft.azure.management.redis.v2017_10_01.implementation.RedisResourceInner;

/**
 * Type representing RedisResource.
 */
public interface RedisResource extends HasInner<RedisResourceInner>, Resource, GroupableResourceCore<CacheManager, RedisResourceInner>, HasResourceGroup, Refreshable<RedisResource>, Updatable<RedisResource.Update>, HasManager<CacheManager> {
    /**
     * @return the accessKeys value.
     */
    RedisAccessKeys accessKeys();

    /**
     * @return the enableNonSslPort value.
     */
    Boolean enableNonSslPort();

    /**
     * @return the hostName value.
     */
    String hostName();

    /**
     * @return the linkedServers value.
     */
    List<RedisLinkedServer> linkedServers();

    /**
     * @return the port value.
     */
    Integer port();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the redisConfiguration value.
     */
    Map<String, String> redisConfiguration();

    /**
     * @return the redisVersion value.
     */
    String redisVersion();

    /**
     * @return the shardCount value.
     */
    Integer shardCount();

    /**
     * @return the sku value.
     */
    Sku sku();

    /**
     * @return the sslPort value.
     */
    Integer sslPort();

    /**
     * @return the staticIP value.
     */
    String staticIP();

    /**
     * @return the subnetId value.
     */
    String subnetId();

    /**
     * @return the tenantSettings value.
     */
    Map<String, String> tenantSettings();

    /**
     * @return the zones value.
     */
    List<String> zones();

    /**
     * The entirety of the RedisResource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithSku, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of RedisResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a RedisResource definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the RedisResource definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithSku> {
        }

        /**
         * The stage of the redisresource definition allowing to specify Sku.
         */
        interface WithSku {
           /**
            * Specifies sku.
            * @param sku The SKU of the Redis cache to deploy
            * @return the next definition stage
*/
            WithCreate withSku(Sku sku);
        }

        /**
         * The stage of the redisresource definition allowing to specify EnableNonSslPort.
         */
        interface WithEnableNonSslPort {
            /**
             * Specifies enableNonSslPort.
             * @param enableNonSslPort Specifies whether the non-ssl Redis server port (6379) is enabled
             * @return the next definition stage
             */
            WithCreate withEnableNonSslPort(Boolean enableNonSslPort);
        }

        /**
         * The stage of the redisresource definition allowing to specify RedisConfiguration.
         */
        interface WithRedisConfiguration {
            /**
             * Specifies redisConfiguration.
             * @param redisConfiguration All Redis Settings. Few possible keys: rdb-backup-enabled,rdb-storage-connection-string,rdb-backup-frequency,maxmemory-delta,maxmemory-policy,notify-keyspace-events,maxmemory-samples,slowlog-log-slower-than,slowlog-max-len,list-max-ziplist-entries,list-max-ziplist-value,hash-max-ziplist-entries,hash-max-ziplist-value,set-max-intset-entries,zset-max-ziplist-entries,zset-max-ziplist-value etc
             * @return the next definition stage
             */
            WithCreate withRedisConfiguration(Map<String, String> redisConfiguration);
        }

        /**
         * The stage of the redisresource definition allowing to specify ShardCount.
         */
        interface WithShardCount {
            /**
             * Specifies shardCount.
             * @param shardCount The number of shards to be created on a Premium Cluster Cache
             * @return the next definition stage
             */
            WithCreate withShardCount(Integer shardCount);
        }

        /**
         * The stage of the redisresource definition allowing to specify StaticIP.
         */
        interface WithStaticIP {
            /**
             * Specifies staticIP.
             * @param staticIP Deprecated. May optionally be used to request a specific IP address, only when deploying a Redis cache inside an Azure virtual network. We recommend you do not set this parameter, and connect using the hostname instead
             * @return the next definition stage
             */
            WithCreate withStaticIP(String staticIP);
        }

        /**
         * The stage of the redisresource definition allowing to specify SubnetId.
         */
        interface WithSubnetId {
            /**
             * Specifies subnetId.
             * @param subnetId The full resource ID of a subnet in a virtual network to deploy the Redis cache in. Example format: /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/Microsoft.{Network|ClassicNetwork}/VirtualNetworks/vnet1/subnets/subnet1
             * @return the next definition stage
             */
            WithCreate withSubnetId(String subnetId);
        }

        /**
         * The stage of the redisresource definition allowing to specify TenantSettings.
         */
        interface WithTenantSettings {
            /**
             * Specifies tenantSettings.
             * @param tenantSettings A dictionary of tenant settings
             * @return the next definition stage
             */
            WithCreate withTenantSettings(Map<String, String> tenantSettings);
        }

        /**
         * The stage of the redisresource definition allowing to specify Zones.
         */
        interface WithZones {
            /**
             * Specifies zones.
             * @param zones A list of availability zones denoting where the resource needs to come from
             * @return the next definition stage
             */
            WithCreate withZones(List<String> zones);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<RedisResource>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithEnableNonSslPort, DefinitionStages.WithRedisConfiguration, DefinitionStages.WithShardCount, DefinitionStages.WithStaticIP, DefinitionStages.WithSubnetId, DefinitionStages.WithTenantSettings, DefinitionStages.WithZones {
        }
    }
    /**
     * The template for a RedisResource update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<RedisResource>, Resource.UpdateWithTags<Update>, UpdateStages.WithEnableNonSslPort, UpdateStages.WithRedisConfiguration, UpdateStages.WithShardCount, UpdateStages.WithSku, UpdateStages.WithTenantSettings {
    }

    /**
     * Grouping of RedisResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the redisresource update allowing to specify EnableNonSslPort.
         */
        interface WithEnableNonSslPort {
            /**
             * Specifies enableNonSslPort.
             * @param enableNonSslPort Specifies whether the non-ssl Redis server port (6379) is enabled
             * @return the next update stage
             */
            Update withEnableNonSslPort(Boolean enableNonSslPort);
        }

        /**
         * The stage of the redisresource update allowing to specify RedisConfiguration.
         */
        interface WithRedisConfiguration {
            /**
             * Specifies redisConfiguration.
             * @param redisConfiguration All Redis Settings. Few possible keys: rdb-backup-enabled,rdb-storage-connection-string,rdb-backup-frequency,maxmemory-delta,maxmemory-policy,notify-keyspace-events,maxmemory-samples,slowlog-log-slower-than,slowlog-max-len,list-max-ziplist-entries,list-max-ziplist-value,hash-max-ziplist-entries,hash-max-ziplist-value,set-max-intset-entries,zset-max-ziplist-entries,zset-max-ziplist-value etc
             * @return the next update stage
             */
            Update withRedisConfiguration(Map<String, String> redisConfiguration);
        }

        /**
         * The stage of the redisresource update allowing to specify ShardCount.
         */
        interface WithShardCount {
            /**
             * Specifies shardCount.
             * @param shardCount The number of shards to be created on a Premium Cluster Cache
             * @return the next update stage
             */
            Update withShardCount(Integer shardCount);
        }

        /**
         * The stage of the redisresource update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku The SKU of the Redis cache to deploy
             * @return the next update stage
             */
            Update withSku(Sku sku);
        }

        /**
         * The stage of the redisresource update allowing to specify TenantSettings.
         */
        interface WithTenantSettings {
            /**
             * Specifies tenantSettings.
             * @param tenantSettings A dictionary of tenant settings
             * @return the next update stage
             */
            Update withTenantSettings(Map<String, String> tenantSettings);
        }

    }
}
