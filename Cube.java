import java.util.*;
public class Cube{
public static void main(String []args){
Scanner sc= new Scanner(System.in);

System.out.println("Enter The Number");
int n=sc.nextInt();
for(int i=1;i<=n;i++){
    if(i==3){
        break;
    }
   int cube=i*i*i;
   System.out.println("Cube Of "+i+" =  " +cube);

sc.close();
}
}
}