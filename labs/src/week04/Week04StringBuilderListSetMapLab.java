//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  StringBuilders, Lists, Sets, & Maps
// Java Week 04 Lab  
//
package week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {

		// 1. Why would we use a StringBuilder instead of a String?
		// 		a. Instantiate a new StringBuilder
		//		b. Append the characters 0 through 9 to it separated by dashes
		// 				Note:  make sure no dash appears at the end of the StringBuilder
		System.out.println("1. This is a StringBuilder that makes a String from the characters 0 to 9 separated by dashes:\n");
		
		StringBuilder builder = new StringBuilder();
			
			for( int i = 0; i < 10; i++) {
				if( i != 9) {
					builder.append(i +"-");					
				} else{
					builder.append(i);
				}
			}

			System.out.println("builder= " + builder.toString() +"\n");
		// 2. List of String:
		//		a. Create a list of Strings 
		//		b. Add 5 Strings to it, each with a different length
			System.out.println("2. Create a list of 5 Strings with different length:\n");
			
			List<String> mtg = new ArrayList<String>();
			mtg.add("Black Lotus");
			mtg.add("Yawgmoth's Will");
			mtg.add("Force of Will");
			mtg.add("Doomsday");
			mtg.add("Daze");
			
			for(String card : mtg) {
				System.out.println(card);
			}
			System.out.println();
			
		// 3. Write and test a method that takes a list of strings 
		//			and returns the shortest string
			System.out.println("3. Testing a method that returns the shortest String in the List mtg:\n");
			
			System.out.println(shortestString(mtg) + "\n");
		
		// 4. Write and test a method that takes a list of strings 
		//			and returns the list with the first and last element switched
			System.out.println("4. Testing a method that returns the list of strings with the first and last elements switched:\n");
			
			List<String> swappy = switchElements(mtg);
			for(String card : swappy) {
				System.out.println(card);
			} System.out.println();
		
		// 5. Write and test a method that takes a list of strings 
		//			and returns a string with all the list elements concatenated to each other,
		// 			separated by a comma
			System.out.println("5. Testing a method that takes a list of strings and returns a string with all the list elements concatenated \nto one another.\n");
			System.out.println("The concatenated string is: " + concatList(mtg) + "\n");
		
		// 6. Write and test a method that takes a list of strings and a string 
		//			and returns a new list with all strings from the original list
		// 			containing the second string parameter (i.e. like a search method)
		
			System.out.println("6. Testing a method that effectively searches a list of Strings for values that contain a certain String: \n");
			
			List<String> mtgsearch= stringSearch(mtg, "Will");
			for(String result : mtgsearch) {
				System.out.println(result);
			} System.out.println();
		
		// 7. Write and test a method that takes a list of integers 
		//			and returns a List<List<Integer>> with the following conditions specified
		//			for the return value:
		//		a. The first List in the returned value contains any number from the input list 
		//			that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5

			System.out.println("7. Testing a method that takes a list of integers and sorts them to see if they are divsible by certain numbers:\n");
			
			List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15, 16, 20, 25, 30);
			
			List<List<Integer>> sortedNumbers = sortDivisibleNumbers(numbers);
			
			for (List<Integer> list : sortedNumbers) {
				for (Integer number : list) {
					System.out.println(number);
				}
				System.out.println("Next list------------");
			}
		
		// 8. Write and test a method that takes a list of strings 
		//			and returns a list of integers that contains the length of each string

			System.out.println("\nTesting a method that takes a list of strings and returns a list of integers that contains the length \nof each string:\n");
			
			List<Integer> outputList = stringLength(mtg);
			
			for (Integer i : outputList) {
				System.out.println(i);
			}
		
		// 9. Create a set of strings and add 5 values

			System.out.println();
			
			Set<String> set = new HashSet<String>();
			set.add("Butt");
			set.add("Farding");
			set.add("Shidding");
			set.add("NOT THE CLIBBINS!");
			set.add("HELL YEAH HOSS!");
		
		// 10. Write and test a method that takes a set of strings and a character 
		//			and returns a set of strings consisting of all the strings in the
		// 			input set that start with the character parameter.

			System.out.println("10. Testing a method that takes a set of strings and a character and returns a set of strings consisting of all the strings\nin the input set that start with that character:\n");
			
			Set<String> setty = letterCheck(set, 'N');
			
			for (String s : setty) {
				System.out.println(s);
			}
			System.out.println();
		// 11. Write and test a method that takes a set of strings 
		//			and returns a list of the same strings
	
			System.out.println("11. Testing a method that takes a set of strings and returns a list of the same strings:\n");
			
			List<String> out = setToList(set);
			for(String s : out) {
				System.out.println(s);
			}
			System.out.println();

		// 12. Write and test a method that takes a set of integers 
		//			and returns a new set of integers containing only even numbers 
		//			from the original set

			System.out.println("12. Testing a method that takes a set of integers and returns a new set of integers containing only\neven numbers from the original set:\n");
		
			Set<Integer> inputSet = new HashSet<Integer>();
			inputSet.add(2);
			inputSet.add(7);
			inputSet.add(15);
			inputSet.add(22);
			inputSet.add(1);
			inputSet.add(69);
			
			Set<Integer> resultSet= evenInts(inputSet);
			for(Integer i : resultSet) {
				System.out.println(i);
			}
			System.out.println();
		// 13. Create a map of string and string and add 3 items to it where the key of each
		// 			is a word and the value is the definition of the word

			Map<String, String> dict = new HashMap<String, String>();
			dict.put("Morophon the Boundless", "Colorless Eldrazi Commander");
			dict.put("Colossal Dreadmaw", "The best creature in Magic!");
			dict.put("Ragavan, Nimble Pilferer", "Stupid Monke");	
		
		// 14. Write and test a method that takes a Map<String, String> and a string 
		// 			and returns the value for a key in the map that matches the
		// 			string parameter (i.e. like a language dictionary lookup)

			System.out.println("14. Testing a method that takes a Map<String, String> and a string then returns the value for the key in the map\nthatmatches the string parameter:\n");
			
			String output = lookupValue(dict, "Ragavan, Nimble Pilferer");
			System.out.println(output + "\n");
		
		// 15. Write and test a method that takes a List<String> 
		//			and returns a Map<Character, Integer> containing a count of 
		//			all the strings that start with a given character
		
			System.out.println("Testing a method that takes a List<String> and returns a Map<Character, Integer> counting all the strings that\nstart with the given character");
			
			Map<Character, Integer> counts = countStartingLetters(mtg);
			for(Character character : counts.keySet()) {
				System.out.println(character + " - " + counts.get(character));
			}

	}
	
	
	// Method 15:
	public static Map<Character, Integer> countStartingLetters(List<String> input) {
		Map<Character, Integer> results = new HashMap<Character, Integer>();
		
		for(String string : input) {
			char c = string.charAt(0);
			if (results.get(c) == null) {
				results.put(c,  1);
			} else {
				results.put(c,  results.get(c) + 1);
			}
		}return results;
	}
	
	
	// Method 14:
	public static String lookupValue(Map<String, String> map, String string) {
		for (String key : map.keySet()) {
			if (key.equals(string)) {
				return map.get(key);
			}
		}return "";
	}

	
	// Method 12:
	public static Set<Integer> evenInts(Set<Integer> ints) {
		Set<Integer> results = new HashSet<Integer>();
		for(Integer i : ints) {
			if (i % 2 == 0) {
				results.add(i);
			}
		}
		return results;
	}

	
	// Method 11:
	public static List<String> setToList(Set<String> set){
		List<String> results = new ArrayList<String>();
		
		for (String s : set) {
			results.add(s);
		}
		return results;
	}


	// Method 10:
	public static Set<String> letterCheck(Set<String> set, char c){
		Set<String> buttString = new HashSet<String>();
		for(String stringy : set) {
			if (stringy.charAt(0) == c) {
				buttString.add(stringy);			}
		}
		return buttString;
	}

	
	// Method 8:
	public static List<Integer> stringLength(List<String> strings) {
		List<Integer> intList = new ArrayList<Integer>();
		
		for (String string : strings) {
			intList.add(string.length());
		}
		return intList;
	}

	
	// Method 7:
	public static List<List<Integer>> sortDivisibleNumbers(List<Integer> intList){
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		
		for (Integer number : intList) {
			if (number % 2 == 0) {
				results.get(0).add(number);
			}
			
			if (number % 3 == 0) {
				results.get(1).add(number);
			}
			
			if (number % 5 == 0) {
				results.get(2).add(number);
			}
			
			if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
				results.get(3).add(number);
			}
		} return results;
	}

	
	// Method 6:
	public static List<String> stringSearch(List<String> list, String string) {
		List<String> results = new ArrayList<String>();
		for(String s : list) {
			if(s.contains(string)) {
				results.add(s);
			}
		} return results;
	}

	
	// Method 5:
	public static String concatList(List<String> list) {
		StringBuilder result = new StringBuilder();
		for( String string : list ) {
			result.append(string + ", ");
		} return result.toString();
	}
	
	
	// Method 4:
	public static List<String> switchElements(List<String> list) {
		String s = list.get(0);
		list.set(0, list.get(list.size()-1));
		list.set(list.size()-1, s);
		return list;
	}
	
	
	// Method 3:
	
	public static String shortestString(List<String> list) {
		String shortest = list.get(0);
		for(String string : list) {
			if(string.length() < shortest.length()) {
				shortest = string;
			}
		} return shortest;
	}

}