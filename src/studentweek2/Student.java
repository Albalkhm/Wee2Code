/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.softwarefundamentals.week1;

/**
 * A class to model students. Students can 
 * study. They have a name and an ID.
 * @author dancye, 2020
 */
public class Student 
{
    private String name;
    private String studentID;
    private String program;

    /**
     * A constructor that takes in both parameters
     * @param givenName - the student's name
     * @param givenID - the student's ID
     * @param program - the program the students are in
     * If you see this message that means that I did edit it on Jan 24th, 2020
     * I do not know what I am doing
     */
    public Student(String givenName, String givenID, String program)
    {
        name = givenName;
        studentID = givenID;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param givenName the name to set
     */
    public void setName(String givenName) {
        name = givenName;
    }

    /**
     * @return the studentID
     */
    public String getStudentID() {
        return studentID;
    }

    /**
     * @param studentID the studentID to set
     */
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    
    /**
     * a method that returns true if a student
     * studied and false otherwise.
     * @return whether or not the student studied
     */
    public boolean didStudy()
    {
        return true;
    }
    
   
}
