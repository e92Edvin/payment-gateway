package com.example.paymentgateway.service.impl;

import com.example.paymentgateway.model.request.ProviderTwoPaymentRequest;
import com.example.paymentgateway.model.response.ProviderTwoPaymentResponse;
import com.example.paymentgateway.service.PaymentService;
import org.springframework.stereotype.Component;

@Component
public class ProviderTwoPaymentServiceImpl implements PaymentService<ProviderTwoPaymentRequest, ProviderTwoPaymentResponse> {

    @Override
    public ProviderTwoPaymentResponse pay(ProviderTwoPaymentRequest request) {
        // To do payment logic with provider 2 ...
        return new ProviderTwoPaymentResponse();
    }

}
