package com.example.paymentgateway.gateway;

import com.example.paymentgateway.model.request.PaymentRequest;
import com.example.paymentgateway.model.response.PaymentResponse;

public interface PaymentGateway<T extends PaymentResponse, K extends PaymentRequest> {
    T makePayment(K paymentRequest);
}
