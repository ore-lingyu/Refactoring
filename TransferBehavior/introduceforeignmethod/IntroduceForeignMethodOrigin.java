package introduceforeignmethod;

import java.util.Date;

public class IntroduceForeignMethodOrigin {
	Date previousEnd = new Date();
	@SuppressWarnings("deprecation")
	Date newStart = new Date(previousEnd.getYear(),
			previousEnd.getMonth(), previousEnd.getDate() +1);
	
	
}
