import java.io.PrintWriter;
import java.util.Scanner;

public class Solution {
	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = in.nextInt();
		long ans=0;
		long min=0;
		for (int i = 0; i < n; i++) {
			ans+=in.nextLong();
			if (min>ans) {
				min=ans;
			}
		}
		out.write(String.valueOf(0-min));
		out.flush();
	}
}