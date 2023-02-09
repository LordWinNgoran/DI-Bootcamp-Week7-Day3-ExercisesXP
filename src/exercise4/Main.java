// Exercise 4 : Value Of PI
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:Write a Java program to find the value of PI using the lambda expression.
* date: 08/02/2023
*/
package exercise4;

public class Main {

	public static void main(String[] args) {
		Pi pi = () -> Math.PI;
		System.out.println("Value of PI : " + pi.findPi());

	}

}
