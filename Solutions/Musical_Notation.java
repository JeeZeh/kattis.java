import java.util.Scanner;

public class Musical_Notation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = 0;
        int buff = 0;
        boolean prev = false;
        String input = "e10 a A B G F f E d3 F C c C2";

        for (int i = 0; i < input.length(); i++) {
            buff = 0;
            if(!prev){
                buff++;
                prev = true;
            }
            else if(prev && input.charAt(i) != ' '){
                buff += Character.getNumericValue(input.charAt(i))-1;
            }
            else
                buff ++;
                prev = false;

            size += buff;

        }

        System.out.println(size);


        String[] notes = new String[2];
        String[][] sheet = new String[14][size*2];



    }
}
