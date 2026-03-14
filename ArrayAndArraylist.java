
import java.sql.Array;
import java.util.*;

public class ArrayAndArraylist {


    static void change(int[] arr){
    arr[0]=99;
    
}
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);


   

    int []arr= new int[5];
    arr[0]=23;
    arr[0]=24;
    arr[0]=44;
    arr[0]=93;
    arr[0]=3;


      
        // System.out.println(arr[1]);

    //     for(int Num:arr){
    //         System.out.print(Num+" ");
    //     }
    // for(int i=0;i<arr.length;i++){
    //     System.out.print(arr[i]+" ");
    // }


//     for(int i=0;i<arr.length;i++)
//     arr[i]=input.nextInt();


// for(int i=0;i<arr.length;i++){
//     System.out.print(arr[i]+" ");
// }

// String[] str= new String[4] ;

// for(int i=0;i<str.length;i++){
//     str[i]=input.next();

// }
// System.out.println(Arrays.toString(str));


int[] nums={11,32,43,43};
System.out.println(Arrays.toString(nums));

change(nums);

System.out.println(Arrays.toString(nums));


}
    
}
