import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Solution {
	private static Scanner in;
	private static final Map<Integer, List<Integer>> FINAL_MAP = new HashMap<Integer, List<Integer>>() {
		{
			put(0, new ArrayList<Integer>() {
				{
					add(0);
				}
			});
			put(1, new ArrayList<Integer>() {
				{
					add(1);
				}
			});
			put(2, new ArrayList<Integer>() {
				{
					add(2);
					add(4);
					add(8);
					add(6);
				}
			});
			put(3, new ArrayList<Integer>() {
				{
					add(3);
					add(9);
					add(7);
					add(1);
				}
			});
			put(4, new ArrayList<Integer>() {
				{
					add(4);
					add(6);
				}
			});
			put(5, new ArrayList<Integer>() {
				{
					add(5);
				}
			});
			put(6, new ArrayList<Integer>() {
				{
					add(6);
				}
			});
			put(7, new ArrayList<Integer>() {
				{
					add(7);
					add(9);
					add(3);
					add(1);
				}
			});
			put(8, new ArrayList<Integer>() {
				{
					add(8);
					add(4);
					add(2);
					add(6);
				}
			});
			put(9, new ArrayList<Integer>() {
				{
					add(9);
					add(9);
				}
			});
		}
	};

	public static void main(String[] args) {
		in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = in.nextInt();
		List<Integer> list=FINAL_MAP.get(n%10);
		int other=n%list.size();
		System.out.println(n%10);
		System.out.println(other);
		out.write(String.valueOf(list.get((n-1)%list.size())) + "\n");
		out.flush();
	}
}