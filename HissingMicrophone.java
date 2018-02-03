import java.util.Scanner;

public class HissingMicrophone {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char prev = ' ';
        char curr = ' ';

        String m = scan.nextLine();

        for (int i = 0; i < m.length(); i++) {
            if(m.charAt(i) == prev && prev == 's') {
                System.out.println("hiss");
                break;
            }
            else if(i == m.length()-1)
                System.out.println("no hiss");
            else
                prev = m.charAt(i);
        }
    }
}
