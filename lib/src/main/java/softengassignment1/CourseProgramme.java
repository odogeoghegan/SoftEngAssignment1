package softengassignment1;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

public class CourseProgramme {
	
	private final String courseName;
    private final List<Module> Modules = new ArrayList<Module>();
    private final List<Student> enrolledStudents = new ArrayList<Student>();
    private final List<Lecturer> enrolledLecturers = new ArrayList<Lecturer>();
    private final LocalDate startDate;
    private final LocalDate endDate;
    
    public CourseProgramme(String courseName, int startDay, int startMonth, int startYear, int endDay, int endMonth, int endYear) {
        this.courseName = courseName;
        this.startDate = new LocalDate(startYear, startMonth, startDay);
        this.endDate = new LocalDate(endYear, endMonth, endDay);
    }
    
    public void addModules(Module Module) {
        this.Modules.add(Module);
        Module.addCourse(this);
    }
    
    public void addStudentToCourse(Student student) {
        this.enrolledStudents.add(student);
        for (Module element : Modules) {
            element.addStudentToModule(student);
        }
    }
    
    public void addLecturerToCourse(Lecturer lecturer) {
        this.enrolledLecturers.add(lecturer);
        for (Module element : Modules) {
            element.addLecturerToModule(lecturer);
        }
    }
    
    // Getter Methods
    public String getCourseName() {
        return courseName;
    }
    
    
    public List<Module> getModuleList() {
        return Modules;
    }
    
    public List<Student> getStudentList() {
        return enrolledStudents;
    }
    
    public List<Lecturer> getLecturersList() {
        return enrolledLecturers;
    }
    
    public LocalDate getStartDate() {
        return startDate;
    }
    
    public LocalDate getEndDate() {
        return endDate;
    }
}
