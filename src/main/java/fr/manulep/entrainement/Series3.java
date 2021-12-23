package fr.manulep.entrainement;

import com.google.common.annotations.VisibleForTesting;

public class Series3 {
	
	private Series3() {
	    throw new IllegalStateException("Training class");
	  }


	@VisibleForTesting
	protected static int[] sortTabBySelection(int[] array) {
		int[] arrayOut = array.clone();
    for (int i = 0; i < arrayOut.length; i++) {
      int min = i;
      for (int j = i + 1; j < arrayOut.length; j++) {
        if (arrayOut[j] < arrayOut[min]) {
          min = j;
        }
      }
      if (min != i) {
        int tmp = arrayOut[i];
        arrayOut[i] = arrayOut[min];
        arrayOut[min] = tmp;
      }
    }
    return arrayOut;
	}

	public static int[] sortTabByInsertion(int[] array) {
		int[] arrayOut = array.clone();
    for (int i = 1; i < arrayOut.length; i++) {
      int j = i;
      while (j > 0 && arrayOut[j - 1] > arrayOut[j]) {
        int tmp = arrayOut[j];
        arrayOut[j] = arrayOut[j - 1];
        arrayOut[j - 1] = tmp;
        j--;
      }
    }
    return arrayOut;
	}

	public static int[] sortTabByBubble(int[] array) {
		int[] arrayOut = array.clone();
    for (int i = 0; i < arrayOut.length; i++) {
      for (int j = 0; j < arrayOut.length - 1; j++) {
        if (arrayOut[j] > arrayOut[j + 1]) {
          int tmp = arrayOut[j];
          arrayOut[j] = arrayOut[j + 1];
          arrayOut[j + 1] = tmp;
        }
      }
    }
    return arrayOut;
	}
	
	public static int findIndexByDichotomy(int element, int[] array) {
    int min = 0;
    int max = array.length - 1;
    while (min <= max) {
      int mid = (min + max) / 2;
      if (array[mid] == element) {
        return mid;
      } else if (array[mid] < element) {
        min = mid + 1;
      } else {
        max = mid - 1;
      }
    }
    return -1;
	}

}
