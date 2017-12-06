package WarGames.Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * The class for Assignments
 * has a grade value and value for students
 */

public class Assignments {

    private File file1 = new File("src/WarGames/files/grades.txt");
    private File file2 = new File("src/WarGames/files/Assignments.txt");
    private Scanner scan = null;

    /**
     * getGrade() returns a grade value associated
     * with the assignment object
     * pre condition: assignment object and grade value exists
     * post condition: grade value is returned
     * @return int assGrade();
     */
    public int getGrade(String myStudent, String myProfessor, String myCourse, String myAssignment) {
        int assGrade = 0;
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

            if (student.equals(myStudent) && professor.equals(myProfessor) && course.equals(myCourse) && assignmentNo.equals(myAssignment)) {
                if (visibility.equals("true")) {
                    if (!grade.equals("grade")) {
                        assGrade = Integer.parseInt(grade);
                    } else
                        System.out.print("Assignment has not been graded yet");
                } else
                    System.out.print("Assignment Does not exist");
            } else
                System.out.print("No assignment found for parameters");
        }
        scan.close();

        return assGrade;
    }




}
