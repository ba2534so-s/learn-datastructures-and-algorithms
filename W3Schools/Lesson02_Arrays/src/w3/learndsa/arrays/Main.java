package w3.learndsa.arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {7, 12, 9, 3, 8, 5, 2, 10, 9, 11};
		
		System.out.print("Unsorted Array: ");
		for(int i : intArray) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		int[] sortedArray = new int[intArray.length];
		Sorter sort = new Sorter();
		sortedArray = sort.bubbleSort(intArray);
		
		
		System.out.print("Sorted Array: ");
		for(int i : sortedArray) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

}
