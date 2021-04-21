package com.khanhnhb.springboot.hellospringboot;

import com.khanhnhb.springboot.hellospringboot.service.PaymentService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
class HellospringbootApplicationTests {

	@Autowired
	PaymentService paymentService;

	@Test
	public void testDependencyInjection() {
		assertNotNull(paymentService);
	}

	@Test
	public void testSumOfTwoNumber() {
		assertEquals(3.0, paymentService.sumOfTwoNumber(1.0, 2.0), 0.0);
	}

	@Test
	void contextLoads() {
	}

}
