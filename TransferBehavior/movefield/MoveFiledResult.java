package movefield;

public class MoveFiledResult {
	
	class Account {
		private AccountType _type;
		
		double interestForAccount_days(double amount, int days) {
			return getInterestRate() * amount * days / 365;
		}
		
		void setInterestRate(double arg) {
			_type.setInterestRate(arg); 
		}
		
		double getInterestRate() {
			return _type.getInterestRate();
		}
	}
	
	
	class AccountType{
		private double _interestRate;
		
		void setInterestRate(double arg) {
			_interestRate = arg;
		}
		
		double getInterestRate() {
			return _interestRate;
		}
	}
}
