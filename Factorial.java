
import java.util.*;

public class FactorialN {
    
}

static int FactorialN(int n){


    int fact=1;

    for(int counter=1;counter<=n;counter++){

     fact=fact*counter;
     
    }
    return fact;

    
}
public static void main(String[] args) {

    

    System.out.println("Enter The Number");
    Scanner input=new Scanner(System.in);
    int N=input.nextInt();

    System.out.println("The Facorial Of "+N+" = "+FactorialN(N));
    input.close();

    if (N<0) {
        System.out.println("Invalid !");
        
    }
}
