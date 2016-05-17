import java.io.PrintWriter;
import java.util.Scanner;

public class Solution {
    private static Scanner in;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        long n=in.nextLong();
        long ans=n/2+n/3+n/5+n/7-n/(2*3)-n/(2*5)-n/(2*7)-n/(3*5)-n/(3*7)-n/(5*7)+n/(2*3*5)+n/(2*3*7)+n/(2*5*7)+n/(3*5*7)-n/(2*3*5*7);
        out.write(String.valueOf(n-ans));
        out.flush();
    }
}