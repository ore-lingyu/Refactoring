package replacetypecodewithclass;

public class Result {
	
	public static void main(String args[]) {
		Person thePerson = new Person(BloodGroup.A);
		thePerson.getBloodGroup().getCode();
		thePerson.setBloodGroup(BloodGroup.AB);
	}
	
	static class Person{
		
		private BloodGroup _bloodGroup;
		
		public Person(BloodGroup bloodGroup) {
			_bloodGroup = bloodGroup;
		}
		
		public void setBloodGroup(BloodGroup arg) {
			_bloodGroup = arg;
		}
		
		public BloodGroup getBloodGroup() {
			return _bloodGroup;
		}
		
	}
}
