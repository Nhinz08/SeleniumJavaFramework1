package Demo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class TestNGIgnoreDemo {
	
	@Test
	public void test() {
		System.out.println(" I am inside Test 1");
	}
	
	@Test
	public void test2() {
		System.out.println(" I am inside Test 1");
	
	}
}
