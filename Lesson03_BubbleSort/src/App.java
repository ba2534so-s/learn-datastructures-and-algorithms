public class App {
    public static void main(String[] args) {
        
        int[] numbers = {6, 5, 2, 8, 9, 4};

        System.out.print("Before Sorting: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        int[] sortedNumbers = bubbleSort(numbers);

        System.out.print("After Sorting: ");
        for (int n : sortedNumbers) {
            System.out.print(n + " ");
        }
        System.out.println();

    }

    public static int[] bubbleSort(int[] unsorted) {
        for(int i = 0; i < unsorted.length - 1; i++) {
            

        }
    }
}
