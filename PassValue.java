class Number{
    int a=2;
    int b=3;
}




public class PassValue {
    public static void main(String[] args) {

    //     int a=2;
    //     int b=3;
    //     swap(a,b);
    //     System.out.println("The Value Of a Is= "+a);
    //     System.out.println("The Value Of b Is= "+b);
    // }

    // static void swap(int x,int y){
    //     int temp=x;
    //     x=y;
    //     y=temp;



    // int[] arr={2,3};

    // swap(arr);
    // System.out.println("The Value Of a Is= "+arr[0]);
    // System.out.println("The Value Of b Is= "+arr[1]);
    // }

    // static void swap(int[] num){
    //     int temp=num[0];
    //     num[0]=num[1];
    //     num[1]=temp;

    Number obj =new Number();

    obj.a=2;
    obj.b=3;
     swap(obj);

    System.out.println("The Value Of A is = "+obj.a);
    System.out.println("The Value Of B is = "+obj.b);
    }

    static void swap(Number n){
        int temp=n.a;
        n.a=n.b;
        n.b=temp;
    }
    
}


