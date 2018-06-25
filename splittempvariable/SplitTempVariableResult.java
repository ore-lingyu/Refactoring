package splittempvariable;

public class SplitTempVariableResult {
	double _primaryForce = 100;
	double _secordaryForce = 30;
	double _mass = 5;
	int _delay = 3;
	double getDistanceTravelled(int time) {
		double result;
		final double primaryAcc = _primaryForce / _mass;
		int primaryTime = Math.min(time, _delay);
		result = 0.5 * primaryAcc * primaryTime * primaryTime;
		int secordaryTime = time - _delay;
		if(secordaryTime > 0) {
			double primaryVel = primaryAcc * _delay;
			final double secordaryAcc = (_primaryForce + _secordaryForce) / _mass;
			result += primaryVel * _secordaryForce + 0.5 * secordaryAcc * 
					secordaryTime * secordaryTime;
		}
		return result;
	}

}
