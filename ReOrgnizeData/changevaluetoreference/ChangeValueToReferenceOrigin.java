package changevaluetoreference;

import java.util.Collection;
import java.util.Iterator;


public class ChangeValueToReferenceOrigin {
	private static int numberOfOrdersFor(Collection orders,String customer) {
		int result  = 0;
		Iterator iter = orders.iterator();
		while(iter.hasNext()) {
			Order each = (Order)iter.next();
			if(each.getCustomerName().equals(customer)) {
				result ++;
			}
		}
		return result;
	}
	
	
	class Customer{
		
		private final String _name;

		public Customer(String name) {
			_name = name;
		}
		
		public String getName() {
			return _name;
		}

		
		
		
	}
	
	class Order{
		
		private Customer _customer;
		
		public Order(String customerName) {
			_customer = new Customer(customerName);
		}

		public String getCustomerName() {
			return _customer.getName();
		}

		public void seCustomerName(String customerName) {
			this._customer = new Customer(customerName);
		}
		
		
	}
}
