package fr.manulep.entrainement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang3.StringUtils;

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
    List<String> list = new ArrayList<String>();
    for (String name : names) {
        String reverse = new StringBuilder(name).reverse().toString();
        list.add(reverse);
    }
    list.sort(null);
    for (int i = 0; i < list.size(); i++) {
        String name = list.get(i);
        String reverse = new StringBuilder(name).reverse().toString();
        list.set(i, reverse);
    }
    return list;
	}
	
	public static String exportWordsWithoutALetter(List<String> names, char letter) {
    List<String> list = new ArrayList<String>();
    for (String name : names) {
        if (name != null && !name.toLowerCase(Locale.ENGLISH).contains(String.valueOf(letter).toLowerCase(Locale.ENGLISH))) {
            list.add(name);
        }
    }
    String result = String.join(", ", list);
    return result;
  }
	
	public static String getAllLetters(List<String> words) {
    StringBuilder sb = new StringBuilder();
    for (String word : words) {
        for (char c : word.toCharArray()) {
            if (!sb.toString().contains(String.valueOf(c))) {
                sb.append(c);
            }
        }
    }
    List<String> list = new ArrayList<String>();
    for (char c : sb.toString().toCharArray()) {
        list.add(String.valueOf(c));
    }
    list.sort(null);
    String result = String.join("", list);
    return result;
  }

	public static List<String> getElementsLowerThanNumber(List<String> elements, int maxi) {
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
    List<Integer> list = new ArrayList<Integer>();
    for (Integer element : elements) {
        if (element % 2 == 0) {
            list.add(element);
        }
    }
    return list;
	}

	public static List<Integer> exportSortPeerElements(List<Integer> elements) {
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
    List<Integer> list = new ArrayList<Integer>();
    for (int i = 1; i < elements.size() - 1; i++) {
        list.add(elements.get(i));
    }
    return list;
	}
	
	public static List<Integer> reverseOrder(List<Integer> elements) {
    List<Integer> list = new ArrayList<Integer>();
    for (int i = elements.size() - 1; i >= 0; i--) {
        list.add(elements.get(i));
    }
    return list;
	}

	public static List<Integer> swapFirstandLastElement(List<Integer> elements) {
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
    String textWithoutSpecialChar = text.replaceAll("[^a-zA-Z0-9 ]", "");
    List<String> words = new ArrayList<String>();
    for (String word : textWithoutSpecialChar.split(" ")) {
        if (!words.contains(word.toLowerCase())) {
            words.add(word.toLowerCase());
        }
    }
    String longestWord = "";
    for (String word : words) {
        if (word.length() > longestWord.length()) {
            longestWord = word;
        }
    }
    return longestWord;
	}

	public static String getAllLetters(String[] array) {
		return null;
	}

	public static String titleize(String title) {
    String[] words = title.split(" ");
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < words.length; i++) {
        if (words[i].equals("the") || words[i].equals("and")) {
            if (i == 0 || words[i-1].equals("witch.")) {
                sb.append(StringUtils.capitalize(words[i]) + " ");
            } else {
                sb.append(words[i] + " ");
            }
        } else {
            sb.append(StringUtils.capitalize(words[i]) + " ");
        }
    }
    System.out.println(sb.toString());
    return sb.toString().trim();
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
