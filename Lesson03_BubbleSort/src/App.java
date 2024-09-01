public class App {
    public static void main(String[] args) {
        
        int[] numbers = {6, 5, 2, 8, 9, 4, 1};

        System.out.print("Before Sorting: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        bubbleSort(numbers);

        System.out.print("After Sorting: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

    }

    public static void bubbleSort(int[] unsorted) {
        for(int i = 0; i < unsorted.length - 1; i++) {
            for(int j = 0; j < unsorted.length - i - 1; j++) {
                if (unsorted[j] > unsorted[j+1]) {
                    int temp = unsorted[j];
                    unsorted[j] = unsorted[j+1];
                    unsorted[j+1] = temp;
                }
            }
        }
    }
}
