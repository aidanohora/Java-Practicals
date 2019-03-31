import java.util.Scanner;

public class CountVowelsAndConsonants2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String inputString = input.next();
        int vowelCounter = 0;
        int consonantCounter = 0;
        char[] charArray = inputString.toLowerCase().toCharArray();
        for (char letter : charArray) {
            switch (letter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u': vowelCounter++;
                    break;
                default: consonantCounter++;
            }
        }
        System.out.println("Number of vowels:" + vowelCounter);
        System.out.println("Number of consonants:" + consonantCounter);
    }
}
