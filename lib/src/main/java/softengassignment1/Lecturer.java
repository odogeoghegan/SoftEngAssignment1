package softengassignment1;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.*;

import softengassignment1.Module;

public class Lecturer {
	private final String name;
    private final int age;
    private final DateTime dateOfBirth;
    private int ID;
    private String username;
    private CourseProgramme registeredCourse;
    private List<Module> modules = new ArrayList<Module>();  
     
    
    public Lecturer(String name, int id, int day, int month, int year){
    	this.name = name;
        this.ID = id;
        this.dateOfBirth = new DateTime(year, month, day, 0, 0);
        this.age= new Period(dateOfBirth, DateTime.now(), PeriodType.yearMonthDay()).getYears();;
    }
    
    public Lecturer(String name, int id, int day, int month, int year, CourseProgramme course){
    	this.name = name;
        this.ID = id;
        this.dateOfBirth = new DateTime(year, month, day, 0, 0);
        this.age = new Period(dateOfBirth, DateTime.now(), PeriodType.yearMonthDay()).getYears();
        registerToCourse(course);
    }
    
    // Lecturer Username is the concatenation of Name and Age
    public String getUsername() {
        username = name + Integer.toString(age);
        return username;
    }

    public void registerToCourse(CourseProgramme course) {
    	this.registeredCourse=course;
        modules = this.registeredCourse.getModuleList();
        this.registeredCourse.addLecturerToCourse(this);
    }
    
    // Getter Methods
    public String getLecturerName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public DateTime getDOB() {
        return dateOfBirth;
    }
    
    public CourseProgramme getCourse() {
        return registeredCourse;
    }
    
    public List<Module> getModules() {
        return modules;
    }
    
    public int getID() {
        return ID;
    }

}
