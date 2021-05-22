package date04042021;

public class StringBufferExample {

	public static void main(String[] args) {

		//String = immutable
		// StringBuffer = mutable
		
		StringBuffer name = new StringBuffer("Hello, World! ");
		
		name.append("I am learning Java");
		
		System.out.println(name);
		System.out.println(name.capacity());
		System.out.println(name.length());
		
		name.delete(0, 6);
		System.out.println(name);
		
		name.insert(0, "Hi");
		System.out.println(name);
		
		System.out.println(name.reverse());
		
		
		
		
		
		
	}

}
