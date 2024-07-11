import java.util.Arrays;
public class SETMISSMATCH {
    public static void main(String[] args) {
        int[]arr={2,1,4,2,6,5};
        findErrorNumbers(arr);
        System.out.println(Arrays.toString(findErrorNumbers(arr)));
    }
    static int[] findErrorNumbers(int[]arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }

        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return new int[] {arr[index], index+1};
            }
        }
        return new int[] {-1, -1};
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}