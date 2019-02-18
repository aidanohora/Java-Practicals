public class PrimeNumber {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++) {
            if (isPrime(i) == true) {
                System.out.printf("%s is a prime number.%n", i);
            } else {
                System.out.printf("%s is not a prime number.%n", i);
            }
        }
    }

    public static boolean isPrime(int number) {
        int divisor = 2;
        boolean isPrime = false;
        while (divisor <= number / 2) {
            if (number % divisor == 0) {
                isPrime = true;
                return true;
            } else {
                number = number * 2;
            }
        }
        if (isPrime == false) {
        }
        return false;
    }

}
