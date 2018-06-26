package replacemethodwithmethodobject;

public class Gamma {
	private final ReplaceMethodWithObjectResult _mReplaceObject;
	private int inputVal;
	private int quantity;
	private int yearToDate;
	private int importantValue1;
	private int importantValue2;
	private int importantValue3;
	
	public Gamma(ReplaceMethodWithObjectResult replaceObject, 
			int inputValArg, int quantityArg,int yearToDateArg){
		_mReplaceObject = replaceObject;
		inputVal = inputValArg;
		quantity = quantityArg;
		yearToDate = yearToDateArg;
	}
	
	int compute() {
		int importantValue1 = (inputVal * quantity) +_mReplaceObject.delta();
		int importantValue2 = (inputVal * yearToDate) +100;
		if((yearToDate - importantValue1) >100) {
			importantValue2 -= 20;
		}
		int importantValue3 = importantValue2 * 7;
		//and so on
		return importantValue3 - 2 * importantValue1;
	}
}
