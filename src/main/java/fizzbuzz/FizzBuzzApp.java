package fizzbuzz;

import java.util.Scanner;

public class FizzBuzzApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		
		FizzBuzz myFizzBuzzGame = new FizzBuzz();
		
		System.out.println("Welcome to FizzBuzz!");
		System.out.println("Enter a non-zero number + get a response.");
		int number = input.nextInt();
		
		System.out.println(myFizzBuzzGame.response(number));
		input.close();
				
		
		

	}

}
