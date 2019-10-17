/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview.implementation;

import com.microsoft.azure.management.billing.v2019_10_01_preview.MarketplacePurchasesPolicy;
import com.microsoft.azure.management.billing.v2019_10_01_preview.ReservationPurchasesPolicy;
import com.microsoft.azure.management.billing.v2019_10_01_preview.ViewChargesPolicy;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * The Policy.
 */
@JsonFlatten
public class PolicyInner extends ProxyResource {
    /**
     * The marketplace purchases are free, allowed or not allowed. Possible
     * values include: 'AllAllowed', 'FreeAllowed', 'NotAllowed'.
     */
    @JsonProperty(value = "properties.marketplacePurchases")
    private MarketplacePurchasesPolicy marketplacePurchases;

    /**
     * The reservation purchases allowed or not. Possible values include:
     * 'Allowed', 'NotAllowed'.
     */
    @JsonProperty(value = "properties.reservationPurchases")
    private ReservationPurchasesPolicy reservationPurchases;

    /**
     * Who can view charges. Possible values include: 'None',
     * 'SubscriptionOwner'.
     */
    @JsonProperty(value = "properties.viewCharges")
    private ViewChargesPolicy viewCharges;

    /**
     * Get the marketplace purchases are free, allowed or not allowed. Possible values include: 'AllAllowed', 'FreeAllowed', 'NotAllowed'.
     *
     * @return the marketplacePurchases value
     */
    public MarketplacePurchasesPolicy marketplacePurchases() {
        return this.marketplacePurchases;
    }

    /**
     * Set the marketplace purchases are free, allowed or not allowed. Possible values include: 'AllAllowed', 'FreeAllowed', 'NotAllowed'.
     *
     * @param marketplacePurchases the marketplacePurchases value to set
     * @return the PolicyInner object itself.
     */
    public PolicyInner withMarketplacePurchases(MarketplacePurchasesPolicy marketplacePurchases) {
        this.marketplacePurchases = marketplacePurchases;
        return this;
    }

    /**
     * Get the reservation purchases allowed or not. Possible values include: 'Allowed', 'NotAllowed'.
     *
     * @return the reservationPurchases value
     */
    public ReservationPurchasesPolicy reservationPurchases() {
        return this.reservationPurchases;
    }

    /**
     * Set the reservation purchases allowed or not. Possible values include: 'Allowed', 'NotAllowed'.
     *
     * @param reservationPurchases the reservationPurchases value to set
     * @return the PolicyInner object itself.
     */
    public PolicyInner withReservationPurchases(ReservationPurchasesPolicy reservationPurchases) {
        this.reservationPurchases = reservationPurchases;
        return this;
    }

    /**
     * Get who can view charges. Possible values include: 'None', 'SubscriptionOwner'.
     *
     * @return the viewCharges value
     */
    public ViewChargesPolicy viewCharges() {
        return this.viewCharges;
    }

    /**
     * Set who can view charges. Possible values include: 'None', 'SubscriptionOwner'.
     *
     * @param viewCharges the viewCharges value to set
     * @return the PolicyInner object itself.
     */
    public PolicyInner withViewCharges(ViewChargesPolicy viewCharges) {
        this.viewCharges = viewCharges;
        return this;
    }

}
