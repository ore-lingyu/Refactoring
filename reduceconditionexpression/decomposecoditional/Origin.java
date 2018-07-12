package decomposecoditional;

import java.util.Date;

public class Origin {
	Date SUMMER_START = new Date();
	Date SUMMER_END = new Date();
	double _winterRate = 0.2;
	double _winterServiceCharge = 0.3;
	double _summerRate = 0.4;
	private void calCharge(Date date,int quantity) {
		double charge = 0;
		if(date.before(SUMMER_START) || date.after(SUMMER_END)) {
			charge = quantity * _winterRate * _winterServiceCharge;
		}else {
			charge = quantity * _summerRate;
		}
	}
}
