package kattis.java.Solutions;

import java.util.HashMap;
import java.util.Scanner;

public class QuickBrownFox {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < n; i++) {
            boolean[] asciibet = new boolean[128];
            String sample = scan.nextLine().replace(" ", "").toLowerCase();
            for (int j = 0; j < sample.length(); j++) {
                asciibet[sample.charAt(j)] = true;
            }
            String out = "missing ";
            for (int j = 97; j < 123; j++) {

                if(!asciibet[j])
                    out+= (char)j;
            }
            if(out.length() == 8)
                System.out.println("pangram");
            else
                System.out.println(out);
        }
    }
}
