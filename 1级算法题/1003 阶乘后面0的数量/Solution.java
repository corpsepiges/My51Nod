import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
    private static Scanner in;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n=in.nextInt();
        out.write(String.valueOf(new Solution().f(n))+"\n");
        out.flush();
    }
    public int f(int n){
        if (n<5) {
            return 0;
        }
        return n/5+f(n/5);
    }
}