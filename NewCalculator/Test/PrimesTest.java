import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class PrimesTest {

    @Test
    public void generalTest(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter max number: ");
        int maxNum = sc.nextInt();
        Primes.prime(maxNum);

    }

    @Test
    public void testIsPrime(){

        Assert.assertTrue(Primes.checkPrime(3));
    }

}