import java.util.*;

public class HumanCannonBall2{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        double g = 9.81;
        int n = scan.nextInt();

        for(int i = 0; i < n; i++){
            double v = scan.nextDouble();
            double a = Math.toRadians(scan.nextDouble());
            double x = scan.nextDouble();
            double h1 = scan.nextDouble();
            double h2 = scan.nextDouble();

            double t = x/(v*Math.cos(a));
            double y = (v*t*Math.sin(a))-(0.5*g*t*t);

            if(y >= h1+1 && y <= h2-1)
                System.out.println("Safe");
            else
                System.out.println("Not Safe");
        }


    }
}