package consolidateconditionalexpression;

public class Result {
	
	private int _seniority = 1;
	private int _monthsDisabled = 11;
	private boolean _isPartTime = false;
	
	
	private double disabilityAmount() {
		if(isNotEligibleForDisaility()) {
			return 0;
		}
		return -1;
	}
	
	private boolean isNotEligibleForDisaility() {
		return ((_seniority < 2) || (_monthsDisabled > 12) || (_isPartTime));
	}
	
}
