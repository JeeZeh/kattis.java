import java.util.Scanner;

public class Erase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        boolean odd = n%2 == 1;

        String before = scan.next();
        String after = scan.next();

        if(odd) {

            for (int i = 0; i < before.length(); i++) {
                if(after.charAt(i) == before.charAt(i)){
                    System.out.println("Deletion failed");
                    break;
                }
                else if(i == before.length()-1)
                    System.out.println("Deletion succeeded");
            }

        }
        else{
            for (int i = 0; i < before.length(); i++) {
                if(after.charAt(i) != before.charAt(i)){
                    System.out.println("Deletion failed");
                    break;
                }
                else if(i == before.length()-1)
                    System.out.println("Deletion succeeded");
            }

        }
    }
}
