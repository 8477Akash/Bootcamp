package com.akash.service;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import com.akash.domain.Order;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EmailServiceTest {

    @InjectMocks
    private EmailService emailService;

    @Test
    public void sendEmail() {
        Order order = new Order(1, "Test Order", 40.0);
        order.setCustomerNotified(true);
        try {
            emailService.sendEmail(order);
        } catch (RuntimeException e) {
            // expected, do nothing
        }
        assertThat(order.isCustomerNotified(), is(false));
    }

    @Test(expected = RuntimeException.class)
    public void sendEmailWithException() {
        Order order = new Order(1, "Test Order", 40.0);
        emailService.sendEmail(order);
    }

    @Test
    public void sendEmailWithCC() {
        Order order = new Order(1, "Test Order", 40.0);
        boolean isNotified = emailService.sendEmail(order, "Sample CC");
        assertThat(isNotified, is(true));
        assertThat(order.isCustomerNotified(), is(true));
    }
}
