package samples;

public class IsPalindrome {
	static boolean isPalindrome(char[] arr) {
	    
	    int startIndex = 0;
	    int endIndex = arr.length-1;
	    
	    while (startIndex < endIndex) {
	        
	        if (arr[startIndex] != arr[endIndex]) {
	            return false;
	        }
	        startIndex++;
	        endIndex--;
	    }
	    return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("abcba " + isPalindrome("abcba".toCharArray()));
		System.out.println("a5cba " + isPalindrome("a5cba".toCharArray()));
	}
}
