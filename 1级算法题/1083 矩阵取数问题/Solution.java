import java.io.PrintWriter;
import java.util.Scanner;

public class Solution {
	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = in.nextInt();
		int[] ans=new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j==0) {
					ans[j]+=in.nextInt();
				}else {
					ans[j]=(ans[j-1]>ans[j]?ans[j-1]:ans[j])+in.nextInt();
				}
			}
		}
		out.write(String.valueOf(ans[n-1]));
		out.flush();
	}
}