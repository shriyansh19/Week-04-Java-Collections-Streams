package resumescreening;

import java.util.Arrays;
import java.util.List;

// Main class to demonstrate the resume screening system
public class Main {
    public static void main(String[] args) {
        // Create job roles
        SoftwareEngineer softwareEngineer = new SoftwareEngineer();
        DataScientist dataScientist = new DataScientist();
        ProductManager productManager = new ProductManager();

        // Create resumes
        Resume<SoftwareEngineer> resume1 = new Resume<>("Brock Lesnar", softwareEngineer);
        Resume<DataScientist> resume2 = new Resume<>("Randy Orton", dataScientist);
        Resume<ProductManager> resume3 = new Resume<>("Alexa Bliss", productManager);

        // Create resume screener and add resumes
        ResumeScreener screener = new ResumeScreener();
        screener.addResume(resume1);
        screener.addResume(resume2);
        screener.addResume(resume3);

        // Display all resumes
        screener.displayResumes();

        // Screen resumes for specific job roles
        List<JobRole> rolesToScreen = Arrays.asList(softwareEngineer, dataScientist);
        screener.screenResumes(rolesToScreen);
    }
}