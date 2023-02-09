package exercise2;

import java.util.Arrays;

public class Sort {

	// we create a generic method to sort any array of object
	public static <E> void selectionSort(E[] array) {
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	}
}
