
import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
    //     String fruit =input.next();

    //    switch(fruit) {
    //     case "Mango":
    //     System.out.println("King Of Fruit");
    //     break;

    //     case "Apple":
    //     System.out.println("A Sweet Red Fruit");

    //     default:
    //     System.out.println("Please Enter The Valid Fruit Name");
    //    }
        
     System.out.println("Enter The Day");
    int Day=input.nextInt();

    

    // switch(Day){

    //     case 1 -> System.out.println("Monday");
    //     case 2 -> System.out.println("Tuesday");
    //     case 3 -> System.out.println("Wednesday");
    //     case 4 -> System.out.println("Thursday");
    //     case 5 -> System.out.println("Friday");
    //     case 6 -> System.out.println("Saturday");
    //     case 7 -> System.out.println("Sunday");
       
    // }

    switch(Day){

        case  1,2,3,4,5 ->System.err.println("Weekday");
        case 6,7 ->System.err.println("Weekend");
    }
    }
    
}
