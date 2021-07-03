package com.example.paymentgateway.controller;

import com.example.paymentgateway.gateway.PaymentGateway;
import com.example.paymentgateway.model.request.PaymentRequest;
import com.example.paymentgateway.model.request.ProviderOnePaymentRequest;
import com.example.paymentgateway.model.response.PaymentResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentController {
    private final PaymentGateway<PaymentResponse, PaymentRequest> paymentGateway;

    @PostMapping("/pay")
    public ResponseEntity<PaymentResponse> processPayment(@RequestBody ProviderOnePaymentRequest paymentRequest) {
        return ResponseEntity.ok(paymentGateway.makePayment(paymentRequest));
    }

}
