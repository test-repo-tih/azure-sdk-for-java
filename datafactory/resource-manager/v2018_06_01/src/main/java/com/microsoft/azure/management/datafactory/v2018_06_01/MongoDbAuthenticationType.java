/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for MongoDbAuthenticationType.
 */
public final class MongoDbAuthenticationType extends ExpandableStringEnum<MongoDbAuthenticationType> {
    /** Static value Basic for MongoDbAuthenticationType. */
    public static final MongoDbAuthenticationType BASIC = fromString("Basic");

    /** Static value Anonymous for MongoDbAuthenticationType. */
    public static final MongoDbAuthenticationType ANONYMOUS = fromString("Anonymous");

    /**
     * Creates or finds a MongoDbAuthenticationType from its string representation.
     * @param name a name to look for
     * @return the corresponding MongoDbAuthenticationType
     */
    @JsonCreator
    public static MongoDbAuthenticationType fromString(String name) {
        return fromString(name, MongoDbAuthenticationType.class);
    }

    /**
     * @return known MongoDbAuthenticationType values
     */
    public static Collection<MongoDbAuthenticationType> values() {
        return values(MongoDbAuthenticationType.class);
    }
}
