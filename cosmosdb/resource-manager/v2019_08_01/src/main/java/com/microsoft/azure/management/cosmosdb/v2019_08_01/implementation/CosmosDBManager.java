/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2019_08_01.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.DatabaseAccounts;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.Operations;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.Databases;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.Collections;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.CollectionRegions;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.DatabaseAccountRegions;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.PercentileSourceTargets;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.PercentileTargets;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.Percentiles;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.CollectionPartitionRegions;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.CollectionPartitions;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.PartitionKeyRangeIds;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.PartitionKeyRangeIdRegions;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.SqlResources;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.MongoDBResources;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.TableResources;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.CassandraResources;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.GremlinResources;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure CosmosDB resource management.
 */
public final class CosmosDBManager extends ManagerCore<CosmosDBManager, CosmosDBImpl> {
    private DatabaseAccounts databaseAccounts;
    private Operations operations;
    private Databases databases;
    private Collections collections;
    private CollectionRegions collectionRegions;
    private DatabaseAccountRegions databaseAccountRegions;
    private PercentileSourceTargets percentileSourceTargets;
    private PercentileTargets percentileTargets;
    private Percentiles percentiles;
    private CollectionPartitionRegions collectionPartitionRegions;
    private CollectionPartitions collectionPartitions;
    private PartitionKeyRangeIds partitionKeyRangeIds;
    private PartitionKeyRangeIdRegions partitionKeyRangeIdRegions;
    private SqlResources sqlResources;
    private MongoDBResources mongoDBResources;
    private TableResources tableResources;
    private CassandraResources cassandraResources;
    private GremlinResources gremlinResources;
    /**
    * Get a Configurable instance that can be used to create CosmosDBManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new CosmosDBManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of CosmosDBManager that exposes CosmosDB resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the CosmosDBManager
    */
    public static CosmosDBManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new CosmosDBManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of CosmosDBManager that exposes CosmosDB resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the CosmosDBManager
    */
    public static CosmosDBManager authenticate(RestClient restClient, String subscriptionId) {
        return new CosmosDBManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of CosmosDBManager that exposes CosmosDB management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing CosmosDB management API entry points that work across subscriptions
        */
        CosmosDBManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage DatabaseAccounts.
     */
    public DatabaseAccounts databaseAccounts() {
        if (this.databaseAccounts == null) {
            this.databaseAccounts = new DatabaseAccountsImpl(this);
        }
        return this.databaseAccounts;
    }

    /**
     * @return Entry point to manage Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(this);
        }
        return this.operations;
    }

    /**
     * @return Entry point to manage Databases.
     */
    public Databases databases() {
        if (this.databases == null) {
            this.databases = new DatabasesImpl(this);
        }
        return this.databases;
    }

    /**
     * @return Entry point to manage Collections.
     */
    public Collections collections() {
        if (this.collections == null) {
            this.collections = new CollectionsImpl(this);
        }
        return this.collections;
    }

    /**
     * @return Entry point to manage CollectionRegions.
     */
    public CollectionRegions collectionRegions() {
        if (this.collectionRegions == null) {
            this.collectionRegions = new CollectionRegionsImpl(this);
        }
        return this.collectionRegions;
    }

    /**
     * @return Entry point to manage DatabaseAccountRegions.
     */
    public DatabaseAccountRegions databaseAccountRegions() {
        if (this.databaseAccountRegions == null) {
            this.databaseAccountRegions = new DatabaseAccountRegionsImpl(this);
        }
        return this.databaseAccountRegions;
    }

    /**
     * @return Entry point to manage PercentileSourceTargets.
     */
    public PercentileSourceTargets percentileSourceTargets() {
        if (this.percentileSourceTargets == null) {
            this.percentileSourceTargets = new PercentileSourceTargetsImpl(this);
        }
        return this.percentileSourceTargets;
    }

    /**
     * @return Entry point to manage PercentileTargets.
     */
    public PercentileTargets percentileTargets() {
        if (this.percentileTargets == null) {
            this.percentileTargets = new PercentileTargetsImpl(this);
        }
        return this.percentileTargets;
    }

    /**
     * @return Entry point to manage Percentiles.
     */
    public Percentiles percentiles() {
        if (this.percentiles == null) {
            this.percentiles = new PercentilesImpl(this);
        }
        return this.percentiles;
    }

    /**
     * @return Entry point to manage CollectionPartitionRegions.
     */
    public CollectionPartitionRegions collectionPartitionRegions() {
        if (this.collectionPartitionRegions == null) {
            this.collectionPartitionRegions = new CollectionPartitionRegionsImpl(this);
        }
        return this.collectionPartitionRegions;
    }

    /**
     * @return Entry point to manage CollectionPartitions.
     */
    public CollectionPartitions collectionPartitions() {
        if (this.collectionPartitions == null) {
            this.collectionPartitions = new CollectionPartitionsImpl(this);
        }
        return this.collectionPartitions;
    }

    /**
     * @return Entry point to manage PartitionKeyRangeIds.
     */
    public PartitionKeyRangeIds partitionKeyRangeIds() {
        if (this.partitionKeyRangeIds == null) {
            this.partitionKeyRangeIds = new PartitionKeyRangeIdsImpl(this);
        }
        return this.partitionKeyRangeIds;
    }

    /**
     * @return Entry point to manage PartitionKeyRangeIdRegions.
     */
    public PartitionKeyRangeIdRegions partitionKeyRangeIdRegions() {
        if (this.partitionKeyRangeIdRegions == null) {
            this.partitionKeyRangeIdRegions = new PartitionKeyRangeIdRegionsImpl(this);
        }
        return this.partitionKeyRangeIdRegions;
    }

    /**
     * @return Entry point to manage SqlResources.
     */
    public SqlResources sqlResources() {
        if (this.sqlResources == null) {
            this.sqlResources = new SqlResourcesImpl(this);
        }
        return this.sqlResources;
    }

    /**
     * @return Entry point to manage MongoDBResources.
     */
    public MongoDBResources mongoDBResources() {
        if (this.mongoDBResources == null) {
            this.mongoDBResources = new MongoDBResourcesImpl(this);
        }
        return this.mongoDBResources;
    }

    /**
     * @return Entry point to manage TableResources.
     */
    public TableResources tableResources() {
        if (this.tableResources == null) {
            this.tableResources = new TableResourcesImpl(this);
        }
        return this.tableResources;
    }

    /**
     * @return Entry point to manage CassandraResources.
     */
    public CassandraResources cassandraResources() {
        if (this.cassandraResources == null) {
            this.cassandraResources = new CassandraResourcesImpl(this);
        }
        return this.cassandraResources;
    }

    /**
     * @return Entry point to manage GremlinResources.
     */
    public GremlinResources gremlinResources() {
        if (this.gremlinResources == null) {
            this.gremlinResources = new GremlinResourcesImpl(this);
        }
        return this.gremlinResources;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public CosmosDBManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return CosmosDBManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private CosmosDBManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new CosmosDBImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
