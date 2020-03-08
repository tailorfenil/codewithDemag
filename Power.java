package IKWebRecursion;

public class Power {


    public static int calculate_power(long a, long b){

        if(b==0){
            return 1;
        }

        else if(b%2==0){
            long y = calculate_power(a%1000000007,b/2)%1000000007;
            return (int)(y*y)%1000000007;
        }

        else{
            return ((int)(a)%1000000007)*calculate_power((int)(a)%1000000007,(b-1))%1000000007;
        }

    }
}
