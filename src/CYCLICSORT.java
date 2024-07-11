import java.util.Arrays;
public class CYCLICSORT {
    public static void main(String[]args){
        int []arr={5,3,1,2,6,10,4,9,7,8};
        cyclic(arr );
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int[]arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if (arr[i] != arr[correct]) {
                Swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }
    static void Swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
