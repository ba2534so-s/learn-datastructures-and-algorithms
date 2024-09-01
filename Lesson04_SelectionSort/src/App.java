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
        int smallestIndex = -1;
        int lastIndex = unsorted.length - 1;
        for (int i = 0; i < lastIndex - 1; i++) {
            smallestIndex = i;
            for (int j = i; j < lastIndex - i; j++) {
                if (unsorted[j] > unsorted[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            
        }
    }
}
