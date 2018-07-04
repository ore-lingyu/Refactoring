package replacetypecodewithsubclasses;

public class Origin {
	
	static class Employee{
		private int _type;
		static final int ENGINEER = 0;
		static final int SALESMAN = 1;
		static final int MANAGER = 2;
		
		static Employee create(int type) {
			return new Employee(type);
		}
		
		Employee(int type){
			_type = type;
		}
	}
}
