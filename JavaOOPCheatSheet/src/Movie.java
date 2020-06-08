
public class Movie {
	//Setting class attributes
	String title;
	String author;
	private String rating; //Setting this to private makes it not accessible to other class
	
	//Making a method
	public Movie(String title, String author, String rating) {
		this.title = title;
		this.author = author;
		this.setRating(rating);	
	}
	
	//Set a setter for rating (bcoz you can put anything in rating)
	public void setRating(String rating) {
		if(rating.equals('G') || rating.equals("PG") || rating.equals("PG-13") || rating.equals('R') || rating.equals("NR")) {
			this.rating = rating;	
		} else {
			this.rating = "NR";	
		}
	}
	
	public String printRating() {
		return rating;
	}
	
	
}