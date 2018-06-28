package movefield;

public class MoveFiledOrigin {
	
	class Account {
		private AccountType _type;
		private double _interestRate;
		
		double interestForAccount_days(double amount, int days) {
			return _interestRate * amount * days / 365;
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
