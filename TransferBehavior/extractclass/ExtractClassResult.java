package extractclass;

public class ExtractClassResult {
	class Person{
		private TelephoneNumber _officeTelephone = new TelephoneNumber();
		private String _name;
		public String getName() {
			return _name;
		}
		public String getTelephoneNumber(String _name) {
			return _officeTelephone.getTelephoneNumber();
		}
		
		TelephoneNumber getOfficeTelephone() {
			return _officeTelephone;
		}
		
	}
	
	class TelephoneNumber{
		private String _areaCode;
		private String _number;
		
		public String getTelephoneNumber() {
			return ("(" + _areaCode + ") "+ _number);
		}
		
		public String getAreaCode() {
			return _areaCode;
		}

		public void setAreaCode(String _areaCode) {
			this._areaCode = _areaCode;
		}

		public String getNumber() {
			return _number;
		}

		public void setNumber(String _number) {
			this._number = _number;
		}
		
		
	}
}
