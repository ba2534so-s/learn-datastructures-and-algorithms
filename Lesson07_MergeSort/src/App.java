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

    private static void mergeSort(int[] arr, int start, int end) {

        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);

            merge(arr, start, mid, end);
        }

    }

    private static void merge(int[] arr, int start, int mid, int end) {

        // get size of left array
        int leftSize = mid-start+1;
        // get size of right array
        int rightSize = end - mid;

        // Create left and right arrays
        int[] leftArr = new int[leftSize];
        int[] rightArr = new int[rightSize];

        for (int x = 0; x < leftSize; x++) {
            leftArr[x]  = arr[start + x];
        }

        for (int x = 0; x < rightSize; x++) {  
            rightArr[x] = arr[mid+1+x];
        }

        int i = 0;
        int j = 0;
        int k = start;

        while (i < leftSize && j < rightSize) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        
        while (i < leftSize) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
        
    }
}
