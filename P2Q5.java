import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a single letter.");
        char letter = scanner.next().charAt(0);
        if (letter < 'A' || letter > 'z') {
            System.out.println("Please only enter letters.");
        } else if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' || letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.printf("You have entered the vowel %s.", letter);
        } else {
            System.out.printf("You have entered the consonant %s", letter);
        }
    }
}