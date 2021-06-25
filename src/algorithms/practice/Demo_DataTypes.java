/**
 * 
 */
package algorithms.practice;

import java.util.Random;

import algorithms.practice.sort.selection.insertionsort.Insertion;
import algorithms.practice.sort.selection.insertionsort.InsertionSort;

/**
 * @author vbillapa
 *
 */
public class Demo_DataTypes {

	/**
	 * @param args
	 */
	public static Integer[] Create(int size) {
		Random random= new Random();
		Integer[] input= new Integer[size];
		for (int i=0;i<size;i++) {
			input[i]=random.nextInt(99);
		}
		return input;
		}
	
	public static void main(String[] args){

		Insertion<Integer> insertion = new InsertionSort<Integer>();
		Integer[] input = Create(20);
		insertion.Sort(input);
		for (int i=0;i<20;i++) {
			System.out.println(input[i]);
		}
		
		insertion.Reverse(input);
		for (int i=0;i<20;i++) {
			System.out.println(input[i]);
		}
		
		
		Insertion<String> insertion_str = new InsertionSort<String>();
		String[] input_str={"Andree", "Leana", "Faviola", "Loyce", "Quincy", "Milo", "Jamila", "Toccara", "Nelda", "Blair", "Ernestine", "Chara", "Kareen", "monty", "Rene", "Cami", "Winifred", "tara", "Demetrice", "azucena"};
		insertion_str.Sort(input_str, Insertion.IgnoreCase);
		
		for (int i=0;i<input_str.length;i++) {
			System.out.println(input_str[i]);
		}
		
		insertion_str.Reverse(input_str, Insertion.IgnoreCase);
		
		for (int i=0;i<input_str.length;i++) {
			System.out.println(input_str[i]);
		}
	}

}
