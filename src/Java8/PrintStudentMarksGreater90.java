package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Student{
	String name;
	int marks;
	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	
	public int getMarks() {
		return marks;
	}
	
	
	
	
}
public class PrintStudentMarksGreater90 {
	public static void main(String[] args) {
		List<Student> stud = Arrays.asList(
				new Student("Ravi",90),
				new Student("naina",98),
				new Student("kolu",94)
				);
		
		System.out.println("Students with Marks > 90");
		
		stud.stream()
			.filter(s -> s.getMarks()>90)
			.map(Student::getName)
			.forEach(System.out::println);
		
		
		
	}
}
