import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;


public class Solution {
    private static Scanner in;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        int n=in.nextInt();
        long[] nums=new long[n];
        for (int i = 0; i < n; i++) {
            nums[i]=in.nextLong();
        }
        Arrays.sort(nums);
        long ans=0;
        for (int i = 0; i < n/2; i++) {
            ans+=(nums[n-1-i]-nums[i]);
        }
        out.write(String.valueOf(ans));
        out.flush();
    }
}