import java.util.Scanner;
import java.lang.Math;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double length;
        do {
            System.out.println("Please enter the length from the center of your pentagon to one of it's vertices.");
            length = input.nextDouble();
            if (length <= 0) {
                System.out.println("Sorry, you must enter a length of greater than zero.");
            }
        } while (length <= 0 );
        double side = 2*length*Math.sin(Math.PI/5);
        double area = (5*(side*side))/(4*Math.tan(Math.PI/5));
        System.out.printf("The area is %s.", area);
    }
}
