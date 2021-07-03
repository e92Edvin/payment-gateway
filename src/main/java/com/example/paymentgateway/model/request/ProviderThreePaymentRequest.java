package com.example.paymentgateway.model.request;

import com.example.paymentgateway.model.constant.PaymentProviderType;

public class ProviderThreePaymentRequest extends PaymentRequest {

    @Override
    public PaymentProviderType getPaymentProviderType() {
        return PaymentProviderType.PROVIDER_THREE;
    }

}
