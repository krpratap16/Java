
import java.util.*;


public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        

        // int [][] arr =new int[3][];
        //  int [][] arr = {

        //     {1,2,3},
        //     {4,5},
        //     {6,7,8,9}
        // };

        int [][]arr=new int[3][3];
        System.out.println(arr.length);

        for( int row=0;row<arr.length;row++){
        for(int column=0;column<arr[row].length;column++)    {
          arr[row][column]=input.nextInt();

        }
        }



    //     for( int row=0;row<arr.length;row++){
    //     for(int column=0;column<arr[row].length;column++)    {

    //         System.out.print(arr[row][column]+" ");
    //     }
    //     System.out.println();
    // }

    // for(int row=0;row<arr.length;row++){
    //     System.out.println(Arrays.toString(arr[row]));
    // }

    for(int[] a:arr){
        System.out.println(Arrays.toString(a));
    }

        }
    }
    
