public class BinarySearch {

    public static int binarySearch(int[] input, int value){
        int start = 0;
        int end = input.length;

        while (start < end){
            int midpoint = (start + end) / 2;
            if (input[midpoint] == value){
                return midpoint;
            }
            else if(input[midpoint] <value){
                start = midpoint + 1;
            }
            else{
                end = midpoint;
            }
        }
        return -1;
    }
}

