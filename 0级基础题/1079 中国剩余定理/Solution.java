import java.io.PrintWriter;
import java.util.Scanner;

public class Solution {
    private static Scanner in;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int[][] nums=new int[n][2];
        int max=0;
        int maxIndex=0;
        for (int i = 0; i < n; i++) {
            nums[i][0]=in.nextInt();
            nums[i][1]=in.nextInt();
            if (nums[i][0]>max) {
                max=nums[i][0];
                maxIndex=i;
            }
        }
        boolean flag=true;
        for (int i = nums[maxIndex][1];; i+=nums[maxIndex][0]) {
            flag=true;
            for (int j = 0; j < nums.length&&flag; j++) {
                if (i%nums[j][0]!=nums[j][1]) {
                    flag=false;
                }
            }
            if (flag) {
                out.write(String.valueOf(i));
                break;
            }
        }
        out.flush();
    }
}