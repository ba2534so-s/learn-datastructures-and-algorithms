public class App {
    public static void main(String[] args) {
        int[] numbers = {6, 5, 2, 8, 9, 4, 1};

        System.out.print("Before Sorting: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        mergeSort(numbers, 0, numbers.length - 1);

        System.out.print("After Sorting: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int[] arr, int start, int end) {

        while (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);

            merge(arr, start, mid, end);
        }

    }

    private static int merge(int[] arr, int start, int mid, int end) {

        // get size of left array
        int leftSize = mid-start+1;
        // get size of right array
        int rightSize = end - mid;

        // Create left and right arrays

    }
}
