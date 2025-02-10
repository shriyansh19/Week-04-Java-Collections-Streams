package university;

// Abstract class representing a course type
public abstract class CourseType {
    private String evaluationMethod;

    public CourseType(String evaluationMethod) {
        this.evaluationMethod = evaluationMethod;
    }

    public String getEvaluationMethod() {
        return evaluationMethod;
    }

    @Override
    public String toString() {
        return "Evaluation Method: " + evaluationMethod;
    }
}