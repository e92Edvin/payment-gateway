package com.example.paymentgateway.service.impl;

import com.example.paymentgateway.model.request.ProviderOnePaymentRequest;
import com.example.paymentgateway.model.response.ProviderOnePaymentResponse;
import com.example.paymentgateway.service.PaymentService;
import org.springframework.stereotype.Component;

@Component
public class ProviderOnePaymentServiceImpl implements PaymentService<ProviderOnePaymentRequest, ProviderOnePaymentResponse> {

    @Override
    public ProviderOnePaymentResponse pay(ProviderOnePaymentRequest request) {
        // To do payment logic with provider 1 ...
        return new ProviderOnePaymentResponse();
    }

}
