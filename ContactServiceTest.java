/*
 * Ronald W. Sudol III
 * SNHU CS320
 * Milestone One
 * 05/21/2023
 */

//import testing tools
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ContactServiceTest {

	@Test
	void testAddContact() {
		
		//Initialize a contact list
		ContactService cList = new ContactService();
		
		//create test contacts
        Contact contact1 = new Contact("123","Ronald", "Sudol", "5558675309", "31 Spooner St");
        Contact contact2 = new Contact("420","Bob", "Marley","1234567890", "Shakedown St");
        
        // add contacts to list and test for returns true
        assertTrue(cList.addContact(contact1));
        assertTrue(cList.addContact(contact2));
        
        // tests for return false when trying to add a contact that already exists
        assertFalse(cList.addContact(contact1));
	}
	
	@Test
	void testDeleteContact() {
		
		//Initialize a contact list
		ContactService cList = new ContactService();
				
		//create test contacts
		Contact contact1 = new Contact("123","Ronald", "Sudol", "5558675309", "31 Spooner St");
		Contact contact2 = new Contact("420","Bob", "Marley","1234567890", "Shakedown St");
		
		// add test contacts to array
		cList.addContact(contact1);
		cList.addContact(contact2);
		
		//delete existing contact and test for returns true
		assertTrue(cList.deleteContact("420"));
		
		//try to delete nonexistent contact and test for returns false
		assertFalse(cList.deleteContact("1986"));
		
	}
	
	@Test
	void testUpdateContact() {
		//Initialize a contact list
		ContactService cList = new ContactService();
						
		//create test contacts
		Contact contact1 = new Contact("123","Ronald", "Sudol", "5558675309", "31 Spooner St");
				
		// add one test contact to array
		cList.addContact(contact1);
		
		// update existing contact, test for return true
		assertTrue(cList.updateContact("123", "Obi Ron", "Kenobi", "1234567890", "Straight outa Connecticut"));
		
		// attempt to update non-existent contact, test for returns false
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			cList.updateContact("69", "Slam", "Duncan", "9876543210", "The Top of the World");
		});
	}
	
	
}

/*
 * Rip and Tear!
 */