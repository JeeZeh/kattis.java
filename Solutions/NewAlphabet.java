import java.util.Scanner;

public class NewAlphabet {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine().toLowerCase();
        String out = "";
        String curr;
        String[][] key = {
            {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"},
            {"@","8","(","|)","3","#","6","[-]","|","_|","|<","1","[]\\/[]","[]\\[]","0","|D","(,)","|Z","$","']['","|_|","\\/","\\/\\/","}{","`/","2"}
        };

        for(int i = 0; i < in.length(); i++){
            curr = Character.toString(in.charAt(i));
            for(int j = 0; j < 26; j++){
                if(curr.equals(key[0][j])){
                    out += key[1][j];
                    break;
                }
                else if(!curr.equals(key[0][j]) && j == 25)
                    out += curr;
            }
        }

        System.out.println(out);
    }
}
