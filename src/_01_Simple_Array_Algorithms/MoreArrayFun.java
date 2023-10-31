package _01_Simple_Array_Algorithms;

import java.util.Arrays;
import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] testArr = {"One", "two", "three", "four", "five"};
		printArray(testArr);
		revArray(testArr);
		everyOther(testArr);
		randomOrder(testArr);
	}


    //2. Write a method that takes an array of Strings and prints all the Strings in the array.

	public static void printArray(String arr[]) {
		System.out.print(Arrays.toString(arr) + "\n");
	}

    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.
	public static void revArray(String arr[]) {
		for (int i = arr.length -1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
			
		}
		System.out.print("\n");
	}


    //4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void everyOther(String arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.print("\n");
	}

    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.
	public static void randomOrder(String arr[]) {
		Random ran = new Random();
		int count = 0;
		
		while (count < arr.length) {
			int arrIndex = ran.nextInt(0, arr.length);
			if (!arr[arrIndex].equals(" ")) {
				System.out.print(arr[arrIndex] + " ");
				arr[arrIndex] = " ";
				count ++;
			}
		}
	}

}
