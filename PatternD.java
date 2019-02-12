//first command line argument should be an integer to determine how many rows for pattern
public class PatternD {
    public static void main(String args[]) {
        int rows = Integer.parseInt(args[0]);
        for (int i = 1; i <= rows; i++) {
            String toPrint = "";
            for (int j = 1; j <= rows+1-i; j++) {
                toPrint += j;
                toPrint += " ";
            }
            System.out.println(toPrint);
        }
    }
}