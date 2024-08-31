public class App {
    public static void main(String[] args) {
        
        int[] sortedArray = {4, 7, 9, 14, 19};
        int target = 14;

        int result = linearSearch(sortedArray, target);

        if (result != -1) {
            System.out.println("Element found at Index: " + result);
        } else {
            System.out.println("Element was not found");
        }

    }

    public static int linearSearch(int[] sortedNumbers, int targetNumber) {
        
        for (int i = 0; i < sortedNumbers.length; i++) {
            if (sortedNumbers[i] == targetNumber) {
                return i;
            }
        }

        return -1;
    } 
}
