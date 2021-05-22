package date07032021;

public class ExecutionNewCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		NewCar santro = new NewCar("Hyundai", "Santro", "White", 2020, 5);
		santro.displayCarDetails();
		
		NewCar baleno = new NewCar("Maruti", "Baleno", "Grey", 2021, 5);
		baleno.displayCarDetails();
		
		
		NewCar polo = new NewCar("Volkswagen", "Polo", "Red", 2020);
		polo.displayCarDetails();

	}

}
