import java.util.*;

public class NestedSwitchCae {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter empID");
        int empID=input.nextInt();
        System.out.println("Enter The Department");
        String Departement=input.next();

        switch(empID){

            case 1 :
            System.out.println("Pratap Kumar");
            break;

            case 2:
            System.out.println("Kabir ");
            break;
            case 3:
            switch(Departement){

             case "CSE":
             System.out.println("CSE Department");
             break;

             case "IT":
             System.out.println("IT Departement");
             break;

             default:
             System.out.println("Invalid EmpID");



            }

        }
        
    }
    
}
