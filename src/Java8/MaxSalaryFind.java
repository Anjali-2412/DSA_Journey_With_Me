package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee{
	String name;
	int id;
	double salary;
	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}
public class MaxSalaryFind {
		public static void main(String[] args) {
			List<Employee> emp = Arrays.asList(
					new Employee("John", 1, 1000),
					new Employee("Mike", 2, 1500),
					new Employee("Sam", 3, 1200)
					);
			Employee maxSalaryEmp = emp.stream().max(Comparator.comparingDouble(Employee::getSalary))
					.orElse(null);
			System.out.println("Max Salaried employee : "+maxSalaryEmp.getName()+" - "+maxSalaryEmp.getSalary());
			
			
			//--------------------------------
			
			
			Employee e =emp.stream().max(Comparator.comparingDouble(Employee::getSalary)).orElse(null);
			System.out.println(e.getName()+" "+e.getSalary());
			
			
			
			
			
			
			
			
			
			
			
		}
}
