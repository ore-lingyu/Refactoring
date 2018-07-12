package replacenestedcoditionalwithguardclauses;

public class Origin {
	private boolean _isDead = false;
	private boolean _isSeparated = false;
	private boolean _isRetired = false;
	double getPayAmount() {
		double result;
		if(_isDead) {
			result = deadAmount();
		}else {
			if(_isSeparated) {
				result = separatedAmount();
			}else {
				if(_isRetired) {
					result = retiredAmount();
				}else {
					result = normalPayAmount();
				}
			}
		}
		return result;
	}
	
	double normalPayAmount() {
		return 0;
	}
	
	double retiredAmount() {
		return 0;
	}
	
	double separatedAmount() {
		return 0;
	}
	
	double deadAmount() {
		return 0;
	}
	
	double _capital = 0.0;
	double _intRate = 0.0;
	double _duration = 0.0;
	double _income = 0.0;
	private static final double ADJ_FACTOR = 1;
	public double getAdjustedCapital() {
		double result = 0.0;
		if(_capital > 0.0) {
			if(_intRate > 0.0 && _duration > 0.0) {
				result = (_income / _duration) * ADJ_FACTOR;
			}
		}
		return result;
	}
}
