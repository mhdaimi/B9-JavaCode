package date13032021;

public class SwapNumbers {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		int z = x + y;
		
		x = z - x;
		y = z - y;
		
		System.out.println("X: " + x);
		System.out.println("Y: " + y);
		
		
		x = x + y;
		y = x - y;
		x = x - y;
		

		System.out.println("X: " + x);
		System.out.println("Y: " + y);
	}

}
