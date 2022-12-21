package org.tnsindiaJunitdemo;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class ExecutorForLifeCycleMethod implements LifeCycleMethodDemo{
	@Test
	//Declares a custom display name for the test class or test method
	@DisplayName("Fast Method")
	void fast()
	{
		System.out.println("First Test case");
	}


}
