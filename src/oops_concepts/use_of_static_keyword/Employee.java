package oops_concepts.use_of_static_keyword;

public class Employee {

	int empid;
	String name;
	// static keyword use here to memory management, static variable points one
	// memory location
	static String company = "Trooman";

	Employee(int empid, String name) {
		this.empid = empid;
		this.name = name;

	}

	void display() {
		System.out.println(empid + " " + name + " " + company);
	}

	public static void main(String[] args) {
		Employee e = new Employee(101, "Mayur");
		e.display();
		Employee e1 = new Employee(102, "Vishal");
		e1.display();
	}
}
