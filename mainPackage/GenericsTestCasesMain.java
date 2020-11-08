package mainPackage;

import org.junit.Assert;
import org.junit.Test;
import CheckMethods.GenericsCheckMethods;

public class GenericsTestCasesMain {

	GenericsCheckMethods checkMethods;
	
	@Test
	public void checkFirstStringNegitive() { //Test case for first Value Negative
		
		checkMethods = new GenericsCheckMethods("Apple", "Peach", "Banana");
		String result = checkMethods.checkString();
		Assert.assertNotEquals("Apple", result);
	}
	
	@Test
	public void checkFirstFloatPositive() { //Test case for first Value Positive
		
		checkMethods = new GenericsCheckMethods("Peach", "Apple", "Banana");
		String result = checkMethods.checkString();
		Assert.assertEquals("Peach", result);
	}
	
	@Test
	public void checkSecondFloatNegitive() { //Test case for Second Value Negative
		
		checkMethods = new GenericsCheckMethods("Peach", "Apple", "Banana");
		String result = checkMethods.checkString();
		Assert.assertNotEquals("Apple", result);
	}
	
	@Test
	public void checkSecondFloatPositive() { //Test case for Second Value Positive
		
		checkMethods = new GenericsCheckMethods("Apple", "Peach", "Banana");
		String result = checkMethods.checkString();
		Assert.assertEquals("Peach", result);
	}
	
	@Test
	public void checkThirdFloatNegitive() { //Test case for Third Value Negative
		
		checkMethods = new GenericsCheckMethods("Apple", "Peach", "Banana");
		String result = checkMethods.checkString();
		Assert.assertNotEquals("Banana", result);
	}
	
	@Test
	public void checkThirdFloatPositive() { //Test case for Third Value Positive
		
		checkMethods = new GenericsCheckMethods("Apple", "Banana", "Peach");
		String result = checkMethods.checkString();
		Assert.assertEquals("Peach", result);
	}
}
