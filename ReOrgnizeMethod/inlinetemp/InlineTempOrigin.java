package inlinetemp;

import extractmethod.Order;

public class InlineTempOrigin {
	Order anOrder = new Order();
	
	boolean basePriceMorethanThousands() {
		double basePrice = anOrder.getBasePrice();
		return basePrice > 1000;
	}
}
