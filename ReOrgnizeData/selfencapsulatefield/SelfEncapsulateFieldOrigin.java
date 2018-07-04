package selfencapsulatefield;

public class SelfEncapsulateFieldOrigin {
	class IntRange{
		private int _low, _high;
		
		public IntRange(int low ,int high) {
			_low = low;
			_high = high;
		}
		
		boolean includes(int arg) {
			return arg >= _low && arg <= _high;
		}
		
		void grow(int factor) {
			_high = _high * factor;
		}
	}
}
