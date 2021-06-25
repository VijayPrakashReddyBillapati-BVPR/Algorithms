package algorithms.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import algorithms.practice.pojo.Student;
import algorithms.practice.sort.collections.insertion.InsertionSortC;
import algorithms.practice.sort.selection.insertionsort.Insertion;
import algorithms.practice.sort.selection.insertionsort.InsertionSort;

public class Demo_CustomObjects {

	public static void main(String[] args) {

		Student student_1 = new Student( 82, "Bdfad", 43242.00);
		Student student_2 = new Student( 84, "Vomkmksjd", 56566.00);
		Student student_3 = new Student( 83, "Pkewyda", 64643.00);
		Student student_4 = new Student( 81, "rgsdfger", 34134.00);
		Student student_5 = new Student( 85, "Ajldjfdfd", 22656.00);
		
		Student[] studentList = {student_1,student_2,student_3,student_4,student_5};
		
		List<Student> studentList_1 = new ArrayList<Student>();
		studentList_1.add(student_1);
		studentList_1.add(student_2);
		studentList_1.add(student_3);
		studentList_1.add(student_4);
		studentList_1.add(student_5);
		
		Insertion<Student> insertion_str = new InsertionSort<Student>();
		insertion_str.Sort(studentList, Student.SortBySalary);
		Arrays.sort(studentList);
		Arrays.sort(studentList, Student.SortBySalary);
		for(Student student:studentList) {
			System.out.println(student.toString());
		}
		
		InsertionSortC.sort(studentList_1,Student.SortBySalary);
		for(Student student:studentList_1) {
			System.out.println(student.toString());
		}
	}

}