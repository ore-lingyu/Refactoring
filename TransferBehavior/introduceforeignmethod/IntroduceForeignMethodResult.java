package introduceforeignmethod;

import java.util.Date;

public class IntroduceForeignMethodResult {
	Date previousEnd = new Date();
	@SuppressWarnings("deprecation")
	Date newStart = nextDay(previousEnd);
	
	private static Date nextDay(Date arg) {
		//foreign method,should be on date
		return new Date(arg.getYear(),arg.getMonth(),arg.getDate() +1);
	}
}
