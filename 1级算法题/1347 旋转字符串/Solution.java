import java.io.PrintWriter;
import java.util.Scanner;

public class Solution {
    private static Scanner in;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        String str=in.next();
        out.write(str.length()%2==0&&str.substring(0, str.length()/2).equals(str.substring(str.length()/2, str.length()))?"YES\n":"NO\n");
        out.flush();
    }
}