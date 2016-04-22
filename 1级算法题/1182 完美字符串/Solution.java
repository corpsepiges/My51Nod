import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		char[] chars=in.next().toLowerCase().toCharArray();
		int[] nums=new int[26];
		for (int i = 0; i < chars.length; i++) {
			nums[chars[i]-97]++;
		}
		int ans=0;
		Arrays.sort(nums);
		for (int i = 26; i >0; i--) {
			ans+=(nums[i-1]*i);
		}
		out.write(String.valueOf(ans));
		out.flush();
	}
}