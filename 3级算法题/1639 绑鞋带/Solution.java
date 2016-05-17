import java.io.PrintWriter;
import java.util.Scanner;


public class Solution {
    private static Scanner in;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        int n=in.nextInt();
        double ans=1;
        for (int i = n; i > 1; i--) {
            ans*=((2*i-2)*1.0/(2*i-1));
        }
        out.println(String.valueOf(ans));
        out.flush();
    }
}