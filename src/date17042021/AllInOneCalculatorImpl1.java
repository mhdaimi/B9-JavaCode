package date17042021;

public abstract class AllInOneCalculatorImpl1 implements AllInOneCalculator{
	
	public void add(int x,int y,int z) {
		System.out.println("Addition of three int is: " + (x+y+z));
	}

	public void add(float x,float y,float z) {
		System.out.println("Addition of 3 float is: " + (x+y+z));
	}
	
}
