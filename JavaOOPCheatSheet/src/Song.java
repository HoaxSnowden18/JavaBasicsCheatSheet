
public class Song {
	private String title;
	private String author;
	private int length;
	//This is a static class variable/attribute
	private static int songCount = 0;
	
	//Constructor - Always run when you make a instance from this class
	public Song(String title, String author, int length) {
		this.setTitle(title);
		this.setAuthor(author);
		this.setLength(length);
		songCount++;
		System.out.println("Song/s Count: "+songCount);
	}
	
	
	//Getters and Setters
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getLength() {
		return this.length;
	}
	
	
}
