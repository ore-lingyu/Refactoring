package removecontrolflag;

public class Origin {
	void checkSecurity(String[] people) {
		boolean found = false;
		for(int i = 0 ;i < people.length; i++) {
			if(!found) {
				if(people[i].equals("Don")) {
					sendAlert();
					found = true;
				}
				
				if(people[i].equals("John")) {
					sendAlert();
					found = true;
				}
			}
		}
	}
	
	void sendAlert() {
		
	}
}
