package algorithms.practice.examples;

import java.util.Comparator;


public class Student implements Comparable<Student>{

	Integer Id;
	String name;
	Double Salary;
	
	
	
	public Integer getId() {
		return Id;
	}


	public void setId(Integer id) {
		Id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getSalary() {
		return Salary;
	}


	public void setSalary(Double salary) {
		Salary = salary;
	}


	public Student(Integer iD, String name, Double salary) {
		this.Id = iD;
		this.name = name;
		this.Salary = salary;
	}


	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", Salary=" + Salary + "]";
	}
	
	
	
	
	public static Comparator<Student> SortByName = new Comparator<Student>() {

		@Override
		public int compare(Student object1, Student object2) {
			return object1.name.compareTo(object2.name);
		}
	};
	public static Comparator<Student> NameIgnoreCase = new Comparator<Student>() {
		
		@Override
		public int compare(Student object1, Student object2) {
			System.out.println("Inside NameIgnoreCase"+" "+object1.getName()+" , "+object2.getName() +" ->"+object1.name.compareToIgnoreCase(object2.name));
			return object1.getName().compareToIgnoreCase(object2.getName());
		}
	};
	public static Comparator<Student> SortBySalary = new Comparator<Student>() {

		@Override
		public int compare(Student object1, Student object2) {
			return object1.Salary.compareTo(object2.Salary);
		}
	};

	public static Comparator<Student> SortById = new Comparator<Student>() {

		@Override
		public int compare(Student object1, Student object2) {
			return object1.getId().compareTo(object2.getId());
		}
	};

	
	
	
	@Override
	public int compareTo(Student o) {		
		return SortById.compare(this, o);
	}

}
