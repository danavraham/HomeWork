package hw2018_10_14;

public class Programm {

	public static void main(String[] args) {
		Student s1 = new Student(97, 27);
		Student s2 = new Student(51, 38);
		Student s3 = new Student(80, 30);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println("AVG grade is:" + Student.avgGrade());
		System.out.println("AVG age is:" + Student.avgAge());
	}

}
