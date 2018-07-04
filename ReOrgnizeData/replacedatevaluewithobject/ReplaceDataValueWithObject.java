package replacedatevaluewithobject;

import java.util.Collection;
import java.util.Iterator;

public class ReplaceDataValueWithObject {
	
	private static int numberOfOrdersFor(Collection orders,String customer) {
		int result  = 0;
		Iterator iter = orders.iterator();
		while(iter.hasNext()) {
			Order each = (Order)iter.next();
			if(each.getCustomer().equals(customer)) {
				result ++;
			}
		}
		return result;
	}
	
	class Order{
		
		private String _customer;
		
		public Order(String customer) {
			_customer = customer;
		}

		public String getCustomer() {
			return _customer;
		}

		public void seCustomer(String _customer) {
			this._customer = _customer;
		}
		
		
	}
}
