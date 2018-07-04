package selfencapsulatefield;

public class SelfEncapsulateFieldResult {
	
	class CappedRange extends IntRange{
		
		private int _cap;
		
		public CappedRange(int low, int high,int cap) {
			super(low, high);
			_cap = cap;
		}
		
		int getCap() {
			return _cap;
		}
		
		int getHigh() {
			return Math.min(super.getHigh(), getCap());
		}
	}
	
	
	class IntRange{
		private int _low, _high;
		
		public IntRange(int low ,int high) {
			/*setLow(low);
			setHigh(high);*/
			initialize(low, high);
		}
		
		private void initialize(int low,int high) {
			_low = low;
			_high = high;
		}
		
		boolean includes(int arg) {
			return arg >= getLow() && arg <= getHigh();
		}
		
		void grow(int factor) {
			setHigh(getHigh() * factor);
		}

		int getLow() {
			return _low;
		}

		void setLow(int _low) {
			this._low = _low;
		}

		int getHigh() {
			return _high;
		}

		void setHigh(int _high) {
			this._high = _high;
		}
		
		
	}
}
