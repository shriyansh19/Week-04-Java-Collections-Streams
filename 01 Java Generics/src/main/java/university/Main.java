package university;

// Main class to demonstrate the university course management system
public class Main {
    public static void main(String[] args) {
        // Create course types
        ExamCourse examCourse = new ExamCourse();
        AssignmentCourse assignmentCourse = new AssignmentCourse();
        ResearchCourse researchCourse = new ResearchCourse();

        // Create courses
        Course<ExamCourse> mathCourse = new Course<>("Mathematics", examCourse);
        Course<AssignmentCourse> historyCourse = new Course<>("History", assignmentCourse);
        Course<ResearchCourse> physicsCourse = new Course<>("Physics", researchCourse);

        // Create department and add courses
        Department department = new Department();
        department.addCourse(mathCourse);
        department.addCourse(historyCourse);
        department.addCourse(physicsCourse);

        // Display all courses in the department
        department.displayCourses();
    }
}