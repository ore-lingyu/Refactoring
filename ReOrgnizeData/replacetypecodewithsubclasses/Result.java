package replacetypecodewithsubclasses;

public class Result {
	static class Engineer extends Employee{
		
		Engineer(int type) {
			super(type);
			// TODO Auto-generated constructor stub
		}
		
		Engineer() {
			super(Employee.ENGINEER);
			// TODO Auto-generated constructor stub
		}

		int getType() {
			return Employee.ENGINEER;
		}
		
		
	}
	
	
	static abstract class Employee{
		private int _type;
		static final int ENGINEER = 0;
		static final int SALESMAN = 1;
		static final int MANAGER = 2;
		
		static Employee create(int type) {
			switch(type) {
			case ENGINEER:
				return new Engineer();
			case SALESMAN:
				return new Engineer();
			case MANAGER:
				return new Engineer();
			default:
				throw new IllegalArgumentException("");
			}
			
		}
		
		Employee(int type){
			_type = type;
		}
		
		abstract int getType();
	}
}
