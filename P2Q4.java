import java.util.Scanner;

public class P2Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer between 0 and 15 (inclusive).");
        int input = scanner.nextInt();
        if (input < 0 || input > 15) {
            System.out.println("Invalid input: Integer entered must be between 0 and 15 (inclusive).");
        } else {
            String toHex = Integer.toHexString(input);
            System.out.printf("Decimal number entered: %s%nHexadecimal equivalent: %s", input, toHex);
        }
    }
}
