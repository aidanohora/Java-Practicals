import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a year");
        int year = scanner.nextInt();
        boolean leapYear;
        if (year % 4 != 0) {
            leapYear = false;
        } else if (year % 100 != 0) {
            leapYear = true;
        } else if (year % 400 != 0) {
            leapYear = false;
        } else {
            leapYear = true;
        }
        System.out.println("Now please enter the first three letters of a month, capitalising the first letter (e.g. 'Jan').");
        String month = scanner.next();
        System.out.print(month);
        char firstLetter = month.charAt(0);
        if (firstLetter < 'A' || firstLetter > 'Z') {
            System.out.println("The month must begin with a capital letter.");
        } else if (leapYear == false) {
            System.out.printf("%n%s is not a leap year.%n", year);
            switch (month) {
                case "Feb": System.out.printf("%s of %s has 28 days", month, year); break;
                case "Apr":
                case "Jun":
                case "Sep":
                case "Nov": System.out.printf("%s of %s has 30 days", month, year); break;
                case "Jan":
                case "Mar":
                case "May":
                case "Jul":
                case "Aug":
                case "Oct":
                case "Dec": System.out.printf("%s of %s has 31 days", month, year); break;
            }
        } else if (leapYear == true) {
            System.out.printf("%n%s is a leap year.%n", year);
            switch (month) {
                case "Feb":
                    System.out.printf("%s of %s has 29 days", month, year);
                    break;
                case "Apr":
                case "Jun":
                case "Sep":
                case "Nov":
                    System.out.printf("%s of %s has 30 days", month, year);
                    break;
                case "Jan":
                case "Mar":
                case "May":
                case "Jul":
                case "Aug":
                case "Oct":
                case "Dec":
                    System.out.printf("%s of %s has 31 days", month, year);
                    break;
            }

        }

    }
}
