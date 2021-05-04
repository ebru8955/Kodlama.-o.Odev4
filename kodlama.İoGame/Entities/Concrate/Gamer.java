package Concrate;

public class Gamer {
	
	public Gamer(int id, String userName, long identityNumber, String firstName, String lastName, int birthYear) {
		super();
		this.id = id;
		UserName = userName;
		IdentityNumber = identityNumber;
		FirstName = firstName;
		LastName = lastName;
		BirthYear = birthYear;
	}
	private int id;
	private String UserName;
    private long IdentityNumber;
    private String FirstName; 
    private String LastName;
    private int BirthYear;
    
	public int getId() {
		return id;
	}
	public String getUserName() {
		return UserName;
	}
	public long getIdentityNumber() {
		return IdentityNumber;
	}
	public String getFirstName() {
		return FirstName;
	}
	public String getLastName() {
		return LastName;
	}
	public int getBirthYear() {
		return BirthYear;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public void setIdentityNumber(long identityNumber) {
		IdentityNumber = identityNumber;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public void setBirthYear(int birthYear) {
		BirthYear = birthYear;
	}

}
