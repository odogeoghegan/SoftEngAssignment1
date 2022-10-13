package softengassignment1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CourseTest {

	@Test
	void student_course_name_should_be_his_registered_course() {
		// Given a course CSIT and student registered in CSIT
		CourseProgramme CSIT = new CourseProgramme("CSIT", 1, 8, 2022, 31, 5, 2026);
		Student James = new Student("James Wall", 00001, 7, 6, 1998, CSIT);
		
		// When 		
		
		// Then CSIT should be his registered course name
		assertEquals("CSIT", James.getCourse().getCourseName());
	}

}
