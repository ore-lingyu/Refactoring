package replacetypecodewithclass;

public class Origin {
	
	public static void main(String args[]) {
		Person thePerson = new Person(Person.A);
		thePerson.getBloodGroup();
		thePerson.setBloodGroup(Person.AB);
	}
	
	static class Person{
		public static final int O = 0;
		public static final int A = 1;
		public static final int B = 2;
		public static final int AB = 3;

		private int _bloodGroup;
		
		public Person(int bloodGroup) {
			_bloodGroup = bloodGroup;
		}
		
		public void setBloodGroup(int arg) {
			_bloodGroup = arg;
		}
		
		public int getBloodGroup() {
			return _bloodGroup;
		}
	}
}
