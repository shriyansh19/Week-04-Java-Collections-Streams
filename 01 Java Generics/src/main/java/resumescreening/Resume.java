package resumescreening;

// Generic class representing a resume for a specific job role
public class Resume<T extends JobRole> {
    private String applicantName;
    private T jobRole;

    public Resume(String applicantName, T jobRole) {
        this.applicantName = applicantName;
        this.jobRole = jobRole;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public T getJobRole() {
        return jobRole;
    }

    @Override
    public String toString() {
        return "Resume: " + applicantName + ", " + jobRole;
    }
}