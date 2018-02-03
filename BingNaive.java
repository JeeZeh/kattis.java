import java.util.Scanner;

public class BingNaive{
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] searches = new String[n];

        for (int i = 0; i < n; i++) {
            int count = 0;
            String search = scan.next();
            searches[i] = search;
            for (int j = 0; j < i; j++) {
                if(searches[j].length() >= search.length() && searches[j].startsWith(search))
                    count++;
            }
            System.out.println(count);
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}
