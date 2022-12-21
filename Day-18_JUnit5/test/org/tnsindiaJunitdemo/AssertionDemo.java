package org.tnsindiaJunitdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class AssertionDemo {
	@Test
	void accept() {
		
		/*if both the value is not same then it will fail*/
		assertEquals(15,15);
		
	}
	
	@Test
	void print() {
		
		/*if the actual value is not null then it fails*/
		assertNull(null);
		
	}
	
	@Test
	void display() {
		//Fails if expression is not true
		assertTrue(3!=4);
		
	}


}
