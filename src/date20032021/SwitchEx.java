package date20032021;

import java.util.Scanner;

public class SwitchEx {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a value between 1-7");
		int input = obj.nextInt();
		
		switch(input) {
		case 1: System.out.println("Monday"); 
			break;
		case 2: System.out.println("Tuesday");
			break;
		case 3: System.out.println("Wednesday");
			break;
		case 4: System.out.println("Thursday");
			break;
		case 5: System.out.println("Friday");
			break;
		case 6: System.out.println("Saturday");
			break;
		case 7: System.out.println("Sunday");
			break;
		//default: System.out.println("You entered invalid value: " + input);
		}
		

	}

}
