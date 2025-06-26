package Pack1;

import java.util.Arrays;

public class ArrayAndString {
	
	public static void main(String[] args) {
		
		int[] arrayOne = {10,20,30,40,50}; // 1st way of defining an array when all values that needs to be put in array are known beforehand.
		
		int[] arrayTwo = new int [5]; // 2nd way of defining array, when array size is known but not the values that needs to be put in it.
		arrayTwo[0] = 50;
		arrayTwo[1] = 40;
		arrayTwo[2] = 30;
		arrayTwo[3] = 20;
		arrayTwo[4] = 10;
		
		String stringOne = "ABCD";
		
		System.out.println(arrayOne[4]);
		System.out.println(arrayTwo[4]);
		System.out.println(stringOne);
		
		//How to find size or length of an array or an string?
		
		int arrayOneLength = arrayOne.length;
		int arrayTwoLength = arrayTwo.length;
		int stringLength = stringOne.length();
		
		System.out.println(arrayOneLength);
		System.out.println(arrayTwoLength);
		System.out.println(stringLength);
		
		//How to sort an array and find desired largest number in an array?
		
		Arrays.sort(arrayOne);
		int largestNumberinanArray = arrayOne[arrayOneLength - 1];
		System.out.println(largestNumberinanArray);
		
		Arrays.sort(arrayTwo);
		int secondLargestNumberinanArray = arrayTwo[arrayTwoLength - 2];
		System.out.println(secondLargestNumberinanArray);
		
		int thirdLargestNumberinanArray = arrayTwo[arrayTwoLength - 3];
		System.out.println(thirdLargestNumberinanArray);
	
	}

}
