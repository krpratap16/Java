import java.util.*;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(" Enter The Number");
        Scanner Input=new Scanner(System.in);
        int Number=Input.nextInt();
        sum(Number);
        System.out.println(sum(Number));
    }
    static int sum(int n){
        if(n<1){
            return 0;
        }
        return n+sum(n-1);
    }
}
