package replacetypecodewithclass;

public class BloodGroup {
	public static final BloodGroup O = new BloodGroup(0);
	public static final BloodGroup A = new BloodGroup(1);
	public static final BloodGroup B = new BloodGroup(2);
	public static final BloodGroup AB = new BloodGroup(3);
	
	private static final BloodGroup[] _values = {O, A, B, AB};
	private final int _code;
	
	private BloodGroup(int code) {
		_code = code;
	}
	
	public int getCode() {
		return _code;
	}
	
	private static BloodGroup code(int arg) {
		return _values[arg]; 
	}
}
