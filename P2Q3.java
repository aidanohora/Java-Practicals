import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an x co-ordinate.");
        double x = input.nextDouble();
        System.out.println("Please enter a y co-ordinate.");
        double y = input.nextDouble();
        if (x>5 || x<-5 || y>2.5 || y<-2.5) {
            System.out.println("Coordinates are outside of the rectangle.");
        } else {
            System.out.println("Coordinates are within or on the edge of the rectangle.");
        }
    }
}