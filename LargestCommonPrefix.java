import java.util.Scanner;

public class LargestCommonPrefix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String string1 = scanner.next();
        System.out.println("Please enter another string: ");
        String string2 = scanner.next();
        String prefix = "";
        for (int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) == string2.charAt(i)) {
                System.out.print(string1.charAt(i));
                prefix += string1.charAt(i);
            } else {
                break;
            }
        }
        if (prefix.length() >= 1) {
            System.out.printf("%nThe largest common prefix of %s and %s is %s.", string1, string2, prefix);
        }
    }
}
