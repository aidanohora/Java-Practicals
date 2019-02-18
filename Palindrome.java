import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to check if it's a palindrome: ");
        String string = input.next();
        if (isPalindrome(string)) {
            System.out.printf("%s is a palindrome.", string);
        } else {
            System.out.printf("%s is not a palindrome.", string);
        }
    }

    public static boolean isPalindrome(String string) {
        string = string.toLowerCase();
        for (int i = 0; i <= (string.length()/2); i++) {
            if (string.charAt(i) != string.charAt((string.length()-1)-i)) {
                return false;
            }
        }
        return true;
    }

}

