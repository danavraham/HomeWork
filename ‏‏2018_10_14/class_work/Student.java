package hw2018_10_14;

public class Student {

	private int grade;
	private int age;
	static int sumGrades = 0;
	static int sumAges = 0;
	static int sumStudents = 0;

	private static void sumGrades(int newGrade) {
		sumGrades += newGrade;
	}

	private static void sumAges(int newAge) {
		sumAges += newAge;
	}

	private static void sumStudents() {
		sumStudents ++;
	}

	
	//G&S's
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static int getSumGrades() {
		return sumGrades;
	}

	public static int getSumAges() {
		return sumAges;
	}

	public static int getSumStudents() {
		return sumStudents;
	}

	
	//CTOR
	public Student(int grade, int age) {
		super();
		this.grade = grade;
		this.age = age;
		sumGrades(grade);
		sumAges(age);
		sumStudents();
	}
	//
	public static double avgGrade() {
		return sumGrades/sumStudents;
	}

	public static double avgAge() {
		return sumAges/sumStudents;
	}
	
	@Override
	public String toString() {
		
		return("Student age:" + age + ", Student grade:" + grade);
	}
	
}
