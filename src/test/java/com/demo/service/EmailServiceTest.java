package com.demo.service;

import com.demo.domain.Order;
import org.junit.*;

import org.junit.runner.RunWith;
import org.mockito.internal.matchers.Or;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class EmailServiceTest {

    @Test(expected = RuntimeException.class)
    public void sendEmailTest_Exception() {
        Order order = new Order(10, "Book", 200);
        EmailService emailService = EmailService.getInstance();
        emailService.sendEmail(order);

        assertFalse(order.isCustomerNotified());
    }

    @Test
    public void emailServiceGetInstanceTest() {
        EmailService emailService = EmailService.getInstance();

        assertNotNull(emailService);
        assertTrue(emailService instanceof EmailService);
    }

    @Test
    public void sendEmailTest() {
        Order order = new Order(10, "Book", 200);
        EmailService emailService = EmailService.getInstance();
        boolean actual = emailService.sendEmail(order, "Abhinav");

        assertTrue(order.isCustomerNotified());
        assertTrue(actual);
    }

    @Before
    public void beforeTest() {
        System.out.println("Before every unit test method");
    }

    @After
    public void afterTest() {
        System.out.println("After every unit test method");
    }

    @AfterClass
    public static void afterClassTest() {
        System.out.println("After Class");
    }

    @BeforeClass
    public static void beforeClassTest() {
        System.out.println("Before Class");
    }

}