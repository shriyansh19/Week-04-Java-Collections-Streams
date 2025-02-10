package university;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class DepartmentTest {

    @Test
    void testAddCourse() {
        Department department = new Department();
        Course<ExamCourse> mathCourse = new Course<>("Mathematics", new ExamCourse());
        department.addCourse(mathCourse);

        assertEquals(1, department.getAllCourses().size());
    }

    @Test
    void testDisplayCourses() {
        Department department = new Department();
        Course<AssignmentCourse> historyCourse = new Course<>("History", new AssignmentCourse());
        department.addCourse(historyCourse);

        // Ensure the department contains the added course
        assertTrue(department.getAllCourses().contains(historyCourse));
    }

    @Test
    void testCourseType() {
        Course<ResearchCourse> physicsCourse = new Course<>("Physics", new ResearchCourse());
        assertEquals("Research-Based", physicsCourse.getCourseType().getEvaluationMethod());
    }
}