package w3.learndsa.arrays;

public class Sorter {
	
	public int[] bubbleSort(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			boolean swapped = false;
			for (int j = 0; j < intArray.length-i-1; j++) {
				if (intArray[j] > intArray[j+1]) {
					int temp = intArray[j];
					intArray[j] = intArray[j+1];
					intArray[j+1] = temp;
					swapped = true;
				}
			}
			if (!swapped)
				break;
		}
		return intArray;
	}
	
	public int[] selectionSort(int[] intArray) {
		for(int i = 0; i < intArray.length-1; i++) {
			int lowestIndex= i;
			for (int j = i+1; j < intArray.length; j++) {
				if(intArray[j] < intArray[lowestIndex]) {
					lowestIndex = j;
				}
			}
			int temp = intArray[i];
			intArray[i] = intArray[lowestIndex];
			intArray[lowestIndex] = temp;
		}
		return intArray;
	}

}
