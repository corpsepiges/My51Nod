import java.io.PrintWriter;
import java.util.Scanner;

public class Solution {
	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n=in.nextInt();
		for (int i = 0; i < n; i++) {
			out.write(String.valueOf(in.nextInt()*2)+"\n");
		}
		out.flush();
	}
}