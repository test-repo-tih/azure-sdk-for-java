/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox.implementation;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Shipment pick up response.
 */
public class ShipmentPickUpResponseInner {
    /**
     * Confirmation number for the pick up request.
     */
    @JsonProperty(value = "confirmationNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String confirmationNumber;

    /**
     * Time by which shipment should be ready for pick up, this is in local
     * time of pick up area.
     */
    @JsonProperty(value = "readyByTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime readyByTime;

    /**
     * Get confirmation number for the pick up request.
     *
     * @return the confirmationNumber value
     */
    public String confirmationNumber() {
        return this.confirmationNumber;
    }

    /**
     * Get time by which shipment should be ready for pick up, this is in local time of pick up area.
     *
     * @return the readyByTime value
     */
    public DateTime readyByTime() {
        return this.readyByTime;
    }

}
