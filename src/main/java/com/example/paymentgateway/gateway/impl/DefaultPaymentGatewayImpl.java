package com.example.paymentgateway.gateway.impl;

import com.example.paymentgateway.gateway.PaymentGateway;
import com.example.paymentgateway.model.request.PaymentRequest;
import com.example.paymentgateway.model.response.PaymentResponse;
import com.example.paymentgateway.provider.PaymentProvider;
import com.example.paymentgateway.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DefaultPaymentGatewayImpl implements PaymentGateway<PaymentResponse, PaymentRequest> {
    private final PaymentProvider<PaymentService<PaymentRequest, PaymentResponse>> paymentProvider;

    @Override
    public PaymentResponse makePayment(PaymentRequest paymentRequest) {
        return paymentProvider.getProvider(paymentRequest.getPaymentProviderType()).pay(paymentRequest);
    }

}
