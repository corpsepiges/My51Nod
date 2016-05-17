import java.io.PrintWriter;
import java.util.Scanner;

public class Solution {
    private static Scanner in;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        String[] strs=in.nextLine().split(" ");
        int a=Integer.parseInt(strs[0]);
        int b=Integer.parseInt(strs[1]);
        out.write(String.valueOf(new Solution().f(a, b)));
        out.flush();
    }
    public int f(int a,int b){
        if (a>b) {
            return f(b,a);
        }
        if (b%a==0) {
            return a;
        }
        return f(b%a,a);
    }
}