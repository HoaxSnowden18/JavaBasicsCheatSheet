import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Main {
	//This is a method and gets automatically called when you run java because of its name "main"
	public static void main(String[] args) {
		//This is a single line comment

		//This is how you print a line
		//It must end with semi-colon
		System.out.println("Hello World");

		//Print new line
		System.out.println("\n");

		//Java executes code line by line
		//Draw a shape
		System.out.println("  /|");
		System.out.println(" / |");
		System.out.println("/__|");



		System.out.println();



		//Variables
		//Strings are immutable
		/*We define variable by:

			DataType varName = varData;

		Primitive Data Types:

		byte = -128 to 127 (inclusive) - 1 byte

		short = -32,768 to 32,767 (inclusive) - 2 bytes

		int = - 2,147,483,648 (-2^31) to 2,147,483,647 (2^31 -1) (inclusive) - 4 bytes

		long = -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 -1)(inclusive) - 8 bytes

		float = Its value range is unlimited - 4 bytes

		double = Its value range is unlimited - 8 bytes

		char = Its value-range lies between '\u0000' (or 0) to '\uffff' (or 65,535 inclusive) - 2 bytes

		boolean = true or false - 1 bit
		*/

		//We defined two variables here, a string and a integer
		String characterName = "Hoax";
		int characterAge = 16;

		//Then we print it out with a string
		System.out.println("My name is " + characterName);
		System.out.println("And I am " + characterAge + " years old");

		//We can call it again
		System.out.println("Again, my name is " + characterName);

		//Make variables from each data types
		String name = "Hoax";
		char grade = 'D';
		int age = 16;
		long views = 3_123_456_789L; //We need to put a L because it is considered as a integer by java, and the underscores separates it into three digits like 123,456
		float gpa = 3.6F; //We need to put a F because java sees it as a double
		double pi = 3.1415926535;
		boolean ismale = true;

		//We can print them by calling their variableName
		System.out.println(name);
		System.out.println("Pi = " + pi);

		System.out.println();

		//Working with strings
		System.out.println("Hoax Snowden");

		System.out.println();

		//Using newlines in a string
		System.out.println("Hoax \nSnowden");

		System.out.println();

		//Using backslash to escape character
		System.out.println("\"Hoax\" Snowden");
		System.out.println("Hoax \\ Snowden");

		System.out.println();

		//Concatenation
		System.out.println("Hoax "
						   + "Snowden" +
						   " is great");

		//Concatenation using method
		System.out.println("HoaxSnowden".concat(" is a boy"));

		System.out.println();



		//String methods//

		//Make a string variable
		String phrase = "Hoax Snowden";

		//Convert to Uppercase
		System.out.println(phrase.toUpperCase());

		//To lowercase
		System.out.println(phrase.toLowerCase());

		//Get string length
		System.out.println(phrase.length());

		//Check if contains the specified string
		System.out.println(phrase.contains("Hoax"));
		System.out.println(phrase.contains("Hello"));
		
		//Check if starts with
		System.out.println(phrase.startsWith("Hoax"));
		
		//Check if ends with
		System.out.println(phrase.endsWith("owden"));
		
		//Replace
		System.out.println(phrase.replace("o", "e"));

		//Get character from index specified
		//0 is the first index
		System.out.println(phrase.charAt(0));

		//Get the first index of specified character or string
		System.out.println(phrase.indexOf("o")); //returns the first index of the first letter that is in hOax
		System.out.println(phrase.indexOf("Se")); // -1 means not in string

		//Get the last index of specified char or string
		System.out.println(phrase.lastIndexOf('o')); //return the last occurence of the "o" that takes place at snOwden

		//Gets substring of the specified index
		System.out.println(phrase.substring(5)); //Gets the char at index 5 and all of its next char

		//Use substring to get only the specified range
		System.out.println(phrase.substring(5, 9)); //excluding 9

		//More complex string things
		System.out.println(phrase.substring(0, phrase.indexOf(" "))); //Prints index 0 upto the whitespace
		
		
		//Spliting phrase in java by whitespace and storing it in a array 
		String [] aStringPhraseArray = phrase.split(" ");
		System.out.println(Arrays.toString(aStringPhraseArray));
		
		
		//String to primitive data types
		//DataType.parseDataType(StringVar)
		
		//String to int
		String aInt = "200";
		int aInteger = Integer.parseInt(aInt);
		System.out.println(aInteger + 1);
		
		//String to float
		String aFloat = "2.5";
		float aFloatingPoint = Float.parseFloat(aFloat);
		System.out.println(aFloatingPoint*2);
		
		//String to boolean
		String aBool = "true";
		boolean aBoolean = Boolean.parseBoolean(aBool);
		if (aBoolean) {
			System.out.println("It is a boolean");	
		}
		
		//String to double
		String aDbl = "4.50";
		double aDouble = Double.parseDouble(aDbl);
		System.out.println(aDouble+1);
		
		//String to character
		String aChar = "a";
		char aCharac = aChar.charAt(0);
		System.out.println(aCharac);
		
		//Check if char is a number
		char strAndNums = '4';
		System.out.println(Character.isDigit(strAndNums));
		
		//Get numericvalue of a char
		System.out.println(Character.getNumericValue(strAndNums));
		
		
		//Get integer value of a char
		System.out.println((int)strAndNums);
		
		System.out.println("");
		
		
		//Math and Numbers//


		//Addition
		System.out.println(3 + 4);

		//Subtraction
		System.out.println(4 - 3);

		//Multiplication
		System.out.println(4 * 3);

		//Division
		System.out.println(16 / 4);
		System.out.println(10 / 3); //Gives you integer because you give a integer given
		System.out.println(10.0 / 3.0);

		//Modulo (Get remainder)
		System.out.println(10 % 3);

		System.out.println();

		//We can also use variables in math
		int myInt = 3;
		double myDouble = 5.5;

		System.out.println(5 + myInt);
		System.out.println(myInt + myDouble);

		//We can also do this
		myInt += 5; //This is just myInt = myInt+5
		System.out.println(myInt);

		//We can also do -=, *=, /=

		//Get absolute value
		System.out.println(Math.abs(-3));

		//Exponetation
		System.out.println(Math.pow(myInt, 3)); //3^3

		//Square Root
		System.out.println(Math.sqrt(25));

		//Tell minimum from 2 numbers
		System.out.println(Math.min(5, 2));

		//Tell maximum from 2 numbers
		System.out.println(Math.max(60, 2));

		//Round a number
		System.out.println(Math.round(myDouble));

		//Get ceiling of number
		System.out.println(Math.ceil(3.5));

		//Get floor of number
		System.out.println(Math.floor(3.5));

		//Get random number between 0 and 1
		System.out.println(Math.random());

		//Get random float between 0 and a number specified
		System.out.println(Math.random() * 100); //Random float between 0 and 100

		//Get random integer between 0 and number
		System.out.println(Math.round(Math.random() * 100));



		System.out.println();



		//Get input from a user(String)
//		//We need to import java.util.Scanner
//
//		//Create scanner called keyboardInput
//		Scanner keyboardInput = new Scanner(System.in);
//		//Then create the prompt
//		System.out.print("Enter your name: ");
//		//Then make the scanner waits for a line of text and store it in a variable
//		String userName = keyboardInput.nextLine();
//		//Then print it
//		System.out.println("Your name is: " + userName);
//
//		System.out.println();
//
//		//Get integer input from user
//		System.out.print("Enter your age: ");
//		int userAge = keyboardInput.nextInt();
//		System.out.println("and you are " + age + " years old");
//
//		System.out.println();
//
//		//Get float from user
//		System.out.print("Enter a float: ");
//		float userFloat = keyboardInput.nextFloat();
//		System.out.println(userFloat);
//
//		System.out.println();
//
//		//Just do this nextDataTypeHere()
//		/*
//		nextLine() - for text
//		nextByte() - for byte
//		nextShort() - for short
//		nextInt() - for int
//		nextLong() - for long
//		nextFloat() - for float
//		nextDouble() - for double
//		nextBoolean() - for boolean
//		*/
//
//		//Make a simple addition calculator
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter first num: ");
//		double num1 = input.nextDouble();
//		System.out.print("Enter second num: ");
//		double num2 = input.nextDouble();
//		System.out.println(num1 + num2);
//
//		System.out.println();

		//Arrays
		//Make an array of string with specific element
		String [] friends = {"John", "John2", "Altis"};

		//Print a specific element
		System.out.println(friends[0]);

		//Get array length
		System.out.println(friends.length);

		//Change a specific element
		friends[0] = "Allen";
		System.out.println(friends[0]);

		//Make array without specific elements but specific length
		String [] someArray = new String[3];
		int [] someIntArray = new int[3];

		//Print a array of string
		//Need to import java.util.Arrays first
		System.out.println(Arrays.toString(someArray));

		//Print a array of int
		System.out.println(Arrays.toString(someIntArray));

		//Add data to the arrays
		someArray[0] = "Hello";
		someArray[2] = "Hi";

		someIntArray[0] = 5;
		someIntArray[1] = 1;
		someIntArray[2] = 3;

		System.out.println(Arrays.toString(someArray));
		System.out.println(Arrays.toString(someIntArray));

		
		//Convert a string to an array of char
		String someChars = "Hello";
		char [] someCharsArray = someChars.toCharArray();
		System.out.println(Arrays.toString(someCharsArray));
		
		
		System.out.println();


		//ArrayList
		//You can't add new elements in an Array
		//ArrayList lets you do that
		//import java.util.ArrayList

		//Make a ArrayList of string
		ArrayList<String> cars = new ArrayList<String>();

		//Add elements to the arraylist
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars);

		//Get elements by its index
		System.out.println(cars.get(0));

		//Change or update an element
		cars.set(0, "Lambo");
		System.out.println(cars);

		//Remove an item with specified index
		cars.remove(0);

		//Remove all elements in arraylist
		//cars.clear();

		//Get length of an arraylist
		System.out.println(cars.size());

		//We can loop them using for-each and for loops too

		//Making arraylist of int and other datatypes
		/*
		"Integer" for int, "Boolean" for boolean, "Character" for char, "Double" for double, "Float" for float
		*/
		ArrayList<Integer> ints = new ArrayList<Integer>();
		ArrayList<Float> floats = new ArrayList<Float>();

		//Sort an arraylist using java.util.Collections
		Collections.sort(cars);
		System.out.println(cars);
	
		
		System.out.println();
		
		
		//Methods
		//This is how we run a method from the method we created below
		sayHi();


		System.out.println();

		//This is how we enter a parameter to a function
		sayUser("Hoax");

		System.out.println();

		//We can also use variable
		String someName = "Snowden";
		sayUser(someName);

		System.out.println();

		//Calling a method with two parameter
		sayHello(someName, 16);

		System.out.println();

		//Using return in a method
		System.out.println(cube(3));

		System.out.println();

		//We can also put the value of the method that we make in a variable
		int cubed = cube(4);
		System.out.println(cubed);



		System.out.println();


		//If Statements
		boolean isMale = true;
		boolean isTall = true;

		//Make a if block
		if (isMale) {
			System.out.println("You are a male");
		} else {
			System.out.println("You are not a male");
		}

		//Use bitwise operators
		/*
		&& - AND
		|| - OR
		! - NOT
		*/
		if (isMale && isTall) {
			System.out.println("You are a tall male");
		} else if (isMale || isTall)  {
			System.out.println("You are either tall or male");
		} else if (isMale && !isTall) {
			System.out.println("You are a short male");
		} else if (!isMale && isTall) {
			System.out.println("You are tall but not a male");
		} else {
			System.out.println("You are not a male and you are not tall");
		}

		System.out.println();

		//Use comparison operators
		/*
		>= - Greater than or Equal
		<= - Less than or Equal
		== - Equal
		!= - Not Equal
		> - Greater Than
		< - Less Than
		*/
		//Call the function that we make
		System.out.println(max(3, 5, 6));

		//If elif shorthand
		//(condition) ? conditionTrue : conditionFalse
		int time = 20;
		System.out.println((time > 15) ? "Time > 20" : "Time < 20");


		//Making a simple calculator
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter a number: ");
//		double uNum1 = input.nextDouble();
//
//		System.out.print("Enter a operator: ");
//		String op = input.next(); //.next() grabs single chararacter
//
//		System.out.print("Enter next number: ");
//		double uNum2 = input.nextDouble();
//
//		if(op.equals("+")) {
//			System.out.println(uNum1 + uNum2);
//		} else if(op.equals("-")) {
//			System.out.println(uNum1 - uNum2);
//		} else if(op.equals("*")) {
//			System.out.println(uNum1 * uNum2);
//		} else if(op.equals("/")) {
//			System.out.println(uNum1 / uNum2);
//		} else {
//			System.out.println("Invalid Operator");
//		}


		System.out.println();


		//Switch statement
		//I made a function that returns a day from the specified number
		System.out.println(getDayName(5));


		System.out.println();


		//While loops
		int i = 1;

		//Make the while block
		while (i <= 10) {
			System.out.println(i);
			i++; //Increment i by one
		}

		System.out.println();

		//Do While
		i = 11;
		do {
			System.out.println(i);
			i++;
		} while (i <= 10);

		/*Their main difference is that while loops checks the conditions first then execute the code under it
		while the do while loops execute the code first then check.if the condition is true then execute it again if its true
		*/


		System.out.println();


		//Make a little guessing game
		//We already have a scanner object named input so i dont need to make it again


//		String secretWord = "Snow";
//		String guess = "";
//
//		while(!guess.equals(secretWord)) {
//			System.out.print("Enter guess: ");			guess = input.nextLine();
//		}
//		System.out.println("You win!");



		//This is a more advanced with guess limit
//		String secretWord2 = "Hello";
//		String guess2 = "";
//		int guessCount = 0;
//		int guessLimit = 3;
//		boolean doneGuessing = false;
//
//		while(!guess2.equals(secretWord2) && !doneGuessing){
//			if(guessCount < guessLimit) {
//				System.out.print("Enter the secret word: ");
//				guess2 = input.nextLine();
//				guessCount++;
//			} else {
//				doneGuessing = true;
//			}
//		}
//
//		if(doneGuessing) {
//			System.out.println("You lose");
//		} else {
//			System.out.println("You win");
//		}
//
//


		System.out.println();
		System.out.println();


		//For loops
		//Make for loop
		//(define the indexing number; the condtion; the code we want to run after all the code inside it is executed)
		for (i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println();

		//Loop through array
		String [] friendss = {"Jimmy", "Jim", "Carl"};
		for (i = 0; i < friendss.length; i++) {
			System.out.println(friendss[i]);
		}
		
		System.out.println();
		
		//Loop through an array (little bit shorter)
		for (String afriend: friendss) {
			System.out.println(afriend);
		}

		System.out.println();

		//Loop through a arraylist
		ArrayList<Integer> intArray = new ArrayList<Integer>();
		intArray.add(2);
		intArray.add(5);
		intArray.add(6);
		intArray.add(16);

		for (i = 0; i < intArray.size(); i++) {
			System.out.println(intArray.get(i));
		}

		//Nested for loops
		for (i = 0; i < 3; i++) {
			for (int j = 1; j < 4; j++) {
				System.out.println("i = " + i + ", j = " + j);
			}
		}

		System.out.println();

		//Multidimensional array
		//int [][] numberGrid = new int[3][3]
		//or
		int [][] numberGrid = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9},
			{0}
		};

		for (i = 0; i < numberGrid.length; i++) {
			for (int j = 0; j < numberGrid[i].length; j++) {
				System.out.print(numberGrid[i][j] + " ");
			}
			System.out.println();
		}


		System.out.println();

		Scanner input = new Scanner(System.in);
		//Try Catch Blocks
		//Exception basically catches all of exception errors
		System.out.print("Enter a number: ");
		try {
			double num = input.nextDouble();
			System.out.println(num);
		} catch (Exception e) {
			System.out.println(e);
		}

		//Multiple Catch
		//We need to specify the exception error
		System.out.println("Enter a number: ");
		int [] nums = {1, 2, 3};

		try {
			System.out.println(nums[5]);
			double num = input.nextDouble();
			System.out.println(num);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index is out of Bounds");
		} catch (InputMismatchException e) {
			System.out.println("Invalid Input, must be a number"); //Import java.util.* to import all possible exceptions
		} catch (Error e) {
			System.out.print(e);
		} catch (Exception e) {
			System.out.print(e);
		}

		System.out.println();

		//Calling a non static method
		Main myMain = new Main();
		myMain.sayHello();

		System.out.println();

		//Versus calling a static method in the same class
		sayHi();

		System.out.println();
	}










	//Make a simple method that says hi
	public static void sayHi() {
		System.out.println("Hi User");
	}


	//Making a method that requires parameters
	//Paramaters in method is same as making variables, just need to enter datatype then its name
	public static void sayUser(String userN) {
		System.out.println("Hello " + userN);
	}


	//Can also do two params
	public static void sayHello(String username, int age) {
		System.out.println("Your name is " + username + " and you are " + age + " years old");
	}

	//In this case, we used int instead of void because we are returning data using return keyword and we want to return a int value.
	//This uses return keyword in a method
	//Also the code that you are gonna put after the return keyword is not gonna read by java because return is where it ends
	public static int cube(int numtocube) {
		return numtocube * numtocube * numtocube;
		//Any code you put under the return statement will not be executed because the code stops at return function 
	}

	//We will make a method that returns the max number in the three given int
	public static int max(int num1, int num2, int num3) {
		if (num1 >= num2 && num1 >= num3) {
			return num1;
		} else if (num2 >= num1 && num2 >= num3) {
			return num2;
		} else {
			return num3;
		}
	}


	public static String getDayName(int i) {
		String dayName = "";
		//Put in the switch statement the value that we wanna compare

		//Then put the number in the case that we expect to get
		//The default runs when the integer we entered is not in the case
		switch (i) {
		case 0:
			dayName = "Sunday";
			break;
		case 1:
			dayName = "Monday";
			break;
		case 2:
			dayName = "Tuesday";
			break;
		case 3:
			dayName = "Wednesday";
			break;
		case 4:
			dayName = "Thursday";
			break;
		case 5:
			dayName = "Friday";
			break;
		case 6:
			dayName = "Saturday";
			break;
		default:
			dayName = "Invalid Day Number";
		}

		return dayName;
	}


	//Non static method
	public void sayHello() {
		System.out.println("Hello User");
	}

}