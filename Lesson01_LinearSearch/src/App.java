public class App {
    public static void main(String[] args) {
        
        int[] sortedArray = {4, 7, 9, 14, 19};
        int target = 14;

        int result = linearSearch(sortedArray, target);

        if (result != -1) {
            System.out.println("Element found at Index: " + result);
        }

    }

    public static int linearSearch(int[] sortedNumbers, int target_numbert) {
        return -1;
    } 
}
