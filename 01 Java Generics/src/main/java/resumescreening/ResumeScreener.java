package resumescreening;

import java.util.ArrayList;
import java.util.List;

// Class to manage the resume screening process
public class ResumeScreener {
    private List<Resume<? extends JobRole>> resumes;

    public ResumeScreener() {
        resumes = new ArrayList<>();
    }

    // Add a resume to the screener
    public <T extends JobRole> void addResume(Resume<T> resume) {
        resumes.add(resume);
    }

    // Screen resumes for a specific job role
    public void screenResumes(List<? extends JobRole> jobRoles) {
        System.out.println("Screening Resumes:");
        for (Resume<? extends JobRole> resume : resumes) {
            if (jobRoles.contains(resume.getJobRole())) {
                System.out.println("Match Found: " + resume);
            }
        }
    }

    // Display all resumes in the screener
    public void displayResumes() {
        System.out.println("Resumes in Screener:");
        for (Resume<? extends JobRole> resume : resumes) {
            System.out.println(resume);
        }
    }

    // Get all resumes in the screener
    public List<Resume<? extends JobRole>> getAllResumes() {
        return resumes;
    }
}