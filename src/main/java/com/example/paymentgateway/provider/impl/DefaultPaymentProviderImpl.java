package com.example.paymentgateway.provider.impl;

import com.example.paymentgateway.model.constant.PaymentProviderType;
import com.example.paymentgateway.model.request.PaymentRequest;
import com.example.paymentgateway.model.response.PaymentResponse;
import com.example.paymentgateway.provider.PaymentProvider;
import com.example.paymentgateway.service.PaymentService;
import com.example.paymentgateway.service.impl.ProviderOnePaymentServiceImpl;
import com.example.paymentgateway.service.impl.ProviderThreePaymentServiceImpl;
import com.example.paymentgateway.service.impl.ProviderTwoPaymentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DefaultPaymentProviderImpl implements PaymentProvider<PaymentService<PaymentRequest, PaymentResponse>> {
    private final ApplicationContext applicationContext;

    @Override
    @SuppressWarnings("rawtypes")
    public PaymentService getProvider(PaymentProviderType type) {
        switch (type) {
            case PROVIDER_ONE:
                return applicationContext.getBean(ProviderOnePaymentServiceImpl.class);
            case PROVIDER_TWO:
                return applicationContext.getBean(ProviderTwoPaymentServiceImpl.class);
            case PROVIDER_THREE:
                return applicationContext.getBean(ProviderThreePaymentServiceImpl.class);
            default:
                throw new UnsupportedOperationException("Notification type: " + type + " not supported");
        }
    }

}
