package softengassignment1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LecturerTest {

	@Test
	// todo add some lecturer tests
	void lecturer_should_have_username_with_age() {
		// Given a new lecturer born in 1984
		Lecturer Micheal = new Lecturer("MichealMartin", 90001, 12, 3, 1984);
		
		// When 		
		
		// Then his name should be the age concatenated with the name
		assertEquals("MichealMartin38", Micheal.getUsername());
	}

}
