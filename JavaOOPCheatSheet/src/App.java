import p1.MyClass;
import p1.AnothaOne;

public class App {
	//Class should be name the same as the file name
	public static void main(String[] args) {
		//I made a Student class which is named Student.java

		//Make instance of the Student class
		//This is the same as the one below
		Student myStudent = new Student("Hoax", "Snowden", 16, 2.5, "BSCS", false);

		//Make attributes of the class w/o constructor
		//myStudent.firstName = "Hoax";
		//myStudent.lastName = "Snowden";
		//myStudent.age = 16;
		//myStudent.gpa = 2.5;
		//myStudent.major = "BSCS";
		//myStudent.isOnProbation = false;

		System.out.println(myStudent.firstName);

		//Make instance of the book class and also put attributes
		//This is the same as above but this is using constructor and is a lot easier
		Book book1 = new Book("Harry Potter", "JK Rowling", 500, "English");
		Book book2 = new Book("Automate Boring Stuffs with Python", "Al Sweigart", 50, "English");

		//Run a class method
		System.out.println(myStudent.isOnHonorRoll());


		System.out.println();

		//Getters and Setters

		//Making instance of Movie class
		Movie movie1 = new Movie("The Avengers", "Joss Whedon", "PG-13");
		Movie movie2 = new Movie("Step Brothers", "Adam McKay", "R");

		//Setting the rating to other rating
		//movie1.rating = "Dog";

		//Using the setter
		movie1.setRating("PG");
		//System.out.println(movie1.rating);

		//Giving the setter other value
		movie2.setRating("Dog");
		//System.out.println(movie2.rating);

		//We can now only use setRating because we specified the rating class variable to be private, we cant also print it so we need to make a getter

		//Print the private variable using getter
		System.out.println(movie1.printRating());

		//Getters prints or returns the class variable because we can not access it
		//Setters sets attributes for the class variables

		System.out.println();

		//Static Class Variables
		Song song1 = new Song("Buwan", "JK", 320);
		Song song2 = new Song("Demonyo", "JK", 360);

		System.out.println();

		//Static Class Methods
		MyMethods.greet();
		System.out.println(MyMethods.max(55, 6));

		System.out.println();

		//Inheritance
		//I made a class named Chef
		Chef chef1 = new Chef();
		chef1.makeSpecialDish();
		chef1.makeSalad();

		System.out.println();

		//Then Italian Chef inherited Chef using extends
		ItalianChef italyChef = new ItalianChef();
		italyChef.makeSpecialDish(); //We can use method from Chef class
		italyChef.makeSalad();

		System.out.println();

		//Chinese Chef also inherited from Chef class
		ChineseChef chinaChef = new ChineseChef();
		chinaChef.makeFriedRice();
		chinaChef.makeSalad();
		chinaChef.makeSpecialDish();

		//Interface Inheritance
		//I made an interface named Animal
		//Classes can inherit from interface

		//Make a new cow object
		Cow cow = new Cow();

		//Is the same as doing this
		//It can do this because Animal also have the same methods as the cow, bird and dog class
		Animal myCow = new Cow();
		myCow.speak();

		Animal myDog = new Dog();
		myDog.eat();

		Animal myBird = new Bird();
		myBird.speak();

		System.out.println();

		//Then we can make a array of classes
		Animal [] animals = {
			new Dog(),
			new Cow(),
			new Bird()
		};

		//Then loop through each class while running the same method
		for (int i = 0; i < animals.length; i++) {
			animals[i].eat();
		}


		System.out.println();



		//Packages in Java
		//Packages in java are basically folders that contains class
		//I made a package name called p1
		//In java, projects you made are automatically stored in a (default package) and do not need to call them
		//We need to import packageName.ClassName to use a class from another package

		//Making a instance of the MyClass class in the package p1
		//We imported it using import p1.MyClass
		//Making instance of the MyClass
		MyClass myClass = new MyClass();
		myClass.sayHi();

		//p2.MyClass will be different from p1.MyClass even though they have the same class name
		AnothaOne anothaClass = new AnothaOne();
		anothaClass.someFunction();
		

	}
}	