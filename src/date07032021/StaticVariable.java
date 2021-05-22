package date07032021;

public class StaticVariable {

	int var = 0;
	static int sVar = 0;
	
	
	void increementValue() {
		var++;
		sVar++;
	}
	
	void displayName() {
		System.out.println("var: " + var);
		System.out.println("sVar: " + sVar);
	}
	
}
