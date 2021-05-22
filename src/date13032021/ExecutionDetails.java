package date13032021;

public class ExecutionDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Details d = new Details();
//		d.displayName();
//		d.displayCity();
//		d.displayLanguage();

		DetailsWithArgs da = new DetailsWithArgs();
		da.displayName("Mohammad", "Daimi");
		da.displayName("Amol", "Shende");
		da.displayCity("Pune", 411014);
		da.displayLanguage("Java");
		
		
	}

}
