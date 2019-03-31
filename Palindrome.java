import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String string) {
        if (string.length() == 1) {
            return true;
        } else {
            StringBuilder sb = new StringBuilder(string);
            for (int i = 0; i < string.length()/2; i++) {
                if (sb.charAt(i) != sb.charAt(sb.length() - (i + 1))) {
                    return false;
                }
            }
            return true;
        }
    }
}

