package replacetypecodewithstrategy;

public class Origin {
	static class Employee{
		
		static final int ENGINEER = 0;
		static final int SALESMAN = 1;
		static final int MANAGER = 2;
		
		private int _type;
		private int _monthlySalary;
		private int _commission;
		private int _bonus;
		
		Employee(int type){
			_type = type;
		}
		
		int getType() {
			return _type;
		}
		
		void setType(int arg) {
			_type = arg;
		}
		
		int payAmount() {
			switch(getType()) {
				case ENGINEER:
					return _monthlySalary;
				case SALESMAN:
					return _monthlySalary * _commission;
				case MANAGER:
					return _monthlySalary * _bonus;
				default:
					throw new RuntimeException("");
						
			}
		}
	}
}
