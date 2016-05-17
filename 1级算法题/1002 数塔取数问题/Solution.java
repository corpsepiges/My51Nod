import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    private static Scanner in;
    static int[][] nums;
    static Map<String, Integer> map;
    static int height=0;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n=in.nextInt();
        height=n;
        nums=new int[n][n];
        map=new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                nums[i][j]=in.nextInt();
            }
        }
        out.write(String.valueOf(new Solution().f(0, 0)));
        out.flush();
    }
    public int f(int x,int y){
        if (x<height&&y<=x) {
            if (map.get(x+","+y)==null) {
                map.put(x+","+y, nums[x][y]+Math.max(f(x+1,y),f(x+1,y+1)));
            }
            return map.get(x+","+y);
        }
        return 0;
    }
}