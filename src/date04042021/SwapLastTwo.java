package date04042021;

public class SwapLastTwo {

	public static void main(String[] args) {

		String str = "Python"; // Pythno
		
		int strLength = str.length();
		
		String firstPart = str.substring(0, strLength-2);
		System.out.println(firstPart);
		
		char lastChar = str.charAt(strLength-1);
		char secondLast = str.charAt(strLength-2);
		
		System.out.println(lastChar);
		System.out.println(secondLast);
		
		System.out.println(firstPart + lastChar + secondLast);
		
		
		
		
	}

}
