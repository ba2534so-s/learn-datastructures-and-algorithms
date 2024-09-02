public class App {
    public static void main(String[] args) {
        int[] numbers = {6, 5, 2, 8, 9, 4, 1};

        System.out.print("Before Sorting: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        quickSort(numbers);

        System.out.print("After Sorting: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void quickSort(int[] unsorted, int low, int high) {
        if (low < high) {
            int pivot = partition(unsorted, low, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {

    }

}
