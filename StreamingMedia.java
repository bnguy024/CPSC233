public abstract class StreamingMedia {
	private String title;
	private int length = 10;

	public StreamingMedia(String aTitle, int aLength){
		title = aTitle;
		length = aLength;
	}
	public StreamingMedia(StreamingMedia toCopy){
		title = toCopy.title;
		length = toCopy.length;
	}
	
	public String getTitle() {
		return title;
	}
	
	protected void setTitle(String aTitle) {
		title = aTitle.toUpperCase();
	}
	
	public int getLength() {
		return length;
	}
	
	protected void setLength(int aLength) {
		if (aLength > 0) {
		length = aLength;
		}
	}
	
	public char getCategory() {
		char temp = 'a';
		if (getRating()== 9 || getRating() == 10) {
			temp = 'A';
		}
		else if(getRating()== 7 || getRating() == 8) {
			temp = 'B';
				
		}
		else if(getRating()== 5 || getRating() == 6) {
			temp = 'C';
		}
		else if(getRating()== 3 || getRating() == 4) {
			temp = 'D';
		}
		else if(getRating()<4) {
			temp = 'F';
		}
		return temp;
	}
	
	public abstract int getRating();
	
	public String toString() {
		return "Title:"+getTitle()+"Length:"+getLength();
	}
}
