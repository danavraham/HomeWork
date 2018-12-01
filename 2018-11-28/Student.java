
public class Student implements Comparable<Student>{
	
	//----------------Properties--------------
	
	private int grade;
	private int age;
	private String name;
	
	
	//----------------CTOR--------------
	public Student(int grade, int age, String name) {
		
		setGrade(grade);
		setAge(age);
		setName(name);
	}


	//----------------G&S's--------------
	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade>=0 && grade<=100 ? grade : 0;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age>=18 && age<=120 ? age : 18;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	//----------------Methods--------------
	@Override
	public String toString() {
		return "Student Name= " + name + ", Grade= " + grade + ", age=" + age;
	}
	
	
	//Sort ArrayList by Name with compareTo()
	@Override
	public int compareTo(Student o) {
		return (int) (this.getName().compareTo(o.getName()));
	}
	
	
	
	
	
	
	
	
	
	
	

}
