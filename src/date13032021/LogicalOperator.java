package date13032021;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		int y = 11;
		int z = 12;
		int a = 10;
		
		
		boolean res =(x<y && x<z);
		System.out.println(res);
		
		System.out.println(x<y && x>a);
		
		System.out.println(!(x<y || x>a));
		
		

	}

}
