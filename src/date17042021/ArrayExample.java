package date17042021;

public class ArrayExample {

	public static void main(String[] args) {

		String name = "Java";
		int num = 5;
		
		
		String[] cities = new String[5];
		
		cities[0] = "Pune";
		cities[1] = "Mumbai";
		cities[2] = "Latur";
		cities[3] = "Aurangabad";
		cities[4] = "Nasik";
		//cities[5] = "Nasik";
		
		for(int i=0; i<cities.length; i++) {
			System.out.println(cities[i]);
		}
		
		
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		
		System.out.println(numbers.length);
		System.out.println(numbers[3]);
		numbers[3]=10;
		System.out.println(numbers[3]);
	}

}
