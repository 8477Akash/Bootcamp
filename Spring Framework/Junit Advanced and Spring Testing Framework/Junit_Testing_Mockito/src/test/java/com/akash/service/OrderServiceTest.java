package com.akash.service;

import com.akash.domain.Order;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class OrderServiceTest {

    @Mock
    private EmailService emailService;

    @InjectMocks
    private OrderService orderService;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testPlaceOrderWithCC() {
        Order order = new Order();
        order.setPrice(100);


        when(emailService.sendEmail(any(Order.class), anyString())).thenReturn(true);

        boolean result = orderService.placeOrder(order, "cc@example.com");

        assertTrue(result);
        assertTrue(order.isCustomerNotified());

        verify(emailService, times(1)).sendEmail(any(Order.class), eq("cc@example.com"));
    }
}
