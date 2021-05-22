package date14032021;

public class CompareThreeNumbers {
	public static void main(String[] args) {
		int x = 10;
		int y = 11;
		int z = 12;
		
		if(z>x) {
			System.out.println("z is greater than x");
			if(z>y) {
				System.out.println("z is greater y");
			}
			System.out.println("Hello");
		}
		
		if(z>x && z>y) {	
			System.out.println("z is greater than x and y");
		}
		
		

	}

}
