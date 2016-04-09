
public class PalindromeChecker {

	public boolean isAPalindrome(String string) {
		return string.equalsIgnoreCase(getReverseString(string));
	}

	private String getReverseString(String string) {
		StringBuilder reverseStringBuilder = new StringBuilder(string);
		reverseStringBuilder.reverse();
		return reverseStringBuilder.toString();
	}

}
