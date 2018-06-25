package replacetempwithquery;

public class ReplaceTempWithQueryResult {
	int _quantity = 0;
	int _itemPrice = 0;
	
	double getPrice() {
		return basePrice() * discountFactor();
		
	}
	
	private double discountFactor() {
		if(basePrice() > 1000) 
			return 0.95;
		else
			return 0.98;
	}
	
	private int basePrice() {
		return  _quantity * _itemPrice;
	}
}
