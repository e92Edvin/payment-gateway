package com.example.paymentgateway.model.request;

import com.example.paymentgateway.model.constant.PaymentProviderType;

public abstract class PaymentRequest {
    // any common fields
    public abstract PaymentProviderType getPaymentProviderType();
}
