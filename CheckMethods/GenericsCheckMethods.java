package CheckMethods;

public class GenericsCheckMethods<T extends Comparable<T>> {
	
	String firstStringValue, secondStringValue, thirdStringValue;
	public GenericsCheckMethods(String firstStringValue, String secondStringValue, String thirdStringValue) {
		this.firstStringValue = firstStringValue;
		this.secondStringValue = secondStringValue;
		this.thirdStringValue = thirdStringValue;
	}

	public String checkString() {
		String max = null;
		if(firstStringValue.compareTo(secondStringValue) >= 0 && firstStringValue.compareTo(thirdStringValue) > 0)
			max = firstStringValue;
		else if(secondStringValue.compareTo(firstStringValue) >= 0 && secondStringValue.compareTo(thirdStringValue) > 0)
			max = secondStringValue;
		else if(thirdStringValue.compareTo(firstStringValue) >= 0 && thirdStringValue.compareTo(secondStringValue) >= 0)
			max = thirdStringValue;
		return max;
	}

}
