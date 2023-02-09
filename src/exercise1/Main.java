// Exercise 1 : Print All Elements
/*
* @author: N'goran Kouadio Jean Cyrille
* @description: You have an integer and a string array.
* Write a single method printArray that can print all the elements of both arrays.
* date: 08/02/2023
*/
package exercise1;

public class Main {

	public static void main(String[] args) {
		//declaration part
		Integer[] tabNumber = { 71, 42, 35, 94, 54 };
		String[] tabName = { "Koffi", "Kouadio", "Zokou" };
		
		Print.printArray(tabNumber);
		System.out.println("\n");
		Print.printArray(tabName);

	}

}
