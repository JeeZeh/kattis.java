import java.util.Scanner;

public class NotAmused {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day = 0;
        String bills[][] = new String[100][3];

        String name;

        while(scan.hasNext()){
            String[] line = scan.nextLine().split(" ");

            switch (line[0]) {
                case "OPEN":
                    day++;
                    if(day > 1){
                        System.out.println();
                    }
                    for (int i = 0; i < 100; i++) {
                        bills[i][0] = "";
                        bills[i][1] = "0";
                        bills[i][2] = "0";
                    }
                    break;
                case "ENTER":
                    name = line[1];
                    for (int i = 0; i < 100; i++) {
                        if (bills[i][0].equals("")) {
                            bills[i][0] = name;
                            bills[i][2] = line[2];
                            break;
                        }

                        if (bills[i][0].equals(name)) {
                            bills[i][2] = line[2];
                            break;
                        }
                    }
                    break;
                case "EXIT":
                    name = line[1];
                    for (int i = 0; i < 100; i++) {
                        if(bills[i][0].equals(name)){
                            bills[i][1] = Double.toString(Double(bills[i][1]) +
                                    (Double(line[2]) - Double(bills[i][2]))*0.1);
                        }
                    }
                    break;
                case "CLOSE":
                    System.out.println("Day " + day);

                    for (int x = 0; x < 100; x++) {
                        for(int i = 0; i < 100; i++){
                            if(bills[i+1][0].equals("") || bills[i][0].equals(""))
                                break;
                            else if(bills[i][0].compareTo(bills[i+1][0]) > 0){
                                String temp = bills[i][0];
                                String temp2 = bills[i][1];
                                bills[i][0] = bills[i+1][0];
                                bills[i][1] = bills[i+1][1];
                                bills[i+1][0] = temp;
                                bills[i+1][1] = temp2;
                            }
                        }
                    }

                    for (int i = 0; i < 100; i++) {
                        if(bills[i][0].equals(""))
                            break;
                        else{
                            System.out.println(bills[i][0] + " $" + String.format("%.2f", Double(bills[i][1])));
                        }
                    }
            }
        }

    }

    private static Double Double(String n){
        return Double.parseDouble(n);
    }
}
