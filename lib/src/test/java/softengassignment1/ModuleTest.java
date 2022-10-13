package softengassignment1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ModuleTest {

	@Test
	void student_username_should_be_name_and_age() {
		// Given a course CSIT and module in that course
		CourseProgramme CSIT = new CourseProgramme("CSIT", 1, 8, 2022, 31, 5, 2026);
		Module CT1 = new Module("Computers for dummies", "1");
		CSIT.addModules(CT1);
		
		// When 		
		
		// Then Computers for dummies should be in the CSIT module list and should be the module name
		assertEquals("Computers for dummies", CSIT.getModuleList().get(0).getModuleName());
	}

}
