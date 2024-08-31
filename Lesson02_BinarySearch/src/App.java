public class App {
    public static void main(String[] args) throws Exception {
        int[] sortedArray = {4, 7, 9, 14, 19};
        int target = 14;

        int result = binarySearch(sortedArray, target);

        if (result != -1) {
            System.out.println("Element found at Index: " + result);
        } else {
            System.out.println("Element was not found");
        }
    }


    public static int binarySearch(int[] sortedNumbers, int targetNumber) {
        int left = 0;
        int right = sortedNumbers.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (sortedNumbers[mid] == targetNumber) {
                return mid;
            } else if (sortedNumbers[mid] > targetNumber) {
                right = mid + 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
