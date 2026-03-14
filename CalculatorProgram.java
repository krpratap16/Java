import java.util.*;

public class CalculatorProgram {
   public static void main(String[] args) {

   int ans=0;
   Scanner input= new Scanner(System.in);

    while(true){
        
         System.out.println("Enter The Operation");
         
        char op=input.next().trim().charAt(0);
   
        if(op == '+' || op =='-' || op =='*' || op == '/' || op =='%'){

            System.out.println("Enter The Numbers");
        
            int Num1=input.nextInt();
            int Num2=input.nextInt();

            if(op =='+'){
                ans= Num1+Num2;
            }
            if(op =='-'){
                ans= Num1-Num2;
            }
            if(op =='*'){
                ans= Num1*Num2;
            }
            if(op =='/'){
                if(Num2 !=0){
                ans= Num1/Num2;
                }
            }
            if(op == '%'){
                ans=Num1%Num2;
            }

        }
         else if(op == 'x' || op == 'X'){
                break;
            }
            else{
                System.out.println("This Is Invalid Parameter !!!");
            }

System.out.println(ans);
      input.close();
       
    }

   } 
}
