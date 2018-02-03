import java.util.Scanner;

public class SevenWonders {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine().toUpperCase();

        int tCount = 0;
        int gCount = 0;
        int cCount = 0;

        int tSet = 0;
        int gSet = 0;
        int cSet = 0;

        int points = 0;

        for (int i = 0; i < in.length(); i++) {
            switch (in.charAt(i)) {
                case 'T':
                    tCount++;
                    tSet++;
                    break;
                case 'G':
                    gCount++;
                    gSet++;
                    break;
                case 'C':
                    cCount++;
                    cSet++;
                    break;
                default:
            }
            if(tSet > 0 && cSet > 0 && gSet > 0){
                points+= 7;
                tSet--;
                gSet--;
                cSet--;
            }
        }


        points += Math.pow(tCount, 2) + Math.pow(gCount, 2) + Math.pow(cCount, 2);

        System.out.println(points);
    }
}
