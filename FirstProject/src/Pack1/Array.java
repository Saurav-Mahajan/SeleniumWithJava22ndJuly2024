package Pack1;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

		int []	array = {10,20,30,40,50}; // 1st way of defining an array when all values that needs to be put in array are known beforehand.
		System.out.println(array[2]);

		int arrayLength = array.length; // How to know array size.
		System.out.println(arrayLength); 

		Arrays.sort(array); // to sort array
		int secondLargestNumberInArray = array[arrayLength-2]; // to find second largest hence "-2".
		System.out.println(secondLargestNumberInArray); //println to print on new line of console.

		int [] arraySecond = new int [5]; // 2nd way of defining array, when array size is know but not the values that needs to be put in it.

		arraySecond [0] = 10;
		arraySecond [1] = 20;
		arraySecond [2] = 30;
		arraySecond [3] = 40;
		arraySecond [4] = 50;

		System.out.print(arraySecond[0]); // print to simply print on the same line of console.
		System.out.print(arraySecond[1]);
		System.out.print(arraySecond[2]);
		System.out.print(arraySecond[3]);
		System.out.println(arraySecond[4]);

		array[0] = 100; // This is how value in an already defind array can be updated. (Array size/ length can not be modified but values in it can be.)
		arraySecond[0] = 100;
		System.out.println(array[0]);
		System.out.println(arraySecond[0]);

	}
}
