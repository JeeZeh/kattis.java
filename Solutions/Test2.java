import java.util.Scanner;

public class Test2 {
    public static void main (String args[]){
        Scanner s = new Scanner(System.in);
        int n = 2643;
        String temp = "";
        String largest = "";
        int index = 0;

        String[] words = new String[n];

        for (int i = 0; i < n; i++){
            words[i] = s.next();
        }
        long start = System.currentTimeMillis();
//        for (int i = 0; i < n; i++){
//            System.out.print(words[i] + " ");
//
//        }

        for (int x = 0; x < n; x++) {
            for (int i = 0; i < n - 1; i++) {
                if (words[i].length() > words[i + 1].length()) {
                    temp = words[i + 1];
                    words[i + 1] = words[i];
                    words[i] = temp;
                }
            }
        }

        long end = System.currentTimeMillis();


//        for (int x = 0; x < n; x++) {
//            for (int i = 0; i < n - 1; i++) {
//                if (words[i].compareTo(words[i+1]) < 0 && words[i].length() == words[i+1].length()) {
//                    temp = words[i + 1];
//                    words[i + 1] = words[i];
//                    words[i] = temp;
//                }
//            }
//        }


        for (int i = 0; i < n; i++){
            System.out.println(words[i]);
        }

        System.out.print("\n\n" + (end - start));
    }
}
