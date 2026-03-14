import java.util.Arrays;

public class SwapValueInArray {
    public static void main(String[] args) {
        int [] arr={0,1,2,3,4,5};

        swap(arr,0,5);
        System.err.println(Arrays.toString(arr));
    }

    static void swap(int[] nums,int index0,int index5){

        int temp=nums[index5];
        nums[index5]=nums[index0];
        nums[index0]=temp;

    } 
    
}
