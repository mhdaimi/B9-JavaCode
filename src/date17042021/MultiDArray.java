package date17042021;

public class MultiDArray {

	public static void main(String[] args) {

		int[][] numbers = { {2,4,6,8}, {3,6,9,12} };
		
		System.out.println(numbers[1][2]);
		
		System.out.println(numbers[0][3]);
		
		System.out.println(numbers.length);
		
		
		for(int i=0; i<numbers.length;i++) {
			for(int j=0; j<numbers[i].length;j++) {
				System.out.print(numbers[i][j]);
			}
			System.out.println();
		}
		
		
		
		String[][] names = new String[2][4];
		
		names[0][0] = "Pune";
		names[0][1] = "Mumbai";
		names[1][0] = "Delhi";
		names[1][1] = "Noida";
		
		
		for(int i=0; i<names.length;i++) {
			for(int j=0; j<names[i].length;j++) {
				System.out.print(names[i][j]);
			}
			System.out.println();
		}
		
		 System.out.println(names);
		
	}

}
