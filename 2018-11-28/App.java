import java.util.ArrayList;
import java.util.Collections;

public class App {

	//rand method to create random number between min and max values
	public static int rand (int min, int max) {
		return (int)(Math.random()*(max-min+1));
	}
	
	public static void main(String[] args) {
		
		ArrayList<Student>students = new ArrayList<>();
		
		//fill th "students" ArrayList with 5 Student with values
		for (int i = 0; i < 5; i++) {
		
			students.add(new Student(rand(0, 100), rand(18, 120), "student"+(i+1)));
		}
		
		System.out.println("-------------------------before sort --------------------------");
		for (Student s : students) {
			System.out.println(s);
		}
		System.out.println();
		Collections.sort(students, new StudentAgeSorting());
		
		System.out.println("-------------after age sort in StudentAgeSorting() class--------");
		for (Student s : students) {
			System.out.println(s);
		}
		
		System.out.println();
		Collections.sort(students);
		
		System.out.println("----------------after name sort in compareTo() ------------------");
		for (Student s : students) {
			System.out.println(s);
		}

		
		
		System.out.println();
		Collections.sort(students, new StudentGradeSorting());
		
		System.out.println("-------after grade sort in StudentGradeSorting() class ---------");
		for (Student s : students) {
			System.out.println(s);
		}

		
		System.out.println();
		Collections.sort(students, new StudentNameSorting());
		
		System.out.println("---------after name sort in StudentNameSorting() class ----------");
		for (Student s : students) {
			System.out.println(s);
		}
		
	}

}

