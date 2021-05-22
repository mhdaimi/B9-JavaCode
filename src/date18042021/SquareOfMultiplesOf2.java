package date18042021;

import java.util.ArrayList;

public class SquareOfMultiplesOf2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(1); numbers.add(44);
		numbers.add(2); numbers.add(23);
		numbers.add(10); numbers.add(85);
		numbers.add(22); numbers.add(74);
		numbers.add(45); numbers.add(25);
		numbers.add(50); numbers.add(66);
		numbers.add(100); numbers.add(67);
		numbers.add(33); numbers.add(80);
		numbers.add(21); numbers.add(11);
		
		System.out.println(numbers);
		
		ArrayList<Integer> divisibleBy2 = new ArrayList<Integer>();
		ArrayList<Integer> others = new ArrayList<Integer>();
		
		
		for (Integer number : numbers) {
			if(number%2==0) {
				divisibleBy2.add(number);
			} else {
				others.add(number);
			}
		}
		
		System.out.println("List of divisible by 2: " + divisibleBy2 );
		System.out.println("List of not divisible by 2: " + others );
		
		
		
		
	}

}
