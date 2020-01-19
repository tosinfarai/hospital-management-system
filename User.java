/*
 * Superclass encompassing all users of the hospital.
 */


public class User {
    
	private long id;
	private String firstName;
	private String lastName;
	private String gender;
	private String email;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getFirstName() {
	    return firstName;
	}
	public void setFirstName(String firstName) {
	    this.firstName = firstName;
	}
	
	public String getLastName() {
	    return firstName;
	}
	public void setLastName(String lastName) {
	    this.lastName = lastName;
	}
        
        public String getGender() {
	    return firstName;
	}
	public void setGender(String gender) {
	    this.gender = gender;
	}
        
        public String getEmail() {
	    return email;
	}
	public void setEmail(String email) {
	    this.email = email;
	}
	
}
