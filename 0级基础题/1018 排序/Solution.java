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
        int[] nums=new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=in.nextInt();
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            out.write(String.valueOf(nums[i])+"\n");
        }
        out.flush();
    }
}