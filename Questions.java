import java.util.*;

public class Questions {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int n=input.nextInt();
        fact(n);
        System.out.println(fact(n));

        // int a=input.nextInt();
        // int b=input.nextInt();
        // int c=input.nextInt();

        // int max=Math.max(c,Math.max(a,b));

        // System.out.println(max);
        // input.close();

        // Scanner input=new Scanner(System.in);
        // char ch=input.next().trim().charAt(0);

        // String Case=(ch>='a'&& ch<='z') ? "Lowercase":"Uppercase";
        // System.out.println(Case);
        // input.close();
        //  System.out.println("Enter The Number");
        //  Scanner input= new Scanner(System.in);
        //  int Number=input.nextInt();

        // int a=0;
        // int b=1;
        // int count=2;
        // while(count<=Number){
        //     int temp=b;
        //     b=b+a;
        //     a= temp;
        //     count++;

        // }
        // System.out.println(b);

        // int Number=453232536;

        
        // while(Number!=0){
        //     int remainder=Number%10;

        //     System.out.print(remainder);
        //       Number= Number/10;
        //     }

        

           
        }

        static int fact(int n){
            if(n<=1){
                return 1;
            }
            return n*fact(n-1);
        }
       
        

        
    }
    

