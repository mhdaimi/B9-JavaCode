package date04042021;

public class BreakExample {

	public static void main(String[] args) {

		
		for(int i=1; i<=10;i++) {
			System.out.println(i);
			if(i==5) {
				System.out.println("Breaking the loop....");
				break;
			}
		}
		
		System.out.println("I am outside the for loop.");
		
		
	}

}
