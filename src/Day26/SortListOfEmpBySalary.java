package Day26;

import java.util.Arrays;
import java.util.List;

class Emp{
	int id;String name;double sal;
	public Emp(int id, String name, double sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
	}	
}
public class SortListOfEmpBySalary {
	public static void main(String[] args) {
		List<Emp> list = Arrays.asList(
				new Emp(1,"Ram",20000),
				new Emp(2,"Shyam",15000),
				new Emp(3,"Mohan",30000)
				);
		list.sort((e1,e2)->(int)(e1.sal-e2.sal));
		list.forEach(e->System.out.println(e.name+" "+e.sal));
	}
}
