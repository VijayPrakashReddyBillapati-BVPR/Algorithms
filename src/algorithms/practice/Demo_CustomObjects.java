package algorithms.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import algorithms.practice.pojo.Student;
import algorithms.practice.sort.arrays.insertionsort.Insertion;
import algorithms.practice.sort.arrays.insertionsort.InsertionSort;
import algorithms.practice.sort.arrays.merge.MergeSort;
import algorithms.practice.sort.arrays.merge.MergeSortImpl;
import algorithms.practice.sort.collections.insertion.InsertionSortC;

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
		System.out.println("\n"+" *****************  InsertionSort arrays **************************"+"\n");
		insertion_str.Sort(studentList, Student.SortBySalary);
//		Arrays.sort(studentList);
//		Arrays.sort(studentList, Student.SortBySalary);
		for(Student student:studentList) {
			System.out.println(student.toString());
		}
		
		System.out.println("\n"+" *****************  InsertionSort collection **************************"+"\n");
		InsertionSortC.sort(studentList_1,Student.SortBySalary);
		for(Student student:studentList_1) {
			System.out.println(student.toString());
		}
		
		System.out.println("\n"+" *****************  MergSort **************************"+"\n");
		MergeSort<Student> mergsort = new MergeSortImpl<Student>();
		mergsort.sort(studentList,Student.SortById);
		for(Student student:studentList) {
			System.out.println(student.toString());
		}
	}

}
