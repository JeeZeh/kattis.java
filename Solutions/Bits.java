package kattis.java.Solutions;

import java.util.Scanner;

public class Bits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            String input = Integer.toString(scan.nextInt());
            int max = 0;
            for (int j = 0; j < input.length(); j++) {
                int test = Integer.parseInt(input.substring(0,j+1));
                String binary = Integer.toBinaryString(test);
                int temp = 0;
                for (int k = 0; k < binary.length(); k++) {
                    if(binary.charAt(k) == '1')
                        temp++;
                }
                if(temp > max)
                    max = temp;
            }
            System.out.println(max);

        }
    }
}
