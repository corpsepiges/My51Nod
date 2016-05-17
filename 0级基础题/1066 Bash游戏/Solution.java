import java.io.PrintWriter;
import java.util.Scanner;

public class Solution {
    private static Scanner in;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a=in.nextInt();
            int b=in.nextInt();
            out.write((a%(b+1)==0?"B":"A")+"\n");
        }
        out.flush();
    }
}