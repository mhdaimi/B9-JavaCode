package date17042021;

public class IndexOutOfBoundExample {

	public static void main(String[] args) {

		String name = "Pune";  
					// 0123
		try {
			char charAt = name.charAt(4);
			System.out.println("The character is: " + charAt);
		}
		catch (ArithmeticException e) {
			System.out.println("Exception occured");
			System.out.println(e.getMessage());
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage() + " occured! StringIndexOutOfBound");
		}
		catch(Exception e) {
			System.out.println(e.getMessage() + " occured!");
		}
		
		
		
	}

}
