package com.streams.datastreams;

import java.io.*;

public class StudentDataHandler {
    /**
     * Writes student details to a binary file.
     * @param filename The file to write data to.
     * @param rollNumber Student's roll number.
     * @param name Student's name.
     * @param gpa Student's GPA.
     */
    public void writeStudentData(String filename, int rollNumber, String name, double gpa) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            dos.writeInt(rollNumber);
            dos.writeUTF(name);
            dos.writeDouble(gpa);

            System.out.println("Student data written successfully!");

        } catch (IOException e) {
            System.out.println("Error writing student data: " + e.getMessage());
        }
    }

    /**
     * Reads and displays student details from a binary file.
     * @param filename The file to read data from.
     */
    public void readStudentData(String filename) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            int rollNumber = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            System.out.println("Student Data:");
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);

        } catch (IOException e) {
            System.out.println("Error reading student data: " + e.getMessage());
        }
    }
}
