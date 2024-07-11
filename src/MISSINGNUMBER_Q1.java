//import java.util.Arrays;
public class MISSINGNUMBER_Q1 {
    public static void main(String[]args){
        int[]arr={0,1,2,3,4,5,7,8};
        missingnumber(arr);
        int ans = missingnumber(arr);
        System.out.println(ans); 
    }
    static int missingnumber(int[]arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if(arr[i]<arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        //search for missing number
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index){
                return index;
            }
        }
        //case 2
        return arr.length;
    }
    static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
