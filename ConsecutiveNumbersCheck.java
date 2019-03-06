import java.util.Scanner;

public class ConsecutiveNumbersCheck {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers are in the sequence you are about to enter? ");
        int number = input.nextInt();
        int[] array = new int[number];
        System.out.printf("Enter the first number: ", number);
        array[0] = input.nextInt();
        for (int i = 1; i < number; i++) {
            System.out.printf("Enter the next number: ", number);
            array[i] = input.nextInt();
        }
        if (isConsecutive(array) == true) {
            System.out.print("You have entered a sequence of consecutive numbers.");
        } else {
            System.out.print("The sequence of numbers you entered is not consecutive.");
        }
    }

    private static boolean isConsecutive (int[] values) {
        boolean consecutive = true;
        for (int i: values) {
            for (int j: values) {
                if (i != j) {
                    consecutive = false;
                }
            }
        }
        return consecutive;
    }
}
