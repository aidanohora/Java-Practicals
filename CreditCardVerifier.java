import java.util.Scanner;

public class CreditCardVerifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a credit card number to verify: ");
        String cardNo = input.next();
        if (isValidCreditCard(cardNo)) {
            System.out.println("Creditcard number is valid.");
        } else {
            System.out.println("Creditcard number is invalid.");
        }

    }

    public static boolean isValidCreditCard(String cardNo) {
        if (cardNo.length() > 16 || cardNo.length() < 13) {
            return false;
        }
        if (cardNo.charAt(0) != '3' && cardNo.charAt(0) != '4' && cardNo.charAt(0) != '5' && cardNo.charAt(0) != '6') {
            return false;
        }
        if (cardNo.charAt(0) == '3' && cardNo.charAt(1) != '7') {
            return false;
        }
        int evenDoubledTotal = 0;
        for (int i = 0; i < cardNo.length(); i+=2) {
            int digitDoubled = (Character.getNumericValue(cardNo.charAt(i)))*2;
            int digits = String.valueOf(digitDoubled).length();
            if (digits > 1) {
                digitDoubled = (Character.getNumericValue(String.valueOf(digitDoubled).charAt(0)))+(Character.getNumericValue(String.valueOf(digitDoubled).charAt(1)));
            }
            evenDoubledTotal += digitDoubled;
        }
        int oddTotal = 0;
        for (int i = 1; i <= cardNo.length() - 1; i+=2) { //return here later
            int digit = Character.getNumericValue(cardNo.charAt(cardNo.length()-i));
            oddTotal += digit;
        }
        int Total = oddTotal+evenDoubledTotal;
        if (Total % 10 == 0) {
            return true;
        } else {
            return false;
        }
    }

}


