import java.util.Scanner;

public class Cypher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String input = scanner.next();
        String caseNormalisedInput = input.toLowerCase();
        String cypheredInput = "";
        for (int i = 0; i < input.length(); i++) {
            char letter = caseNormalisedInput.charAt(i);
            switch (letter) {
                case 'a': cypheredInput += 'g'; break;
                case 'b': cypheredInput += 'a'; break;
                case 'c': cypheredInput += 'b'; break;
                case 'd': cypheredInput += 't'; break;
                case 'e': cypheredInput += 'j'; break;
                case 'f': cypheredInput += 'q'; break;
                case 'g': cypheredInput += 'f'; break;
                case 'h': cypheredInput += 't'; break;
                case 'i': cypheredInput += 'z'; break;
                case 'j': cypheredInput += 's'; break;
                case 'k': cypheredInput += 'g'; break;
                case 'l': cypheredInput += 'y'; break;
                case 'm': cypheredInput += 'w'; break;
                case 'n': cypheredInput += 't'; break;
                case 'o': cypheredInput += 'a'; break;
                case 'p': cypheredInput += 'g'; break;
                case 'q': cypheredInput += 'd'; break;
                case 'r': cypheredInput += 'e'; break;
                case 's': cypheredInput += 's'; break;
                case 't': cypheredInput += 'g'; break;
                case 'u': cypheredInput += 'y'; break;
                case 'v': cypheredInput += 'w'; break;
                case 'w': cypheredInput += 'q'; break;
                case 'x': cypheredInput += 'e'; break;
                case 'y': cypheredInput += 'y'; break;
                case 'z': cypheredInput += 's'; break;
            }
        }
        System.out.println(cypheredInput);
    }
}