package consolidateduplicateconditionalfragments;

public class Origin {
	private void calTotalSend(double price) {
		double total = 0;
		if(isSpecialDeal()) {
			total = price * 0.95;
			send();
		}else {
			total = price * 0.98;
			send();
		}
	}
	
	private void send() {
		
	}
	
	private boolean isSpecialDeal() {
		return false;
	}
}
