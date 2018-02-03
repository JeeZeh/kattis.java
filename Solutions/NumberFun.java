import java.util.Scanner;

public class NumberFun {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a, b, c;
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();

            System.out.println(possible(a,b,c) ? "Possible" : "Impossible");

        }
    }

    private static boolean possible(int a, int b, int c){
        return ((a + b == c || a - b == c || a * b == c || b - a == c)
                || ((a % b == 0 || b % a == 0) && (a / b == c || b / a == c)));
    }
}
