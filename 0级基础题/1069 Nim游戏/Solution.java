import java.io.PrintWriter;
import java.util.Scanner;

public class Solution {
    private static Scanner in;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int ans=0;
        for (int i = 0; i < n; i++) {
            ans^=in.nextInt();
        }
        out.write(ans==0?"B":"A");
        out.flush();
    }
}