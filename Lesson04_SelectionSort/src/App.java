public class App {
    public static void main(String[] args) throws Exception {
        int[] numbers = {6, 5, 2, 8, 9, 4, 1};

        System.out.print("Before Sorting: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        selectionSort(numbers);

        System.out.print("After Sorting: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] unsorted) {
        int largest = -1;
        for (int i = 0; i < unsorted.length - 1; i++) {
            for (int j = i; j < unsorted.length; j++) {
                if (unsorted[j] > unsorted[largest]) {
                    largest = j;
                }
            }
        }
    }
}
