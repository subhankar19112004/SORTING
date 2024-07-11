import java.util.Arrays;
public class SELECTION{
    public static void main(String[] args) {
        int[]arr={2,38,-78,56,97};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[]arr){
        for(int i=0;i<arr.length;i++){
            //find the max item in the remaining array and swap with corect index
            int last=arr.length-i-1;
            int MaxIndex=getMaxIndex(arr,0,last);
            swap(arr,MaxIndex,last);
        }
    }
    static void swap(int[]arr,int first,int second){
        int temp =arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static int getMaxIndex(int[]arr,int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max =i;
            }
        }
        return max;
    }
}
