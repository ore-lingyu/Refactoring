package encapsulatecollection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EncapsulateCollectionSetResult {
	
	private static void main(String args[]) {
		EncapsulateCollectionSetResult o = new EncapsulateCollectionSetResult();
		EncapsulateCollectionSetResult.Person kent  = o.new Person();
		
		Set s = new HashSet();
		kent.addCourse(o.new Course("Smalltalk Programming",false));
		kent.addCourse(o.new Course("Appreciating Single Malts ",true));
		System.out.println(kent.getCourses().size());
		
		Course refact = o.new Course("Refactoring",true);
		kent.addCourse(refact);
		kent.addCourse(o.new Course("Brutal Sacasm",false));
		System.out.println(kent.numberOfCourses());
		
		kent.removeCourse(refact);
		System.out.println(kent.numberOfCourses());
		
		
		
	}
	
	class Person{
		Set _courses = new HashSet();;
		
		public void addCourse(Course arg) {
			_courses.add(arg);
		}
		
		public void removeCourse(Course arg) {
			_courses.remove(arg);
		}
		
		public Set getCourses() {
			return Collections.unmodifiableSet(_courses);
		}
		
		public void initializeCourse(Set arg) {
			_courses.addAll(arg);
			/*Iterator iter = arg.iterator();
			while(iter.hasNext()) {
				addCourse((Course)iter.next());
			}*/
		}
		
		int numberOfAdvancedCourses() {
			Iterator iter = getCourses().iterator();
			int count = 0 ;
			while(iter.hasNext()) {
				Course course = (Course)iter.next();
				if(course.isAdvanced()) {
					count ++;
				}
			}
			return count;
		}
		
		int numberOfCourses() {
			return _courses.size();
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
