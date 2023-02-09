// Exercise 3 : “HIPPOPOTAMUS”
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:Write a Java program to write the word “HIPPOPOTAMUS” backward.
* date: 08/02/2023
*/
package exercise3;

public class Backward {
	public static void reverse(String word) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(word);
		System.out.println(stringBuilder.reverse());
	}

}
