import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Scanner;

public class Solution {
    private static Scanner in;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        BigDecimal a = in.nextBigDecimal();
        BigDecimal b = in.nextBigDecimal();
        out.println(a.add(b));
        out.flush();
    }
}