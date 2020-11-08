package CheckMethods;

public class GenericClassRefactor <T extends Comparable<T>> {
	
	GenericClassRefactor checkMax;
	T firstStringValue, secondStringValue, thirdStringValue;
	
	public GenericClassRefactor(T firstStringValue, T secondStringValue, T thirdStringValue) {
		this.firstStringValue = firstStringValue;
		this.secondStringValue = secondStringValue;
		this.thirdStringValue = thirdStringValue;
	}
	
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <T extends Comparable> T genericClassMethodMax(T firstStringValue, T secondStringValue, T thirdStringValue) {
		T max = null;
		if(firstStringValue.compareTo(secondStringValue) >= 0 && firstStringValue.compareTo(thirdStringValue) > 0)
			max = firstStringValue;
		else if(secondStringValue.compareTo(firstStringValue) >= 0 && secondStringValue.compareTo(thirdStringValue) > 0)
			max = secondStringValue;
		else if(thirdStringValue.compareTo(firstStringValue) >= 0 && thirdStringValue.compareTo(secondStringValue) >= 0)
			max = thirdStringValue;
		return max;
		
	}
	public Comparable checkMax() {
		
		return (Comparable) checkMax.genericClassMethodMax(firstStringValue, secondStringValue, thirdStringValue);
	}

}
