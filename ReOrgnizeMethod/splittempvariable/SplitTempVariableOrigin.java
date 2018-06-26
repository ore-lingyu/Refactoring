package splittempvariable;

public class SplitTempVariableOrigin {
	double _primaryForce = 100;
	double _secordaryForce = 30;
	double _mass = 5;
	int _delay = 3;
	double getDistanceTravelled(int time) {
		double result;
		double acc = _primaryForce / _mass;
		int primaryTime = Math.min(time, _delay);
		result = 0.5 * acc * primaryTime * primaryTime;
		int secordaryTime = time - _delay;
		if(secordaryTime > 0) {
			double primaryVel = acc * _delay;
			acc = (_primaryForce + _secordaryForce) / _mass;
			result += primaryVel * _secordaryForce + 0.5 * acc * 
					secordaryTime * secordaryTime;
		}
		return result;
	}

}
