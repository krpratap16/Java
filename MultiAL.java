import java.util.ArrayList;
import java.util.*;
public class MultiAL {
    public static void main(String[] args) {
        Scanner Input=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> List= new ArrayList<>();

        for(int i=0;i<3;i++){
            List.add(new ArrayList<>());
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            List.get(i).add(Input.nextInt());
        }

    }
        System.out.println(List);
    }
    
}
