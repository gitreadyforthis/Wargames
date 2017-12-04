package WarGames;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *this is the public class for Professor
 *it implements both grader and people interfaces
 */

public class Professor implements People, Grader {
    File file = new File("src/WarGames/files/Assignments.txt");
    File grades = new File("src/WarGames/files/grades.txt");

    Scanner scan = null;
    /**
     * postAssignment() creates an assignment object
     * and "posts" it to the relevant course
     * precondition: assignment does not already exist
     * postcondition: assignment object is created and set to visible in the course
     * no return as it is void
     *
     */
    public void postAssignment(String visible)
    {
        try {
        scan = new Scanner(file);
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

            if (visibiliy.equals("false")) {
                System.out.print("Assignment does not exist");
                }
            }

        scan.close();
    }
   /**
     * removeAssignment() removes an already existing assignment object
     * from the relevant course and "sets" the visibility to false
     * as long as there is no grade associated with the assignment
     * precondition: an assignment without a grade exists
     * postCondition: the assignment is removed from the array and visibility is set to false
     */
    public void removeAssignment()
    {

    }

    /**
     * createGrade() creates a grade object
     * precondition: a grade object does not exist
     * postcondition: a grade object is created
     */

    @Override
    public void createGrade() {

    }

    /**
     * changeGrade() modifies the attributes of a preexisting grade object
     * preCondition: a grade already exists
     * post condition: the grades values are modified
     */
    @Override
    public void changeGrade() {

    }

    /**
     * boolean pollStudents() checks if the student object exists/ is valid for the particular
     * assignment/ grade
     * precondition student tries to access grade
     * post condition: returns data if true, returns error false
     */
    @Override
    public boolean pollStudents() {
        return false;
    }


//    /** checkRegistered() which checks if the people are registered for the course
//     * precondition: a "person" tries to access the course
//     * postCondition: the system returns true (the user is valid) if not the system returns an error (false)
//     **/
//    @Override
//    public boolean checkRegistered(String myCourse, String myStudent, String myProfessor, String myTA) {
//        return false;
//    }


   /** checkGrade() which returns the associated float value in grade objects
     * precondition: assignment has grade
     * post condition: returns the grade value (float) taken from the assignment
     * @return float
    **/
    @Override
    public float checkGrade() {
        try {
            scan = new Scanner(grades);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String stuff;
        float courseGrade = 0;

        assert scan != null;
        while (scan.hasNextLine()) {
            stuff = scan.nextLine();
            StringTokenizer myTokenizer = new StringTokenizer(stuff, ",");
            String student = myTokenizer.nextToken();
            String teacher = myTokenizer.nextToken();
            String course = myTokenizer.nextToken();
            String assignmentNo = myTokenizer.nextToken();
            String submission = myTokenizer.nextToken();
            String grade = myTokenizer.nextToken();
            String visibiliy = myTokenizer.nextToken();

            if (!grade.equals("grade"))
            {
                courseGrade = Float.parseFloat(grade);
            }
            else if(grade.equals("grade"))
            {
                System.out.print("Assignment Has not been graded yet");
            }
            else
            {
                System.out.print("Assignment NOT FOUND");

            }
        }
        scan.close();
        return courseGrade;
    }
}
