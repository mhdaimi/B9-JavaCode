package date17042021;

public abstract class AllInOneCalculatorImpl2 extends AllInOneCalculatorImpl1  {

	public void sub(float x,float y,float z) {
		System.out.println(x-y-z);
	}
	public void div(float x,float y,float z) {
		System.out.println(x/y);
	}

	
	public void sub(int x,int y,int z) {
		System.out.println(x-y-z);
	}
	public void div(int x,int y,int z) {
		System.out.println(x/y);
	}
	public void mult(int x,int y,int z) {
		System.out.println(x*y*z);
	}
	
}
