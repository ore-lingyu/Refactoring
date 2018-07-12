package replacenestedcoditionalwithguardclauses;

public class Result {
	private boolean _isDead = false;
	private boolean _isSeparated = false;
	private boolean _isRetired = false;
	double getPayAmount() {
		if(_isDead) return deadAmount();
		if(_isSeparated) return separatedAmount();
		if(_isRetired) return retiredAmount();
		return normalPayAmount();
	}
	
	
	double _capital = 0.0;
	double _intRate = 0.0;
	double _duration = 0.0;
	double _income = 0.0;
	private static final double ADJ_FACTOR = 1;
	public double getAdjustedCapital() {
		if(_capital <= 0.0) return 0;
//		if(!(_intRate > 0.0 && _duration > 0.0)) return result;
		if(_intRate <= 0.0 || _duration <= 0.0) return 0;
		return (_income / _duration) * ADJ_FACTOR;
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
}
