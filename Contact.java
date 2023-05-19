/*
 * Ronald W. Sudol III
 * SNHU CS320
 * Milestone One
 * 05/21/2023
 */

//declare class
public class Contact {

	//declare variables
	private String id;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	//define class object
	public Contact(String id,String firstName,String lastName, String phone, String address){
		
		//assert id is not null and is not > 10
		if(id == null || id.length()>10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		
		//assert first name is not null and is not > 10
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		
		//assert last name is not null and is not > 10
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		
		//assert phone number is not null and exactly 10 digits
		if(phone == null || phone.length()!=10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		
		//assert address is not null and is not > 30
		if(address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		
		// if all checks are good, create contact object
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
		
	}
	
	//getters
	public String getId() {
		return id;
	}
	public String getFirst() {
		return firstName;
	}
	public String getLast() {
		return lastName;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	
	//setters
	public void setFirst(String firstName) {
			this.firstName = firstName;
	}
	public void setLast(String lastName) {
		this.lastName = lastName;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}

/*
 * Rip and Tear!
 */