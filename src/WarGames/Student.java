package WarGames;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.File;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
/**
 * the public class for Students
 * implements People Interface
 */
public class Student implements People{

    File file1 = new File("src/WarGames/Assignments.txt");
    File tester = new File("src/WarGames/files/Tester.txt");
    File grades = new File("src/WarGames/files/grades.txt");
    Scanner scan = null;

    /**
     * uploads the students response to the listed assignment to the
     * assignment object
     * precondition: assignment object exists
     * post condition: student response is added to assignment object
     */
    public void uploadAssignment(String assignmentFile) throws FileNotFoundException, IOException {

        String search = "sub";

            try {
            FileReader fr = new FileReader(file1);
            String newText = tester.toString();
            String stuff;
            String compleat = "";
            try (BufferedReader br = new BufferedReader(fr))
            {
                //scan = new Scanner(file);
                while ((stuff = br.readLine()) != null)
                {
                    compleat += stuff;
                }
                compleat = compleat.replaceAll(search,newText);
                FileWriter fw = new FileWriter(file1);
                fw.write(compleat);
                fw.close();
                System.out.print(compleat);

            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }


        }


 /** boolean checkRegistered() which checks if the people are registered for the course
 * precondition: a "person" tries to access the course
 * postCondition: the system returns true (the user is valid) if not the system returns an error (false)
  *
 **/
 // TODO: 12/3/2017 add variable for TA's in the registered check

    @Override
    public boolean checkRegistered(String myCourse, String myStudent, String myProfessor, String myTA)
    {try {
        scan = new Scanner(grades);
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
        while (scan.hasNextLine()) {
            String stuff = scan.nextLine();
            StringTokenizer myTokenizer = new StringTokenizer(stuff, ",");
            String student = myTokenizer.nextToken();
            String grade = myTokenizer.nextToken();
            String professor = myTokenizer.nextToken();
            String course = myTokenizer.nextToken();
         if (course.equals(myCourse) && student.equals(myStudent) && professor.equals((myProfessor))) {
                {
                    return true;
                }
            }
        }
        scan.close();
        return false;

    }

    /**
     * checkGrade() which returns the associated float value in grade objects
     * precondition: assignment has grade
     * post condition: returns the grade value (float) taken from the assignment
     * checks the listed letter grade and returns a float #
     * @return float
     */
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
            String grade = myTokenizer.nextToken();
            String teacher = myTokenizer.nextToken();
            String course = myTokenizer.nextToken();
            if ( grade.equals("A"))
            {
                courseGrade = 90;
            }
            else if(grade.equals(("B")))
            {
                courseGrade = 80;
            }
            else if(grade.equals(("C")))
            {
                courseGrade = 70;
            }
            else if(grade.equals(("D")))
            {
                courseGrade = 60;
            }
            else if(grade.equals(("E")))
            {
                courseGrade = 50;
            }
            else
            {
                courseGrade = 0;
            }
        }
        scan.close();
        return courseGrade;
    }
}
