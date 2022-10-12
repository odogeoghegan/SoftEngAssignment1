package softengassignment1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import softengassignment1.Student;

class StudentTest {
	
	

	@Test
	void student_name_should_be_name_and_age() {
		// Given a new student born 10 years ago
		Calendar cal = Calendar.getInstance();
		Student joe = new Student("Joe", 90, cal.get(Calendar.DAY_OF_MONTH), cal.get(Calendar.MONTH)+1, cal.get(Calendar.YEAR)-10);
		
		// When 		
		
		// Then his name should be the age concatenated with the name
		assertEquals("Joe10", joe.getUsername());
	}
	
		

}
