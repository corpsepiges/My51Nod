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
        if (nums[0]>0||nums[n-1]<0) {
            out.write("No");
        }
        boolean flag=true;
        for (int i = 0; i < n-3&&flag; i++) {
            for (int j = i+1; j < n-2&&flag; j++) {
                int s=j+1;
                int e=n-1;
                while (s<e&&flag) {
                    long test=nums[i]+nums[j]+nums[s]+nums[e];
                    if (test==0) {
                        out.write("Yes");
                        flag=false;
                    }else if (test<0) {
                        s++;
                    }else {
                        e--;
                    }
                }
            }
        }
        if (flag) {
            out.write("No");
        }
        out.flush();
    }
}