package softengassignment1;

import java.util.ArrayList;
import java.util.List;

public class Module {

	private final String moduleName;
    private final String moduleID;
    private final List<Student> enrolledStudents = new ArrayList<Student>();
    private final List<Lecturer> enrolledLecturers = new ArrayList<Lecturer>();
    private final List<CourseProgramme> associatedCourses = new ArrayList<CourseProgramme>();
    
    public Module(String moduleName, String moduleID) {
        this.moduleName = moduleName;
        this.moduleID = moduleID;
    }
    
    public void addCourse(CourseProgramme course) {
        this.associatedCourses.add(course);
    }
    
    public void addStudentToModule(Student student) {
        this.enrolledStudents.add(student);
    }
    
    public void addLecturerToModule(Lecturer lecturer) {
        this.enrolledLecturers.add(lecturer);
    }
    
    // Getter Methods
    public String getModuleName() {
        return moduleName;
    }
    
    public String getModuleID() {
        return moduleID;
    }
    
    public List<Student> getStudentList() {
        return enrolledStudents;
    }
    
    public List<Lecturer> getLecturerList() {
        return enrolledLecturers;
    }
    
    public List<CourseProgramme> getCourseList() {
        return associatedCourses;
    }
}
