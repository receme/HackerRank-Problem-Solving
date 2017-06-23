import java.util.Scanner;

public class CamelCase {

    static int getWordCount(String input) {

        int count = 1;

        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)>= 'A' && input.charAt(i) <= 'Z'){
                count++;
            }
        }

        return count;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(getWordCount(s));
    }
}
