
public class Dog implements Animal{
	//We can implement all of the methods of the interface by using the keyword implements
	//We are just implementing the methods from the interface to our class
	
	
	//@Override basically means we override the method from the Animal interface
	@Override
	public void speak() {
		System.out.println("Woof Woof");
	}
	
	@Override
	public void eat() {
		System.out.println("Eats some dogfood");
	}
}