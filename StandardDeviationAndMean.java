import java.util.Scanner;
import java.lang.Math;

public class StandardDeviationAndMean {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers do you want to find the mean and standard deviation of? ");
        int number = input.nextInt();
        double[] array = new double[number];
        System.out.printf("Enter the first number: ", number);
        array[0] = input.nextInt();
        for (int i = 1; i < number; i++) {
            System.out.printf("Enter the next number: ", number);
            array[i] = input.nextInt();
        }
        double mean = getMean(array);
        System.out.printf("%nThe mean of these numbers is %s%n", mean);
        double standardDeviation = getStandardDeviation(array, mean);
        System.out.printf("%nThe standard deviation of  of these numbers is %s", standardDeviation);
    }

    private static double getMean (double[] numbers) {
        int n = numbers.length;
        double sum = 0;
        for (double i: numbers) {
            sum += i;
        }
        return sum/n;
    }

    private static double getStandardDeviation (double[] numbers, double mean) {
        double sum = 0;
        for (double i: numbers) {
            sum += ((i - mean)*(i - mean));
        }
        return Math.sqrt(sum/(numbers.length - 1));
    }
}
