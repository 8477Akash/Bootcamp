package com.akash.service;


import com.akash.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class OrderServiceTest {

    @Test
    public void testGetInstance() {
        OrderService orderService = OrderService.getInstance();
        assertNotNull(orderService);
        assertTrue(orderService instanceof OrderService);
    }

    @Test
    public void testPlaceOrderWithCc() {
        OrderService orderService = OrderService.getInstance();
        Order order = new Order(1, "Test Item", 100.0);
        order.setCustomerNotified(false);
        boolean testCc = orderService.placeOrder(order, "Test CC");
        assertTrue(testCc);
        assertTrue(order.isCustomerNotified());
        assertEquals(120.0, order.getPriceWithTax(), 0.01);
    }

    @Test
    public void testPlaceOrder() {
        OrderService orderService = OrderService.getInstance();
        Order order = new Order(1, "Test Item", 100.0);
        order.setCustomerNotified(true);
        try {
            orderService.placeOrder(order);
            assertFalse(order.isCustomerNotified());
            assertEquals(120.0, order.getPriceWithTax(), 0.01);
        } catch (Exception e) {
            assertTrue(e instanceof RuntimeException);
        }
    }

}