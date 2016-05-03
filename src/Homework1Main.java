import java.util.Scanner;

public class Homework1Main {

	public static void main(String[] args) {
	//write a program that takes in a value in euros and convert the equivalent in pounds, dollars and yen.
		//declare a Scanner Object
		Scanner input = new Scanner(System.in);
		
		//declaring variables
		double euros, dollars, pounds, yen;
	
		
		
		//ask the user to put the value in euro
		System.out.println("Please enter the value you wish to convert in euros");
		//read the value into the variable euro
		euros = input.nextDouble();
		
	
	
	
		pounds = (euros * 0.71);
		dollars = (euros * 1.07);
		yen = (euros * 132.3);
		
		
		
		//output the result 
		System.out.println(euros + "euros = " + pounds + "pounds");
		System.out.println(euros + "euros = " + dollars + "dollars");
		System.out.println(euros + "euros = " + yen + "yens");
		
		
		 
		 

	}

}
