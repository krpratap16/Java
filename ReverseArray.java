import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
         int []arr={1,3,23,9,18};
         reverseA(arr);
         System.out.println(Arrays.toString(arr));
    }

    static void reverseA(int []arr){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int []arr,int l1 ,int l2){
        int temp= arr[l1];
        arr[l1]=arr[l2];
        arr[l2]=temp;
    }
    
}
