package replacesubclasswithfields;

public class Origin {
	
	private static void main(String args[]) {
		Person kent = new Male();
	}
	
	static abstract class Person{
		
		abstract boolean isMale();
		
		abstract char getCode();
	}
	
	static class Male extends Person{

		@Override
		boolean isMale() {
			return true;
		}

		@Override
		char getCode() {
			return 'M';
		}
		
	}
	
	static class Female extends Person{

		@Override
		boolean isMale() {
			return false;
		}

		@Override
		char getCode() {
			return 'F';
		}
		
	}
}
