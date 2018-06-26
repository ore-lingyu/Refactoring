package extractmethod;

import java.util.Enumeration;
import java.util.Stack;

public class ExtactMethodResult {
	Stack<Order> _orders = new Stack<Order>();
	String _name = "ExtactMethod";
	
	void printOwing() {
		printBanner();
		double outstanding = getOutstanding();
		printDetails(outstanding);
	}
	
	
	//无局部变量
	void printBanner() {
		//print banner
		System.out.println("start print");
		System.out.println("Customer Owes");
		System.out.println("end print");
	}
	
	
	void printDetails(double outstanding) {
		//print details
		System.out.println("name" +_name);
		System.out.println("amount" + outstanding);
	}
	
	double getOutstanding() {
		Enumeration e = _orders.elements();
		double result = 0.0;
		while(e.hasMoreElements()) {
			Order each = (Order)e.nextElement();
			result += each.getAmount();
			
		}
		return result;
	}
	
}
