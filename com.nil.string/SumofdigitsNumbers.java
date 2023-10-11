
public class SumofdigitsNumbers {
	public static void main(String[] args) {
		int n = 687;

		System.out.println(sumDigits(n));
	}

	/* Function to get sum of digits */
	static int sumDigits(int no) {
		return no == 0 ? 0 : no % 10 + sumDigits(no / 10);
	}

}
