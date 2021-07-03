package com.example.paymentgateway.service;

import com.example.paymentgateway.model.request.PaymentRequest;
import com.example.paymentgateway.model.response.PaymentResponse;

public interface PaymentService<T extends PaymentRequest, R extends PaymentResponse> {
    R pay(T request);
}
