/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.TransactionInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.BillingManager;
import org.joda.time.DateTime;

/**
 * Type representing Transaction.
 */
public interface Transaction extends HasInner<TransactionInner>, HasManager<BillingManager> {
    /**
     * @return the billingProfileDisplayName value.
     */
    String billingProfileDisplayName();

    /**
     * @return the billingProfileId value.
     */
    String billingProfileId();

    /**
     * @return the customerDisplayName value.
     */
    String customerDisplayName();

    /**
     * @return the customerId value.
     */
    String customerId();

    /**
     * @return the dateProperty value.
     */
    DateTime dateProperty();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the invoice value.
     */
    String invoice();

    /**
     * @return the invoiceSectionDisplayName value.
     */
    String invoiceSectionDisplayName();

    /**
     * @return the invoiceSectionId value.
     */
    String invoiceSectionId();

    /**
     * @return the kind value.
     */
    TransactionTypeKind kind();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the orderId value.
     */
    String orderId();

    /**
     * @return the orderName value.
     */
    String orderName();

    /**
     * @return the productDescription value.
     */
    String productDescription();

    /**
     * @return the productFamily value.
     */
    String productFamily();

    /**
     * @return the productType value.
     */
    String productType();

    /**
     * @return the productTypeId value.
     */
    String productTypeId();

    /**
     * @return the quantity value.
     */
    Integer quantity();

    /**
     * @return the subscriptionId value.
     */
    String subscriptionId();

    /**
     * @return the subscriptionName value.
     */
    String subscriptionName();

    /**
     * @return the transactionAmount value.
     */
    Amount transactionAmount();

    /**
     * @return the transactionType value.
     */
    ReservationType transactionType();

    /**
     * @return the type value.
     */
    String type();

}
