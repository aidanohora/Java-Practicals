public class PerfectNumber {
    public static void main(String[] args) {
        int perfectNumbers = 0;
        int number = 2;
        while (perfectNumbers < 4) {
            if (isPerfect(number)) {
                System.out.printf("%s is a perfect number%n", number);
                perfectNumbers++;
            }
            number++;
        }

        /*if (isPerfect(6)) {
            System.out.println("6 is a perfect number%n");
        } */

    }

    public static boolean isPerfect(int number) {
        if (number <= 0) {
            return false;
        }
        int divisorTotal = 0;
        for (int i = 1; i <= number/2; i++) {
            if (number % i == 0) {
                divisorTotal += i;
            }
        }
        if (divisorTotal == number) {
            return true;
        } else {
            return false;
        }
    }

}
