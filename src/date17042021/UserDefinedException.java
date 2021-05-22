package date17042021;

public class UserDefinedException {

	public static void main(String[] args) {
		
		int x = 10;
		try {
			checkValueOfX(x);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	static void checkValueOfX(int x) throws Exception {
		if (x==10) {
			throw new Exception("ValueOfXis10");
		}
	}
	
}
