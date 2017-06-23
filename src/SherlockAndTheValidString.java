import java.util.*;

public class SherlockAndTheValidString {

    static int[] map = new int[26];

    static String isValid(String input) {

        char c = 0;

        for (int i = 0; i < 26; i++) {
            map[i] = 0;
        }

        for (int i = 0; i < input.length(); i++) {
            int ch1 = input.charAt(i) - 97;
            map[ch1]++;
        }

        Set<Integer> s = new HashSet<>();

        for (int i = 0; i < 26; i++) {
            if (map[i] != 0)
                s.add(map[i]);

            if (map[i] == 1) c++;
        }

        if (s.size() > 2 || c > 1)
            return "NO";
        else
            return "YES";

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = isValid(s);
        System.out.println(result);
    }
}
