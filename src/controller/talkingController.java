package controller;

import java.util.Scanner;

public class talkingController
{
	
	public void start()
	{
		moreInput();
		lastInput();
		
		// System.out.println("Standard output for java");
		// System.out.println("more words");
		// System.out.print("same line");
		// System.out.print(" as this");
		
		questions();
	}
	
	private void questions()
	{
		System.out.print("Q: What is your favorite color?");
		Scanner inputScanner = new Scanner(System.in);
		
		String answer = inputScanner.next();
		System.out.println(answer);
		
		System.out.println("Q: What's the deal with airline food?");
		answer = inputScanner.nextLine();
		System.out.println(answer);
		
		System.out.print("Q: What is love?");
		answer = inputScanner.nextLine();
		System.out.println(answer);
		
		inputScanner.close();
	}
	
	private void moreInput()
	{
		Scanner anotherInputScanner;
		
		anotherInputScanner = new Scanner(System.in);
		
		System.out.println("What is the meaning of Life, the Universe, and Everything?");
		Double answer = anotherInputScanner.nextDouble();
		
		System.out.println("You typed: " + answer);
		anotherInputScanner.nextLine(); //Used to consume the enter key press, ignoring the returned String value.
		System.out.println("Words - why the error? Type in a guess");
		String secondResponse = anotherInputScanner.nextLine();
		System.out.println(secondResponse);
		
		//double holds real numbers AKA numbers with a decimal point !
		double magicNumber;
		
		System.out.println("Type in your fractional number AKA use a decimal");
		magicNumber = anotherInputScanner.nextDouble();
		
		System.out.println(magicNumber);
		
//		anotherInputScanner.close();
	}

	private void lastInput()
	{
		Scanner lastInputScanner;
		
		lastInputScanner = new Scanner(System.in);
		
		System.out.println("Q: What's the deal with airline food?");
		String firstAnswer = lastInputScanner.next();
		
		System.out.println("A: " + firstAnswer);
		
		System.out.println();
		
		lastInputScanner.close();
		
	}

	public boolean validInt(String example)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(example);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			System.out.println("An error has occurred.");
			System.out.println("Int value required.");
		}
		
		return isValid;
	}
	
	public boolean validDouble(String example)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(example);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			System.out.println("Only floating point values are allowed for input.");
		}
		
		return isValid;
	}
}