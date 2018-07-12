package introducenullobject;

import introducenullobject.Result.BillingPlan;

public class Origin {
	private static void main(String args[]) {
		Site site = new Site();
		Customer customer = site.getCustomer();
		BillingPlan plan;
		if(customer == null) {
			plan = BillingPlan.basic();
		}else {
			plan = customer.getPlan();
		}
		
		String customerName;
		if(customer == null) {
			customerName = "occupant";
		}else {
			customerName = customer.getName();
		}
		
		int weekDelinquent;
		if(customer == null) {
			weekDelinquent = 0;
		}else {
			weekDelinquent = customer.getHistory().getWeekDelinquentInLastYear();
		}
		
		if(customer != null) {
			customer.setPlan(BillingPlan.special());
		}
	}
	
	
	static class Site{
		
		Customer _customer;
		
		Customer getCustomer() {
			return _customer;
		}
	}
	
	static class Customer{
		BillingPlan _plan;
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
	
	static class PaymentHistory{
		int getWeekDelinquentInLastYear() {
			return 0;
		}
	}
}
