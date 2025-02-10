package university;

import java.util.ArrayList;
import java.util.List;

// Class to manage courses in a department
public class Department {
    private List<Course<? extends CourseType>> courses;

    public Department() {
        courses = new ArrayList<>();
    }

    // Add a course to the department
    public <T extends CourseType> void addCourse(Course<T> course) {
        courses.add(course);
    }

    // Display all courses in the department
    public void displayCourses() {
        System.out.println("Courses in Department:");
        for (Course<? extends CourseType> course : courses) {
            System.out.println(course);
        }
    }

    // Get all courses in the department
    public List<Course<? extends CourseType>> getAllCourses() {
        return courses;
    }
}