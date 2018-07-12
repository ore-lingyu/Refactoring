package decomposecoditional;

import java.util.Date;

public class Result {
	Date SUMMER_START = new Date();
	Date SUMMER_END = new Date();
	double _winterRate = 0.2;
	double _winterServiceCharge = 0.3;
	double _summerRate = 0.4;
	private void calCharge(Date date,int quantity) {
		double charge = 0;
		if(notSummer(date)) {
			charge = summerCharge(quantity);
		}else {
			charge = winterCharge(quantity);
		}
	}
	
	private boolean notSummer(Date date) {
		return date.before(SUMMER_START) || date.after(SUMMER_END);
	}
	
	private double summerCharge(int quantity) {
		return quantity * _summerRate;
	}
	
	private double winterCharge(int quantity) {
		return quantity * _winterRate * _winterServiceCharge;
	}
}
