package replacetempwithquery;

public class ReplaceTempWithQueryOrigin {
	int _quantity = 0;
	int _itemPrice = 0;
	
	double getPrice() {
		int basePrice = _quantity * _itemPrice;
		double discountFactor;
		if(basePrice > 1000) 
			discountFactor = 0.95;
		else
			discountFactor = 0.98;
		return basePrice * discountFactor;
		
	}
}
