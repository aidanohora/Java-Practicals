import java.util.Scanner;

public class Palindrome {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = input.next();
        StringBuilder sb = new StringBuilder(inputString);
        for (int i = 0; i < sb.length(); i++) {
            char preCypher = sb.charAt(i);
            sb.setCharAt(i, ++preCypher);
        }
        System.out.println(sb);
    }

}

