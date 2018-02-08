package kattis.java.Solutions;

import java.util.Scanner;

public class AboveAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int m = in.nextInt();
            double sum = 0;
            int[] scores = new int[m];
            for (int j = 0; j < m; j++) {
                int a = in.nextInt();
                sum+= a;
                scores[j] = a;
            }
            double avg = sum/m;
            double greater = 0;
            for (int j = 0; j < m; j++) {
                if(scores[j] > avg)
                    greater++;
            }
            greater = (greater/m)*100;
            System.out.printf("\n%.3f", Math.round(greater*1000)/1000.0);
            System.out.print("%");


        }
    }
}
