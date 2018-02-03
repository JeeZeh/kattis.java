import java.util.Scanner;

public class PigLatin {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()){
            String curr = scan.nextLine();
            String[] words = curr.split("\\S+");
            String out = "";

            for (String word : words) {
                for (int i = 0; i < word.length(); i++) {
                    if(isVowel(word.charAt(i))){
                        if(i == 0)
                            word  = word + "yay";
                        else
                            word = word.substring(i) + word.substring(0,i) + "ay";
                    }
                }
            }

            for (int i = 0; i < words.length; i++) {
                if(i == words.length-1)
                    out += words[i];
                else out += words[i] + " ";
            }
            System.out.println(out);

        }
    }

    public static boolean isVowel(char a){
        switch(a){
            case 'a':return true;
            case 'e':return true;
            case 'i':return true;
            case 'o':return true;
            case 'u':return true;
            case 'y':return true;
            default:return false;
        }
    }
}
