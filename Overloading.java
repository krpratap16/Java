public class Overloading {



    static void fun(int a){



    }



    static void fun(String name){




    }

    static int sum(int a,int b){
        return a+b;
    }

    static int sum(int a,int b,int c){
        return a+b+c;

    }
    public static void main(String[] args) {
        fun("Raj");
        fun(2);
        
         int ans=sum(1, 9);
        System.out.println(ans);



    }
    
}
