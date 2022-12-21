package org.tnsindiaJunitdemo;

import org.junit.Test;
import org.junit.jupiter.api.Assumptions;

public class AssumptionDemo {
	@Test
	void test() {
		System.setProperty("Shiwani", "Jenny");
		
		//Execute the body when the positive condition  else test will be skipped
		Assumptions.assumeTrue("Jenny".equals(System.getProperty("Shiwani")));
	}
	
	@Test
	void display() {
		System.setProperty("Shiwani", "Jenny");
		
		//Execute the body when the negative condition  else test will be skipped
		Assumptions.assumeFalse("Rhia".equals(System.getProperty("Shiwani")));
	}
	
	@Test
	void print() {
		System.setProperty("Shiwani", "Jenny");
		
		Assumptions.assumingThat(true, null);
	}

}
