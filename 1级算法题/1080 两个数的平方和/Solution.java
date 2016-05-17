import java.io.PrintWriter;
import java.util.Scanner;

public class Solution {
    private static Scanner in;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        boolean flag=true;
        for (int i = 0; i <= (int) Math.sqrt(n/2); i++) {
            int onther=(int) Math.sqrt(n-i*i);
            if (i*i+onther*onther==n) {
                out.write(String.valueOf(i)+" "+String.valueOf(onther) + "\n");
                flag=false;
            }
        }
        if (flag) {
            out.write("No Solution\n");
        }
        out.flush();
    }
}