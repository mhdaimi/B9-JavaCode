package date18042021;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MultiDArrayList {

	public static void main(String[] args) {

//		ArrayList<String> progLanguage = new ArrayList<String>();
//		ArrayList<Integer> num = new ArrayList<Integer>();
		
		ArrayList<ArrayList<Integer>> numbers = new ArrayList<ArrayList<Integer>>();
		
		ArrayList<Integer> num1 = new ArrayList<Integer>();
		ArrayList<Integer> num2 = new ArrayList<Integer>();
		ArrayList<Integer> num3 = new ArrayList<Integer>();
		
		LinkedList<String> str1 = new LinkedList<String>(); // nodes: value, next node address
		
		num1.add(2);
		num1.add(4);
		num1.add(6);
		num1.add(8);
		
		num2.add(3);
		num2.add(6);
		num2.add(9);
		num2.add(12);
		num2.add(15);
		num2.add(18);
		num2.add(21);
		
		num3.add(4);
		num3.add(8);
		num3.add(12);
		
		
		numbers.add(num1);
		numbers.add(num2);
		numbers.add(num3);
		
		System.out.println(numbers);
		
		System.out.println(numbers.size());
		
		System.out.println(numbers.get(0));
		List<Integer> temp = numbers.get(1);
		System.out.println("Temp :" + temp);
		
		System.out.println(temp.get(4));
		
		
		System.out.println(numbers.get(1).get(4));
		
		
	}

}
