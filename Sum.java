import java.util.Scanner;

public class Sum {
public static void main(String[] args){
 System.out.println("Enter A");
    Scanner sc=new Scanner(System.in);
    int A=sc.nextInt();
    System.out.println("Enter B");
    int B=sc.nextInt();
    int sum=A+B;
    System.out.println("The Sum Of A and B is " +sum);
    sc.close();

}

    
}
