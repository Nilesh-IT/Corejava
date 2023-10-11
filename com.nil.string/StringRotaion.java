
class StringRotation {
	public static boolean isRotation(String s1, String s2) {
		return (s1.length() == s2.length()) && ((s1 + s1).indexOf(s2) != 0);
	}

	public static void main(String[] args) {
		if (isRotation("ABCD", "CDAB"))
			System.out.println("number is rotational");
		else
			System.out.println("number is not rotational");

	}

}
