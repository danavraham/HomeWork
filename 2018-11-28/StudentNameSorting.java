import java.util.Comparator;

public class StudentNameSorting implements Comparator<Student> {
	
	public int compare(Student s1, Student s2) {
		return (int) (s1.getName().compareTo(s2.getName()));
	}

}
 