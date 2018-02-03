import java.util.Scanner;

public class Sibice {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        double w = scan.nextDouble();
        double h = scan.nextDouble();
        double l = Math.sqrt((w*w)+(h*h));
        for (double i = 0; i < n; i++) {
            if(scan.nextDouble() <= l){
                System.out.println("DA");
            }
            else{
                System.out.println("NE");
            }
        }
    }
}
