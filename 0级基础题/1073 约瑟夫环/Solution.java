import java.io.PrintWriter;
import java.util.Scanner;

public class Solution {
	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = in.nextInt();
		int k = in.nextInt();
		out.write(String.valueOf(new Solution().f(n, k)+1));
		out.flush();
	}
	public int f(int m,int k){
		if (m==1) {
			return 0;
		}else {
			return (f(m-1,k)+k)%m;
		}
	}
}