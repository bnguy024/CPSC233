public class Movie extends StreamingMedia {
	private int rating;
	
	public Movie(String aTitle, int aLength, int aRating) {
		super(aTitle, aLength);
		rating = aRating;
	}
	
	public Movie(Movie toCopy) {
		super(toCopy);
		rating = toCopy.rating;
	}
	
	public void setRating(int aRating) {
		if(rating >= 0 && rating <=10) {
		rating = aRating;
		}
	
	}
	public int getRating() {
		return rating;
	}
	public String toString() {
		return "Title:"+super.getTitle()+"Length:"+super.getLength()+"Rating:"+getRating();
	}
}