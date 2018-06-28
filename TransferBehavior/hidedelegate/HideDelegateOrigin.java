package hidedelegate;

public class HideDelegateOrigin {
	
	public static void main(String args[]) {
		HideDelegateOrigin x = new HideDelegateOrigin();
		Person John = x.new Person();
		//获取john的经理人
		John.getDepartment().getManager();
	}
	
	class Person{
		Department _department;
		
		public Department getDepartment() {
			return _department;
		}
		
		public void setDepartment(Department arg) {
			_department = arg;
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
