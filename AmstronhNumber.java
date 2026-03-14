public class AmstronhNumber {
    public static boolean ArmstrongN(int x) {
        int sum=0;
        int Num=x;
        if(x<0){
            return false;
        }

        while(x!=0){
            int LastDigit=x%10;
            sum=sum+(LastDigit*LastDigit*LastDigit);

        x=x/10;
        }
        return sum==Num;

    }
    
}
