import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the first side? No side may be larger than both sides put together");
        double side1 = input.nextDouble();
        System.out.println("And the second?");
        double side2 = input.nextDouble();
        System.out.println("And the third?");
        double side3 = input.nextDouble();
        if (side1 > side2 + side3 || side2 > side1 + side3 || side3 > side2 + side1) {
            System.out.println("The combinations of sides described cannot belong to a triangle, one side is larger than two together.");
        }
        else {
            double area = side1 + side2 + side3;
            System.out.printf("The perimeter of your triangle is: %s", String.valueOf(area));
        }
    }
}
