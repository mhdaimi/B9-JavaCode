package date04042021;

public class FirstLetterUppercase {

	public static void main(String[] args) {
		
		// I am learning java ==> I Am Learning Java
		
		// sentence => words => split(" ")
		// substring => separate the first letter from other letters
		// every word first letter => charAt(0)
		// use the toUpper()
		// concat the uppercase letter and other letters
		// concat all the words
			
		String str = "I am learning java";
		
		String[] words = str.split(" "); // [I, am, learning, java]
		
		String newStr = "";
		
		for(int i=0 ; i<words.length; i++) {
			
			String letter = words[i].substring(0,1);    // j
			letter = letter.toUpperCase();              // J
			
			String temp = letter + words[i].substring(1);  // J + ava
			
			newStr += temp + " ";   
			
		}
		
		System.out.println(newStr);

	}

}
