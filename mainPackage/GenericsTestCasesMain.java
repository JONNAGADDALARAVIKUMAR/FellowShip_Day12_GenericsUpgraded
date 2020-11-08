package mainPackage;

import org.junit.Assert;
import org.junit.Test;
import CheckMethods.GenericsCheckMethods;

public class GenericsTestCasesMain {

	GenericsCheckMethods checkMethods;
	@Test
	public void checkFirstIntegerNegitive() { //Test case for first Value Negative
		
		checkMethods = new GenericsCheckMethods(23,67,47);
		int result = checkMethods.checkInteger();
		Assert.assertNotEquals(23, result);
	}
	
	@Test
	public void checkFirstIntegerPositive() { //Test case for first Value Positive
		
		checkMethods = new GenericsCheckMethods(67,32,47);
		int result = checkMethods.checkInteger();
		Assert.assertEquals(67, result);
	}
	
	@Test
	public void checkSecondIntegerNegitive() { //Test case for Second Value Negative
		
		checkMethods = new GenericsCheckMethods(23,18,47);
		int result = checkMethods.checkInteger();
		Assert.assertNotEquals(18, result);
	}
	
	@Test
	public void checkSecondIntegerPositive() { //Test case for Second Value Positive
		
		checkMethods = new GenericsCheckMethods(67,86,47);
		int result = checkMethods.checkInteger();
		Assert.assertEquals(86, result);
	}
	
	@Test
	public void checkThirdIntegerNegitive() { //Test case for Third Value Negative
		
		checkMethods = new GenericsCheckMethods(23,67,47);
		int result = checkMethods.checkInteger();
		Assert.assertNotEquals(47, result);
	}
	
	@Test
	public void checkThirdIntegerPositive() { //Test case for Third Value Positive
		
		checkMethods = new GenericsCheckMethods(67,32,77);
		int result = checkMethods.checkInteger();
		Assert.assertEquals(77, result);
	}
}
