package changevaluetoreference;

import java.util.Collection;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Iterator;

public class ChangeValueToReferenceResult {
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
	
	
	static class Customer{
		private static Dictionary _instances = new Hashtable();
		
		static void loadCustomers() {
			new Customer("Lemon Car Hire").store();
			new Customer("Associated Coffee Machines").store();
			new Customer("Billston Gasworks").store();
			
		}
		
		private void store() {
			_instances.put(this.getName(), this);
		}
		
		public static Customer getNamed(String name) {
			return (Customer)_instances.get(name);
		}
		
		private final String _name;

		private Customer(String name) {
			_name = name;
		}
		
		public String getName() {
			return _name;
		}
	}
	
	class Order{
		
		private Customer _customer;
		
		public Order(String customerName) {
			_customer = Customer.getNamed(customerName);
		}

		public String getCustomerName() {
			return _customer.getName();
		}

		public void seCustomerName(String customerName) {
			this._customer = new Customer(customerName);
		}
		
		
	}
}
