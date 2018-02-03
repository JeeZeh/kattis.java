import java.util.Scanner;

public class EstimatingTheAreaOfACircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            double r = scan.nextDouble();
            double m = scan.nextDouble();
            double c = scan.nextDouble();

            if(r == 0 && m == 0 && c == 0){
                break;
            }

            System.out.println(Math.PI*r*r + " " + r*r*(c/(m-c)));
        }
    }
}
