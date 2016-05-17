import java.io.PrintWriter;
import java.util.Scanner;

public class Solution {
    private static Scanner in;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int t=in.nextInt();
            int s=(int)Math.sqrt(8*t-7);
            if (s*s==(8*t-7)&&s%2==1) {
                out.write("1\n");
            }else {
                out.write("0\n");
            }
        }
        out.flush();
    }
}