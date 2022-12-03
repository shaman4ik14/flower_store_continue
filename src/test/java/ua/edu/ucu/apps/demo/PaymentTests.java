package ua.edu.ucu.apps.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.demo.payments.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.demo.payments.PayPalPaymentStrategy;

public class PaymentTests {
    private CreditCardPaymentStrategy creditCard;
    private PayPalPaymentStrategy payPal;

    @BeforeEach
    public void init() {
        creditCard = new CreditCardPaymentStrategy();
        payPal = new PayPalPaymentStrategy();
    }

    @Test
    public void testPaymentStrategies() {
        Assertions.assertTrue(creditCard.pay(300.0));
        Assertions.assertTrue(payPal.pay(300.0));
    }
}
