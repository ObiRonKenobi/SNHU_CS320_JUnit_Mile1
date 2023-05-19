/*
 * Ronald W. Sudol III
 * SNHU CS320
 * Milestone One
 * 05/21/2023
 */

// import arrays for storing and searching contacts
import java.util.ArrayList;

public class ContactService {

	// Holds the list of contacts
    private final ArrayList<Contact> contactList;
    
    //construct new contact list
    public ContactService() {
        
    	// Initialize the contact list array
        contactList = new ArrayList<>();
    }
	
    // define method for adding contact if doesn't already exist
    public boolean addContact(Contact contact) {
       
    	//initialize bool as false, assumes contact does not exist
    	boolean contactExists = false;
        
    	// check if contact already exists
        for (Contact contactObject : contactList) {
            
        	// if contact in array, return true
            if (contactObject.equals(contact)) {
            	contactExists = true;
                
            	break;
            }
        }
        
        // If the contact is not in the array, add it
        if (!contactExists) {
        	contactList.add(contact);
            
        	// Returns true if the contact was added
            return true;
        }
        
        // Returns false if the contact was not added
        return false;
    }
	
    // searches for contact by id number
    public Contact getContact(String id) {
        for (Contact contactObject : contactList) {
            
        	// if object found, return it
            if (contactObject.getId().equals(id)) {
                return contactObject;
            }
        }
        // else return null
        return null;
    }
    
    // Method to delete a contact by id
    public boolean deleteContact(String id) {
        Contact contactObject = getContact(id);
        
        // if contact found, delete it and return true
        if (contactObject != null) {
            contactList.remove(contactObject);
            return true;
        }
        // else return false
        return false;
    }
    
    //method to update existing contact
    public boolean updateContact(String id, String firstName, String lastName, String phone, String address) {
    	
    	// check if id exists in array
    	for (Contact idNums : contactList){
    		if ( id == idNums.getId()) {
    			break;
    		}
    		else {
    			throw new IllegalArgumentException("No Contact with that ID");
    		}
    	}
    	
    	//initialize contact object
    	Contact contactObject = getContact(id);
    	
    	
    	//find contact to update
    	 for (Contact contacts : contactList){
    		 
    		 // when contact found, update it and return true
    		 if (contactObject.getId() == contacts.getId()){
    			 contacts.setFirst(firstName);
    	         contacts.setLast(lastName);
    	         contacts.setPhone(phone);
    	         contacts.setAddress(address);
    	         return true;
    		 }
    	 }
    	 //else return false
    	 return false;
    }
}

/*
 * Rip and Tear!
 */