package IntroduceExplainingVariable;

public class IntroduceExplainingVariableResult {
	int _quantity = 0;
	double _itemPrice = 0;
	double basePrice() {
		//price is base price - quantity discount + shiping
		final double basePrice = _quantity * _itemPrice;
		final double quantityDiscount = Math.max(0, _quantity - 500) * _itemPrice * 0.05;
		final double shiping = Math.min(basePrice * 0.1, 100.0);
		return basePrice -
				quantityDiscount +
				shiping;
		// next step extract method
	}
}
