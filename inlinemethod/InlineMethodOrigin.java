package inlinemethod;

public class InlineMethodOrigin {
	int _numberOfLateDeliveries;
	int getRating() {
		return moreThanFiveLateDeliveries() ? 2 : 1;
	}
	
	boolean moreThanFiveLateDeliveries() {
		return _numberOfLateDeliveries > 5 ;
	}
}
