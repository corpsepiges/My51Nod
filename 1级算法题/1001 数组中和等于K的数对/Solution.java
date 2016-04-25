import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int target=in.nextInt();
		int n=in.nextInt();
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		int[] nums=new int[n];
		for (int i = 0; i < n; i++) {
			nums[i]=in.nextInt();
			map.put(target-nums[i], nums[i]);
		}
		boolean flag=true;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			Integer t=map.get(nums[i]);
			if (t!=null&&nums[i]<t) {
				out.write(String.valueOf(nums[i])+" "+String.valueOf(t)+"\n");
				flag=false;
			}
		}
		if (flag) {
			out.write("No Solution\n");
		}
		out.flush();
	}
}