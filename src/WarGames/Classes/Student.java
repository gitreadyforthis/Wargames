package WarGames.Classes;

import WarGames.Interfaces.PeopleInterface;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * the public class for Students
 * implements PeopleInterface Interface
 */
public class Student implements PeopleInterface {

    File file1 = new File("src//WarGames//files//Assignments.txt");
    File tester = new File("src//WarGames//files//Tester.txt");
    File grades = new File("src//WarGames//files//grades.txt");

    Scanner scan = null;


    /**
     * uploads the students response to the listed assignment to the
     * assignment object
     * precondition: assignment object exists
     * post condition: student response is added to assignment object
     */
    public void uploadAssignment(String studentName, String professor, String course1, String assignmentNumber, String assignmentFile) {

        String search = "sub";

        try {
            FileReader fr = new FileReader(file1);
            String newText = tester.toString();
            String stuff;
            String Assign;
            String compleat = "";
            String newContent;


            try (BufferedReader br = new BufferedReader(new FileReader(file1))) {
                scan = new Scanner(file1);
                while (scan.hasNextLine()) {
                    Assign = scan.nextLine();
                    StringTokenizer myTokenizer = new StringTokenizer(Assign, ",");
                    String student = myTokenizer.nextToken();
                    String teacher = myTokenizer.nextToken();
                    String course = myTokenizer.nextToken();
                    String assignmentNo = myTokenizer.nextToken();
                    String submission = myTokenizer.nextToken();
                    String grade = myTokenizer.nextToken();
                    String visibility = myTokenizer.nextToken();


                 if ((submission.equals("sub") && student.equals(studentName) && assignmentNo.equals(assignmentNumber) && teacher.equals(professor) && visibility.equals("true") && course.equals(course1))) {

                     stuff = "";
                        while (stuff != null)
                        {

                            compleat = compleat + stuff + System.lineSeparator();
                            stuff = br.readLine();

                        }

                       newContent = compleat.replaceFirst(search,newText);
                       FileWriter fw = new FileWriter(tester);
                        fw.write(newContent);
                        fw.close();
                        br.close();

                    }
                    scan.close();
                }
            }
            catch (IOException e)
            {
               e.printStackTrace();

            }
        }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }

    /**
     * checkGrade() which returns the associated float value in grade objects
     * precondition: assignment has grade
     * post condition: returns the grade value (float) taken from the assignment
     * checks the listed letter grade and returns a float #
     * @return float
     */
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
        System.out.print(courseGrade);
        return courseGrade;
    }
}
