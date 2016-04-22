import java.io.PrintWriter;
import java.util.Scanner;

public class Solution {
	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		String[] strs=in.nextLine().split(" ");
		long a=Long.parseLong(strs[0]);
		long b=Long.parseLong(strs[1]);
		out.write(String.valueOf(a/new Solution().f(a, b)*b));
		out.flush();
	}
	public long f(long a,long b){
		if (a>b) {
			return f(b,a);
		}
		if (b%a==0) {
			return a;
		}
		return f(b%a,a);
	}
}