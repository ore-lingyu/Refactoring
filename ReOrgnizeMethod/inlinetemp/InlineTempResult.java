package inlinetemp;

import extractmethod.Order;

public class InlineTempResult {
	Order anOrder = new Order();
	
	boolean basePriceMorethanThousands() {
		return anOrder.getBasePrice() > 1000; 
	}
}
