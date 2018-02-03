import java.util.Scanner;

public class BlackFriday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] rolls = new int[n];
        int[] results = {0, 0, 0, 0, 0, 0};
        for (int i = 0; i < n; i++) {
            rolls[i] = scan.nextInt();

        }

        for (int i = 0; i < n; i++) {
            results[rolls[i]-1]++;
        }

        int largest = 0;
        for (int i = 5; i >= 0; i--) {
            if(results[i] == 1) {
                largest = i + 1;
                break;
            }
        }
        int pos = 0;
        if(largest == 0)
            System.out.println("none");
        else {
            for (int i = 0; i < n; i++) {
                if (rolls[i] == largest)
                    pos = i;
            }
            System.out.println(pos+1);
        }


    }
}
