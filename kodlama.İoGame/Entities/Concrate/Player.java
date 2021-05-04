package Concrate;

public class Player {
	

	public Player(int id, int identityNumber, String firstName, String lastName) {
		super();
		this.id = id;
		this.identityNumber = identityNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	private int id;
	private int identityNumber;
	private String firstName;
	private String lastName;
	
	public int getId() {
		return id;
	}
	public int getIdentityNumber() {
		return identityNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setIdentityNumber(int identityNumber) {
		this.identityNumber = identityNumber;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
