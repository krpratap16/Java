public class MaxArray {
    public static void main(String[] args) {
        int []arr={1,3,23,9,18};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                

            }
           
        }
        System.out.println(" The Maximum Value Is = "+max);
    }
    
}
