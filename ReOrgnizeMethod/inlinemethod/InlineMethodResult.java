package inlinemethod;

public class InlineMethodResult {
	int _numberOfLateDeliveries;
	int getRating() {
		return _numberOfLateDeliveries > 5 ? 2 : 1;
	}
}
