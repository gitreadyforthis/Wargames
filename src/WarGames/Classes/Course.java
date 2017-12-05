package WarGames.Classes;

import WarGames.Interfaces.CourseInterface;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * The class for course, contains a single character called grade
 * and a PeopleInterface array of people objects
 * contains a scanner to read in user input
 * and a file1 io to read in files
 */
public class Course implements CourseInterface {

    private File file1 = new File("src/WarGames/files/grades.txt");
    private File file2 = new File("src/WarGames/files/Assignments.txt");
    private Scanner scan = null;



    /**
     * isVisible() checks to see if the assignment is listed as
     * visible by the professor
     * precondition the professor has posted an assignment to course
     * postcondition: returns true or false (visible or invisible)
     */
    @Override
    public boolean isVisible(String myCourse, String myAssignment) {
        try {
            scan = new Scanner(file2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (scan.hasNextLine()) {
            String stuff = scan.nextLine();
            StringTokenizer myTokenizer = new StringTokenizer(stuff, ",");
            String student = myTokenizer.nextToken();
            String professor = myTokenizer.nextToken();
            String course = myTokenizer.nextToken();
            String assignmentNo = myTokenizer.nextToken();
            String submission = myTokenizer.nextToken();
            String grade = myTokenizer.nextToken();
            String visibility = myTokenizer.nextToken();
            // TODO: 12/2/2017 when isReg is done add to the requirements here
            if (course.equals(myCourse) && assignmentNo.equals(myAssignment) && hasAssignment(myCourse)) {
                if (visibility.equals("true")) {
                    return true;
                }
            }
        }
        scan.close();
        return false;
    }

    /**
     * hasAssignment() checks if the course has any assignment Objects associated
     * with it.
     * precondition: checks if assignment objects exist in assignment
     * postCondition: returns true if exist returns false if not
     */
    @Override
    public boolean hasAssignment(String myCourse) {
        try {
            scan = new Scanner(file2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (scan.hasNextLine()) {
            String stuff = scan.nextLine();
            StringTokenizer myTokenizer = new StringTokenizer(stuff, ",");
            String student = myTokenizer.nextToken();
            String professor = myTokenizer.nextToken();
            String course = myTokenizer.nextToken();
            String assignmentNo = myTokenizer.nextToken();
            String submission = myTokenizer.nextToken();
            String grade = myTokenizer.nextToken();
            String visibiliy = myTokenizer.nextToken();

            if (course.equals(myCourse)) {
                if (!assignmentNo.equals("null")) {
                    return true;
                }
            }
        }
        scan.close();
        return false;

    }

    /**
     * string getGrade() is the final letter grade for the course
     * for now it returns 0 until it takes in the grade data from the
     * whole of the assignments in the course
     *
     * @return final grade
     */
    public String getGrade(String myCourse, String myStudent, String myProfessor) {

        try {
            scan = new Scanner(file1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String stuff;
        String compleat = null;

        assert scan != null;
        while (scan.hasNextLine()) {
            stuff = scan.nextLine();
            StringTokenizer myTokenizer = new StringTokenizer(stuff, ",");
            String student = myTokenizer.nextToken();
            String grade = myTokenizer.nextToken();
            String teacher = myTokenizer.nextToken();
            String course = myTokenizer.nextToken();
            if (student.equals(myStudent) && teacher.equals(myProfessor) && course.equals(myCourse))
                compleat = grade;
        }
        scan.close();
        return compleat;
    }
}
