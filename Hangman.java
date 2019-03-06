import java.util.Arrays;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        System.out.println("Welcome to hangman!");
        String[] words = {"hay", "elephant", "java", "magic"};
        boolean repeat = true;
        while (repeat == true) {
            int index = (int) (Math.random() * words.length);
            String word = words[index].toLowerCase();
            Scanner input = new Scanner(System.in);
            boolean wordGuessed = false;
            String correctGuesses = "";
            int incorrectGuesses = 0;
            while (wordGuessed == false) {
                char[] hiddenWord = new char[word.length() + 2];
                hiddenWord[0] = '[';
                for (char letter : word.toCharArray()) {
                    if (correctGuesses.indexOf(letter) == -1) {
                        hiddenWord[word.indexOf(letter) + 1] = '*';
                    } else {
                        boolean searching = true;
                        int foundAt = word.indexOf(letter);
                        hiddenWord[foundAt + 1] = letter;
                        while (searching == true) {
                            foundAt = word.indexOf(letter, foundAt+1);
                            if (foundAt == -1) {
                                searching = false;
                            } else {
                                hiddenWord[foundAt + 1] = letter;
                            }
                        }
                    }
                }
                hiddenWord[word.length() + 1] = ']';
                String progressDisplay = "";
                for (char element : hiddenWord) {
                    progressDisplay += element;
                }
                if (progressDisplay.indexOf('*') == -1) {
                    wordGuessed = true;
                    break;
                }
                System.out.println("Guess a letter: " + progressDisplay);
                char guess = input.next().charAt(0);
                if (correctGuesses.indexOf(guess) != -1) {
                    System.out.printf("%s has already been found in the word!%n%n", guess);
                } else if (word.indexOf(guess) != -1) {
                    correctGuesses += guess;
                } else {
                    System.out.printf("%s is not in the word.%n%n", guess);
                    incorrectGuesses += 1;
                }
            }
            System.out.printf("%nYou win! The word is '%s'. You missed %s times.%n%n", word, incorrectGuesses);
            System.out.println("Enter 'y' to play again or any other character to exit: ");
            String toContinue = input.next().toLowerCase();
            System.out.print(toContinue);
            if (toContinue.equals("y") == false) {
                repeat = false;
            }
        }
    }
}
