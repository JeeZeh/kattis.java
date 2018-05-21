package kattis.java.Solutions;

import java.math.BigInteger;
import java.util.Scanner;

public class Powers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger a = new BigInteger(scan.next());
        int max = a.intValue();
        int b = scan.nextInt();

        BigInteger sum = new BigInteger("0");
        long tempSum = 0;
        for (int i = 1; i <= max ; i++) {
                sum = sum.add(BigInteger.valueOf(i).pow(b));

        }

        System.out.println(sum.mod(a));

    }

    public static long modPow(long number, long power, long modulus){
        //raises a number to a power with the given modulus
            if(power==0)
                return 1;
            else if (power%2==0) {
                long halfpower=modPow(number, power/2, modulus);
                return modMult(halfpower,halfpower,modulus);
            }else{
                long halfpower=modPow(number, power/2, modulus);
                long firstbit = modMult(halfpower,halfpower,modulus);
                return modMult(firstbit,number,modulus);
            }
        }
        public static long modMult(long first, long second, long modulus){
        //multiplies the first number by the second number with the given modulus
            if(second==0)
                return 0;
            else if (second%2==0) {
                long half=modMult(first, second/2, modulus);
                return (half+half)%modulus;
            }else{
                long half=modMult(first, second/2, modulus);
                return (half+half+first)%modulus;
            }
        }

}
