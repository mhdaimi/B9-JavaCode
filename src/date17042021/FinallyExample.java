package date17042021;

public class FinallyExample {

	public static void main(String[] args) {

		String name = null;
		//String name = "Maharashtra";
		int length=0;
		//length = name.length();
		
		try {
			length = name.length();
		}
		catch (Exception e) {
			System.out.println(e.getMessage() + " occured");
			name = "Pune";
			length = name.length();
		}
		finally {
			//System.exit(0);
			System.out.println("I am always executed: finally");
		}
		
		System.out.println("The length of the string is: " + length);
		
		
		
	}

}
