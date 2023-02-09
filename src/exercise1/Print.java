// Exercise 1 : Print All Elements
/*
* @author: N'goran Kouadio Jean Cyrille
* @description: You have an integer and a string array.
* Write a single method printArray that can print all the elements of both arrays.
* date: 08/02/2023
*/

package exercise1;

public class Print {

	// We create a generic method to print any type of data
	public static <E> void printArray(E[] array) {
		for (E element : array) {
			System.out.println(element);
		}
	}
}
