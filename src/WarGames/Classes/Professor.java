package WarGames.Classes;

import WarGames.Interfaces.GraderInterface;
import WarGames.Interfaces.PeopleInterface;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *this is the public class for Professor
 *it implements both grader and people interfaces
 */

public class Professor implements PeopleInterface, GraderInterface {
    File file = new File("src/WarGames/files/Assignments.txt");
    File grades = new File("src/WarGames/files/grades.txt");
    File tester = new File("src//WarGames//files//Tester.txt");

    Scanner scan = null;

   /**
     * removeAssignment() removes an already existing assignment object
     * from the relevant course and "sets" the visibility to false
     * as long as there is no grade associated with the assignment
     * precondition: an assignment without a grade exists
     * postCondition: the assignment is removed from the array and visibility is set to false
     */
   public void removeAssignment() throws IOException
    {    try {
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

                if (visibiliy.equals("true") && grade != "grade") {
                    System.out.print("Assignment has been graded assignment cannot be removed");
                }
                else
                {
                    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                        String newData = stuff.trim();
                        FileWriter fw = new FileWriter(tester);
                        fw.write(newData);
                        fw.close();
                        br.close();
                    }
                }
            }

            scan.close();
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
    public String checkGrade(String studentName,String professor, String course1) {
        try {
            scan = new Scanner(grades);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String stuff;
        String courseGrade = "";

        assert scan != null;
        while (scan.hasNextLine()) {
            stuff = scan.nextLine();
            StringTokenizer myTokenizer = new StringTokenizer(stuff, ",");
            String student = myTokenizer.nextToken();
            String grade = myTokenizer.nextToken();
            String teacher = myTokenizer.nextToken();
            String course =  myTokenizer.nextToken();

            if (!grade.equals("grade") && student.equals(studentName)&& teacher.equals(professor) &&course.equals(course1))
            {
                courseGrade = grade;
            }
            else if(grade.equals("grade")&& student.equals(studentName)&& teacher.equals(professor) &&course.equals(course1))
            {
                System.out.print("Course Has not been graded yet");
            }
            else
            {
                System.out.print("COURSE  NOT FOUND");

            }
        }
        scan.close();
        return courseGrade;
    }
}
