package com.demo.service;

import com.demo.domain.Order;
import org.junit.*;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.runner.RunWith;
import org.mockito.internal.matchers.Or;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EmailServiceTest {


    // Doubt........

//    @Test(expected = RuntimeException.class)
//    public void sendEmailTest_Exception() {
//        Order order = new Order();
//        order.setCustomerNotified(true);
//
//        assertTrue(order.isCustomerNotified());
//    }

    @Test
    public void emailServiceGetInstanceTest() {
        EmailService emailService = EmailService.getInstance();
        //emailService = null;
        assertNotNull(emailService);
        assertTrue(emailService instanceof EmailService);
    }

    @Test
    public void sendEmailTest() {
        Order order = new Order();
        order.setCustomerNotified(true);
        assertTrue(EmailService.getInstance().sendEmail(new Order(), "abhinav"));
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