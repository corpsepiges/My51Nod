import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    private static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        List<Integer> weightList = new ArrayList<Integer>();
        List<Integer> dirList = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int weight = in.nextInt();
            int dir = in.nextInt();
            boolean flag = true;
            while (weightList.size() > 0 && dirList.get(dirList.size() - 1) == 1 && dir == 0) {
                if (weightList.get(weightList.size() - 1) > weight) {
                    flag = false;
                    break;
                }else {
                    weightList.remove(weightList.size() - 1);
                    dirList.remove(dirList.size()-1);
                }
            }
            if (flag) {
                weightList.add(weight);
                dirList.add(dir);
            }
        }
        out.write(String.valueOf(weightList.size()));
        out.flush();
    }
}