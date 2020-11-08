package mainPackage;

import org.junit.Assert;
import org.junit.Test;

import CheckMethods.GenericClassRefactor;
import CheckMethods.GenericsCheckMethods;

@SuppressWarnings({ "unchecked", "rawtypes" })

public class GenericsTestCasesMain {

	GenericsCheckMethods checkMethods;
	
	
	@Test
	public void checkFirstIntegerNegitive() { //Test case for first Integer Value Negative
		
		checkMethods = new GenericsCheckMethods(23,67,47);
		Comparable result = checkMethods.checkMaxValue();
		Assert.assertNotEquals(23, result);
	}
	
	@Test
	public void checkFirstIntegerPositive() { //Test case for first Integer Value Positive
		
		checkMethods = new GenericsCheckMethods(67,32,47);
		Comparable result = checkMethods.checkMaxValue();
		Assert.assertEquals(67, result);
	}
	
	@Test
	public void checkSecondIntegerNegitive() { //Test case for Second Integer Value Negative
		
		checkMethods = new GenericsCheckMethods(23,18,47);
		Comparable result = checkMethods.checkMaxValue();
		Assert.assertNotEquals(18, result);
	}
	
	@Test
	public void checkSecondIntegerPositive() { //Test case for Second Integer Value Positive
		
		checkMethods = new GenericsCheckMethods(67,86,47);
		Comparable result = checkMethods.checkMaxValue();
		Assert.assertEquals(86, result);
	}
	
	@Test
	public void checkThirdIntegerNegitive() { //Test case for Third Integer Value Negative
		
		checkMethods = new GenericsCheckMethods(23,67,47);
		Comparable result = checkMethods.checkMaxValue();
		Assert.assertNotEquals(47, result);
	}
	
	@Test
	public void checkThirdIntegerPositive() { //Test case for Third Integer Value Positive
		
		checkMethods = new GenericsCheckMethods(67,32,77);
		Comparable result = checkMethods.checkMaxValue();
		Assert.assertEquals(77, result);
	}
	
	@Test
	public void checkFirstFloatNegitive() { //Test case for first Float Value Negative
		
		checkMethods = new GenericsCheckMethods(23.2,67.4,47.6);
		Comparable result = checkMethods.checkMaxValue();
		Assert.assertNotEquals(23.2, result);
	}
	
	@Test
	public void checkFirstFloatPositive() { //Test case for first Float Value Positive
		
		checkMethods = new GenericsCheckMethods(67.5,32.3,47.9);
		Comparable result = checkMethods.checkMaxValue();
		Assert.assertEquals(67.5, result);
	}
	
	@Test
	public void checkSecondFloatNegitive() { //Test case for Second Float Value Negative
		
		checkMethods = new GenericsCheckMethods(23.2,18.1,47.2);
		Comparable result = checkMethods.checkMaxValue();
		Assert.assertNotEquals(18.1, result);
	}
	
	@Test
	public void checkSecondFloatPositive() { //Test case for Second Float Value Positive
		
		checkMethods = new GenericsCheckMethods(67.6,86.3,47.9);
		Comparable result = checkMethods.checkMaxValue();
		Assert.assertEquals(86.3, result);
	}
	
	@Test
	public void checkThirdFloatNegitive() { //Test case for Third Float Value Negative
		
		checkMethods = new GenericsCheckMethods(23.1,67.0,47.4);
		Comparable result = checkMethods.checkMaxValue();
		Assert.assertNotEquals(47.4, result);
	}
	
	@Test
	public void checkThirdFloatPositive() { //Test case for Third Float Value Positive
		
		checkMethods = new GenericsCheckMethods(67.3,32.8,77.7);
		Comparable result = checkMethods.checkMaxValue();
		Assert.assertEquals(77.7, result);
	}
	
	@Test
	public void checkFirstStringNegitive() { //Test case for first String Negative
		
		checkMethods = new GenericsCheckMethods("Apple", "Peach", "Banana");
		Comparable result = checkMethods.checkMaxValue();
		Assert.assertNotEquals("Apple", result);
	}
	
	@Test
	public void checkFirstFStringPositive() { //Test case for first String Positive
		
		checkMethods = new GenericsCheckMethods("Peach", "Apple", "Banana");
		Comparable result = checkMethods.checkMaxValue();
		Assert.assertEquals("Peach", result);
	}
	
	@Test
	public void checkSecondStringNegitive() { //Test case for Second String Negative
		
		checkMethods = new GenericsCheckMethods("Peach", "Apple", "Banana");
		Comparable result = checkMethods.checkMaxValue();
		Assert.assertNotEquals("Apple", result);
	}
	
	@Test
	public void checkSecondStringPositive() { //Test case for Second String Positive
		
		checkMethods = new GenericsCheckMethods("Apple", "Peach", "Banana");
		Comparable result = checkMethods.checkMaxValue();
		Assert.assertEquals("Peach", result);
	}
	
	@Test
	public void checkThirdStringNegitive() { //Test case for Third String Negative
		
		checkMethods = new GenericsCheckMethods("Apple", "Peach", "Banana");
		Comparable result = checkMethods.checkMaxValue();
		Assert.assertNotEquals("Banana", result);
	}
	
	@Test
	public void checkThirdStringPositive() { //Test case for Third String Positive
		
		checkMethods = new GenericsCheckMethods("Apple", "Banana", "Peach");
		Comparable result = checkMethods.checkMaxValue();
		Assert.assertEquals("Peach", result);
	}
	
	@Test
	public void checkFirstIntegerNegitive1() { //Test case for first Integer Value Negative
		
		GenericClassRefactor genericClassRefactor;
		genericClassRefactor = new GenericClassRefactor(23,67,47);
		Comparable result = genericClassRefactor.checkMax();
		Assert.assertNotEquals(23, result);
	}
	
}
