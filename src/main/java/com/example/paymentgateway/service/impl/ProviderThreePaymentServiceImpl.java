package com.example.paymentgateway.service.impl;

import com.example.paymentgateway.model.request.ProviderThreePaymentRequest;
import com.example.paymentgateway.model.response.ProviderThreePaymentResponse;
import com.example.paymentgateway.service.PaymentService;
import org.springframework.stereotype.Component;

@Component
public class ProviderThreePaymentServiceImpl implements PaymentService<ProviderThreePaymentRequest, ProviderThreePaymentResponse> {

    @Override
    public ProviderThreePaymentResponse pay(ProviderThreePaymentRequest request) {
        // To do payment logic with provider 3 ...
        return new ProviderThreePaymentResponse();
    }

}
