package date04042021;

public class StringBuilderEx {

	public static void main(String[] args) {

		StringBuilder str = new StringBuilder("Hello");
		
		str.append(" World!");
		
		System.out.println(str);
		
		str.delete(0, 6);
		
		System.out.println(str);
		
		str.insert(0, "Hi ");
		System.out.println(str);
	}

}
