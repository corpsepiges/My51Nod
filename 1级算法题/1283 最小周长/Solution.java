import java.io.PrintWriter;
import java.util.Scanner;

public class Solution {
	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n=in.nextInt();
		int m=(int) Math.sqrt(n)+1;
		while (m-->0) {
			if (n%m==0) {
				out.write(String.valueOf((m+n/m)*2));
				break;
			}
		}
		out.flush();
	}
}