package replaceconditionalwithpolymorphism;

public class Origin {
	
	static class Engineer extends EmployeeType{

		@Override
		int getTypeCode() {
			return ENGINEER;
		}
		
	}
	
	static class Salesman extends EmployeeType{

		@Override
		int getTypeCode() {
			return SALESMAN;
		}
		
	}
	
	static class Manager extends EmployeeType{

		@Override
		int getTypeCode() {
			return MANAGER;
		}
		
	}
	
	static class Employee{
		
		private EmployeeType _type;
		private int _monthlySalary;
		private int _commission;
		private int _bonus;
		
		Employee(EmployeeType type){
			_type = type;
		}
		
		int getType() {
			return _type.getTypeCode();
		}
		
		void setType(int arg) {
			switch(arg) {
			case EmployeeType.ENGINEER:
				_type = new Engineer();
				break;
			case EmployeeType.SALESMAN:
				_type = new Salesman();
				break;
			case EmployeeType.MANAGER:
				_type = new Manager();
				break;
			default:
				break; 
			}
		}
		
		int payAmount() {
			switch(getType()) {
			case EmployeeType.ENGINEER:
				return _monthlySalary;
			case EmployeeType.SALESMAN:
				return _monthlySalary + _commission;
			case EmployeeType.MANAGER:
				return _monthlySalary + _bonus;
			default:
				throw new RuntimeException("");
			}
		}
	}
	
	abstract static class EmployeeType{
		
		static final int ENGINEER = 0;
		static final int SALESMAN = 1;
		static final int MANAGER = 2;
		
		static EmployeeType newType(int code) {
			switch(code) {
			case ENGINEER:
				return new Engineer();
			case SALESMAN:
				return new Salesman();
			case MANAGER:
				return new Manager();
			default:
				throw new RuntimeException("");
			}
		}
		
		abstract int getTypeCode();
	}
}
