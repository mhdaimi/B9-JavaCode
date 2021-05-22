package date11042021;

public class Execution {

	public static void main(String[] args) {
		Addition a = new Addition();
		a.add(10, 20);
		a.add(12.1f, 10.5f);
		a.add(10, 20, 30);
			
	}
	
	
	public static void main(int[] args) {
		System.out.println("Another main method");
		Addition a = new Addition();
		a.add(10, 20);
		a.add(12.1f, 10.5f);
		a.add(10, 20, 30);
	}

}
