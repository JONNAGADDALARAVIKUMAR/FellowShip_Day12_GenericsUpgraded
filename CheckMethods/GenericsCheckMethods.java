package CheckMethods;

public class GenericsCheckMethods<T extends Comparable<T>> {
	
	private T firstStringValue;
	private T secondStringValue;
	private T thirdStringValue;
	
	public GenericsCheckMethods(T firstStringValue, T secondStringValue, T thirdStringValue) {
		this.firstStringValue = firstStringValue;
		this.secondStringValue = secondStringValue;
		this.thirdStringValue = thirdStringValue;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Comparable checkMaxValue() {
		
		Comparable max = null;
		if(firstStringValue.compareTo(secondStringValue) >= 0 && firstStringValue.compareTo(thirdStringValue) > 0)
			max = firstStringValue;
		else if(secondStringValue.compareTo(firstStringValue) >= 0 && secondStringValue.compareTo(thirdStringValue) > 0)
			max = secondStringValue;
		else if(thirdStringValue.compareTo(firstStringValue) >= 0 && thirdStringValue.compareTo(secondStringValue) >= 0)
			max = thirdStringValue;
		return max;
	}
	
	// Can Test More than Three Values
	T[] genericList;
	public GenericsCheckMethods(T[] genericList) {
		this.genericList = genericList;
	}
	
	T max;
	public T checkMaximumInList() { 
		
		max = genericList[0];
		for(int i=1; i < genericList.length; i++) {
			
			if(genericList[i].compareTo(max) > 0) {
				max = genericList[i];
			}
		}
		return max;
	}
}
