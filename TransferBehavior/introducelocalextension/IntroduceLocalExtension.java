package introducelocalextension;

import java.util.Date;

public class IntroduceLocalExtension {
	//使用子类扩展
	class MyDateSub extends Date{
		public MyDateSub(String dateString) {
			super(dateString);
		}
		
		public MyDateSub(Date arg) {
			super(arg.getTime());
		}
		
		Date nextDay() {
			return new Date(getYear(), getMonth(), getDate() + 1);
		}
	}
	
	//使用包装类扩展
	class MyDateWrap{
		private Date _oldDate;
		
		public MyDateWrap(String dateString) {
			_oldDate = new Date(dateString);
		}
		
		public MyDateWrap(Date arg) {
			_oldDate = arg;
		}
		
		public int getYear() {
			return _oldDate.getYear();
		}
		
		public boolean equals(Object arg) {
			if(this == arg) {
				return true;
			}
			if(!(arg instanceof MyDateWrap)) {
				return false;
			}
			
			MyDateWrap other = (MyDateWrap)arg;
			return (_oldDate.equals(other._oldDate));
		}
		
		
//		使用包装类有个特殊问题：如何处理“接受原始类之实例为参数“的函数?
	}
}
