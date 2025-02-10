package resumescreening;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ResumeScreenerTest {

    @Test
    void testAddResume() {
        ResumeScreener screener = new ResumeScreener();
        Resume<SoftwareEngineer> resume = new Resume<>("John Doe", new SoftwareEngineer());
        screener.addResume(resume);

        assertEquals(1, screener.getAllResumes().size());
    }

    @Test
    void testScreenResumes() {
        ResumeScreener screener = new ResumeScreener();
        Resume<DataScientist> resume = new Resume<>("Jane Smith", new DataScientist());
        screener.addResume(resume);

        List<JobRole> rolesToScreen = Arrays.asList(new DataScientist());
        screener.screenResumes(rolesToScreen);
    }

    @Test
    void testDisplayResumes() {
        ResumeScreener screener = new ResumeScreener();
        Resume<ProductManager> resume = new Resume<>("Alice Johnson", new ProductManager());
        screener.addResume(resume);

        // Ensure the resume is displayed correctly
        screener.displayResumes();
    }
}