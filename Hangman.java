import java.util.Scanner;

public class P4Q4 {
    public static void main(String[] args) {
        String[] words = {"hello", "world", "elephant"};
        int index = (int) (Math.random() * words.length);
        String word = words[index].toLowerCase();
        System.out.println(word);
        StringBuilder display = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            display.append('*');
        }
        StringBuilder correctGuesses = new StringBuilder();
        Scanner input = new Scanner(System.in);
        boolean stillPlaying = true;
        int misses = 0;
        while (stillPlaying) {
            System.out.println(display);
            System.out.println("Guess a letter: ");
            char guess = input.next().charAt(0);
            if (correctGuesses.toString().indexOf(guess) != -1) {
                System.out.println(guess + " is already in the word.");
            } else if (word.indexOf(guess) != -1) {
                System.out.println(guess + " is in the word!");
                correctGuesses.append(guess);
                for (int i = 0; i < display.length(); i++) {
                    if (word.charAt(i) == guess) {
                        display.setCharAt(i, guess);
                    }
                }
            } else {
                System.out.println("Incorrect guess.");
                misses++;
            }
            if (display.toString().indexOf('*') == -1) {
                stillPlaying = false;
            }
        }
        System.out.println("You won with " + misses + " misses.");
    }
}
