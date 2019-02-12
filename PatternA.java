//first command line argument should be an integer to determine how many rows for pattern
public class PatternA {
    public static void main(String args[]) {
        int rows = Integer.parseInt(args[0]);
        for (int i = 1; i <= rows; i++) {
            String toPrint = "";
            for (int j = 1; j <= i; j++) {
                toPrint += j;
                toPrint += " ";
            }
            System.out.println(toPrint);
        }
    }
}