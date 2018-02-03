import java.util.Scanner;

public class Peragrams {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String in = scan.next();

        char[] chars = new char[26];
        int[] num = new int[26];

        for (int i = 0; i < 26; i++) {
            num[i] = 0;
        }

        int charSize = 0;
        boolean madeOne = false;

        for (int i = 0; i < in.length(); i++) {
            char current = in.charAt(i);
            int insert = Check(current, chars, charSize);
            chars[insert] = current;
            num[insert]++;
            if(insert == charSize)
                charSize++;
        }

        int oddCount = 0;
        for (int i = 0; i < charSize; i++) {
            if(num[i] % 2 == 1){
                oddCount++;
            }
        }
        
        int remCount = 0;
        for (int i = 1; i < oddCount; i++) {
            for (int j = 0; j < charSize; j++) {
                if(num[j] % 2 == 1){
                    remCount++;
                    num[j] --;
                    break;
                }
            }
        }

        System.out.println(remCount);
    }

    public static int Check(int character, char[] list, int size){
        if(size == 0)
            return 0;
        else
            for (int i = 0; i < size; i++) {
                if(list[i] == character)
                    return i;
            }
            return size;
    }

}
