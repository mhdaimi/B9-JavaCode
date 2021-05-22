package date20032021;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1234;
		int rev = 0;
		int temp;
		
		while(num > 0) {
			
			temp = num%10;
			rev = rev*10 + temp;
			num = num/10;
			
		}

		System.out.println(rev);
		
		
		
		for(int i=0; i<=5; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		
		
	}

}
