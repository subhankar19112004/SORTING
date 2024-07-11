import java.util.Arrays;
public class INSERTION {
    public static void main(String[]args){
        int[]arr={-3,99,76,89};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;//this will run if the array id already sorted given
                }
            }
        }
    }
    static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }
}
