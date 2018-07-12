package removecontrolflag;

public class Result {
	
	String foundMiscreant(String[] people) {
		for(int i = 0 ;i < people.length; i++) {
			if(people[i].equals("Don")) {
				sendAlert();
				return "Don";
			}
				
			if(people[i].equals("John")) {
				sendAlert();
				return "John";
			}
		}
		return "";
		
	}
	
	void someLaterCode(String code) {
		//
		sendAlert();
	}
	
	void checkSecurity(String[] people) {
		String found = foundMiscreant(people);
		someLaterCode(found);
	}
	
	void sendAlert() {
		
	}
}
