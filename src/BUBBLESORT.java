import java.util.Arrays;
public class BUBBLESORT {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,9};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[]arr){
        boolean swapped;
        //run the steps n-1 times
        for(int i=0;i<arr.length;i++){
            swapped=false;
            //for each loop, MAX item will come at the last perspective index
            for(int j=1;j< arr.length-i;j++){
                //swap if the item is smaller than the previous item
                if(arr[j ]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            //if you didn't swap for a particular value of i, it means the array given is completely sorted hence stop the program
            if(!swapped){
                break;
            }
        }
    }
}
