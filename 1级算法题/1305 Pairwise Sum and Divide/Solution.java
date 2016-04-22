import java.io.PrintWriter;
import java.util.Scanner;

public class Solution {
	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = in.nextInt();
		int[] nums=new int[3];
		for (int i = 0; i < n; i++) {
			switch (in.nextInt()) {
			case 1:
				nums[0]++;
				break;
			case 2:
				nums[1]++;
				break;
			default:
				nums[2]++;
			}
		}
		out.write(String.valueOf(nums[0]*(nums[0]-1)+nums[0]*(nums[1]+nums[2])+nums[1]*(nums[1]-1)/2));
		out.flush();
	}
}