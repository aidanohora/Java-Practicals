import java.lang.Math;
import java.text.DecimalFormat;

public class PairwiseDistance {
    public static void main(String[] args) {
        double [][] Array2D = create2DArray();
        double[][] distanceArray = createDistance2DArray(Array2D);
        printDistance2DArray(distanceArray);

    }

    private static double[][] create2DArray() {
        double[][] array2D = {{1.5, -1.5},{-0.5, 2.5}, {3.5, 4.5}, {0.0, 0.0}, {0.0, 0.4}};
        return array2D;
    }

    private static void print2DArray(double[][] array2D) {
        System.out.printf("Points: ");
        System.out.printf("%npoint1: %s", array2D[0]);
        System.out.printf("%npoint1: %s", array2D[1]);
        System.out.printf("%npoint1: %s", array2D[2]);
    }

    private static double calculateDistance(double[] firstPoint, double[] secondPoint) {
        return Math.sqrt(Math.pow((secondPoint[0]-firstPoint[0]), 2)+Math.pow((secondPoint[1]-firstPoint[1]), 2));
    }

    private static double[][] createDistance2DArray(double[][] points) {
        double[][] distanceArray = new double[points.length][points.length];
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                distanceArray[i][j] = calculateDistance(points[i], points[j]);
            }
        }
        return distanceArray;
    }

    private static void printDistance2DArray(double[][] distanceArray) {
        System.out.print("Distances: ");
        for (int i = 0; i < distanceArray.length; i++) {
            System.out.println();
            for (int j = 0; j < distanceArray.length; j++) {
                System.out.printf("%.2f", distanceArray[i][j]);
                System.out.print("  ");
            }
        }

    }

}
