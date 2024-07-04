//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//
package week03;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		String part1 = "ARRAYS";
		String part2 = "METHODS";
		String divider = "╔══════════════════════════════╗";
		String dividerBottom = "╚══════════════════════════════╝";
		
		System.out.println(part1 + "\n" + divider);

		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
			int[] numArray = {1, 5, 2, -33,  8, 13, 6};
		// 2. Print out the first element in the array
			System.out.println("The first element in numArray is: " + numArray[0] + "\n");
		
		// 3. Print out the last element in the array without using the number 5
			System.out.println("The final element in numArray is: " + numArray[numArray.length - 1] + "\n");
		
		// 4. Print out the element in the array at position 6, what happens?
			// System.out.println(numArray[6]);
			// Throws and out of bounds exception since the element does not exist in the array
			
		// 5. Print out the element in the array at position -1, what happens?
			// System.out.println(numArray[-1]);
			// Throws the same exception since that index also doesn't exist in the array
			
		// 6. Write a traditional for loop that prints out each element in the array
			System.out.println("This is a for loop to print the values in numArray:");
			
			for (int i = 0; i < numArray.length; i++) {
				System.out.println(numArray[i]);
			}
			System.out.println();
			
		// 7. Write an enhanced for loop that prints out each element in the array
			System.out.println("This is an enhanced for loop to print the values in numArray:");
			
			for (int num : numArray) {
				System.out.println(num);
			}
			System.out.println();
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
			double sum = 0;
			for (int num : numArray) {
				sum += num;
			}
			
			System.out.println("The sum of the ints in the array is: " + sum + "\n");
			
		// 9. Create a new variable called average and assign the average value of the array to it
			double avg = sum / numArray.length;
			
			System.out.println("The average of the values in numArray is: " + avg + "\n");
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
			System.out.println("Printing out only the odd values in numArray:");
			
			for (int num : numArray) {
				if (num % 2 != 0) {
					System.out.println(num);
				}
			}
			
			System.out.println();
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
			String[] nameArray = {"Sam", "Sally", "Thomas", "Robert"};
		
		// 12. Calculate the sum of all the letters in the new array
			System.out.println("Calculating the sum of all the letters in the new array nameArray: \n");
			
			int length = 0;
			for (String name : nameArray) {
				length += name.length();
			}
			System.out.println("The sum of all the letters in the new array nameArray is: " + length);
			System.out.println(dividerBottom + "\n" + part2 + "\n" + divider);
;
		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
			System.out.println("Testing a method to greet people: \n");
			
			greeting("Billy");
			greeting("Lafawnduh");
		
			System.out.println();
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
			System.out.println("Testing another method that does the same thing but uses return: \n");
			
			String greeting1 = returnGreeting("Billy");
			String greeting2 = returnGreeting("Lafawnduh");
			
			System.out.println(greeting1 + "\n" + greeting2 + "\n");
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
			System.out.println("Now for a boolean method to see if a string's length is bigger than a number: \n");
			
			boolean isIt = compareStrInt("Buttmuch", 69);
			System.out.println(isIt + "\n");
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
			System.out.println("Now to see if a string is in an array: \n");
		
			boolean isIt2 = isItInThere(nameArray, "Sam");
			System.out.println(isIt2 + "\n");

		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
			System.out.println("This should find the smallest int in the numArray array: \n");
			
			int beItSmol = smallNumber(numArray);
			System.out.println(beItSmol + "\n");
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
			double[] pissArray = {1337, 69, 42, 0.01};
			System.out.println("This method should determine the average of the doubles in pissArray: \n");
			
			double theThing = avgPissArray(pissArray);
			System.out.println("The average of the doubles in pissArray is: \n" + theThing + "\n");

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
			System.out.println("This method tests taking a array of Strings and returning an int array where \neach element matches the length of the element in the string array: \n"); 
			int[] answer = stringLengthMeth(nameArray);
			for (int i : answer) {
				System.out.println(i);
			}	
			System.out.println();
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
			System.out.println("This is a method that checks if the number of even lettered strings in an array is greater than the sum \nof odd lettered strings: \n" + evenOddString(nameArray));
	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
			System.out.println("This tests a method to see if a string is a palindrome: \n" + isPalindrome("tacocat"));
		
	}
	
	// Method 13:
	public static void greeting(String name) {
		System.out.println("Whaddup, " + name + "! You're a bitch!");
	}
	
	// Method 14:
	public static String returnGreeting(String name) {
		return "Whaddup, " + name + "! You're a bitch!";
	}
	
	
	// Method 15:
	public static boolean compareStrInt(String string, int number) {
		return string.length() > number;
	}
	
	// Method 16:
	public static boolean isItInThere(String[] array, String isName) {
		for (String str : array) {
			if (str.equals(isName)) {
				return true;
			} 
		} return false;
	}
	
	// Method 17:
	public static int smallNumber(int[] numbz) {
		int smallInt = numbz[0];
		for (int j : numbz) {
			if (j < smallInt) {
				smallInt = j;
			}
		} return smallInt;
	}
	
	// Method 18:
	public static double avgPissArray(double[] pizz) {
		double sum = 0;
		for (double shid : pizz) {
			sum += shid;
		} return sum / pizz.length;
	}
	
	// Method 19:
	public static int[] stringLengthMeth(String[] inputString) {
		int[] stringInts = new int[inputString.length];
		for (int i = 0; i < inputString.length; i++) {
			stringInts[i] = inputString[i].length();
		}
		return stringInts;
	}
	
	// Method 20:
	public static boolean evenOddString(String[] j) {
		int sumEven = 0;
		int sumOdd = 0;
		for (String string : j) {
			if (string.length() % 2 == 0) {
			sumEven += string.length();
		} else {
			sumOdd += string.length();
		}
		} return sumEven > sumOdd;
	}
	
	// Method 21:
	public static boolean isPalindrome(String string) {
		for (int i = 0; i < string.length() / 2; i++) {
			if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
				return false;
			}
		} return true;
	}

}