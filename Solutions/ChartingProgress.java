import java.util.Arrays;
import java.util.Scanner;

public class ChartingProgress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int last = 0;
        while(scan.hasNext()){
            String in = scan.nextLine();
            if(in.length() == 0) {
                last = 0;
                System.out.println();
            }
            else{

                char[] outC = new char[in.length()];
                int count = 0;
                for (int i = 0; i < in.length(); i++) {
                    if(in.charAt(i) == '*')
                        count++;
                }
                for (int i = 0; i < outC.length; i++) {
                    if(i < outC.length-count-last || i >= outC.length-last)
                        outC[i] = '.';
                    else
                        outC[i] = '*';
                }
                last += count;
                String outS = new String(outC);
                System.out.println(outS);
            }
        }
    }
}
