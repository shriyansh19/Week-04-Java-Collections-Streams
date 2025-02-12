package com.streams.datastreams;

public class Main {
    public static void main(String[] args) {
        StudentDataHandler handler = new StudentDataHandler();
        String filename = "studentData.dat";

        // Write student data
        handler.writeStudentData(filename, 101, "Jethalal Champaklal Gada", 3.9);

        // Read student data
        handler.readStudentData(filename);
    }
}
