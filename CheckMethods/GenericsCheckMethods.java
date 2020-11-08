package CheckMethods;

public class GenericsCheckMethods<T extends Comparable<T>> {
	
	Float firstFloatValue, secondFloatValue, thirdFloatValue;
	public GenericsCheckMethods(double firstFloatValue, double secondFloatValue, double thirdFloatValue) {
		this.firstFloatValue = (float) firstFloatValue;
		this.secondFloatValue = (float) secondFloatValue;
		this.thirdFloatValue = (float) thirdFloatValue;
	}

	public float checkFloat() {
		Float max = (float) 0.0;
		if(firstFloatValue.compareTo(secondFloatValue) >= 0 && firstFloatValue.compareTo(thirdFloatValue) > 0)
			max = firstFloatValue;
		else if(secondFloatValue.compareTo(firstFloatValue) >= 0 && secondFloatValue.compareTo(thirdFloatValue) > 0)
			max = secondFloatValue;
		else if(thirdFloatValue.compareTo(firstFloatValue) >= 0 && thirdFloatValue.compareTo(secondFloatValue) >= 0)
			max = thirdFloatValue;
		return max;
	}

}
