package com.akash.service;

import com.akash.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class EmailServiceTest {
    @InjectMocks
    public EmailService emailSer;

    @Test
    public void testGetInstance() {
        EmailService emailService = EmailService.getInstance();
        assertNotNull(emailService);
        assertTrue(emailService instanceof EmailService);
    }

    @Test
    public void testSendEmail() {
        Order order = new Order(1, "Test Item", 100.0);
        order.setCustomerNotified(true);
        try {
            emailSer.sendEmail(order);
            assertFalse(order.isCustomerNotified());
        } catch (RuntimeException e) {
            assertTrue(e instanceof RuntimeException);
        }
    }

    @Test
    public void testSendEmailWithAttachment() {
        Order order = new Order(1, "Test Item", 100.0);
        order.setCustomerNotified(false);
        boolean result = emailSer.sendEmail(order, "123");
        assertTrue(order.isCustomerNotified());
        assertTrue(result);
    }
}