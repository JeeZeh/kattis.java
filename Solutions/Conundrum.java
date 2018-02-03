import java.util.Scanner;

public class Conundrum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String in = scan.next();
        int days = 0;
        for (int i = 0; i < in.length(); i++) {
            switch (i % 3) {
                case 0:
                    if (in.charAt(i) != 'P')
                        days++;
                    break;
                case 1:
                    if (in.charAt(i) != 'E')
                        days++;
                    break;
                case 2:
                    if (in.charAt(i) != 'R')
                        days++;
                    break;
                default:
            }
        }
        System.out.println(days);
    }
}
