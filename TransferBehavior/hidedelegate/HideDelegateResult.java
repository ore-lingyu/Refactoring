package hidedelegate;

public class HideDelegateResult {
	
	public static void main(String args[]) {
		HideDelegateResult x = new HideDelegateResult();
		Person John = x.new Person();
		//获取john的经理人
		John.getManager();
	}
	
	class Person{
		Department _department;
		
		public Department getDepartment() {
			return _department;
		}
		
		public void setDepartment(Department arg) {
			_department = arg;
		}
		
		public Person getManager() {
			return _department.getManager();
		}
	}
	
	class Department{
		private String _chargeCode;
		private Person _manager;
		
		public Department(Person person) {
			_manager = person;
		}
		
		public Person getManager() {
			return _manager;
		}
	}
}
