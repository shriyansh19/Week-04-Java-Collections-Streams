package com.streams.datastreams;

import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StudentDataTest {
    @Test
    public void testWriteStudentData() {
        StudentDataHandler handler = new StudentDataHandler();
        String filename = "testStudentData.dat";

        handler.writeStudentData(filename, 102, "Champaklal Jayantilal Gada", 3.8);

        File file = new File(filename);
        assertTrue(file.exists());
    }
}
