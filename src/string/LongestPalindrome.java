package string;

public class LongestPalindrome {

	public static void main(String[] args) {
		final String inputStr = "aaabbaaaccdeqjncsdddmmmkkkmmmddd";
		String largePaliString = "";
		// System.out.println(isPalindrome(inputStr));

		if (isPalindrome(inputStr)) {
			largePaliString = inputStr;
		} else {
			for (int i = 0; i < inputStr.length(); i++) {
				for (int j = i + 1; j < inputStr.length(); j++) {
					final String s = inputStr.substring(i, j);
					if (isPalindrome(s) && s.length() > largePaliString.length()) {
						largePaliString = s;
					}
				}
			}
		}
		System.out.println(largePaliString);

	}

	public static boolean isPalindrome(final String str) {
		// boolean isPalinDrome = false;
		StringBuilder reverseString = new StringBuilder();
		for (int index = str.length() - 1; index >= 0; index--) {
			reverseString.append(str.charAt(index));
		}

		return reverseString.toString().equals(str);
	}
}
