import java.util.Scanner;

public class Semafori {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int l = scan.nextInt();
        int t = 0;
        int prev = 0;
        for (int i = 0; i < n; i++) {
            boolean red = true;
            boolean green = false;
            int a = scan.nextInt();
            int r = scan.nextInt();
            int g = scan.nextInt();
            t += a - prev;
            prev = a;
            int d = t;
            boolean wait = true;
            while(true) {
                if(green && g <= d) {
                    d -= g;
                    red = true;
                    green = false;
                }
                else if(red && r <= d){
                    d -= r;
                    green = true;
                    red = false;
                }
                else if(red){
                    t += r - d;
                    break;
                }
                else if(green){
                    break;
                }
            }
            if(i == n-1)
                t += l - a;
        }

        System.out.println(t);

    }
}
