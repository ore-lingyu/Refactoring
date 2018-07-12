package replaceconditionalwithpolymorphism;

public class Result {
	
	static class Engineer extends EmployeeType{

		@Override
		int getTypeCode() {
			return ENGINEER;
		}
		
		@Override
		int payAmount(Employee emp) {
			return emp.getMonthlySalary();
		}
		
	}
	
	static class Salesman extends EmployeeType{

		@Override
		int getTypeCode() {
			return SALESMAN;
		}
		@Override
		int payAmount(Employee emp) {
			return emp.getMonthlySalary() + emp.getCommission();
		}
		
	}
	
	static class Manager extends EmployeeType{

		@Override
		int getTypeCode() {
			return MANAGER;
		}
		@Override
		int payAmount(Employee emp) {
			return emp.getMonthlySalary() + emp.getBonus();
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
			return _type.payAmount(this);
		}

		public int getMonthlySalary() {
			return _monthlySalary;
		}

		public void setMonthlySalary(int _monthlySalary) {
			this._monthlySalary = _monthlySalary;
		}

		public int getCommission() {
			return _commission;
		}

		public void setCommission(int _commission) {
			this._commission = _commission;
		}

		public int getBonus() {
			return _bonus;
		}

		public void setBonus(int _bonus) {
			this._bonus = _bonus;
		}
		
		
	}
	
	static abstract class EmployeeType{
		
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
		
		abstract int payAmount(Employee emp);
		
		abstract int getTypeCode();
	}
}
