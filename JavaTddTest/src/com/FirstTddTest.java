package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FirstTddTest {

	@Test
	void myFirst1Test() {
		MyHelper helper = new MyHelper();
		assertEquals("1",helper.getResult("1"));
	}
	
	
	@Test
	void myFirst3Test() {
		MyHelper helper = new MyHelper();
		assertEquals("fuzz",helper.getResult("3"));
	}
	
	@Test
	void myFirst5Test() {
		MyHelper helper = new MyHelper();
		assertEquals("buzz",helper.getResult("5"));
	}

	
	@Test
	void myFirst15Test() {
		MyHelper helper = new MyHelper();
		assertEquals("fuzzbuzz",helper.getResult("15"));
	}

}
