package changeunidirectionalassociationtobidirectional;

import java.util.HashSet;
import java.util.Set;

public class Result {
	class Order{
		Customer _customer;
		
		Customer getCustomer() {
			return _customer;
		}
		
		void setCustomer(Customer arg) {
			if(_customer != null) {
				_customer.friendOrders().remove(this);
			}
			if(arg != null) {
				_customer = arg;
				_customer.friendOrders().add(this);
			}
		}
	}
	
	
	class Customer{
		private Set _orders = new HashSet();
		
		Set friendOrders() {
			return _orders;
		}
	}
}
