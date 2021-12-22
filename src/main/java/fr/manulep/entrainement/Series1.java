package fr.manulep.entrainement;

import org.apache.commons.lang3.ArrayUtils;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Series1 {
	
	private Series1() {
		 throw new IllegalStateException("Test class");
	}


	public static String helloWorld(String name) {
		//1
		if (name == null) {
			return "Hello World";
		} else if (name == "") {
			return "Hello World";
		} else {
			return "Hello " + name;
		}
	}
	

	public static String[] removeNullElements(String[] array) {
		//2
		String[] arrayExpected = ArrayUtils.removeAllOccurences(array, null);
		return arrayExpected;
	}

	public static int[] addElementToBeginning(int[] array, int element) {
		//3

		int[] arrayExpected = ArrayUtils.insert(0, array, element);
		return arrayExpected;
	}
	
	public static int[] allElementsExceptFirstThree(int[] array) {
		//4
		int[] arrayExpected = array;
		int al = array.length;
		switch(al){
			case 0:
				return arrayExpected;

			case 1:
				arrayExpected = ArrayUtils.remove(arrayExpected, 0);
				break;

			case 2:
				for(int i = 0; i < 2; i++){
					arrayExpected = ArrayUtils.remove(arrayExpected, 0);
				}
				break;

			default:
				for(int i = 0; i < 3; i++){
					arrayExpected = ArrayUtils.remove(arrayExpected, 0);
				}
				break;
		}

		return arrayExpected;
	}
	
	public static String getFirstHalf(String word) {
		//5
		int al = word.length();

		if(al % 2 == 0){
			word = word.substring(0, word.length() / 2);
		} else {
			word = word.substring(0, (word.length() / 2)+1);
		}
		return word;
	}
	
	public static String[] selectElementsStartingWithA(String[] array) {
		//6
		int al = array.length;
		String aString = "a";
		char aChar = aString.charAt(0);
		ArrayList<String> strList = new ArrayList<>();
		for(int i = 0; i < al; i++){
			if(array[i].charAt(0) == aChar){
				strList.add(array[i]);
			}
		}
		return strList.toArray(new String[0]);
	}


	public static String[] selectElementsStartingWithVowel(String[]array) {
		//7
		int al = array.length;
		ArrayList<String> strList = new ArrayList<>();

		for(int i = 0; i < al; i++){
			System.out.println(i);
			if(array[i] == null){
				continue;
			}
			switch(array[i].charAt(0)){
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'y':
					strList.add(array[i]);
					break;
				default :
					break;
			}
		}

		return strList.toArray(new String[0]);
	}
	
	public static String[] reverseOrderInArray(String[]array) {
		//8
		int al = array.length;
		String[] reversedArray = new String[al];
		int reversedIndex = 0;

		for(int i = al; i > 0; i--){
			reversedArray[reversedIndex] = array[i-1];
			reversedIndex++;
		}

		return reversedArray;
	}

	public static int[] insertElementInTheMiddleOfAnArray(int[] array, int element) {
		//9
		int al = array.length;
		array = ArrayUtils.insert((al / 2), array, element);
		return array;
	}

	public static String shortestWord(String text) {
		//10
		String[] words = text.split(" ");
		String shortestWord = words[0];
		for(int i = 0; i < words.length; i++){
			if(words[i].length() < shortestWord.length()){
				shortestWord = words[i];
			}
		}
		return shortestWord;
	}

	public static String removeCapitals(String text) {
		//11
		text = text.replaceAll("[A-Z]", "");
		return text;
	}
	
	public static long addingTwoNumbers(long number1, long number2) {
		//12
		long sum = number1 + number2;
		return sum;
	}

	public static long addingThreeNumbers(long number1, long number2, long number3) {
		//13
		long sum = number1 + number2 + number3;
		return sum;
	}

	public static long addingSeveralNumbers(final Integer... numbers) {
		//14
		long sum = 0;
		for (long number:
			 numbers) {
			sum = sum + number;
		}
		return sum;
	}

	public static float makeNegative(float number) {
		//15
		if(number > 0){
			return number * (-1);
		}

		return number;
	}

	public static boolean checkForSpecialCharacters(String string) {
		//16
		Pattern pattern = Pattern.compile("[^a-zA-Z0-9!]");
		Matcher matcher = pattern.matcher(string);
		return matcher.find();
	}

	public static boolean checkIfStringStartsWithConsonant( String word ) {
		//17
		char firstChar = word.toLowerCase(Locale.ROOT).charAt(0);
		String firstLetter = String.valueOf(firstChar);
		Pattern pattern = Pattern.compile("[b-df-hj-np-tv-z]");
		Matcher matcher = pattern.matcher(firstLetter);
		return matcher.find();
	}

	public static String getDomainName(String email) {
		//18
		String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
		return domain;
	}

	public static int[] letterPosition(String name) {
		//19
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int position;
		int[] expectedArray = new int[0];
		String[] nameArray = name.toUpperCase(Locale.ROOT).split("");
		int nameArrayL = nameArray.length;
		for(int i=0; i<nameArrayL; i++){
			position = (alphabet.indexOf(nameArray[i])) + 1;
			expectedArray = ArrayUtils.add(expectedArray, position);
		}

		return expectedArray;
	}

	public static boolean isPeer(int number) {
		//20
		if(number%2 == 0){
			return true;
		}
		return false;
	}


}
