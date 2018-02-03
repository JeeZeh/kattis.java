import java.util.Scanner;

public class PervasiveHeartMonitor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(scan.hasNextLine()){
            String name = "";
            double total = 0;
            int count = 0;


            String[] line = scan.nextLine().split(" ");

            for (String e : line) {
                if (Character.isLetter(e.charAt(0))) {
                    if (name.length() != 0)
                        name += " ";
                    name += e;
                } else {
                    count++;
                    total += Double.parseDouble(e);
                }
            }

            System.out.println(String.format("%.5f", total/count) + " " + name);
        }
    }
}
