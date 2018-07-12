package consolidateconditionalexpression;

public class Origin {
	
	private int _seniority = 1;
	private int _monthsDisabled = 11;
	private boolean _isPartTime = false;
	
	
	private double disabilityAmount() {
		if(_seniority < 2) return 0;
		if(_monthsDisabled > 12) return 0;
		if(_isPartTime) return 0;
		return -1;
	}
}
