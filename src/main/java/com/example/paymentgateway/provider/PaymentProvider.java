package com.example.paymentgateway.provider;

import com.example.paymentgateway.model.constant.PaymentProviderType;

public interface PaymentProvider<T> {
    T getProvider(PaymentProviderType type);
}
