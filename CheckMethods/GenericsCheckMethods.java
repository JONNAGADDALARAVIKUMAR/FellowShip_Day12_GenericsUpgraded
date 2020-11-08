package CheckMethods;

public class GenericsCheckMethods<T extends Comparable<T>> {

	Integer firstValue, secondValue, thirdValue;
	public GenericsCheckMethods(Integer firstValue, Integer secondValue, Integer thirdValue) {
		
		this.firstValue = firstValue;
		this.secondValue = secondValue;
		this.thirdValue = thirdValue;
	}
	public int checkInteger() {
		Integer max = 0;
		if(firstValue.compareTo(secondValue) >= 0 && firstValue.compareTo(thirdValue) >= 0)
			max = firstValue;
		else if(secondValue.compareTo(firstValue) >= 0 && secondValue.compareTo(thirdValue) >= 0)
			max = secondValue;
		else if(thirdValue.compareTo(firstValue) >= 0 && thirdValue.compareTo(secondValue) >= 0)
			max = thirdValue;
		return max;
	}

}
