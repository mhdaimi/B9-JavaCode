package date21032021;

public class ReverseHalfPyramid {

	public static void main(String[] args) {
		for(int i=5; i>=0; i--) {
			for(int j=0; j<=i; j++) {
				System.out.print("X");
			}
			System.out.println();
		}
	}
}
