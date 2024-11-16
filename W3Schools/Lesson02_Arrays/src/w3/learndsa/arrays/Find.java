package w3.learndsa.arrays;

public class Find {
	
	public int findLowestValue(int[] intArray) {
		int lowest = intArray[0];
		
		for(int i : intArray) {
			if (intArray[i] < lowest) 
				lowest = intArray[i];
		}
		
	}

}
