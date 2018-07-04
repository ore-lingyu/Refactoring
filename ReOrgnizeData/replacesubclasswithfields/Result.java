package replacesubclasswithfields;

public class Result {
	private static void main(String args[]) {
		Person kent = Person.createMale();
	}
	
	static class Person{
		private final boolean _isMale;
		private final char _code;
		
		protected Person(boolean isMale ,char code) {
			_isMale = isMale;
			_code = code;
		}
		
		static Person createMale() {
			return new Person(true,'M');
		}
		
		static Person createFemale() {
			return new Person(false,'F');
		}
		
		boolean isMale() {
			return _isMale;
		}
		
		char getCode() {
			return _code;
		}
		
	}
}
