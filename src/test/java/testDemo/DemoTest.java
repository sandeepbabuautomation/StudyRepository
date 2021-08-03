package testDemo;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DemoTest {
	
	@Test
	public void Sum() {
		System.out.println("Sum");
		int a=10,b=20;
		Assert.assertEquals(30, a+b);
	}
	
	@Test
	public void Sub() {
		System.out.println("Sub");
		int a=10,b=20;
		Assert.assertEquals(10, b-a);
	}

}
