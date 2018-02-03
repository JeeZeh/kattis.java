import java.util.Scanner;

public class batterup {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        double div = n;
        double total = 0;

        for (int i = 0; i < (int)n; i++) {
            double in = scan.nextDouble();
            if(in == -1.00){
                div--;
            }
            else total += in;
        }

        System.out.println(total/div);
    }
}
