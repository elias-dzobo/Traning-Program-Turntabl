import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {

    }

    public static void prime(int maxInt){
        //
        if (maxInt < 2) {
            System.out.println("There are no primes in the range of this number!");
        }
        for(int num=2; num < maxInt; num++) {
            if (checkPrime(num)){
                System.out.println(num);
            }
        }
    }

    public static boolean checkPrime(int rndNum) {
        if (rndNum == 2) return true;
        for (int i=2; i <= sqrt(rndNum); i++) {
            if (rndNum%i == 0) return false;
        }

        return true;
    }


}
