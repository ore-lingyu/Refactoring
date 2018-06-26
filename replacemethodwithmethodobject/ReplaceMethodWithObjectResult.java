package replacemethodwithmethodobject;
public class ReplaceMethodWithObjectResult {
	
	int gamma(int inputVal,int quantity, int yearToDate) {
		return new Gamma(this,inputVal,quantity,yearToDate).compute();
	}
}
