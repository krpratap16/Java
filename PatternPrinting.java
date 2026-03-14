public class PatternPrinting {
    public static void main(String[] args) {
        Pattern(4);
        
    }
    // static void Pattern(int n){
    //     for( int row=1;row<=n;row++){
    //      for(int column=1;column<=row;column++) 
    //     for(int column=1;column<=n-row+1;column++)
    //     {
    //         System.out.print("* ");
    //      }  

    //      System.out.println();
    //     }

    static void Pattern(int N){
        for(int row=0;row<2*N;row++){
         int TotalCol=row>N?2*N-row:row;
         for(int col=0;col<TotalCol;col++){
            System.out.print("* ");
         }
        System.out.println();
        }
    }
    
}
