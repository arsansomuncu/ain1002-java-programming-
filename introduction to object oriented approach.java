package week08;

public class Person //extends Object
{
	String name, surname, birthPlace;

	public Person(String name, String surname, String birthPlace) 
	{
		this.name = name;
		this.surname = surname;
		this.birthPlace = birthPlace;
	}
	
	@Override
	public String toString() {
		return ", name=" + name + ", surname=" + surname
				+ ", birthPlace=" + birthPlace;
	}
	
}



package week08;

public class Student extends Person 
{
	long stuID;
	double gpa; 
	String department;
	
	public Student(String name, String surname, String birthplace, 
			long stuID, double gpa, String department)
	{
		super(name, surname, birthplace);
		/*
		//this.name = name;
		super.name = name;
		super.surname = surname;
		super.birthPlace = birthplace;*/
		
		this.stuID = stuID;
		this.gpa = gpa;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student stuID=" + stuID + ", gpa=" + gpa 
				+ ", department=" + department + super.toString();
	}



package week08;

public class Employee extends Person 
{
	long empID;
	String company;
	
	public Employee(long empID, String company, String name, String surname, String birthplace) 
	{
		super(name, surname, birthplace);
		
		this.empID = empID;
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employee empID=" + empID + ", company=" + company + super.toString();
	}
	
	
}



package week08;

public class Test1
{
	public static void main(String[] args) {
		
		Student s1 = new Student("Ali", "Mehmetoglu", "Istanbul", 234567, 3.21, "AIN");
		System.out.println(s1);
		
		Employee e1 = new Employee(1672, "BAU", "Duygu", "CAKIR", "Istanbul");
		System.out.println(e1);
	}
}
