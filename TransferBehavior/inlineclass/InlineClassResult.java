package inlineclass;

public class InlineClassResult {
	private String _name;
	private String _officeAreaCode;
	private String _officeNumber;
	public String getName() {
		return _name;
	}
	public String getTelephoneNumber(String _name) {
		return ("("+_officeAreaCode+") ") + _officeNumber;
	}
	public String getOfficeAreaCode() {
		return _officeAreaCode;
	}
	public void setOfficeAreaCode(String _officeAreaCode) {
		this._officeAreaCode = _officeAreaCode;
	}
	public String getOfficeNumber() {
		return _officeNumber;
	}
	public void setOfficeNumber(String _officeNumber) {
		this._officeNumber = _officeNumber;
	}
}
