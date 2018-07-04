package changereferencetovalue;

public class ChangeReferenceToValueOrigin {
//	new Currency("USD").equals(new Currency("USD"));//return false
	class Currency{
		private String _code;
		
		public String getCode() {
			return _code;
		}
		
		private Currency(String code) {
			_code = code;
		}
	}
}
