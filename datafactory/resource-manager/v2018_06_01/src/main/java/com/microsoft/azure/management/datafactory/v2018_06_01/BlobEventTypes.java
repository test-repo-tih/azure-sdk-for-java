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
 * Defines values for BlobEventTypes.
 */
public final class BlobEventTypes extends ExpandableStringEnum<BlobEventTypes> {
    /** Static value Microsoft.Storage.BlobCreated for BlobEventTypes. */
    public static final BlobEventTypes MICROSOFT_STORAGE_BLOB_CREATED = fromString("Microsoft.Storage.BlobCreated");

    /** Static value Microsoft.Storage.BlobDeleted for BlobEventTypes. */
    public static final BlobEventTypes MICROSOFT_STORAGE_BLOB_DELETED = fromString("Microsoft.Storage.BlobDeleted");

    /**
     * Creates or finds a BlobEventTypes from its string representation.
     * @param name a name to look for
     * @return the corresponding BlobEventTypes
     */
    @JsonCreator
    public static BlobEventTypes fromString(String name) {
        return fromString(name, BlobEventTypes.class);
    }

    /**
     * @return known BlobEventTypes values
     */
    public static Collection<BlobEventTypes> values() {
        return values(BlobEventTypes.class);
    }
}
