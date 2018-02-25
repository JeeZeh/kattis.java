package kattis.java.Solutions;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Baconeggsandspam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            int n = scan.nextInt();
            if(n == 0)
                break;
            TreeMap<String, TreeSet<String>> items = new TreeMap<>();
            for (int i = 0; i <= n; i++) {
                String[] input = scan.nextLine().split(" ");
                for (int j = 1; j < input.length; j++) {
                    if(items.containsKey(input[j]))
                        items.get(input[j]).add(input[0]);
                    else {
                        TreeSet<String> names = new TreeSet<>();
                        names.add(input[0]);
                        items.put(input[j], names);
                    }
                }
            }
            System.out.println();
            for (Map.Entry<String, TreeSet<String>> entry : items.entrySet()){
                String out = entry.getKey();
                for (String s : entry.getValue()) {
                    out += " " + s;
                }
                System.out.println(out);
            }
        }
    }
}
