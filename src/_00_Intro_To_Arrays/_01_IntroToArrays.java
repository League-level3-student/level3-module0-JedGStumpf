package _00_Intro_To_Arrays;

import java.util.Arrays;
import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
    	String[] fiveStrings = {"one", "two", "three", "four", "five"};

        // 2. print the third element in the array
    	System.out.println(fiveStrings[2]);

        // 3. set the third element to a different value
    	fiveStrings[2] = "changed";
        // 4. print the third element again
    	System.out.println(fiveStrings[2]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
    	for (int i = 0; i < 5; i++) {
    		fiveStrings[i] = Integer.toString(i);
    	}

        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
    	for (int i = 0; i < fiveStrings.length; i++) {
    		System.out.println(fiveStrings[i]);
    	}

        // 7. make an array of 50 integers
    	int[] ranNums = new int[50];

        // 8. use a for loop to make every value of the integer array a random
        //    number
    	Random ran = new Random();
    	for (int i = 0; i < ranNums.length; i++) {
    		ranNums[i] = ran.nextInt(0, 51);
    	}

        // 9. without printing the entire array, print only the smallest number
        //    on the array
    	int small = 50;
    	for (int i = 0; i < ranNums.length; i++) {
    		if (ranNums[i] < small) {
    			small = ranNums[i];
    		}
    	}
    	System.out.println("Small = " + small);

        // 10 print the entire array to see if step 8 was correct
    	System.out.println(Arrays.toString(ranNums));
        // 11. print the largest number in the array.
    	int large = 0;
    	for (int i = 0; i < ranNums.length; i++) {
    		if (ranNums[i] > large) {
    			large = ranNums[i];
    		}
    	}
    	System.out.println("Large = " + large);
        // 12. print only the last element in the array
    	System.out.println(ranNums[ranNums.length-1]);

    }
}
