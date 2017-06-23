import java.util.Scanner;

public class SortReducedString {

    private static String[] pair = new String[26];

    static String super_reduced_string(String input){

        boolean isReduced = true;

        while (isReduced) {

            String temp = input;

            for (int i = 0; i < 26; i++) {
                input = input.replaceAll(pair[i], "");
            }

            if(temp == input){
                isReduced = false;
            }
        }

        return input;
    }

    public static void main(String[] args) {

        for(int i=97; i<=122;i++){
            char ch = (char)i;
            pair[i-97] = new String(new char[]{ch,ch});
        }

        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        if(result.isEmpty()){
            System.out.println("Empty String");
        }
        else{
            System.out.println(result);
        }

    }
}
