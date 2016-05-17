import java.io.PrintWriter;
import java.util.Scanner;

public class Solution {
    private static Scanner in;
    public static int[] nums;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        nums=new int[1000001];
        out.write(String.valueOf(new Solution().f(in.nextInt())));
        out.flush();
    }
    public int f(int n){
        if (n==1) {
            return 0;
        }
        if (nums[n]==0) {
            int ans=Integer.MAX_VALUE;
            for (int i = 2; i < 8; i++) {
                int test=i+f((n+(i-n%i)%i)/i)+(i-n%i)%i;
                if (test<ans) {
                    ans=test;
                }
            }
            nums[n]=ans;
        }
        return nums[n];
    }
}