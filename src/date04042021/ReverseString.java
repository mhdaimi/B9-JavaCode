package date04042021;

public class ReverseString {

	public static void main(String[] args) {

		String name = "I am learning Java";  // avaJ gninrael ma I
//		StringBuilder s = new StringBuilder(name);
//		s.reverse();
//		System.out.println(s);
		
		int strLength = name.length(); 
		
		for(int i = strLength-1; i >=0; i--) {
			System.out.print(name.charAt(i));
		}
		
		
		
		
		
		
		
	}

}
