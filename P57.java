package Pro_6;

import java.util.*;

public class P57 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter The Two Strings :");
		String input1 = in.next();
		String input2 = in.next();
		in.close();
		System.out.println("The String-1 Having The Substring String-2 :");
		System.out.println(substringChecker(input1, input2));
	}

	public static boolean substringChecker(String s1, String s2) {
		ArrayList<String> al1 = new ArrayList<String>();
		String a = "";
		for (int i = s1.length(); i > 1; i--) {
			for (int j = 0; j <= s1.length() - i; j++) {
				a = "";
				for (int k = j; k < j + i; k++) {
					a += s1.charAt(k) + "";
				}
				al1.add(a);
			}
		}
		ArrayList<String> al2 = new ArrayList<String>();
		a = "";
		for (int i = s2.length(); i > 1; i--) {
			for (int j = 0; j <= s2.length() - i; j++) {
				a = "";
				for (int k = j; k < j + i; k++) {
					a += s2.charAt(k) + "";
				}
				al2.add(a);
			}
		}
		int flag = 0;
		OUTER: for (int i = 0; i < al1.size(); i++) {
			for (int j = 0; j < al2.size(); j++) {
				if (al1.get(i).equals(al2.get(j))) {
					flag = 1;
					break OUTER;
				}
			}
		}
		if (flag == 1) {
			return true;
		} else {
			return false;
		}
	}
}
