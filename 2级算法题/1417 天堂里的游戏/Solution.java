import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Scanner;

public class Solution {
	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		Solution s=new Solution();
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			BigDecimal a=in.nextBigDecimal();
			BigDecimal b=in.nextBigDecimal();
			BigDecimal c=s.f(a.add(new BigDecimal(3).multiply(b)), new BigDecimal(4).multiply(a).add(new BigDecimal(4).multiply(b)));
			out.write(String.valueOf((a.add(new BigDecimal(3).multiply(b))).divide(c))+"/"+String.valueOf((new BigDecimal(4).multiply(a).add(new BigDecimal(4).multiply(b))).divide(c))+"\n");
		}
		out.flush();
	}
	public BigDecimal f(BigDecimal a,BigDecimal b){
		if (a.compareTo(b)==1) {
			return f(b,a);
		}
		if (b.divideAndRemainder(a)[1].compareTo(new BigDecimal(0))==0) {
			return a;
		}
		return f(b.divideAndRemainder(a)[1],a);
	}
}