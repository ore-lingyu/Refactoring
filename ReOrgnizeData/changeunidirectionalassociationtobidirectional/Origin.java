package changeunidirectionalassociationtobidirectional;

import java.util.HashSet;
import java.util.Set;

public class Origin {
	class Order{
		Customer _customer;
		
		Customer getCustomer() {
			return _customer;
		}
		
		void setCustomer(Customer arg) {
			_customer = arg;
		}
	}
	
	
	class Customer{
		private Set _orders = new HashSet();
	}
}
