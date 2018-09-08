package AssertionDemo;

import org.testng.Assert;
import org.testng.annotations.*;

public class HardAssertionScript2 {
	
	@Test
	public void AssertTest1() {
		System.out.println("Test Case-1 Started");
		String mystr = "Amit Patel";
		Assert.assertTrue(mystr.contains("Prabhas"), "Names are not matching.");
		System.out.println("Test Case-1 Completed");
	}
	
	@Test
	public void AssertTest2() {
		System.out.println("Test Case-2 Started");
		Assert.assertTrue(false);
		System.out.println("Test Case-2 Completed");
	}
	
}
