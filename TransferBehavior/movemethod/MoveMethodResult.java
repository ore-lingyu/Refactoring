package movemethod;

public class MoveMethodResult {
	private AccountType _type;
	private int _daysOverdrawn;
	
	class Account{
		double overdraftCharge() {
			return _type.overdraftCharge(_daysOverdrawn);
		}
		
		double bankCharge() {
			double result = 4.5;
			if(_daysOverdrawn > 0) {
				result += _type.overdraftCharge(_daysOverdrawn);
			}
			return result;
		}
	}
	
	class AccountType{
		//若涉及多个参数方法，可传递对象
		double overdraftCharge(int daysOverdrawn) {
			if(isPremium()) {
				double result = 10;
				if(daysOverdrawn > 7)
					result += (daysOverdrawn -7) * 0.85;
				return result;
			}else {
				return daysOverdrawn * 1.75;
			}
		}
		
		boolean isPremium() {
			return false;
		}
	}
}
