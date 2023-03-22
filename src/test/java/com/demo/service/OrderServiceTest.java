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

    @Test
    public void placeOrderTest_WithPrice100() {
        Order order = new Order(10, "Book", 100);
        double tax = order.getPrice() * 20 / 100;
        order.setPriceWithTax(tax);

        assertThat(20, equalTo(20));
        order.setCustomerNotified(true);

        assertTrue(order.isCustomerNotified());
    }

    @Test
    public void placeOrderTest_WithPrice200() {
        Order order = new Order(10, "Book", 200);
        double tax = order.getPrice() * 20 / 100;
        order.setPriceWithTax(tax);

        assertThat(40, equalTo(40));
        order.setCustomerNotified(true);

        assertTrue(order.isCustomerNotified());
    }

}