package replacearraywithobject;

public class ReplaceArrayWithObjectResult {
	
	class Performance{
		public String _name;
		public String _wins;
		
		public String getName() {
			return _name;
		}
		public void setName(String arg) {
			_name = arg;
		}
		
		public int getWins() {
			return Integer.parseInt(_wins);
		}
		
		public void setWins(String arg) {
			_wins = arg;
		}
	}
	
	Performance row = new Performance();
	
	private void getInfoFromArray(){
		String name = row.getName();
		int wins = row.getWins();
	}
	
	private void initStringArray() {
		row.setName("Liverpool");
		row.setWins("15"); 
	}
}
