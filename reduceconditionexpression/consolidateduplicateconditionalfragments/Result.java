package consolidateduplicateconditionalfragments;

public class Result {
	private void calTotalSend(double price) {
		double total = 0;
		if(isSpecialDeal()) {
			total = price * 0.95;
		}else {
			total = price * 0.98;
		}
		send();
	}
	
	private void send() {
		
	}
	
	private boolean isSpecialDeal() {
		return false;
	}
}
