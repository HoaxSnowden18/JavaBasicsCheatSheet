
public class Cow implements Animal {
	//We can also implement this Animal interface to this cow class
	@Override
	public void speak() {
		System.out.println("Mooooo");
	}
	
	@Override
	public void eat() {
		System.out.println("Eats some hay");
	}
}