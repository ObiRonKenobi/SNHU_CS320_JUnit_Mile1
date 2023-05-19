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

//declare test class
class ContactTest {
	
	//define tests
	@Test
	void testContact() {
		//initialize testable object
		Contact testContact = new Contact("123","Ronald","Sudol","5558675309","31 Spooner St");
		
		//test object creation
		assertTrue(testContact.getId().equals("123"));
		assertTrue(testContact.getFirst().equals("Ronald"));
		assertTrue(testContact.getLast().equals("Sudol"));
		assertTrue(testContact.getPhone().equals("5558675309"));
		assertTrue(testContact.getAddress().equals("31 Spooner St"));
	}
	
	// null tests
	@Test
	void testContactIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact(null,"Ronald","Sudol","5558675309","31 Spooner St");
		});
	}
	@Test
	void testContactFirstNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("123",null,"Sudol","5558675309","31 Spooner St");
		});
	}
	@Test
	void testContactLastNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("123","Ronald",null,"5558675309","31 Spooner St");
		});
	}
	@Test
	void testContactPhoneNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("123","Ronald","Sudol",null,"31 Spooner St");
		});
	}
	@Test
	void testContactAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("123","Ronald","Sudol","5558675309",null);
		});
	}
	
	// too long tests
		@Test
		void testContactIdTooLong() {
			Assertions.assertThrows(IllegalArgumentException.class,  () -> {
				new Contact("ABCDEF1234567890","Ronald","Sudol","5558675309","31 Spooner St");
			});
		}
		@Test
		void testContactFirstTooLong() {
			Assertions.assertThrows(IllegalArgumentException.class,  () -> {
				new Contact("123","ABCDEF1234567890","Sudol","5558675309","31 Spooner St");
			});
		}
		@Test
		void testContactLastTooLong() {
			Assertions.assertThrows(IllegalArgumentException.class,  () -> {
				new Contact("123","Ronald","ABCDEF1234567890","5558675309","31 Spooner St");
			});
		}
		@Test
		void testContactPhoneTooLong() {
			Assertions.assertThrows(IllegalArgumentException.class,  () -> {
				new Contact("123","Ronald","Sudol","ABCDEF1234567890","31 Spooner St");
			});
		}
		@Test
		void testContactAddressTooLong() {
			Assertions.assertThrows(IllegalArgumentException.class,  () -> {
				new Contact("123","Ronald","Sudol","5558675309","ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890");
			});
		}
		
		// too short phone test
		@Test
		void testContactPhoneTooShort() {
			Assertions.assertThrows(IllegalArgumentException.class,  () -> {
				new Contact("123","Ronald","Sudol","321","31 Spooner St");
			});
		}
}

/*
 * Rip and Tear!
 */
