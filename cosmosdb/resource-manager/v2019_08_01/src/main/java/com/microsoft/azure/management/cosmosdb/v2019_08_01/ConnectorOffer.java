/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2019_08_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ConnectorOffer.
 */
public final class ConnectorOffer extends ExpandableStringEnum<ConnectorOffer> {
    /** Static value Small for ConnectorOffer. */
    public static final ConnectorOffer SMALL = fromString("Small");

    /**
     * Creates or finds a ConnectorOffer from its string representation.
     * @param name a name to look for
     * @return the corresponding ConnectorOffer
     */
    @JsonCreator
    public static ConnectorOffer fromString(String name) {
        return fromString(name, ConnectorOffer.class);
    }

    /**
     * @return known ConnectorOffer values
     */
    public static Collection<ConnectorOffer> values() {
        return values(ConnectorOffer.class);
    }
}
