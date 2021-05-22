package date20032021;

public class ProductDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// cost = 50, discount=12, discounted price?
		
		int cost = 50;
		int discount = 12;
		int discountedPrice=0;
		
		
		discountedPrice = cost - (discount * cost/100);
		
		System.out.println(discountedPrice);
		

	}

}
