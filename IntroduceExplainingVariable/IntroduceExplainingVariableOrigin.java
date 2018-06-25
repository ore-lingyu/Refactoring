package IntroduceExplainingVariable;

public class IntroduceExplainingVariableOrigin {
	int _quantity = 0;
	double _itemPrice = 0;
	double basePrice() {
		//price is base price - quantity discount + shiping
		return _quantity * _itemPrice -
				Math.max(0, _quantity - 500) * _itemPrice * 0.05 +
				Math.min(_quantity * _itemPrice * 0.1, 100.0);
	}
}
