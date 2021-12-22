package fr.manulep.entrainement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Series2 {
	
	private Series2() {
		 throw new IllegalStateException("Test class");
	}

	public static List<String> selectElementsFromListStartingWithA(List<String> elements) {
    List<String> list = new ArrayList<String>();
    for (String element : elements) {
        if (element.startsWith("a")) {
            list.add(element);
        }
    }
    return list;
	}

	public static List<String> sortByLastLetter(List<String> names) {
    // reverse each name in the list
    List<String> list = new ArrayList<String>();
    for (String name : names) {
        String reverse = new StringBuilder(name).reverse().toString();
        list.add(reverse);
    }
    // sort the list
    list.sort(null);
    // reverse the list again
    for (int i = 0; i < list.size(); i++) {
        String name = list.get(i);
        String reverse = new StringBuilder(name).reverse().toString();
        list.set(i, reverse);
    }
    return list;
	}
	
	public static String exportWordsWithoutALetter(List<String> names, char letter) {
    // Remove null from list
    // Exclude the names containing the letter from the list case insensitive
    // Then sysout the list
    List<String> list = new ArrayList<String>();
    for (String name : names) {
        if (name != null && !name.toLowerCase(Locale.ENGLISH).contains(String.valueOf(letter).toLowerCase(Locale.ENGLISH))) {
            list.add(name);
        }
    }
    // transform the list into a string where each word is separated by a comma and a space
    // Remove the last comma and space
    // Return it
    String result = String.join(", ", list);
    return result;
  }
	
	public static String getAllLetters(List<String> words) {
    // Create a string containing all the letters of the words
    // Remove duplicate letters
    StringBuilder sb = new StringBuilder();
    for (String word : words) {
        for (char c : word.toCharArray()) {
            if (!sb.toString().contains(String.valueOf(c))) {
                sb.append(c);
            }
        }
    }
    // transform sb to a List
    List<String> list = new ArrayList<String>();
    for (char c : sb.toString().toCharArray()) {
        list.add(String.valueOf(c));
    }
    // sort the list
    list.sort(null);
    // transform the list to a string
    String result = String.join("", list);
    return result;
  }

	public static List<String> getElementsLowerThanNumber(List<String> elements, int maxi) {
    // remove duplicate from elements
    // order the list in numerical order
    // remove the elements equal or superior to maxi
    // return the list
    List<String> list = new ArrayList<String>();
    for (String element : elements) {
        if (element != null && !list.contains(element)) {
            list.add(element);
        }
    }
    list.sort(null);
    for (int i = list.size() - 1; i >= 0; i--) {
        if (Integer.parseInt(list.get(i)) >= maxi) {
            list.remove(i);
        }
    }
    return list;
  }

	public static List<Integer> exportPeerElements(List<Integer> elements) {
    // Remove the odd elements from the list and return it
    List<Integer> list = new ArrayList<Integer>();
    for (Integer element : elements) {
        if (element % 2 == 0) {
            list.add(element);
        }
    }
    return list;
	}

	public static List<Integer> exportSortPeerElements(List<Integer> elements) {
    // remove duplicate from elements and sort the list. Remove odd elements. Return it
    List<Integer> list = new ArrayList<Integer>();
    for (Integer element : elements) {
        if (element % 2 == 0 && !list.contains(element)) {
            list.add(element);
        }
    }
    list.sort(null);
    return list;
	}

	public static List<Integer> allElementsExceptFirstAndLast(List<Integer> elements) {
    // remove the first and last element from the list and return it
    List<Integer> list = new ArrayList<Integer>();
    for (int i = 1; i < elements.size() - 1; i++) {
        list.add(elements.get(i));
    }
    return list;
	}
	
	public static List<Integer> reverseOrder(List<Integer> elements) {
    // reverse the list and return it
    List<Integer> list = new ArrayList<Integer>();
    for (int i = elements.size() - 1; i >= 0; i--) {
        list.add(elements.get(i));
    }
    return list;
	}

	public static List<Integer> swapFirstandLastElement(List<Integer> elements) {
    // swap first and last element from the list. Return it
    // if the list only consist in one entry, return list
    if (elements.size() == 1) {
        return elements;
    }
    int first = elements.get(0);
    int last = elements.get(elements.size() - 1);
    elements.set(0, last);
    elements.set(elements.size() - 1, first);
    return elements;

	}

	public static int numberOfPalindromeWord(String text) {
    // remove special characters from text
    // split the text into words
    // remove duplicate from the list
    // count the number of palindrome words
    // return it
    String textWithoutSpecialChar = text.replaceAll("[^a-zA-Z0-9 ]", "");
    List<String> words = new ArrayList<String>();
    for (String word : textWithoutSpecialChar.split(" ")) {
        if (!words.contains(word.toLowerCase())) {
            words.add(word.toLowerCase());
        }
    }
    int count = 0;
    for (String word : words) {
        if (word.equals(new StringBuilder(word).reverse().toString()) && !word.equals("")) {
            count++;
        }
    }
    return count;
	}

	public static String longestWord(String text) {
		return null;
	}

	public static String getAllLetters(String[] array) {
		return null;
	}

	public static String titleize(String title) {
		return null;
	}

	public static List<String> findAnagrams(String name) {
		return null;
	}

	public static int roundUp(float number) {
		return 0;
	}

	public static int findLastDayOfMonth(int month, int year) {
		return 0;
	}

	public static int factorial(int number) {
		return 0;
	}

	public static int convertToCelsius(int temperature) {
		return 0;
	}

	public static boolean isPeerSum(final int... numbers) {
		return false;
	}

	public static boolean isRightTriangle(int side1, int side2, int side3) {
		return false;
	}

	public static boolean isOrder(int... number) {
		return false;
	}

	public static Float intToFloat(int number) {
		return null;
	}

	public static Integer floatToInt(float number) {
		return null;
	}

	public static String dateToString(LocalDate date, String format) {
		return null;
	}

}
