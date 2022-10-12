package softengassignment1;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalDate;

public class Lecturer {
	private final String name;
    private final int age;
    private final LocalDate dateOfBirth;
    private int ID;
    private String username;
    private CourseProgramme registeredCourse;
    private List<Module> Modules = new ArrayList<Module>();  
    
    public Lecturer(String name, int id, int day, int month, int year, CourseProgramme course){
        this.name = name;
        this.ID = id;
        this.dateOfBirth = new LocalDate(year, month, day);
        this.age = setAge();
        this.registeredCourse = course;
        registerToCourse();
    }
    
    // Calcuating Current Age of Student using Joda-Time
    private int setAge() {
        LocalDate currentAge = new LocalDate();
        currentAge = dateOfBirth.minusYears(currentAge.getYear());
        return currentAge.getYear();
    }
    
    // Lecturer Username is the concatenation of Name and Age
    public String getUsername() {
        username = name + Integer.toString(age);
        return username;
    }

    private void registerToCourse() {
        Modules = this.registeredCourse.getModuleList();
        this.registeredCourse.addLecturerToCourse(this);
    }
    
    // Getter Methods
    public String getLecturerName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public LocalDate getDOB() {
        return dateOfBirth;
    }
    
    public CourseProgramme getCourse() {
        return registeredCourse;
    }
    
    public List<Module> getModules() {
        return Modules;
    }
    
    public int getID() {
        return ID;
    }

}
