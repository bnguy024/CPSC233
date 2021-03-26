
public class Customer {
	private String name;
	private int iD = 0;
	
	Customer(){
	}
	public Customer(String n, int id){
		this.name = n;
		this.iD = id;
		}
	
	Customer(Customer b){ //copy Constructor
		name = b.name;
		iD = b.iD;
	}
	
	public int getID() {
		return iD;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	public String toString() {
		return getName()+" "+getID();
	}

}
