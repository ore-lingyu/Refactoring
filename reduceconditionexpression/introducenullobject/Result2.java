package introducenullobject;

public class Result2 {
	private static void main(String args[]) {
		Site site = new Site();
		Customer customer = site.getCustomer();
		BillingPlan plan = customer.getPlan();
		String customerName = customer.getName();
		int weekDelinquent = customer.getHistory().getWeekDelinquentInLastYear();;
		customer.setPlan(BillingPlan.special());
	}
	
	
	static class Site{
		
		Customer _customer;
		
		Customer getCustomer() {
			return _customer == null ? Customer.newNull() : _customer;
		}
	}
	
	static interface Nullable{
		boolean isNull();
	}
	
	static interface Null{
		//special case
	};
	
	static class NullCustomer extends Customer implements Null{
		public boolean isNull() {
			return true;
		}
		
		public String getName() {
			return "occupant";
		}
		
		public void setPlan(BillingPlan plan) {}
		
		public BillingPlan getPlan() {
			return BillingPlan.basic();
		}
		
		public PaymentHistory getHistory() {
			return PaymentHistory.newNull();
		}
		
	}
	
	static class Customer implements Nullable{
		BillingPlan _plan;
		static Customer newNull() {
			return new NullCustomer();
		}
		
		public boolean isNull() {
			return false;
		}
		public String getName() {
			return "customername";
		}
		public BillingPlan getPlan() {
			return _plan;
		}
		
		public void setPlan(BillingPlan plan) {
			_plan = plan;
		}
		
		public PaymentHistory getHistory() {
			return new PaymentHistory();
		}
	}
	
	static class BillingPlan{
		static BillingPlan basic() {
			return new BillingPlan();
		}
		
		static BillingPlan special() {
			return new BillingPlan();
		}
		
	}
	
	static class NullPaymentHistory extends PaymentHistory{
		int getWeekDelinquentInLastYear() {
			return -1;
		}
	}
	
	static class PaymentHistory{
		
		static PaymentHistory newNull() {
			return new NullPaymentHistory();
		}
		
		int getWeekDelinquentInLastYear() {
			return 0;
		}
	}
}
