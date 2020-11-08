package mainPackage;

import org.junit.Assert;
import org.junit.Test;
import CheckMethods.GenericsCheckMethods;

public class GenericsTestCasesMain {

	GenericsCheckMethods checkMethods;
	
	@Test
	public void checkFirstFloatNegitive() { //Test case for first Value Negative
		
		checkMethods = new GenericsCheckMethods(23.2,67.4,47.6);
		float result = (float) checkMethods.checkFloat();
		Assert.assertNotEquals(23.2, result);
	}
	
	@Test
	public void checkFirstFloatPositive() { //Test case for first Value Positive
		
		checkMethods = new GenericsCheckMethods(67.5,32.3,47.9);
		float result = (float) checkMethods.checkFloat();
		Assert.assertEquals(67.5, result, 0.01);
	}
	
	@Test
	public void checkSecondFloatNegitive() { //Test case for Second Value Negative
		
		checkMethods = new GenericsCheckMethods(23.2,18.1,47.2);
		float result = (float) checkMethods.checkFloat();
		Assert.assertNotEquals(18.1, result);
	}
	
	@Test
	public void checkSecondFloatPositive() { //Test case for Second Value Positive
		
		checkMethods = new GenericsCheckMethods(67.6,86.3,47.9);
		float result = (float) checkMethods.checkFloat();
		Assert.assertEquals(86.3, result, 0.01);
	}
	
	@Test
	public void checkThirdFloatNegitive() { //Test case for Third Value Negative
		
		checkMethods = new GenericsCheckMethods(23.1,67.0,47.4);
		float result = (float) checkMethods.checkFloat();
		Assert.assertNotEquals(47.4, result);
	}
	
	@Test
	public void checkThirdFloatPositive() { //Test case for Third Value Positive
		
		checkMethods = new GenericsCheckMethods(67.3,32.8,77.7);
		float result = (float) checkMethods.checkFloat();
		Assert.assertEquals(77.7, result, 0.01);
	}
}
