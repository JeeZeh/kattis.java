import java.util.Scanner;

public class Autori {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();
        String out = "";

        for (int i = 0; i < in.length(); i++) {
            if(i == 0)
                out += in.charAt(0);
            else if(in.charAt(i) == '-')
                out += in.charAt(i+1);
        }
        System.out.println(out);
    }
}
