public class Main {
    public static void main(String[] args) {
        int[] intarray =  {-5, -2, 0, 4, 8, 20, 25};
        int target = 2;

        int result = BinarySearch.binarySearch(intarray, target);

        if (result != -1) {
            System.out.println("Found value " + target + " at index: " + result);
        } else {
            System.out.println("Value " + target + " not found in the array.");
        }
    }
}
