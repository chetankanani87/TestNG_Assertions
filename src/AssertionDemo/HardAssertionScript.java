package AssertionDemo;

import org.testng.Assert;
import org.testng.annotations.*;

public class HardAssertionScript {
	
	@Test
	public void AssertTest1() {
		System.out.println("Test Case-1 Started");
		Assert.assertEquals(12, 13);
		System.out.println("Test Case-1 Completed");
	}
	
	@Test
	public void AssertTest2() {
		System.out.println("Test Case-2 Started");
		Assert.assertEquals(12, 13, "Dropdown count does not match please go to developer.");
		System.out.println("Test Case-2 Completed");

	}
	
	@Test
	public void AssertTest3() {
		System.out.println("Test Case-3 Started");
		Assert.assertEquals("Hello", "Hello", "Words does not match pleas raise a bug.");
		System.out.println("Test Case-3 Completed");
	}
}
