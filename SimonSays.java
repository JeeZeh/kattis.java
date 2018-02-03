import java.util.Scanner;

public class SimonSays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i <= n; i++) {
            String phrase = scan.nextLine();
            if(phrase.startsWith("Simon says "))
                System.out.println(phrase.substring(10));
        }
    }
}
