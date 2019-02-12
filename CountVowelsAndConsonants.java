import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String input = scanner.next();
        String caseNormalisedString = input.toUpperCase();
        int consonants = 0;
        int vowels = 0;
        for (int i = 0; i < input.length(); i++){
            char letter = caseNormalisedString.charAt(i);
            if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                vowels += 1;
            } else {
                consonants += 1;
            }
        }
        if (vowels != 1 && consonants != 1) {
            System.out.printf("There are %s vowels and %s consonants in %s", vowels, consonants, input);
        } else if (vowels != 1) {
            System.out.printf("There are %s vowels and %s consonant in %s", vowels, consonants, input);
        } else if (consonants != 1) {
            System.out.printf("There is %s vowel and %s consonants in %s", vowels, consonants, input);
        } else {
            System.out.printf("There is %s vowel and %s consonant in %s", vowels, consonants, input);
        }
    }
}
