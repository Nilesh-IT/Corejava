import java.util.Scanner;

public class StringToInteger {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		String s = scr.nextLine();

		// String s="1234";
		String rev = "";
		int sum = 0;

		for (int i = s.length()- 1; i >= 0; i--) {
			rev = rev + s.charAt(i);

		}
		System.out.println(rev);

		int parseInt = Integer.parseInt(rev);

		while (parseInt != 0) {
			sum = sum + parseInt % 10;
			parseInt = parseInt / 10;
		}
		System.out.println("sum of number: "+sum);

	}

}
