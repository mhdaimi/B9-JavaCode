package date20032021;

import java.util.Scanner;

public class EvenNumberRangeInput {

	public static void main(String[] args) {

		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter start range: ");
		int start = obj.nextInt();
		
		System.out.println("Enter end range: ");
		int end = obj.nextInt();
		
		
		for(int i = start; i <= end; i++) {
			
			if(i%2==0) {
				System.out.println("Even number: " + i);
			}
			
		}
		
		
		
		
	}

}
