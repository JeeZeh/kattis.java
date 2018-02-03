import java.util.Scanner;

public class StackingCups {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[][] cups = new String[n][2];
        scan.nextLine();
        for (int i = 0; i < n; i++) {
            String[] line = scan.nextLine().split(" ");
            if(Character.isLetter(line[0].charAt(0))){
                cups[i][0] = line[0];
                cups[i][1] = line[1];
            }
            else{
                cups[i][1] = Integer.toString(Integer.parseInt(line[0])/2);
                cups[i][0] = line[1];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if(Integer.parseInt(cups[j][1]) > Integer.parseInt(cups[j+1][1])){
                    String t0 = cups[j+1][0];
                    String t1 = cups[j+1][1];
                    cups[j+1][0] = cups[j][0];
                    cups[j+1][1] = cups[j][1];
                    cups[j][0] = t0;
                    cups[j][1] = t1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(cups[i][0]);
        }

    }
}
