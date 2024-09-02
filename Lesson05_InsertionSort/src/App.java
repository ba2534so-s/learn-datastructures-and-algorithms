public class App {
    public static void main(String[] args) throws Exception {
        int[] numbers = {6, 5, 2, 8, 9, 4, 1};

        System.out.print("Before Sorting: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        insertionSort(numbers);

        System.out.print("After Sorting: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void insertionSort(int[] unsorted) {
        int temp = 0;
        int j = 0;

        for(int i = 1; i < unsorted.length; i++) {
            temp = unsorted[i];
            j = i - 1;
            while (j >= 0 && temp < unsorted[j]) {
                unsorted[j+1] = unsorted[j];
                j--;
            }
        }
    }
}
