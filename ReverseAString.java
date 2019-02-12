import java.util.Scanner; //reverses string input

public class ReverseAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String input = scanner.next();
        String reverseInput = "";
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(input.length()-(1+i));
            reverseInput += letter;
        }
        System.out.println(reverseInput);
    }
}

