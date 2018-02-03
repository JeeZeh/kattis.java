import java.util.Scanner;

public class DifferentProblem {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLong()){
            long a = scan.nextLong();
            long b = scan.nextLong();

            System.out.println(Math.abs(a-b));
        }
    }
}
