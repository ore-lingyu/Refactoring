package extractmethod;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;

public class ExtactMethodOrigin {
	Stack<Order> _orders = new Stack<Order>();
	String _name = "ExtactMethod";
	
	void printOwing() {
		Enumeration e = _orders.elements();
		double outstanding = 0.0;
		
		//print banner
		System.out.println("start print");
		System.out.println("Customer Owes");
		System.out.println("end print");
		
		//calculate outstanding
		while(e.hasMoreElements()) {
			Order each = (Order)e.nextElement();
			outstanding += each.getAmount();
			
		}
		
		//print details
		System.out.println("name" +_name);
		System.out.println("amount" + outstanding);
	}
}
