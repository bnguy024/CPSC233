
public class Song extends StreamingMedia{
 private int numOfLikes;
 
 public Song(String aTitle, int aLength) {
	 super(aTitle,aLength);
 }
 public Song(Song toCopy) {
	 super(toCopy);
	 numOfLikes = toCopy.numOfLikes;
 }
 
 public void addLikes(int amount) {
	 
 }
 
 public int getRating() {
   int temp = 0;
	 if(getNumOfLikes() >= 5000) {
		 temp = 9;
	 }
	 else if(getNumOfLikes() >= 500){
		 temp = 7;
	 }
	 else if(getNumOfLikes()>= 50){
		 temp = 3;
	 }
	 return temp;
 }
 
 public int getNumOfLikes() {
	 return numOfLikes;
 }
 
 public String toString() {
		return "Title:"+super.getTitle()+"Length:"+super.getLength()+"Likes"+getNumOfLikes();
}
