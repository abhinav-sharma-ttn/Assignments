package com.demo.service;

import com.demo.domain.Order;
import junit.framework.TestCase;
import org.junit.Test;
import org.mockito.internal.matchers.Or;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

public class OrderServiceTest {

    @Test
    public void orderServiceGetInstanceTest() {
        OrderService orderService = OrderService.getInstance();

        assertNotNull(orderService);
        assertTrue(orderService instanceof OrderService);
    }

    @Test(expected = RuntimeException.class)
    public void placeOrderTest_With_1_Parameter() {
        Order order = new Order(10, "Book", 100);
        OrderService orderService = OrderService.getInstance();

        orderService.placeOrder(order);

        double expected = 120;
        //System.out.println(order.getPriceWithTax());
        assertEquals(expected, order.getPriceWithTax(), 0.1);
        assertTrue(order.isCustomerNotified());
    }

    @Test
    public void placeOrderTest_With_2_Parameter() {
        Order order = new Order(10, "Book", 200);
        OrderService orderService = OrderService.getInstance();

        boolean expectedBoolean = orderService.placeOrder(order, "Abhinav");
        double expected = 240;

        assertEquals(expected, order.getPriceWithTax(), 0.1);
        assertTrue(order.isCustomerNotified());
        assertTrue(expectedBoolean);
    }

}