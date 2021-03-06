import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;

public class FourStrings {
	public int shortestLength(String a, String b, String c, String d) {
		int ans = Integer.MAX_VALUE;
		String ar[] = { a, b, c, d };
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					for (int l = 0; l < 4; l++) {
						if (i != j && i != k && i != l && j != k && j != l && k != l) {
							String s = merge(ar[i], ar[j], ar[k], ar[l]);
							System.out.println(s);
							ans = Math.min(ans, s.length());
						}
					}
				}
			}
		}
		return ans;
	}

	public String merge(String a, String b, String c, String d) {
		String ar[] = { a, b, c, d };
		String str = ar[0];
		for (int i = 1; i < 4; i++) {
			String cur = ar[i];
			if (str.contains(cur))
				continue;
			int j;
			for (j = cur.length(); j > 0; j--) {
				if (str.endsWith(cur.substring(0, j))) {
					str += cur.substring(j);
					break;
				}
			}
			if(j == 0) str += cur;
		}
		return str;
	}

	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.8 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, String p0, String p1, String p2, String p3,
			boolean hasAnswer, int p4) {
		System.out.print("Test " + testNum + ": [" + "\"" + p0 + "\"" + "," + "\"" + p1 + "\"" + "," + "\"" + p2 + "\""
				+ "," + "\"" + p3 + "\"");
		System.out.println("]");
		FourStrings obj;
		int answer;
		obj = new FourStrings();
		long startTime = System.currentTimeMillis();
		answer = obj.shortestLength(p0, p1, p2, p3);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + p4);
		}
		System.out.println("Your answer:");
		System.out.println("\t" + answer);
		if (hasAnswer) {
			res = answer == p4;
		}
		if (!res) {
			System.out.println("DOESN'T MATCH!!!!");
		} else if ((endTime - startTime) / 1000.0 >= 2) {
			System.out.println("FAIL the timeout");
			res = false;
		} else if (hasAnswer) {
			System.out.println("Match :-)");
		} else {
			System.out.println("OK, but is it right?");
		}
		System.out.println("");
		return res;
	}

	public static void main(String[] args) {
		boolean all_right;
		all_right = true;

		String p0;
		String p1;
		String p2;
		String p3;
		int p4;

		// ----- test 0 -----
		p0 = "abc";
		p1 = "ab";
		p2 = "bc";
		p3 = "b";
		p4 = 3;
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------

		// ----- test 1 -----
		p0 = "a";
		p1 = "bc";
		p2 = "def";
		p3 = "ghij";
		p4 = 10;
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------

		// ----- test 2 -----
		p0 = "top";
		p1 = "coder";
		p2 = "opco";
		p3 = "pcode";
		p4 = 8;
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------

		// ----- test 3 -----
		p0 = "thereare";
		p1 = "arelots";
		p2 = "lotsof";
		p3 = "ofcases";
		p4 = 19;
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------

		// ----- test 4 -----
		p0 = "aba";
		p1 = "b";
		p2 = "b";
		p3 = "b";
		p4 = 3;
		all_right = KawigiEdit_RunTest(4, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------

		// ----- test 5 -----
		p0 = "x";
		p1 = "x";
		p2 = "x";
		p3 = "x";
		p4 = 1;
		all_right = KawigiEdit_RunTest(5, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------

		if (all_right) {
			System.out.println("You're a stud (at least on the example cases)!");
		} else {
			System.out.println("Some of the test cases had errors.");
		}
	}
	// END KAWIGIEDIT TESTING
}
// Powered by KawigiEdit 2.1.8 (beta) modified by pivanof!
