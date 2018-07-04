package encapsulatecollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EncapsulateCollectionSetOrigin {
	
	private static void main(String args[]) {
		EncapsulateCollectionSetOrigin o = new EncapsulateCollectionSetOrigin();
		EncapsulateCollectionSetOrigin.Person kent  = o.new Person();
		Set s = new HashSet();
		s.add(o.new Course("Smalltalk Programming",false));
		s.add(o.new Course("Appreciating Single Malts ",true));
		kent.setCourses(s);
		System.out.println(kent.getCourses().size());
		
		Course refact = o.new Course("Refactoring",true);
		kent.getCourses().add(refact);
		kent.getCourses().add(o.new Course("Brutal Sacasm",false));
		System.out.println(kent.getCourses().size());
		
		kent.getCourses().remove(refact);
		System.out.println(kent.getCourses().size());
		
		Iterator iter = kent.getCourses().iterator();
		int count = 0 ;
		while(iter.hasNext()) {
			Course course = (Course)iter.next();
			if(course.isAdvanced()) {
				count ++;
			}
		}
		
	}
	
	class Person{
		Set _courses;
		public Set getCourses() {
			return _courses;
		}
		
		public void setCourses(Set arg) {
			_courses = arg;
		}
		
		
	}
	
	class Course{
		String _name;
		boolean _isAdvanced;
		public Course(String name, boolean isAdvanced) {
			_name = name;
			_isAdvanced = isAdvanced;
		}
		
		public boolean isAdvanced() {
			return _isAdvanced;
		}
	}
}
