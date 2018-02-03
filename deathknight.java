import java.util.Scanner;

public class deathknight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int wins = 0;
        for (int i = 0; i < n; i++) {
            String in = scan.next();
            char prev = ' ';
            for (int j = 0; j < in.length(); j++) {
                if(in.charAt(j) == 'D' && prev == 'C'){
                    j = in.length();
                }
                else if(j == in.length()-1){
                    wins++;
                }
                else prev = in.charAt(j);
            }
        }

        System.out.println(wins);
    }
}
